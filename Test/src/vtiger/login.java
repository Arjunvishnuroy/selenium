package vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	WebDriver driver;
	public static void login(WebDriver driver)
	{
		WebElement username;
		WebElement password;
		WebElement submit;
		 username=driver.findElement(By.id("username"));
	        username.sendKeys("admin");
	        password=driver.findElement(By.name("password"));
	        password.sendKeys("1234");
	        submit=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/form/div[3]/button"));
	        submit.click();
	}

}
