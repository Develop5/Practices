package api.utlities;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.util.Arrays;

public class DataProviders {

    @ParameterizedTest
    @ValueSource
    public String[][] getAllData()
    {
        try {
            //This path needs to be configured somewhere else
            String relativeExcelFilePath = "\\restassuredsample\\testData\\UserData.xlsx";
            String path = System.getProperty("user.dir") + relativeExcelFilePath;
            XLUtility xl = new XLUtility(path);
            int rowNumber = xl.getRowCount("Sheet1");
            int colCount = xl.getCellCount("Sheet1", 1);
            String[][] apiData = new String[rowNumber][colCount];

            for (int i=1; i<=rowNumber; i++)
            {
                for (int j=1; j<=colCount; j++) {
                    String newData = xl.getCellData("Sheet1", i, j-1);
                    apiData[i-1][j-1] = newData;
                }
                System.out.println("Row " + i + "  : " + Arrays.toString(apiData[i-1]));
            }
            return apiData;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
