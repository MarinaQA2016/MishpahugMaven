package ru.stqa.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class UnAuthEventsPageHelper extends PageBase {
    @FindBy(xpath = "//span[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(xpath = "//span[contains(text(),'Filters')]")
    WebElement filterButton;

    @FindBy(xpath = "//h1[@class='gorisontal-center']")
    WebElement headerPage;

    public UnAuthEventsPageHelper(WebDriver driver) {
        super(driver);
    }
    public void waitUntilPageIsLoaded() {
        waitUntilElementIsLoaded(driver,filterButton,40);

    }

    public boolean isHedearCorrect(String value) {
        return headerPage.getText().equals(value);
    }
}