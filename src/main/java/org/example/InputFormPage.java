package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormPage extends Base{

    private final WebElement name;
    private final WebElement userEmail;

    public InputFormPage(WebDriver driver){
        this.driver = driver;
        this.name = driver.findElement(By.id("userName"));
        this.userEmail = driver.findElement(By.id("userEmail"));
    }

    public WebElement name(){ return this.name;}
    public WebElement userEmail(){ return this.userEmail;}
}
