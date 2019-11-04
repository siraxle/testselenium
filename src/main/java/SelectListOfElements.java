import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectListOfElements extends Helper{
    public static void main(String[] args) throws InterruptedException {
        beforeTest("https://market.yandex.ru/catalog--posudomoechnye-mashiny/54956/list?hid=90584&onstock=1&local-offers-first=0");
        List<WebElement> checkboxes = driver.findElements
                (By.xpath("//fieldset[@data-autotest-id=\"7893318\"]//ul//div[@class=\"LhMupC0dLR\"]"));
        //checkboxes.get(3).click();
        if (checkboxes.size() == 12) System.out.println("It's OK!");
        else System.out.println("Fail!");
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }
        afterTest();
    }
}
