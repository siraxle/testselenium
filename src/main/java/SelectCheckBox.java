import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectCheckBox extends Helper{

    public static void main(String[] args) throws InterruptedException {
        beforeTest("https://market.yandex.ru");
        driver.findElement(By.xpath("//span[text()='Бытовая техника']")).click();
        driver.findElement(By.xpath("//a[text()=\"Посудомоечные машины\"]")).click();

        selectCheckBox("Indesit");
        selectCheckBox("Beko");
        unSelectCheckBox("Indesit");

        System.out.println(driver.findElement(By.xpath("//input[@id=\"good-state_cutprice\"]")).isSelected());
        driver.findElement(By.xpath("//span[text()=\"Уценённый\"]")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id=\"good-state_cutprice\"]")).isSelected());

        afterTest();
    }

    public static void selectCheckBox(String name) {
        String xpath = "//span[contains(text(),'" + name + "')]";
        String sel = "//span[contains(text(),'" + name + "')]/../../input";
        if (!driver.findElement(By.xpath(xpath)).isSelected()) {
            driver.findElement(By.xpath(xpath)).click();
        }
        System.out.println("Element" + name + " Selected? - " + driver.findElement(By.xpath(sel)).isSelected());
    }

    public static void unSelectCheckBox(String name) {
        String xpath = "//span[contains(text(),'" + name + "')]";
        String sel = "//span[contains(text(),'" + name + "')]/../../input";
        if (driver.findElement(By.xpath(xpath)).isSelected()) {
            driver.findElement(By.xpath(xpath)).click();
        }
        System.out.println("Element" + name + " Selected? - " + driver.findElement(By.xpath(sel)).isSelected());
    }

}
