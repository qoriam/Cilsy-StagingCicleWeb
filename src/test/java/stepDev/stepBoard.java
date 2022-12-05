package stepDev;

import com.qori.base.TestBase;
import com.qori.pages.BoardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class stepBoard extends TestBase {
    BoardPage boardPage;

    @Given("User navigate to board menu")
    public void userNavigateToBoardMenu() throws Exception {
        initialization();
        boardPage = new BoardPage();
        boardPage.clickTeams();
        boardPage.clickBoardBtn();
    }

    @When("User click menu board")
    public void userClickMenuBoard() {
        boardPage.clickBoardBtn();
    }

    @Then("User can see can see Kanban Board - Team {int}")
    public void userCanSeeCanSeeKanbanBoardTeam(int arg0) throws InterruptedException {
        Assert.assertEquals(boardPage.validateBoard(), "Kanban Board - Team 1");
        Thread.sleep(3000);
        driver.quit();
    }

    @When("User click add list")
    public void userClickAddList() {
        boardPage.clickAddListBoard();
    }

    @And("User click button create board")
    public void userClickButtonCreateBoard() throws InterruptedException {
        boardPage.clickCreateListBtn();
        Thread.sleep(3000);
    }

    @Then("User failed add listboard")
    public void userFailedAddListboard() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'List name cannot be empty')]")).isDisplayed());
        Thread.sleep(3000);
        driver.quit();
    }

    @And("User input listname")
    public void userInputListname() throws InterruptedException {
        boardPage.inputListName("List Test");
        Thread.sleep(2000);
    }

    @Then("User successfully add list board")
    public void userSuccessfullyAddListBoard() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Creating list is success')]")).isDisplayed());
        Thread.sleep(3000);
        driver.quit();
    }

    @When("User click add card")
    public void userClickAddCard() {
        boardPage.clickAddCard();
    }

    @And("User click button create card")
    public void userClickButtonCreateCard() throws InterruptedException {
        boardPage.clickBtnCreadCard();
        Thread.sleep(2000);
    }

    @Then("User failed add card")
    public void userFailedAddCard() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Card name cannot be empty')]")).isDisplayed());
        Thread.sleep(3000);
        driver.quit();
    }

    @And("User input name card")
    public void userInputNameCard() throws InterruptedException {
        boardPage.inputCardName("Card Test");
        Thread.sleep(2000);
    }

    @Then("User successfully add card")
    public void userSuccessfullyAddCard() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Creating card is success')]")).isDisplayed());
        Thread.sleep(3000);
        driver.quit();
    }

    @When("User click name board")
    public void userClickNameBoard() {
        boardPage.clickEditBoard();
    }

    @And("User edit name board")
    public void userEditNameBoard() throws InterruptedException {
        boardPage.inputEditNameBoard("Board Edit");
        Thread.sleep(2000);
    }

    @Then("User successfully edit name board")
    public void userSuccessfullyEditNameBoard() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Update list is success')]")).isDisplayed());
        Thread.sleep(3000);
        driver.quit();
    }

    @And("User clear text name")
    public void userClearTextName() {
        boardPage.clearTextEditBoard();
    }


    @Then("User can see can see Kanban Board")
    public void userCanSeeCanSeeKanbanBoard() throws InterruptedException {
        Assert.assertEquals(boardPage.validateBoard(), "Kanban Board - Team 1");
        Thread.sleep(3000);
        driver.quit();
    }

    @When("User click card")
    public void userClickCard() {
        boardPage.clickCardINList();
    }

    @Then("User successfully comment")
    public void userSuccessfullyComment() {
        boardPage.getNotifComment();
        driver.quit();
    }

    @And("User click comment board")
    public void userClickCommentBoard() {
        boardPage.clickInputComment();
    }

    @And("User input comment board")
    public void userInputCommentBoard() throws InterruptedException {
        boardPage.inputComment("Comment Test");
        Thread.sleep(2000);
    }

    @Then("User successfully comment board")
    public void userSuccessfullyCommentBoard() {
        boardPage.getNotifComment();
        driver.quit();
    }

    @Given("User navigate to teams")
    public void userNavigateToTeams() {
    boardPage.clickTeams();
    }

    @And("User edit name with many character")
    public void userEditNameWithManyCharacter() throws InterruptedException {
        boardPage.enterTextEditBoard();
        Thread.sleep(2000);
    }

    @And("User click button post")
    public void userClickButtonPost() throws InterruptedException {
        boardPage.btnSubmitComment();
        Thread.sleep(2000);
    }
}