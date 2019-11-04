import org.openqa.selenium.By;

public class WorkWithBrowserWindow extends Helper{
    public static void main(String[] args) throws InterruptedException {
        beforeTest("https://www.oracle.com/technetwork/java/javase/downloads/2133151");
        driver.findElement(By.xpath("//div[@class=\"warningBox\"]/a[text()=\"Oracle Technology Network License Agreement for Oracle Java SE\"]")).click();
        String mainWindow = driver.getWindowHandle();

        //переключаемся на последнее открытое окно
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }

        driver.findElement(By.xpath("//a[text()=\"https://www.oracle.com/technetwork/java/javase/documentation/\"]")).click();

        driver.switchTo().window(mainWindow);
        driver.findElement(By.xpath("//div[@class=\"orcl6w0\"]//a")).click();
        afterTest();
    }
}
