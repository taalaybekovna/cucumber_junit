package com.cydeo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class GoogleSearchPage {
    
    public GoogleSearchPage(){
        PageFactory.initElements(com.cydeo.utilities.Driver.getDriver(),this);
    }

    @FindBy(name = "q")
    public WebElement searchBox;

    @FindBy(css = "a[class='FLP8od']")
    public WebElement capitalText;


}
