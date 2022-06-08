package code;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class ExcelToDataProvider {
     
    String xlFilePath = "d:\\TestData.xlsx";
    String sheetName = "Sheet1";
    ExcelApiTest eat = null;
     
    @Test(dataProvider = "userData")
    public void fillUserForm(String userName, String passWord)
    {
       System.out.println("UserName: "+ userName);
       System.out.println("PassWord: "+ passWord);
       System.out.println("*********************");
    }
     
     
    @DataProvider(name="userData")
    public Object[][] userFormData() throws Exception
    {
        Object[][] data = testData(xlFilePath, sheetName);
        return data;
    }
     
    public Object[][] testData(String xlFilePath, String sheetName) throws Exception
    {
        Object[][] excelData = null;
        eat = new ExcelApiTest(xlFilePath);
        int rows = eat.getRowCount(sheetName);
        int columns = eat.getColumnCount(sheetName);
                 
        excelData = new Object[rows-1][columns];
         
        for(int i=1; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                excelData[i-1][j] = eat.getCellData(sheetName, j, i);
            }
             
        }
        return excelData;
    }
}