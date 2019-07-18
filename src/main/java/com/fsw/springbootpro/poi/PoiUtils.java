package com.fsw.springbootpro.poi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * POI操作Excel的工具类
 * @author fansiwen
 */
public class PoiUtils {
    public static final String XLSX_FLAG = "xlsx";
    public static final String XLS_FLAG = "xls";
    /**
     * 校验上传文件的格式是否正确
     * 上传的文件应该以.xls或者.xlsx结尾
     * @param fileName 上传的文件名称
     */
    public static boolean checkFileType(String fileName){

        if (!fileName.matches("^.+\\.(?i)(xls)$") && !fileName.matches("^.+\\.(?i)(xlsx)$")) {
            return false;
        }
        return true;
    }

    /**
     * 获取工作簿
     * 2003版本的Excel只能支持.xls格式
     * 2007版本的Excel可以支持.xls和.xlsx格式
     * @param filePath 上传文件所在路径
     * @param fileType  上传文件格式,是xls还是xlsx
     */
    public static Workbook getWorkBook(String filePath,String fileType) throws Exception {
        if(fileType.equals(XLSX_FLAG)){
            return new XSSFWorkbook(new File(filePath));
        }
        return new HSSFWorkbook(new FileInputStream(new File(filePath)));
    }
}
