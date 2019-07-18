package com.fsw.springbootpro;

import com.fsw.springbootpro.poi.PoiUtils;
import com.fsw.springbootpro.poi.SheetThread;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    @Test
    public void test() {
        try {
            Workbook workBook = PoiUtils.getWorkBook("C:\\Users\\soda\\Desktop\\WhiteNameImport.xls", PoiUtils.XLS_FLAG);
            int sheetsNum = workBook.getNumberOfSheets();
            //启用多线程处理Excel，每一个sheet页一个线程
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(sheetsNum, sheetsNum,
                    5000,
                    TimeUnit.SECONDS,
                    new LinkedBlockingDeque(3),
                    Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
            //循环获取sheet页进行处理
            for (int i = 0; i <sheetsNum ; i++) {
                threadPoolExecutor.execute(new SheetThread(workBook.getSheetAt(i)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
