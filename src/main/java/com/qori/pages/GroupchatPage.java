package com.qori.pages;

import com.aventstack.extentreports.util.Assert;
import com.qori.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class GroupchatPage extends TestBase {
    public GroupchatPage(){
        PageFactory.initElements(driver, "https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8");
    }

    //chat
    By click_teams_on_Dashboard = By.className("Card_Card__2LWWW");
    By click_groupchat = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[1]/a/div");
    By click_input_chat = By.className("CreateMessage_text__2pZbe");
    By input_chat = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[2]/div/div/div/p");
    By btn_sendMessage = By.className("CreateMessage_send__2f1ZQ");
    By suggestionmember = By.xpath("/html/body/div[3]/ul/li");


    //Attachment file photo
    By attachmentfile = By.xpath("//*[contains(@type,'file')]");
    By notifSuccessUploadfile = By.xpath("//*[contains(text(),'Upload attachments is success')]");

    //Photo
    String filename1 = "D:/Qori/QA/JAVA/Maven/bigproject-cilsy/src/test/filetest/cat.jpg";
    File file1 = new File(filename1);
    String path1 = file1.getAbsolutePath();

    //pdf
    String filename2 = "D:/Qori/QA/JAVA/Maven/bigproject-cilsy/src/test/filetest/dummy file.pdf";
    File file2 = new File(filename2);
    String path2 = file2.getAbsolutePath();



    //delete chat
    By ballonchat1 = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div/div[1]");
    By ballonchat2 = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div");
    By clickbuttonchat1 = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[4]/div/div/div[1]/div[1]");
    By downarrowBtn = By.xpath("//*[@id=\\\"list-groupChat-messages-section\\\"]/div/div/div[2]/div/div/div[1]/div[1]");
    By menudelete = By.className("MessageMenuPopUp_menu__1rkRG");
    By btndeletechat = By.className("Button_container__1WNuB");
    By notifdeletesuccess = By.xpath("//*[contains(text(),'Delete group chat message success')]");


    //Method attachment file
    public void UploadAttachmentFile1(){
        System.out.println("Upload file " + path1);
        driver.findElement(attachmentfile).sendKeys(path1);
    }

    public void UploadAttachmentFile2(){
        System.out.println("Upload file " + path2);
        driver.findElement(attachmentfile).sendKeys(path2);
    }

    public void getNotifSuccessUploadFile(){
        driver.findElement(notifSuccessUploadfile).isDisplayed();
    }

    //Delete chat
    public void clickBallonchat1(){
        driver.findElement(ballonchat1).click();
    }
    public void clickArrowDownBtn(){
        driver.findElement(downarrowBtn).click();
    }
    public void clickMenudelete(){
        driver.findElement(menudelete).click();
    }
    public void clickBtnDeleteChat(){
        driver.findElement(btndeletechat).click();
    }
    public void notifsuccessdelete(){
        driver.findElement(notifdeletesuccess).isDisplayed();
    }


    // chat
    public void clickTeams(){
        driver.findElement(click_teams_on_Dashboard).click();
    }

    public void clickGroupChat(){
        driver.findElement(click_groupchat).click();
    }

    public void clickInputChat(){
        driver.findElement(click_input_chat).click();
    }
    public void inputChat(String chat){
        driver.findElement(input_chat).sendKeys(chat);
    }

    public void sendMessageBtn(){
        driver.findElement(btn_sendMessage).click();
    }

    public void clickMentionMember(){
        driver.findElement(suggestionmember).click();
    }
}
