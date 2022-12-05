package testcases;

import com.qori.base.TestBase;
import com.qori.pages.BlastPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BlastTest extends TestBase {
    BlastPage blastPage;

    public BlastTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException{
        initialization();
        blastPage = new BlastPage();
        blastPage.clickTeams();
        blastPage.clickBlast();
        Thread.sleep(2000);
    }

    @Test
    public void invalid_create_blast() throws InterruptedException{
        blastPage.clickBtncreateblast();
        blastPage.inputTitleBlast("");
        blastPage.clickBtnPublish();
        blastPage.getNotifInvalidAddBlast();
    }

    @Test
    public void create_blast() throws InterruptedException{
        blastPage.clickBtncreateblast();
        blastPage.inputTitleBlast("Blast Test");
        blastPage.clickBtnPublish();
        blastPage.getNotifSuccessAddBlast();
    }

//    @Test
//    public void invalid_edit_blast() throws InterruptedException{
//        blastPage.cl
//    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
