package pl.coderslab.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {

    @FindBy(css = "#main > div > div.cart-grid-right.col-xs-12.col-lg-4 > div.card.cart-summary > div.checkout.cart-detailed-actions.js-cart-detailed-actions.card-block > div > a")
    private WebElement checkoutButton;
    private WebDriver driver;

    public ShoppingCart(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void clickCheckoutButton() {
        checkoutButton.click();

    }
}
