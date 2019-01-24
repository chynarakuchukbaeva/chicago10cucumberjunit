package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utilities.Config;

import java.io.File;
import java.io.FileInputStream;

public class ExcelRead {
    public static void main(String[] args) throws Exception{
        File file= new File("src/SampleData.xlsx");
        System.out.println(file.exists());
        FileInputStream inputStream= new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet worksheet =workbook.getSheet("Employees");
        //System.out.println(worksheet.getRow(2).getCell(1));
       // System.out.println(worksheet.getRow(5).getCell(0));

    int usedRows=worksheet.getPhysicalNumberOfRows();
        //System.out.println("Physical number of rows: "+usedRows);
    int lastUsedRow=worksheet.getLastRowNum();
       // System.out.println("last used row: "+lastUsedRow);
        //TODO:PRINT OUT NANCY'S JOB_ID DYNAMICALLY

        for(int rowNum=0;rowNum<usedRows;rowNum++){
            if(worksheet.getRow(rowNum).getCell(0).toString().equals("NANCY")) {
                System.out.println("NANCY'S JOB_ID: "+worksheet.getRow(rowNum).getCell(2));

            }
        }
        for(int rowNum=0;rowNum<usedRows;rowNum++){
            if(worksheet.getRow(rowNum).getCell(1).toString().equals(Config.getProperty("lastname"))) {
                System.out.println("Haan's  name is: "+worksheet.getRow(rowNum).getCell(0));
                System.out.println("Haan's  jod _id: "+worksheet.getRow(rowNum).getCell(2));
            }
        }

        workbook.close();
        inputStream.close();
    }
}
