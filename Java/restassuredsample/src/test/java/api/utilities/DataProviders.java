package api.utilities;


import java.io.IOException;

public class DataProviders {
    public static String[][] getAllData() throws IOException {
        //This path needs to be configured somewhere else
        String relativeExcelFilePath = "\\testData\\UserData.xlsx";
        String path = System.getProperty("user.dir") + relativeExcelFilePath;
        XLUtility xl = new XLUtility(path);
        int rowNumber = xl.getRowCount("Sheet1");
        int colCount = xl.getCellCount("Sheet1", 1);
        String[][] apiData = new String[rowNumber][colCount];
        for (int i = 1; i <= rowNumber; i++) {
            for (int j = 1; j <= colCount; j++) {
                String newData = xl.getCellData("Sheet1", i, j - 1);
                apiData[i - 1][j - 1] = newData;
            }
            //System.out.println("From DataProvider Row " + i + "  : " + Arrays.toString(apiData[i - 1]));
        }
        return apiData;
    }

    public static String[] getUserNames() throws IOException
    {
        //This path needs to be configured somewhere else
        String relativeExcelFilePath = "\\testData\\UserData.xlsx";
        String path = System.getProperty("user.dir") + relativeExcelFilePath;
        XLUtility xl = new XLUtility(path);
        int rowNumber = xl.getRowCount("Sheet1");
        String[] apiData = new String[rowNumber];
        for (int i = 1; i <= rowNumber; i++) {
                String newData = xl.getCellData("Sheet1", i, 1);
                apiData[i - 1] = newData;
        }
        return apiData;
    }

}
