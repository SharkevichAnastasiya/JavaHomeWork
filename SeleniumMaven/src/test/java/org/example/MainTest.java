package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @org.junit.Test
    public void testMain() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/anastasiasharkevich/IdeaProjects/SeleniumMaven/src/main/resources/drivers/chrome/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        Thread.sleep(2000);

        WebElement cookie = driver.findElement(By.cssSelector(".cookie__ok"));

        if(cookie.isDisplayed()) {
            cookie.click();
        }

        WebElement blockTitle = driver.findElement(By.cssSelector(".pay__wrapper h2"));
        assertEquals("Онлайн пополнение без комиссии", blockTitle.getText().replaceAll("\\r\\n|\\r|\\n", " "));

        List<WebElement> paymentLogos = driver.findElements(By.cssSelector(".pay img"));
        assertFalse(paymentLogos.isEmpty());

        WebElement moreInfoLink = driver.findElement(By.cssSelector(".pay__partners + a"));
        moreInfoLink.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.titleIs("Порядок оплаты и безопасность интернет платежей"));

        driver.navigate().back();

        driver.findElement(By.cssSelector(".pay__form input.phone")).sendKeys("297777777");
        driver.findElement(By.cssSelector(".pay__form input.total_rub")).sendKeys("123");

        WebElement continueButton = driver.findElement(By.cssSelector(".pay__form .button__default"));
        assertTrue(continueButton.isEnabled());
        continueButton.click();

        Thread.sleep(5000);

        assertTrue(driver.findElement(By.cssSelector(".bepaid-app")).isDisplayed());

        driver.quit();
    }
}