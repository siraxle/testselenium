import org.openqa.selenium.By;

public class SelectComboBox extends Helper{

    public static void main(String[] args) throws InterruptedException {
        beforeTest("https://support.office.com/ru-ru/");
        selectComboBox("Ресурсы", "Обучение");
        afterTest();
    }

    public static void selectComboBox(String name, String choice) throws InterruptedException {
        name = String.format("//button[contains(text(), '%s')]", name);
        driver.findElement(By.xpath(name)).click();
        Thread.sleep(5000);
        choice = String.format("//button[contains(text(), \"Ресурсы\")]/..//a[contains(text(), '%s')] ", choice);
        driver.findElement(By.xpath(choice)).click();
    }

}
