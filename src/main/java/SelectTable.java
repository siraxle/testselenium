import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class SelectTable extends Helper {
    public static void main(String[] args) throws InterruptedException {
        beforeTest("https://www.w3schools.com/html/html_tables.asp");
        WebElement tableElement = driver.findElement(By.xpath("//table[@id=\"customers\"]"));
        Table table = new Table(tableElement, driver);
        List<WebElement> rows = table.getRows();
        System.out.println("rows: " + rows.size());
        System.out.println(table.getValueFromCell(2,3));
        System.out.println(table.getValueFromCell(4, "Company"));
        Thread.sleep(5000);
        afterTest();
    }
}
