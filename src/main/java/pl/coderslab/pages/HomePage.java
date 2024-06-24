package pl.coderslab.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
@FindBy(css = "#_desktop_user_info > div > a > span")
    private WebElement signInLink;
@FindBy(xpath = "//*[@id=\"content\"]/section/div/div[2]/article/div/div[2]/h3/a")
private WebElement product;


    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.product = product;
}
public void openSignInPage(){
    signInLink.click();
}
    public void setProduct(){
        product.click();
}}
