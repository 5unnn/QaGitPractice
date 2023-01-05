package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GoogleTest extends Base{

    private WebDriver driver;
    private String baseUrl = "https://demoqa.com/text-box";


    @Test
    public void setUp() throws IOException {
        driver = initializeDriver();
        driver.get(baseUrl);
        String title = driver.getTitle();
        InputFormPage inputFormPage = new InputFormPage(driver);
        WebElement name = inputFormPage.name();
        WebElement userEmail = inputFormPage.userEmail();
        name.sendKeys("John");
        userEmail.sendKeys("john@doe.com");
        driver.findElement(By.id("currentAddress")).sendKeys("New York 6th ave");
        driver.findElement(By.id("permanentAddress")).sendKeys("Chicago Michigan ave");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("submit")).click();

        Assert.assertEquals("ToolsQA",title,"Title is not as expected !");
        driver.quit();



    }

}
