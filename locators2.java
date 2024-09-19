import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		String name="sreeja" ;
	
		// TODO Auto-generated method stub
		//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\sreej\\Downloads\\chromedriver-win32.zip\\chromedriver-win32");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		String password=getPassword(driver);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//extract pass word from method can be in two ways ---1 way is put static in method --2 way is create object and perform object.method
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class*='login'] h2")).getText(), "Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText= driver.findElement(By.tagName("p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray=passwordText.split("'");
		//first time extract
		//0 th index -->Please use temporary password '
		//1st index-->rahulshettyacademy' to Login.
		//--> reference -->String[] passwordArray2=passwordArray[1].split("'");
		//-->reference -->passwordArray2[0];
		//second time extract
		//0th index --> rahulshettyacademy ---> this is the password we want to retrive and place in password variable
		//1st index -->' to login.
		String password= passwordArray[1].split("'")[0];
		return password;
		
		
	}
}
