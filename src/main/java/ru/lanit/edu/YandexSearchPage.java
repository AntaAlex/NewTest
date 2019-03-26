package ru.lanit.edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexSearchPage {

    @FindBy(id = "text")
    private WebElement input;

    @FindBy(xpath = "//button[@role='button']")
    private WebElement button;


    public YandexSearchPage(WebDriver driver) {


        PageFactory.initElements(driver, this);
    }
    public void searchFor( ) {
        input.sendKeys("shiki");
        button.click();

    }
    public void doesInput() {
        input.isDisplayed();
    }



}
