import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class updatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		//int i=1;
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			for(int i=1;i<5;i++) {
				driver.findElement(By.id("hrefIncAdt")).click(); 
			}
			/*while( i<5) {
				driver.findElement(By.id("hrefIncAdt")).click(); 
				i++;//loop will happen for 4 adults
			}*/
			
			Thread.sleep(2000);
			driver.findElement(By.id("btnclosepaxoption")).click();
					System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
					Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
					
			driver.quit();
	}

}
