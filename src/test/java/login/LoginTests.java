package login;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests {
    @Test
    @DisplayName("TC01-Login successfully")
    public void testLoginSucessfull(){
        loginPage.setUserName("Admin");
        loginPage.setPassword("admin123");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
//        String alertText = secureAreaPage.getAlertText();
//        Assertions.assertFalse(alertText.contains("Invalid credentials"), "Alert text is incorrect");
    }
    @Test
    @DisplayName("TC02-Login Failed")
    public void testLoginFail(){
        loginPage.setUserName("Admin");
        loginPage.setPassword("ad123");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        String alertText = secureAreaPage.getAlertText();
        Assertions.assertTrue(alertText.contains("Invalid credentials"), "Alert text is incorrect");
    }
    @Test
    @DisplayName("TC03-Login Failed")
    public void testLoginFail1(){
        loginPage.setUserName("Admin1");
        loginPage.setPassword("ad123");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        String alertText = secureAreaPage.getAlertText();
        Assertions.assertTrue(alertText.contains("Invalid credentials"), "Alert text is incorrect");
    }
    @Test
    @DisplayName("TC04-Login Failed")
    public void testLoginFail2(){
        loginPage.setUserName("");
        loginPage.setPassword("");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        String requireAlertUsername = secureAreaPage.getRequireAlerUserName();
        Assertions.assertTrue(requireAlertUsername.contains("Required"), "Alert text is incorrect");
        String requireAlertPassword = secureAreaPage.getRequireAlerPassword();
        Assertions.assertTrue(requireAlertPassword.contains("Required"), "Alert text is incorrect");
    }
    @Test
    @DisplayName("TC05-Login Failed")
    public void testLoginFail3(){
        loginPage.setUserName("");
        loginPage.setPassword("admin123");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        String requireAlert = secureAreaPage.getRequireAlerUserName();
        Assertions.assertTrue(requireAlert.contains("Required"), "Alert text is incorrect");
    }
    @Test
    @DisplayName("TC06-Login Failed")
    public void testLoginFail4(){
        loginPage.setUserName("");
        loginPage.setPassword("min123");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        String requireAlert = secureAreaPage.getRequireAlerUserName();
        Assertions.assertTrue(requireAlert.contains("Required"), "Alert text is incorrect");
    }
    @Test
    @DisplayName("TC07-Login Failed")
    public void testLoginFail5(){
        loginPage.setUserName("Admin");
        loginPage.setPassword("");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        String requireAlert = secureAreaPage.getRequireAlerPassword();
        Assertions.assertTrue(requireAlert.contains("Required"), "Alert text is incorrect");
    }
    @Test
    @DisplayName("TC08-Login Failed")
    public void testLoginFail6(){
        loginPage.setUserName("Amin");
        loginPage.setPassword("");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        String requireAlert = secureAreaPage.getRequireAlerPassword();
        Assertions.assertTrue(requireAlert.contains("Required"), "Alert text is incorrect");
    }
}
