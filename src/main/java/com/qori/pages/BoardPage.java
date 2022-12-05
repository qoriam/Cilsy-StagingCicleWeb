package com.qori.pages;

import com.aventstack.extentreports.util.Assert;
import com.qori.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

public class BoardPage extends TestBase {
    public BoardPage(){
        PageFactory.initElements(driver, "https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8");
    }

    //Locator List Board
    By click_teams_on_Dashboard = By.className("Card_Card__2LWWW");
    By click_board_on_Teams = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[1]/a/div");
    By btn_add_list_on_Board = By.className("Button_container__1WNuB Button_flexStart__2nS1S");
    By btn_add_listBoard2 = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/button/div");
    By input_name_list = By.name("name");
    By btn_create_name_list = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/form/div[2]/div/button/div");
    By btn_createListBoard2 = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/form/div[2]/div/button/div");
    By notif_success_add_listBoard = By.id("notistack-snackbar");
    By listboardtest = By.xpath("//*[@id=\"listcard_content-1\"]/div[2]/div/div/a");

    By clickeditname = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div/div/div[1]/div[1]/div");
    By editnameboard = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div/div/div[1]/div[1]/div/div/div/form/input");

    //Locator card
    By btn_add_card = By.className("ListContainer_ListContainer__buttonBottom__2kZAI");
    By input_card_name = By.xpath("//input[@placeholder='Card name']");
    By btn_create_card = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div/div/div[4]/div[3]/button");


    //Locator card details
    By click_card_on_list = By.xpath("//*[@id=\"listcard_content-1\"]/div[1]/div/div/a");
    By clickinput_comment = By.className("CreateCommentForm_inputComment__2G2m9");
    By input_comment = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[7]/div/div/div/div[2]/div[2]/div[1]/div/div/div[2]/div/p");

//    By btn_post_comment = By.xpath("//*[contains(text(),'Post')]");
    By btn_post_comment = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[7]/div/div/div/div[2]/div[2]/div[2]/button[2]");


    By notifinvalidlistname = By.xpath("//*[contains(text(),'List name cannot be empty')]");
    By notifSuccessComment = By.xpath("//*[contains(text(),'Create comment is success')]");
    public void notifInvalidlistname(){
        driver.findElement(notifinvalidlistname).isDisplayed();
    }

    //Method Board
    public void clickTeams(){
        driver.findElement(click_teams_on_Dashboard).click();
    }
    public void clickBoardBtn(){
        driver.findElement(click_board_on_Teams).click();
    }

    public void clickAddListBoard(){
        driver.findElement(btn_add_listBoard2).click();
    }

    public void inputListName(String namelist){
        driver.findElement(input_name_list).sendKeys(namelist);
    }

    public void clickCreateListBtn(){
        driver.findElement(btn_createListBoard2).click();
    }

    public void clickEditBoard(){
        driver.findElement(clickeditname).click();
    }
    public void clearTextEditBoard(){
        driver.findElement(editnameboard).clear();
    }
    public void enterTextEditBoard(){
        //character 150, to be normal 50 character
        driver.findElement(editnameboard).sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + Keys.ENTER);
    }

    public void invalidEditBoard(){
        driver.findElement(editnameboard).sendKeys(""+ Keys.ENTER);
    }

    public void inputEditNameBoard(String editboard){
        driver.findElement(editnameboard).sendKeys(editboard+Keys.ENTER);
    }


    //Method Card
    public void clickAddCard(){
        driver.findElement(btn_add_card).click();
    }

    public void inputCardName(String cardname){
        driver.findElement(input_card_name).sendKeys(cardname);
    }
    public void clickBtnCreadCard(){
        driver.findElement(btn_create_card).click();
    }

    //validate
    public String validateBoard(){
        return driver.getTitle();
    }

    public void notifSuccessAddBoardList(){
        driver.findElement(notif_success_add_listBoard);
    }

    //comment
    public void clickCardINList(){
        driver.findElement(click_card_on_list).click();
    }
    public void clickInputComment(){
        driver.findElement(clickinput_comment).click();
    }
    public void inputComment(String comment){
        driver.findElement(input_comment).sendKeys(comment);
    }
    public void btnSubmitComment(){
        driver.findElement(btn_post_comment).click();
    }

    public void getNotifComment(){
        driver.findElement(notifSuccessComment).isDisplayed();
    }

    //to scroll
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public void scrollComment(){
        js.executeScript("window.scrollBy(0,1000)");
    }
}
