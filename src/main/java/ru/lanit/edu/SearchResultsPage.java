package ru.lanit.edu;

import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends AbstractPage {
    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }
    public void iCanGoHome() {
        System.out.println("I can go home!");
    }
}
