import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\sreej\\Downloads\\chromedriver-win32.zip\\chromedriver-win32");
	WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Sreeja");
		driver.findElement(By.name("inputPassword")).sendKeys("sreeja123");
		driver.findElement(By.className("signInBtn")).click();
		//implicit wait -->wait atleast 4 secs globally
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("sreeja");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sreeja@g,mail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("sreejasria83@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9182205788");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		Thread.sleep(2000);
		//achive from parent to child -in css selector
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys("sreeja");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'signIn')]")).click();
		
	}

}
