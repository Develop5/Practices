package api.utilities;

/*  Arreglar de aquí:
https://github.com/Furrial/junit5-extentreports-example/blob/main/src/main/java/com/example/util/ScreenshotUtil.java
*/

import java.io.File;

public class ScreenshotUtil {

    public static File takeScreenshot() {
            return new File("src\\test\\resources\\Images\\CircleCI-Screenshot.PNG");
        }


}
