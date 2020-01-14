package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class YouTubeSearchVideoAutomation {

    @Test

    public void testEmailAutomation() throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Worth it" + Keys.ENTER);
        Thread.sleep(2000);

        driver.findElement(By.partialLinkText("$5 Fried Chicken Sandwich Vs. $20 Fried Chicken Sandwich")).click();
        Thread.sleep(2000);

        WebElement startingTime = driver.findElement(By.className("ytp-time-current"));
        Thread.sleep(2000);
        String currentTime = startingTime.getText();

        System.out.println(currentTime+"!!!!!!!!!!!");

        Assert.assertFalse(currentTime.equals("0:00"));

//




    }
}
