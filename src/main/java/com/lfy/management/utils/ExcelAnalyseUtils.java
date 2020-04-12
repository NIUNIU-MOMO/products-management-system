package com.lfy.management.utils;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ExcelAnalyseUtils {
    private final static String excel2003L = ".xls"; // 2003- 版本的excel
    private final static String excel2007U = ".xlsx"; // 2007+ 版本的excel

    private ExcelAnalyseUtils() {
    }

    public static List<List<Object>> analysisExcelFile(InputStream inputStream, String filename) throws Exception {
        Workbook workbook = getWorkbook(inputStream, filename);
        List<List<Object>> list = new ArrayList();

        for (int i = 0; i < workbook.getNumberOfSheets(); ++i) {
            Sheet sheet = workbook.getSheetAt(i);
            for (int j = sheet.getFirstRowNum() + 1; j <= sheet.getLastRowNum(); ++j) {
                Row row = sheet.getRow(j);
                List<Object> rowList = new ArrayList();
                for (int m = row.getFirstCellNum(); m < row.getLastCellNum(); ++m) {
                    Cell cell = row.getCell(m);
//                    System.out.println("CellStyle : " + cell.getCellStyle().getDataFormatString() + " , ");
//                    System.out.println("CellType : " + cell.getCellType() + " , ");
////                    System.out.print(cell.getNumericCellValue() + " , ");
//                    System.out.println("CellValue : " + getCellValue(cell) + " , ");
//                    System.out.println("==============");
                    rowList.add(getCellValue(cell));
                }
                list.add(rowList);
            }
        }
        return list;
    }

    private static Object getCellValue(Cell cell) {
        Object value = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DecimalFormat df = new DecimalFormat("0");
        DecimalFormat df2 = new DecimalFormat("##.00%");
        if (cell.getCellType() == CellType.STRING) {
            value = cell.getRichStringCellValue().getString();
        } else if (cell.getCellType() == CellType.NUMERIC) {
            if ("General".equals(cell.getCellStyle().getDataFormatString())) {
                value = df.format(cell.getNumericCellValue());
            } else if ("m/d/yy".equals(cell.getCellStyle().getDataFormatString())) {
                value = sdf.format(cell.getDateCellValue());
            } else if ("yyyy/m/d\\ h:mm;@".equals(cell.getCellStyle().getDataFormatString())) {
                value = sdf2.format(cell.getDateCellValue());
//                value = sdf2.format(cell.getNumericCellValue());
            } else if ("0_ ".equals(cell.getCellStyle().getDataFormatString())) {
                value = df.format(cell.getNumericCellValue());
            } else if ("0.00_ ".equals(cell.getCellStyle().getDataFormatString())) {
                value = cell.getNumericCellValue();
            } else if ("0.000_ ".equals(cell.getCellStyle().getDataFormatString())) {
                value = cell.getNumericCellValue();
            } else if ("0.00%".equals(cell.getCellStyle().getDataFormatString())) {
                value = df2.format(cell.getNumericCellValue());
            }else if ("@".equals(cell.getCellStyle().getDataFormatString())) {
                value = df.format(cell.getNumericCellValue());
            }
        } else if (cell.getCellType() == CellType.BOOLEAN) {
            value = cell.getBooleanCellValue();
        } else if (cell.getCellType() == CellType.BLANK) {
            value = "NULL";
        }
        return value;
    }

    private static Workbook getWorkbook(InputStream inputStream, String filename) throws Exception {
        Workbook wb = null;
        String fileType = filename.substring(filename.lastIndexOf("."));
        if (".xls".equals(fileType)) {
            wb = new HSSFWorkbook(inputStream);
        } else {
            if (!".xlsx".equals(fileType)) {
                throw new Exception("解析的文件格式有误！");
            }
            wb = new XSSFWorkbook(inputStream);
        }
        return (Workbook) wb;
    }
}
