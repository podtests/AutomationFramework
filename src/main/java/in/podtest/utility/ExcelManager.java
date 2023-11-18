package in.podtest.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelManager {

    private static final String propertyFilePath= "src\\main\\resources\\file.xlsx";

    public static Object[][] readData() throws IOException {
        File file = new File(propertyFilePath);
        FileInputStream fis = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheetAt(0);

        int[][] a1 = new int[2][2];

        a1[0][1] = 50;


        int rowCount = sheet.getLastRowNum();  //0 based  1: 0 , 1
        int colCount = sheet.getRow(0).getLastCellNum(); //1 based

        //  System.out.println(rowCount);
        //  System.out.println(colCount);

        Object [][] dataObject = new Object[rowCount+1][colCount];

        for(int x =0; x <rowCount+1; x++) {
            for(int y =0; y < colCount; y++) {
                dataObject[x][y] = sheet.getRow(x).getCell(y).toString(); // here cell is 0 based
            }
        }

/*
        for(int x =0; x <rowCount+1; x++) {
            for(int y =0; y < colCount; y++) {

                System.out.print(dataObject[x][y] + "\t");
            }
            System.out.println();
        }
/*
        for (Row row : sheet) {
            for (Cell cell : row) {

                System.out.print(cell.getStringCellValue() + "\t");
            }
            System.out.println();
        }
        */
/*
        if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
        {
            System.out.print(cell.getStringCellValue()+" ");
        }
        else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
        {
            System.out.print(cell.getNumericCellValue()+" ");
        }
        else
        {
        }
*/

        workbook.close();
        fis.close();

        return dataObject;
    }

    public static Object[][] getData() throws IOException {
        File file = new File(propertyFilePath);
        FileInputStream fis = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheetAt(0);

        int rowCount = sheet.getLastRowNum();  //0 based
        int colCount = sheet.getRow(0).getLastCellNum(); //1 based

      //  System.out.println(rowCount);
      //  System.out.println(colCount);

        Object [][] dataObject = new Object[rowCount+1][colCount];

        for(int x =0; x <rowCount+1; x++) {
            for(int y =0; y < colCount; y++) {
                dataObject[x][y] = sheet.getRow(x).getCell(y).toString(); // here cell is 0 based
            }
        }

/*
        for(int x =0; x <rowCount+1; x++) {
            for(int y =0; y < colCount; y++) {

                System.out.print(dataObject[x][y] + "\t");
            }
            System.out.println();
        }
/*
        for (Row row : sheet) {
            for (Cell cell : row) {

                System.out.print(cell.getStringCellValue() + "\t");
            }
            System.out.println();
        }
        */
/*
        if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
        {
            System.out.print(cell.getStringCellValue()+" ");
        }
        else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
        {
            System.out.print(cell.getNumericCellValue()+" ");
        }
        else
        {
        }
*/

        workbook.close();
        fis.close();

        return dataObject;
    }

    public static void main(String[] args) throws IOException {
        ExcelManager e1 = new ExcelManager();
       // e1.printData();
    }
}
