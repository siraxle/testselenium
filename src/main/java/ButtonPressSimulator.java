import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ButtonPressSimulator extends Helper{

    public static void main(String[] args) throws InterruptedException {
        beforeTest("https://ru.wikipedia.org");
        WebElement searchInput = driver.findElement(By.xpath("//input[@id=\"searchInput\"]"));

        String select = Keys.chord(Keys.CONTROL, "a");
        String cut = Keys.chord(Keys.CONTROL, "x");
        String paste = Keys.chord(Keys.CONTROL, "v");

        searchInput.sendKeys("test text");
        searchInput.sendKeys(select);
        searchInput.sendKeys(cut);
        searchInput.sendKeys(paste);
        searchInput.sendKeys(Keys.ENTER);
        afterTest();
    }

}
