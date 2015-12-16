package Utilities;

/**
 * Created by rsangroula on 6/23/2015.
 */

import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    private static XSSFSheet ExcelWSheet;

    private static XSSFWorkbook ExcelWBook;


    private static XSSFRow Row;
    //String Path = "C:\\Users\\rsangroula\\IdeaProjects\\QaAutomation\\src\\testData\\TestData.xlsx";
    //String SheetName = "BorrowerInfo";
    //This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method

    public static void setExcelFile( String Path, String SheetName) throws Exception {


            // Open the Excel file

            FileInputStream ExcelFile = new FileInputStream(Path);

            // Access the required test data sheet

            ExcelWBook = new XSSFWorkbook(ExcelFile);

            ExcelWSheet = ExcelWBook.getSheet(SheetName);


    }

    //This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

    public static String getCellData(int RowNum, int ColNum) throws Exception {


             XSSFCell Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

            String CellData = Cell.getStringCellValue();

            return CellData;


    }

    //This method is to write in the Excel cell, Row num and Col num are the parameters
/*
    public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {


            Row = ExcelWSheet.getRow(RowNum);

            XSSFCell Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);

            if (Cell == null) {

                Cell = Row.createCell(ColNum);

                Cell.setCellValue(Result);

            } else {

                Cell.setCellValue(Result);

            }

            // Constant variables Test Data path and Test Data file name

            FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);

            ExcelWBook.write(fileOut);

            fileOut.flush();

            fileOut.close();

    }
*/
}
