package pl.coderslab.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentCart {
    @FindBy(id="payment-option-1")
    private WebElement paymentMethodCheckbox;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    private WebElement termsCheckbox;

    @FindBy(xpath = "//*[@id=\"payment-confirmation\"]/div[1]/button")
    private WebElement confirmButton;
    public PaymentCart(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void checkPaymentMethod(){
        paymentMethodCheckbox.click();
    }
    public void checkTermsCheckbox(){
        termsCheckbox.click();
    }
    public void clickConfirmButton(){
        confirmButton.click();
    }
}
