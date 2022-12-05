package com.qori.pages;

import com.qori.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class BlastPage extends TestBase {
    public BlastPage(){
        PageFactory.initElements(driver, "https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8");
    }

    //Locator
    By click_teams_on_Dashboard = By.className("Card_Card__2LWWW");
    By click_blast_on_Teams = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]");

    //create blast
    By btncreateblast= By.className("GlobalActionButton_container__EJ7Lh");
    By inputTitleBlast = By.xpath("//*[contains(@placeholder,'Type a title...')]");
    By btnPublish = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[6]/button");
    By notifInvalidAddBlast = By.xpath("//*[contains(text(),'Field parameter not complete.')]");

    By notifSuccessAddBlast = By.xpath("//*[contains(text(),'Create post successful')]");

    //locator for edit blast
    By click_blast_edit = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div/div/div/div[2]/a/div");
    By click_tripledot = By.cssSelector("#root > div.Main_container__39jS7 > div.Main_mainCol__3MC7n > div > div > div.PostBlastPage_headerSection__QUMQs > div.PostBlastPage_menuSection__2mg_7 > div");
    By click_option_edit= By.xpath("//*[contains(text(),'Edit')]");
    //css=.PostBlastPage_menuSection__2mg_7 .MuiSvgIcon-root
    By edit_title = By.xpath("//*[contains(@placeholder,'Type a title...')]");
    By btn_SaveChanges = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[6]/button");
    By notifSuccesEdit = By.xpath("//*[contains(text(),'Update post successful')]");

    //comment blast
    By click_inputcomment = By.xpath("//*[contains(@placeholder,'Add new comment...')]");
//    By input_comment = By.xpath("//*[contains(text(),'Tell your story here...')]");
    By input_comment = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div/div/div[1]/div[2]/div[2]/div[1]/div/div/div[3]/div/p");
//
    By btn_post_comment = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div/div/div[1]/div[2]/div[2]/div[2]/button[2]");

    By notifSuccesComment = By.xpath("//*[contains(text(),'Create comment on blast post successful')]");

    public void clickTeams(){
        driver.findElement(click_teams_on_Dashboard).click();
    }
    public void clickBlast(){
        driver.findElement(click_blast_on_Teams).click();
    }
    public void clickBtncreateblast(){
        driver.findElement(btncreateblast).click();
    }
    public void inputTitleBlast(String title){
        driver.findElement(inputTitleBlast).sendKeys(title);
    }
    public void clickBtnPublish(){
        driver.findElement(btnPublish).click();
    }
    public void getNotifInvalidAddBlast(){
        driver.findElement(notifInvalidAddBlast).isDisplayed();
    }
    public void getNotifSuccessAddBlast(){
        driver.findElement(notifSuccessAddBlast).isDisplayed();
    }

    //edit blast
    public void clickBlastEdit(){
        driver.findElement(click_blast_edit).click();
    }
    public void clickTripleDot(){
        driver.findElement(click_tripledot).click();
    }
    public void clickOptionEdit(){
        driver.findElement(click_option_edit).click();
    }
   public void clickClearTitleEdit(){
        driver.findElement(edit_title).click();
   }
    public void clearTitleEdit(){
        driver.findElement(edit_title).clear();
    }
    public void inputTitleEdit(String edittitle){
        driver.findElement(edit_title).sendKeys(edittitle);
    }
    public void clickBtnSavedChange(){
        driver.findElement(btn_SaveChanges).click();
    }
    public void getNotifSuccessEdit(){
        driver.findElement(notifSuccesEdit).isDisplayed();
    }

    //comment
    public void clickInputComment(){
        driver.findElement(click_inputcomment).click();
    }
    public void inputComment(String comment){
        driver.findElement(input_comment).sendKeys(comment);
    }
    public void clickBtnPost(){
        driver.findElement(btn_post_comment).click();
    }
    public void getNotifSuccessComment(){
        driver.findElement(notifSuccesComment).isDisplayed();
    }

}
