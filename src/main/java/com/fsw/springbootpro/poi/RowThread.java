package com.fsw.springbootpro.poi;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * sheet页中对行数据的操作
 * @author fansiwen
 */
public class RowThread extends Thread{
    private Sheet sheet;
    private int start;
    private int end;

    public RowThread(Sheet sheet, int start, int end) {
        this.sheet = sheet;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        Row row = sheet.getRow(0);
        System.out.println(row.getCell(1));
    }
}
