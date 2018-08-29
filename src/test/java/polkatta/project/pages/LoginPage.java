package polkatta.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver){

        this.driver = driver;
    }

    By fldUsername = By.xpath("//*[@id='ma_uname']");
    By fldpassword = By.xpath("//*[@id='ma_pwd']");
    By btnlogin    = By.xpath("//*[@value='Login']");

    public WebElement enterusername(){

        return driver.findElement(fldUsername);
    }

    public WebElement enterpassword(){

        return driver.findElement(fldpassword);
    }

    public WebElement pressloginbutton(){

        return driver.findElement(btnlogin);
    }


}
