package com.fsw.springbootpro.poi;

import com.fsw.springbootpro.CommonUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.concurrent.ExecutorService;

/**
 * 每一个Sheet页的线程处理逻辑
 * @author fansiwen
 *
 */
public class SheetThread extends Thread{
    private Sheet sheet;

    public SheetThread(Sheet sheet) {
        this.sheet = sheet;
    }

    /**
     * 每一个Sheet页的处理逻辑
     */
    @Override
    public void run() {
        //获得Sheet最大行数
        int maxRow = sheet.getLastRowNum();
        //每1000条数据启用一个线程进行处理
        int threadCount = maxRow%1000;
        System.out.println("=============需要分成"+threadCount+"个批次！=============");
        ExecutorService threadPool = CommonUtils.getThreadPool(threadCount);
        for (int i = 0; i <threadCount ; i++) {
            System.out.println(sheet.getSheetName()+"");
            threadPool.execute(new RowThread(sheet));
        }
        while(Thread.activeCount()>1){
            Thread.yield();
        }

    }
}
