package api.utlities;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;

public class DataProviders {
    @ParameterizedTest
    @ValueSource
    public String[][] getAllData() throws IOException
    {
        String path = System.getProperty("user.dir") + "UserData.xlsx";
        XLUtility xl = new XLUtility(path);
        int rowNumber = xl.getRowCount("Sheet1");
        int colCount = xl.getCellCount("Sheet1", 1);
        String[][] apiData = new String[rowNumber][colCount];

        for (int i=1; i<rowNumber; i++)
        {
            for (int j=1; j<colCount; j++) {
                apiData[i-1][j] = xl.getCellData("Sheet1", i, j);
            }
        }
        return apiData;
    }
}
