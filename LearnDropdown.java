package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();	
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.partialLinkText("Create")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Janani");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subramani");
			
			WebElement sourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
			 //instantiate my select class
			 Select sel=new Select(sourcedd);//shortcut for import the class is ctrl+shift+o
			 sel.selectByIndex(4);
			  WebElement MarketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			 //instantiate my select class
			 Select market=new Select(MarketingCampaign);//shortcut for import the class is ctrl+shift+o
			 market.selectByValue("CATRQ_AUTOMOBILE");
			 
			 WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			 //instantiate my select class
			 Select owner=new Select(Ownership);//shortcut for import the class is ctrl+shift+o
			 owner.selectByVisibleText("Corporation");
			 
			 driver.findElement(By.className("smallSubmit")).click();
		 

	}

}
