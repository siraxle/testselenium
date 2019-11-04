import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Alert extends Helper{

    public static void main(String[] args) throws InterruptedException {
        beforeTest("https://www.oracle.com/technetwork/java/javase/downloads/2133151");
        driver.findElement(By.xpath("//a[text()=\"jdk-8u231-windows-x64.exe\"]")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        driver.get("https://www.google.com/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("confirm('Are you sure?')");
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        afterTest();
    }

}

