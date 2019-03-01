package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
        super(driver);
    }
	
	
	private By header = By.xpath("/descendant::div[@id='header'][1]");
    private By usrname = By.xpath("//input[@type='text' and @id='login-form:email']");
    private By passwrd = By.xpath("//input[@id='login-form:password']");
    private By login = By.xpath("//input[@id='login-form:login']");
       
       
    
   public LoginPage gotoLoginPage(String username, String password){
	   writeText(usrname, username);
	   writeText(passwrd, password);
	   click(login);
	   return this;
   }
       

}