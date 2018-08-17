package vtiger;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Createticket {
	WebDriver driver; 
	public static void createticket(WebDriver driver)
	{
		WebElement quickcreate, ticket,title,description,save;
		
		quickcreate=driver.findElement(By.xpath("//*[@id=\"menubar_quickCreate\"]"));
		quickcreate.click();
		
		ticket=driver.findElement(By.xpath("/html/body/div[1]/nav/div[1]/div/div[3]/ul/li[1]/div/ul/li[2]/div/div[1]/div[3]/a/span"));
		ticket.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		title=driver.findElement(By.xpath("//*[@id=\"HelpDesk_editView_fieldName_ticket_title\"]"));
		title.sendKeys("Mr");
		
		
		Select priority = new Select (driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div/div[1]/div/table/tbody/tr[2]/td[2]/select")));
		priority.selectByVisibleText("Low");
		
		description=driver.findElement(By.xpath("//*[@id=\"HelpDesk_editView_fieldName_description\"]"));
		description.sendKeys("new ticket");
		
		
		Select assignedto=new Select (driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div/div[1]/div/table/tbody/tr[1]/td[4]/select")));
		assignedto.selectByVisibleText("Support Group");
		
		
		Select status =new Select(driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div/div[1]/div/table/tbody/tr[2]/td[4]/select")));
		status.selectByVisibleText("In Progress");
		save=driver.findElement(By.name("saveButton"));
		save.click();
		
	}

}
