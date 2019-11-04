import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import java.util.concurrent.TimeUnit;

public class Helper {

    static WebDriver driver;

    static void afterTest() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }

    static void beforeTest(String url) {
        driver = getChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static WebDriver getChromeDriver() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("user-data-dir = C:\\Users\\EEfremov\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\EEfremov\\IdeaProjects\\testselenium\\drivers\\chromedriver.exe");
        //System.setProperty("phantomjs.binary.path", "C:\\Users\\EEfremov\\IdeaProjects\\testselenium\\drivers\\phantomjs.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriverManager.phantomjs().setup();
        //driver = new PhantomJSDriver();
        return driver;
    }
}
