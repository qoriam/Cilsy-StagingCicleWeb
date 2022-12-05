package testcases;

import com.qori.base.TestBase;
import com.qori.pages.CompaniesPage;
import com.qori.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.ConcurrentMap;

public class LoginTest extends TestBase {
    LoginPage loginPage;

    public LoginTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException{
        initialization();
        loginPage = new LoginPage();
    }

    @Test
    public void verify_success_login(){
        loginPage.clickGoogleLoginBtn();
        loginPage.inputGoogleEmailField(properties.getProperty("username"));
        loginPage.clickGoogleNextBtn();
        loginPage.inputGooglePassField(properties.getProperty("password"));
        loginPage.clickGoogleNextAfterPassBtn();
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
