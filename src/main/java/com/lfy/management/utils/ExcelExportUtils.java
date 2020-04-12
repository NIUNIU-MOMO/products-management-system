package com.lfy.management.utils;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelExportUtils {

    private ExcelExportUtils() {
    };

    // 显示的导出Excel表的标题
    private static String title;
    // 导出Excel表的列名
    private static String[] rowName;
    // 导出Excel表的文件名
    private static String fileName;
    // 导出Excel的路径
    private static final String FILE_PATH = "E:/ExcelFile/Export/";
    // 导出Excel 的内容


    private static List<List<String>> dataList = new ArrayList();

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        ExcelExportUtils.title = title;
    }

    public static String[] getRowName() {
        return rowName;
    }

    public static void setRowName(String[] rowName) {
        ExcelExportUtils.rowName = rowName;
    }

    public static String getFileName() {
        return fileName;
    }

    public static void setFileName(String fileName) {
        ExcelExportUtils.fileName = fileName;
    }

    public static String getFilePath() {
        return FILE_PATH;
    }

    public static List<List<String>> getDataList() {
        return dataList;
    }

    public static void setDataList(List<List<String>> dataList) {
        ExcelExportUtils.dataList = dataList;
    }


    public static void exportExccel() throws Exception {
        // 创建写出流
        FileOutputStream outputStream = null;
        // 创建工作簿对象
        HSSFWorkbook workbook = null;
        try {
            workbook = new HSSFWorkbook();
            // 创建工作表
            HSSFSheet sheet = workbook.createSheet(title);
            // 设置工作表的标题行
//            HSSFRow titleRow = sheet.createRow(0);
//            HSSFCell titleRowCell = titleRow.createCell(0);
//            titleRowCell.setCellValue(title);
//            // 设置sheet的样式
//            // TODO
//            // 合并单元格
//            //CellRangeAddress（int， int， int， int）
//            //参数：起始行号，终止行号， 起始列号，终止列号
//            sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, rowName.length - 1));
            //表中列数
            int columnNum = rowName.length;
            // 填写表头
            HSSFRow rowRowName = sheet.createRow(0);
            for (int i = 0; i < columnNum; i++) {
                HSSFCell rowNameCell = rowRowName.createCell(i);
                rowNameCell.setCellType(CellType.STRING);
                HSSFRichTextString text = new HSSFRichTextString(rowName[i]);
                rowNameCell.setCellValue(text);                                 //设置列头单元格的值

            }
            // 填写内容
            for (int i = 0; i < dataList.size(); i++) {
                List<String> objectList = dataList.get(i);
                HSSFRow row = sheet.createRow(i + 1); // 创建行
                for (int j = 0; j < objectList.size(); j++) {
                    HSSFCell cell = null;
                    cell = row.createCell(j); //创建单元格
                    cell.setCellValue(objectList.get(j)); // 写单元格的内容
//                    System.out.println(cell.getStringCellValue());
                }
            }
            //让列宽随着导出的列长自动适应
            for (int colNum = 0; colNum < columnNum; colNum++) {
                int columnWidth = sheet.getColumnWidth(colNum) / 256;
                for (int rowNum = 0; rowNum < sheet.getLastRowNum(); rowNum++) {
                    HSSFRow currentRow;
                    //当前行未被使用过
                    if (sheet.getRow(rowNum) == null) {
                        currentRow = sheet.createRow(rowNum);
                    } else {
                        currentRow = sheet.getRow(rowNum);
                    }
                    if (currentRow.getCell(colNum) != null) {
                        HSSFCell currentCell = currentRow.getCell(colNum);
                        if (currentCell.getCellType() == CellType.STRING) {
                            int length = currentCell.getStringCellValue().getBytes().length;
                            if (columnWidth < length) {
                                columnWidth = length;
                            }
                        }
                    }
                }
                if (colNum == 0) {
                    sheet.setColumnWidth(colNum, (columnWidth - 2) * 256);
                } else {
                    sheet.setColumnWidth(colNum, (columnWidth + 4) * 256);
                }
            }
            // 写出Excel
            if (workbook != null) {
                try {
                    outputStream = new FileOutputStream(FILE_PATH + fileName);
                    workbook.write(outputStream);
                    workbook.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
//            e.printStackTrace();
        } finally {
            if (outputStream != null && workbook != null) {
                outputStream.close();
                workbook.close();
            } else {
                workbook = null;
                outputStream = null;
            }
        }
    }
}
