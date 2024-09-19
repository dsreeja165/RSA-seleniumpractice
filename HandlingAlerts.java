import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) {

		String text = "areeja";
		String text1 = "ssreeja";
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.findElement(By.id("name")).sendKeys(text1);
		driver.findElement(By.id("confirmbtn")).click();

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}

}
