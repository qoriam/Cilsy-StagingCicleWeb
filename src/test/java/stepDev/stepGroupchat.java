package stepDev;

import com.qori.base.TestBase;
import com.qori.pages.BoardPage;
import com.qori.pages.GroupchatPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sun.security.mscapi.CPublicKey;

public class stepGroupchat extends TestBase {
    GroupchatPage groupchatPage;
    @Given("User navigate to group chat menu")
    public void userNavigateToGroupChatMenu() {
        initialization();
        groupchatPage = new GroupchatPage();
        groupchatPage.clickTeams();
        groupchatPage.clickGroupChat();
    }

    @When("User click chat")
    public void userClickChat() {
        groupchatPage.clickInputChat();
    }

    @And("User input chat")
    public void userInputChat() {
        groupchatPage.inputChat("Test chat delete");
    }

    @And("User click send message")
    public void userClickSendMessage() throws InterruptedException {
        groupchatPage.sendMessageBtn();
        Thread.sleep(2000);
    }

    @Then("User successfully send message")
    public void userSuccessfullySendMessage() {
        driver.quit();
    }

    @And("User click ballon message")
    public void userClickBallonMessage() {
    }

    @And("User click delete message")
    public void userClickDeleteMessage() {
        groupchatPage.clickMenudelete();
    }

    @And("User click delete")
    public void userClickDelete() {
        groupchatPage.clickBtnDeleteChat();
    }

    @Then("User successfully delete message")
    public void userSuccessfullyDeleteMessage() {
        groupchatPage.notifsuccessdelete();
    }


    @When("User click menu attachment")
    public void userClickMenuAttachment() {
    }

    @And("User input file")
    public void userInputFile() {
       groupchatPage.UploadAttachmentFile1();
    }

    @Then("User successfully attachment file")
    public void userSuccessfullyAttachmentFile() throws InterruptedException {
        groupchatPage.getNotifSuccessUploadFile();
        Thread.sleep(3000);
        driver.quit();
    }

    @And("User input mention member")
    public void userInputMentionMember() {
        groupchatPage.inputChat("@Q");
    }

    @Then("User successfully mention member")
    public void userSuccessfullyMentionMember() {
        driver.quit();
    }

    @And("User click suggestion member")
    public void userClickSuggestionMember() {
        groupchatPage.clickMentionMember();
    }

    @When("User click chat ballon message")
    public void userClickChatBallonMessage() {
        groupchatPage.clickBallonchat1();
    }

    @And("User click button ballon message")
    public void userClickButtonBallonMessage() {
        groupchatPage.clickArrowDownBtn();
    }

    @And("User click button down arrow message")
    public void userClickButtonDownArrowMessage() {
        groupchatPage.clickArrowDownBtn();
    }

    @When("User input file pdf")
    public void userInputFilePdf() {
        groupchatPage.UploadAttachmentFile2();
    }
}
