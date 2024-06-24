package pl.coderslab.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingMethodCart {
    @FindBy(id = "delivery_option_8")
    private WebElement shippingMethodCheckbox;
    @FindBy(xpath = "//*[@id=\"js-delivery\"]/button")
    private WebElement continueButtonShipping;

    public ShippingMethodCart(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickContinueButtonShipping() {
        continueButtonShipping.click();
    }
}
