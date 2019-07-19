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
        int threadCount = maxRow%1000+1;
        System.out.println("=============需要分成"+threadCount+"个批次！=============");
        ExecutorService threadPool = CommonUtils.getThreadPool(threadCount);
        for (int i = 1; i <=threadCount ; i++) {
            System.out.println(sheet.getSheetName()+"");
            int start = 1+threadCount*1000;
            int end = 0;
            if(i==threadCount-1){
                //代表是最后一个批次
                end = maxRow-start;
            }
            end = start+1000;
            threadPool.execute(new RowThread(sheet,start,end));
        }
        while(Thread.activeCount()>1){
            Thread.yield();
        }

    }
}
