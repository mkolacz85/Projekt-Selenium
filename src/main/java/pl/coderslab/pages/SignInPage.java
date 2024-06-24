package pl.coderslab.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    @FindBy(id = "field-email")
    private WebElement emailInput;
    @FindBy(id = "field-password")
    private WebElement passwordInput;
    @FindBy(css = "#submit-login")
    private WebElement signInButton;
    @FindBy(xpath = "//*[@id=\"category-3\"]/a")
    private WebElement clothesLink;
private WebDriver driver;
    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setEmailInput(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void setPasswordInput(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

}

