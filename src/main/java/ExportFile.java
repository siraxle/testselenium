import org.openqa.selenium.By;

public class ExportFile extends Helper{
    public static void main(String[] args) throws InterruptedException {
        beforeTest("https://www.google.ru/");
        driver.findElement(By.xpath("//a[text()=\"Картинки\"]")).click();
        driver.findElement(By.xpath("//span[@class=\"S3Wjs\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Загрузить файл\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"qbfile\"]"))
                .sendKeys("C:\\Users\\EEfremov\\IdeaProjects\\testselenium\\screenshots\\12_24_54.png");
        afterTest();
    }
}
