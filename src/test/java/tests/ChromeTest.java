package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

    @Test

    public void testPartialLink() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Search")).click();


        String expectedTitle = "Discover How Google Search Works";

        Assert.assertTrue(driver.getTitle().contains(expectedTitle));

        driver.close();
    }

    @Test

    public void testSearch() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("Australia" + Keys.ENTER);

        Thread.sleep(2000);
        Assert.assertTrue(driver.getTitle().contains("Australia"));

        driver.close();
    }

    @Test

    public void testAmazon() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);


        driver.findElement(By.id("nav-hamburger-menu")).click();

        Thread.sleep(2000);
        WebElement amazonElement = driver.findElement(By.id("hmenu-customer-avatar-icon"));

        Thread.sleep(2000);
        Assert.assertTrue(amazonElement.isDisplayed());

        driver.close();
    }

    @Test

    public void testSearchAmazon() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");


        Thread.sleep(2000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("manicure tools" + Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertTrue(driver.getTitle().contains("manicure tools"));

        driver.close();
    }

    @Test

    public void testSeleniumSofia() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com");

        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Let's Talk Tea")).click();

        Thread.sleep(2000);
        driver.findElement(By.name("name")).sendKeys("John" + Keys.ENTER);

        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("abc123@gmail.com" + Keys.ENTER);

        Thread.sleep(2000);
        driver.findElement(By.name("subject")).sendKeys("special request" + Keys.ENTER);

        Thread.sleep(2000);
        driver.findElement(By.name("message")).sendKeys("I love tea" + Keys.ENTER);

        driver.findElement(By.className("form-submit")).click();

        driver.close();

    }

}
