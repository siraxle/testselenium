import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class VTB_tests {

    public static void main(String[] args) throws InterruptedException {


      //  WebDriver fireFoxDriver = getFireFoxDriver();
      //  fireFoxDriver.get("https://www.seleniumhq.org");

        WebDriver chromeDriver = getChromeDriver();
        chromeDriver.get("http://fe-root-client.slr-test.k8s-dev-reksoft.vtb-dbo.local/");
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement enterWithLogin = chromeDriver.findElement(By.linkText("Вход по логину"));
                //(By.xpath("//div[@class=\"login__form-TSz\"]/div[5]/a\n"));
        enterWithLogin.click();
        chromeDriver.manage().window().setSize(new Dimension(900, 500));
        WebElement login = chromeDriver.findElement(By.xpath("//input[@name=\"login\"]"));
        login.sendKeys("77515030\n");
        WebElement password = chromeDriver.findElement(By.xpath("//input[@name=\"password\"]"));
        password.sendKeys("123ewqEWQ\n");
        //password.submit();
        System.out.println(chromeDriver.getTitle());
        System.out.println(chromeDriver.getCurrentUrl());
        Thread.sleep(10000);
        chromeDriver.quit();
        //chromeDriver.close();
    }

    public static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\EEfremov\\IdeaProjects\\testselenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver getFireFoxDriver() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\EEfremov\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");
        File pathBinary = new File("C:\\Users\\EEfremov\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
        FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
        DesiredCapabilities desired = DesiredCapabilities.firefox();
        FirefoxOptions options = new FirefoxOptions();
        desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
        WebDriver driver = new FirefoxDriver(options);
        return driver;
    }

}