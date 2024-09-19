import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\sreej\\Downloads\\chromedriver-win32.zip\\chromedriver-win32");
		WebDriver driver = new ChromeDriver();
		//sibling -xpath
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//parent +sibiling xpath -->//header/div/button[1]/following-sibling::button[1]
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		//child to parent --> //header/div/button[1]/parent::div
		System.out.println(driver.findElement(By.xpath("//header/div/button/parent::div/button[2]")).getText());
	}

}
