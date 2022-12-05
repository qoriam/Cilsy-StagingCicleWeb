package testcases;

import com.qori.base.TestBase;
import com.qori.pages.BoardPage;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BoardTest  extends TestBase {
    BoardPage boardPage;

    public BoardTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException{
        initialization();
        boardPage = new BoardPage();

        boardPage.clickTeams();
        Thread.sleep(2000);
        boardPage.clickBoardBtn();
        Thread.sleep(3000);
    }

    //test case post
    @Test(priority = 0)
    public void verify_assertionHome() throws InterruptedException {
        Assert.assertEquals(boardPage.validateBoard(), "Kanban Board - Team 1");
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    public void invalid_create_listBoard_bcs_empty_listname() throws InterruptedException{
        boardPage.clickAddListBoard();
        Thread.sleep(2000);
        boardPage.clickCreateListBtn();
        Thread.sleep(2000);
        boardPage.notifInvalidlistname();

//        String expectedMessage = "List name cannot be empty";
//        String message = driver.findElement(By.id("notistack-snackbar")).getText();
//        Assert.assertTrue(message.contains(expectedMessage), "Your error message");

//        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'List name cannot be empty')]")).isDisplayed());

    }

    @Test(priority = 2)
    public void create_list_board() throws InterruptedException {
        boardPage.clickAddListBoard();
        Thread.sleep(2000);
        boardPage.inputListName("List Test");
        boardPage.clickCreateListBtn();
        Thread.sleep(3000);

        String expectedMessage = "Creating list is success";
        String message = driver.findElement(By.id("notistack-snackbar")).getText();
        Assert.assertTrue(message.contains(expectedMessage), "Your error message");
    }

    @Test(priority = 3)
    public void invalid_create_card() throws InterruptedException {
        boardPage.clickAddCard();
        Thread.sleep(2000);
        boardPage.clickBtnCreadCard();
        Thread.sleep(2000);

        String expectedMessage = "Card name cannot be empty";
        String message = driver.findElement(By.id("notistack-snackbar")).getText();
        Assert.assertTrue(message.contains(expectedMessage), "Your error message");
    }

    @Test(priority = 4)
    public void create_card_success() throws InterruptedException{
        boardPage.clickAddCard();
        Thread.sleep(2000);
        boardPage.inputCardName("Card Test");
        Thread.sleep(2000);
        boardPage.clickBtnCreadCard();
        Thread.sleep(3000);

        String expectedMessage = "Creating card is success";
        String message = driver.findElement(By.id("notistack-snackbar")).getText();
        Assert.assertTrue(message.contains(expectedMessage), "Your error message");
    }

    @Test
    public void edit_nameboard() throws InterruptedException{
        boardPage.clickEditBoard();
        boardPage.clearTextEditBoard();
        boardPage.inputEditNameBoard("Board Edit" + Keys.ENTER);
        Thread.sleep(3000);

        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Update list is success')]")).isDisplayed());
    }

    @Test
    public void edit_board_with_tomuchcharacter() throws InterruptedException{
        boardPage.clickEditBoard();
        boardPage.clearTextEditBoard();
        Thread.sleep(2000);
        boardPage.enterTextEditBoard();
        Thread.sleep(3000);

        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Update list is success')]")).isDisplayed());

    }
    @Test
    public void add_comment()throws InterruptedException{
        boardPage.clickCardINList();
        Thread.sleep(3000);
        boardPage.clickInputComment();
        boardPage.scrollComment();
        boardPage.inputComment("Comment Test");
        boardPage.btnSubmitComment();
        boardPage.getNotifComment();
    }

//    @Test
//    public void invalid_edit_board() throws InterruptedException{
//        boardPage.clickEditBoard();
//        boardPage.clearTextEditBoard();
//        Thread.sleep(2000);
//        boardPage.invalidEditBoard();
//        Thread.sleep(3000);
//
//        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'List name cannot be empty')]")).isDisplayed());
//
//    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
