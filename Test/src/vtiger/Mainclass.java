package vtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Mainclass {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		
		System.setProperty("webdriver.ie.driver","d://drivers//IEDriverServer32bit.exe");
        
        driver = new InternetExplorerDriver();
 
        driver.get("http://localhost/vtigercrm/");
 
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
       login.login(driver);
      // logout.logout(driver);
        Createticket.createticket(driver);
        
        
        
        


	}

}
