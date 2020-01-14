package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AsosAutomation {


    @Test

    public void tesAsos() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.asos.com/");

        driver.manage().window().maximize();

        /*Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@type='accountUnfilled']")).click();

        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Sign in")).click();

        Thread.sleep(2000);
        driver.findElement(By.name("Username")).sendKeys("tursunkulnazerke@gmail.com" + Keys.ENTER);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@aria-labelledby='PasswordLabel']")).sendKeys("Nazek260197" + Keys.ENTER);

        Thread.sleep(2000);
        driver.findElement(By.id("signin")).click();

        Thread.sleep(3000);

         */




        driver.close();

    }
}
