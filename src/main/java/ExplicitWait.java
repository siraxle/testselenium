import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait extends Helper{

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = getChromeDriver();
        driver.get("https://www.seleniumhq.org/");
        WebDriverWait wait = (new WebDriverWait(driver, 5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[text() = \"What is Selenium?\"]")));
        WebElement seleniumProjectButton = driver.findElement(By.xpath("//a[@title=\"Selenium Projects\"]"));
        seleniumProjectButton.click();
        afterTest();
    }

}
