package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userNameTxt = By.name("username");
    private By passwordTxt = By.name("password");
    private By loginButton = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void setUserName(String userName){
        driver.findElement(userNameTxt).sendKeys(userName);
    }
    public void setPassword(String password){
        driver.findElement(passwordTxt).sendKeys(password);
    }
    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
