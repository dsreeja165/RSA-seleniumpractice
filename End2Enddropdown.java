import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class End2Enddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
			//calender
			
			driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
			
			
			//checkbox 
			WebElement Checkin= driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
			Checkin.click();
			//no of pasengers
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000);
			for(int i=1;i<5;i++) {
				driver.findElement(By.id("hrefIncAdt")).click(); 
			}
			//curencydropdown
			WebElement Staticdropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			
			Select dropdown = new Select(Staticdropdown);
			//select dropdown based on index
			dropdown.selectByIndex(3);
			System.out.println(dropdown.getFirstSelectedOption().getText());
			
			driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();			     
	}

}
