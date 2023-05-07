package api.utlities;

import java.io.IOException;

public class ProbandoLecturaFichero {
    public static void main(String[] args) throws IOException {
        String[][] resultados = getAllData();
        System.out.println(">>>>>>>>>>>>>>>>>>>");
        System.out.println(resultados.toString());
    }

    public static String[][] getAllData() throws IOException
    {
        try {
            // apply from: '{YOUR_PATH}/general.gradle'
            String estaruta = System.getProperty("{UsersDataFile}");
            String otraruta = System.getProperty("UsersDataFile");
            System.out.println("Ruta del fichero ....... " + estaruta);
            System.out.println("Otras propiedades -------------- " + otraruta);


            String path = System.getProperty("datafiles") + "//UserData.xlsx";
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
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
