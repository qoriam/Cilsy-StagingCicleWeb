package com.qori.pages;

import com.qori.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class CompaniesPage  extends TestBase {
    public CompaniesPage(){
        PageFactory.initElements(driver, "https://staging.cicle.app/companies/637e172a0a02aab47952ec80");
    }

    // Validate
    public String validateDashboard() {
        return driver.getTitle();
    }
}
