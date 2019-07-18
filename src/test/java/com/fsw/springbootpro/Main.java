package com.fsw.springbootpro;

import com.fsw.springbootpro.poi.PoiUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;

public class Main {
    @Test
    public void test() {
        try {
            Workbook workBook = PoiUtils.getWorkBook("C:\\Users\\soda\\Desktop\\百胜公司码表.xlsx", PoiUtils.XLSX_FLAG);
            System.out.println(workBook.getNumberOfSheets());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
