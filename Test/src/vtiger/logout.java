package vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logout {
	WebDriver driver;
	public static void logout(WebDriver driver)

	{
		WebElement logout;
		WebElement logoutclick;
		logout=driver.findElement(By.xpath("/html/body/div[1]/nav/div[1]/div/div[3]/ul/li[5]/div/a/span[1]"));
		logout.click();
		logoutclick=driver.findElement(By.xpath("//*[@id=\"menubar_item_right_LBL_SIGN_OUT\"]"));
		logoutclick.click();
	}
}
