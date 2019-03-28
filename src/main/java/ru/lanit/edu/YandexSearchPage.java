package ru.lanit.edu;

import org.openqa.selenium.WebDriver;

public class YandexSearchPage extends AbstractPage{

    public SearchArrow searchArrow;


    public YandexSearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchResultsPage searchFor(String query) {
        searchArrow.searchFor(query);
        return new SearchResultsPage(driver);

    }
}
