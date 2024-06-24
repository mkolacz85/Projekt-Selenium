package pl.coderslab.tests;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.coderslab.pages.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

public class TestOrderProduct {
    private WebDriver driver;
    private WebDriverWait wait;
    private WebElement checkoutButton;

    @Before
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void TestOrderProduct() throws IOException, InterruptedException {
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        HomePage homePage = new HomePage(driver);

        homePage.openSignInPage();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.setEmailInput("Mary1234@gmail.com");
        signInPage.setPasswordInput("password");
        signInPage.clickSignInButton();

        AccountPage accountPage = new AccountPage(driver);
        accountPage.clickHomeLink();
        homePage.setProduct();
        ProductPage productPage = new ProductPage(driver);
        productPage.chooseSize(1);
        Thread.sleep(2000);
        productPage.setQuantityInput("5");
        Thread.sleep(2000);
        productPage.clickAddToCart();
        Thread.sleep(2000);
        productPage.clickCheckoutButton();

        ShoppingCart shoppingCart = new ShoppingCart(driver);
        shoppingCart.clickCheckoutButton();

        AddressCart addressCart = new AddressCart(driver);
        addressCart.clickContinueButton();

        ShippingMethodCart shippingMethodCart = new ShippingMethodCart(driver);
        shippingMethodCart.clickContinueButtonShipping();

        PaymentCart paymentCart = new PaymentCart(driver);
        paymentCart.checkPaymentMethod();
        paymentCart.checkTermsCheckbox();
        paymentCart.clickConfirmButton();

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("src/main/resources/images/screenshot.png"));
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
