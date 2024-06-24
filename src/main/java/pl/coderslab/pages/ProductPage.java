package pl.coderslab.pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ProductPage {

    private WebDriver driver;
    @FindBy(id = "group_1")
    private WebElement sizeDropDown;
    @FindBy(id = "quantity_wanted")
    private WebElement quantityInput;
    @FindBy(xpath = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")
    private WebElement addToCartButton;
    @FindBy(xpath = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")
    private WebElement checkoutButton;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void chooseSize(int index) {
        Select selectSize = new Select(sizeDropDown);
        selectSize.selectByIndex(index);


    }

    public void setQuantityInput(String quantity) {
        quantityInput.sendKeys(Keys.DELETE);
        quantityInput.sendKeys(quantity);
    }

    public void clickAddToCart() {
        addToCartButton.click();
    }

    public void clickCheckoutButton() {
        checkoutButton.click();
    }

}

