package com.fsw.springbootpro.poi;

import com.fsw.springbootpro.pojo.WhiteName;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.ArrayList;
import java.util.List;

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
        List list = new ArrayList();
        for (int i = start; i <=end ; i++) {
            //处理每一行的数据映射到对应的对象中
            WhiteName whiteName = dealData(i);
            list.add(whiteName);
        }
    }

    /**
     * 封装实体类数据
     * @param i
     */
    private WhiteName dealData(int i) {
        //获取行
        Row row = sheet.getRow(i);
        WhiteName whiteName = new WhiteName();
        whiteName.setIndex(Integer.valueOf(row.getCell(0).getStringCellValue()));
        whiteName.setCompanyName((row.getCell(1).getStringCellValue()));
        whiteName.setName(row.getCell(2).getStringCellValue());
        whiteName.setSex(row.getCell(3).getStringCellValue());
        whiteName.setBirthday(row.getCell(4).getDateCellValue());
        whiteName.setIdType(row.getCell(5).getStringCellValue());
        whiteName.setIdNo(row.getCell(6).getStringCellValue());
        return whiteName;
    }
}
