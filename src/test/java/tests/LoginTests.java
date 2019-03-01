package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test (priority = 0)
    public void LoginTest_validUserName_validPassword() throws Exception  {
    	
    	HomePage homePage = new HomePage(driver);
    	homePage.goToN11().gotoLoginPage("john.smith@gmail.com", "john");
    	Thread.sleep(5000);
    	homePage.readText("Logged");
     	homePage.scrollDown();
    	homePage.goToSignOutPage();
       		
    	}
}

        

   


