package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EmailAutomation {

    @Test

    public void testEmailAutomation() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait() ;
        driver.get("https://accounts.google.com/signin");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.click();
        email.sendKeys("tursunkulnazerke@gmail.com" + Keys.ENTER);

        driver.findElement(By.className("RveJvd snByac")).click();
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("input[@name='password']"));
        password.click();
        Thread.sleep(2000);
        password.sendKeys("Nazek260197" + Keys.ENTER);
        Thread.sleep(2000);

        driver.findElement(By.className("RveJvd snByac")).click();
        Thread.sleep(2000);








    }
}
