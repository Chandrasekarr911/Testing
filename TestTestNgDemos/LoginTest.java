package TestTestNgDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import aTestNGdemos.LoginPage;

public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        // Assuming you have ChromeDriver installed and its path set
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage = new LoginPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void loginWithValidCredentials() {
        LoginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.clickLoginButton();
        // Assuming there is some success page after login, you can assert that here
    }

    @Test
    public void loginWithInvalidCredentials() {
        loginPage.setUsername("invalidUsername");
        loginPage.setPassword("invalidPassword");
        loginPage.clickLoginButton();
        String errorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(errorMessage, "Invalid credentials");
    }
}
