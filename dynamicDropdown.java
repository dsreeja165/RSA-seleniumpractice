import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			Thread.sleep(2000);
			//with index , becoz browser gives 2 elements
			//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); 
			//with parent-child method to locate an element
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
			//Autosuggestive dropwdown from URL BRowser
			driver.findElement(By.id("autosuggest")).sendKeys("ind");
			Thread.sleep(2000);
			//li[@class='ui-menu-item']/a --- xpath for list of options
			List<WebElement> options= driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
			
			for(WebElement option:options) 
			{
				if(option.getText().equalsIgnoreCase("india"))  //equals will ignore case 
				//if(option.getText().equals("India"))  //one way of writing if condition with equals (we have give correct case and speelling)
				//if(option.getText().equals("india")) // this is example of above If condition giving India as india
				{
					option.click();
					break;
				}
			}
			
			//checkbox 
			WebElement Checkin= driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
			//Regular expression for CSS selector locator for above id--> input[id*='friendsand']
			Assert.assertFalse(Checkin.isSelected());
			//System.out.println( Checkin.isSelected());
			Checkin.click();
			//System.out.println( Checkin.isSelected());
			Assert.assertTrue(Checkin.isSelected());
			//count of checkboxes in browser --->makesure we have same type value in all the check boxes
			List<WebElement> count= driver.findElements(By.cssSelector("input[type='checkbox']"));
			System.out.println(count.size());
			
	}

	
}
