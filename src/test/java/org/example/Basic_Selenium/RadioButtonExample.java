package org.example.Basic_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {
    WebDriver driver;
    @Before
    public void setUpChrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void openNextWebsite() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        driver.findElement(By.id("bmwradio")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("benzradio")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("hondaradio")).click();
        Thread.sleep(4000);
    }
    @After
    public void closeTest(){
        driver.close();
    }
}


