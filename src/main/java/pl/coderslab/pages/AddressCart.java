package pl.coderslab.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressCart {

    @FindBy(xpath = "//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button")
    private WebElement continueButton;

    public AddressCart(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickContinueButton() {
        continueButton.click();
    }
}
