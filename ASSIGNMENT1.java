import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class ASSIGNMENT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			//Checkboxes
			WebElement Checkin=driver.findElement(By.id("checkBoxOption1"));

			Checkin.click(); //checking the checkbox

			Assert.assertTrue(Checkin.isSelected());

			Checkin.click(); //unchecking the check box

			Assert.assertFalse(Checkin.isSelected());
			List<WebElement>  Count= driver.findElements(By.xpath("//input[@type='checkbox']"));

			System.out.println(Count.size());
			
	}

}
