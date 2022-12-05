package stepDev;

import com.qori.base.TestBase;
import com.qori.pages.BlastPage;
import com.qori.pages.BoardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepBlast extends TestBase {
    BlastPage blastPage;

    @Given("User navigate to blast menu")
    public void userNavigateToBlastMenu() {
        initialization();
        blastPage = new BlastPage();
        blastPage.clickTeams();
        blastPage.clickBlast();
    }

    @When("User click create blast")
    public void userClickCreateBlast() {
        blastPage.clickBtncreateblast();
    }

    @And("User input title blast empty")
    public void userInputTitleBlastEmpty() {
        blastPage.inputTitleBlast("");
    }

    @And("User click publish blast")
    public void userClickPublishBlast() throws InterruptedException {
        blastPage.clickBtnPublish();
        Thread.sleep(3000);
    }

    @Then("User failed add blast")
    public void userFailedAddBlast() {
        blastPage.getNotifInvalidAddBlast();
        driver.quit();
    }

    @And("User input title blast")
    public void userInputTitleBlast() {
        blastPage.inputTitleBlast("Test Blast");
    }

    @Then("User successfully create blast")
    public void userSuccessfullyCreateBlast() {
        blastPage.getNotifSuccessAddBlast();
        driver.quit();
    }

    @When("User click blast post")
    public void userClickBlastPost() {
        blastPage.clickBlastEdit();
    }

    @And("User click triple dot icon")
    public void userClickTripleDotIcon() throws InterruptedException {
        blastPage.clickTripleDot();
        Thread.sleep(2000);
        blastPage.clickOptionEdit();
    }

    @And("User clear text title blast")
    public void userClearTextTitleBlast() throws InterruptedException {
        blastPage.clickClearTitleEdit();
        blastPage.clearTitleEdit();
        Thread.sleep(2000);
    }

    @Then("User failed edit title blast")
    public void userFailedEditTitleBlast() {
//        blastPage.getNotif
    }

    @And("User edit title blast")
    public void userEditTitleBlast() throws InterruptedException {
        blastPage.clearTitleEdit();
        Thread.sleep(2000);
        blastPage.inputTitleEdit("Blast Updated");
    }

    @Then("User successfully edit title blast")
    public void userSuccessfullyEditTitleBlast() {
        blastPage.getNotifSuccessEdit();
        driver.quit();
    }

    @And("User click comment")
    public void userClickComment() {
        blastPage.clickInputComment();
    }

    @And("User input comment")
    public void userInputComment() {
        blastPage.inputComment("Comment Test");
    }

    @And("User click button send comment")
    public void userClickButtonSendComment() throws InterruptedException {
        blastPage.clickBtnPost();
        Thread.sleep(2000);
    }

    @Then("User successfully add comment")
    public void userSuccessfullyAddComment() throws InterruptedException {
        blastPage.getNotifSuccessComment();
        Thread.sleep(2000);
        driver.quit();
    }
}
