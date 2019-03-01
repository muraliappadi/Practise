package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    

    @BeforeMethod
    public void setup () throws Exception {
    	
        //Create a Chromedriver. All test classes use this.
    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//main//resources//chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(4000);
		
        //Maximize Window
        driver.manage().window().maximize();
        

        //Create a wait. All test classes use this.
        wait = new WebDriverWait(driver,15);

        //Maximize Window
        driver.manage().window().maximize();
       
    }

    @AfterMethod
    public void teardown () {
        driver.quit();
    }
}
