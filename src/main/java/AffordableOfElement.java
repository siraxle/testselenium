import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AffordableOfElement extends Helper{

    public static void main(String[] args) throws InterruptedException {
        //w3schools();
        beforeTest("https://www.oracle.com/technetwork/java/javase/downloads/2133151");
        WebElement r1 = driver.findElement(By.xpath("//input[@id=\"agreementjdk-8u231-oth-JPR-a\"]"));
        WebElement r2 = driver.findElement(By.xpath("//input[@id=\"agreementjdk-8u231-demos-oth_JPR-d\"]"));
        System.out.println("Radio button 2 selected: " + r2.isSelected());
        if (!r1.isSelected()) r1.click();
        afterTest();
    }

    private static void w3schools() throws InterruptedException {
        beforeTest("https://www.w3schools.com/jsref/prop_pushbutton_disabled.asp");
        driver.findElement(By.xpath("//a[text()=\"Try it Yourself »\"]")).click();
        String mainWindow = driver.getWindowHandle();

        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }
        WebElement res = driver.findElement(By.cssSelector("#myBtn"));
        System.out.println(res.isEnabled());
        WebElement el = driver.findElement(By.xpath("/html[1]/body[1]/button[2]"));
        System.out.println(el.isDisplayed());
        System.out.println(res.isEnabled());
        driver.switchTo().window(mainWindow);
        WebElement buttonObject = driver.findElement(By.xpath("//a[text()=\"❮ Button Object\"]"));
        System.out.println(buttonObject.isDisplayed());
        afterTest();
    }

}
