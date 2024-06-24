package pl.coderslab.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    @FindBy(css = "#wrapper > div > nav > ol > li:nth-child(1) > a > span")
    private WebElement homeLink;

    public AccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickHomeLink() {
        homeLink.click();
    }
}
