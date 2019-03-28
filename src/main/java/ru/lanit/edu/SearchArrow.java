package ru.lanit.edu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;


@FindBy(xpath = "//*[@role='search']")
public class SearchArrow extends HtmlElement {

    @FindBy(id = "text")
    private WebElement input;

    @FindBy(xpath = ".//button[@role='button']")
    private WebElement button;

    public void searchFor(String query) {
        input.sendKeys(query);
        button.click();

    }
    public boolean doesInput() {
        return input.isDisplayed();
    }


}
