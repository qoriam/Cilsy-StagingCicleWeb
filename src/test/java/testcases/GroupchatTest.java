package testcases;

import com.qori.base.TestBase;
import com.qori.pages.GroupchatPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupchatTest extends TestBase {
    GroupchatPage groupchatPage;

    public GroupchatTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException{
        initialization();
        groupchatPage = new GroupchatPage();

        groupchatPage.clickTeams();
        Thread.sleep(2000);
        groupchatPage.clickGroupChat();
        Thread.sleep(2000);
    }

    @Test
    public void send_chat_success() throws InterruptedException{
        groupchatPage.clickInputChat();
        groupchatPage.inputChat("Test");
        Thread.sleep(2000);
        groupchatPage.sendMessageBtn();
        Thread.sleep(2000);
    }

    @Test
    public void deletechat() throws InterruptedException{
        groupchatPage.clickBallonchat1();
        groupchatPage.clickArrowDownBtn();
        groupchatPage.clickMenudelete();
        groupchatPage.clickBtnDeleteChat();
        Thread.sleep(2000);
        groupchatPage.notifsuccessdelete();

    }

    @Test
    public void attachment_file() throws InterruptedException{
        groupchatPage.UploadAttachmentFile1();
        groupchatPage.getNotifSuccessUploadFile();
        Thread.sleep(3000);
    }

    @Test
    public void mention_member() throws InterruptedException{
        groupchatPage.clickInputChat();
        groupchatPage.inputChat("@");
        Thread.sleep(2000);
        groupchatPage.clickMentionMember();
        groupchatPage.sendMessageBtn();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
