package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[@class='button nav__item active']")
    public WebElement viewAllOrders;

    @FindBy(xpath = "//button[@class='button nav__item']")
    public WebElement viewAllProducts;

    @FindBy(xpath="//button[.='Order']")
    public WebElement orderBtn;

    @FindBy(xpath = "//button[@class='button __logout']")
    public WebElement logOut;


}
