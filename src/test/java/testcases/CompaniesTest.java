package testcases;

import com.qori.base.TestBase;
import com.qori.pages.CompaniesPage;
import com.qori.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CompaniesTest extends TestBase {
    CompaniesPage companiesPage;

    public CompaniesTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException{
        initialization();
        companiesPage = new CompaniesPage();
    }

    @Test
    public void verify_assertionHome() throws InterruptedException {
        Assert.assertEquals(companiesPage.validateDashboard(), "Home");
        Thread.sleep(3000);
    }




    @AfterMethod
    public void tearDown(){


    }
}
