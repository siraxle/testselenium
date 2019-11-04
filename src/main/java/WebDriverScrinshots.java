import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WebDriverScrinshots extends Helper{

    public static void main(String[] args) throws InterruptedException, IOException {
        beforeTest("https://ru.wikipedia.org");

        Date dataNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
        String filename = format.format(dataNow) + ".png";

        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File
                ("C:\\Users\\EEfremov\\IdeaProjects\\testselenium\\screenshots\\"+ filename));
        afterTest();
    }

}
