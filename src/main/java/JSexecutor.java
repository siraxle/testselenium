import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JSexecutor extends Helper{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\EEfremov\\IdeaProjects\\testselenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://en.wikipedia.org");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("alert('Hello World!!');");
        jse.executeScript("window.scrollBy(0, 1000)", "");
        driver.quit();
    }
}
