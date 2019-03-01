package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    //*********Constructor*********
    public HomePage (WebDriver driver) {
        super(driver);
    }

    //*********Page Variables*********
    String baseURL = "http://demo.borland.com/InsuranceWebExtJS/";

    //*********Web Elements By Using Page Factory*********
    private By header = By.xpath("/descendant::div[@id='header'][1]");
    private By usrname = By.xpath("//input[@type='text' and @id='login-form:email']");
    private By passwrd = By.xpath("//input[@id='login-form:password']");
    private By login = By.xpath("//input[@id='login-form:login']");
    private By partialTxt= By.xpath("//p[contains(.,'Logged')]");   		
    private By signOutButton=By.xpath("//*[@class='cbutton' and @id='logout-form:logout']");
    		
    
   
    //*********Page Methods*********
    //Open Insurance Homepage
    public HomePage goToN11 (){
        driver.get(baseURL);
        return this;
    }

    public LoginPage gotoLoginPage(String username, String password){
  	   writeText(usrname, username);
  	   writeText(passwrd, password);
  	   click(login);
  	  return new LoginPage(driver);
     }
        
    //Read Text 
    public LoginPage readText (String text) {
    	readText(partialTxt);
    	return new LoginPage(driver);
    } 
    
    //Scroll Down using javascript Executor
    public LoginPage scrollDown () {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
		return null;
    } 
    
  //Go to SignOutPage
    public LoginPage goToSignOutPage (){
        click(signOutButton);
        return new LoginPage(driver);
    }
    	
}