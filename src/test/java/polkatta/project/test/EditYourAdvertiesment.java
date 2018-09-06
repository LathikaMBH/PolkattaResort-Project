package polkatta.project.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import polkatta.project.pages.*;
import polkatta.project.util.EnvironmentConstants;

public class EditYourAdvertiesment {


    @Test

    public void editmyAdvertiesmentTest(){

        System.setProperty("webdriver.chrome.driver","E:\\MY WORKSPACE\\PolkattaResortProject\\PolkattaResort-Project\\install\\drivers\\chromedriver.exe");

        WebDriver driver    = new ChromeDriver();
        HomePage homePage   = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ActionMenuPage actionMenuPage = new ActionMenuPage(driver);
        MyAccountPage myAccountPage   = new MyAccountPage(driver);
        MyAccountEditPage myAccountEditPage = new MyAccountEditPage(driver);
        UpdatePicturePage updatePicturePage = new UpdatePicturePage(driver);



        driver.get(EnvironmentConstants.BASE_URL);
        homePage.presspostadbutton().click();
        loginPage.enterusername().sendKeys("amilak");
        loginPage.enterpassword().sendKeys("dulina123");
        loginPage.pressloginbutton().click();
        loginPage.enterusername().sendKeys("amilak");
        loginPage.enterpassword().sendKeys("dulina123");
        loginPage.pressloginbutton().click();
        actionMenuPage.pressvieweditdeletebutton().click();
        myAccountPage.presseditbutton().click();
        myAccountEditPage.presssavebutton().click();
        updatePicturePage.pressupdatepicturebutton().click();

        driver.close();


    }
}
