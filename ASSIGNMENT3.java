import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ASSIGNMENT3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		String username = "rahulshettyacademy";
		String password = "learning";

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		// entering username and password
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		// click on user radio button
		driver.findElement(By.xpath("//input[@value='user']")).click();

		// explicit wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.modal-body")));
		// click on okay button
		driver.findElement(By.cssSelector("button.btn.btn-success")).click();
		// select the dropdown
		WebElement element = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(element);
		dropdown.selectByValue("consult");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.id("signInBtn")).click();
		// explicit wait until the page loads
		wait.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop"));
		// using for loops to add the items into cart

		List<WebElement> addelement = driver.findElements(By.cssSelector("h4.card-title"));
		for (int i = 0; i < addelement.size(); i++) {
			driver.findElements(By.cssSelector("button.btn.btn-info")).get(i).click();
		}

		// checkout page
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
	}

}

/*
 * assignment-rahulsheety code import java.time.Duration;
 * 
 * import java.util.List;
 * 
 * import java.util.concurrent.TimeUnit;
 * 
 * 
 * 
 * import org.openqa.selenium.By;
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * import org.openqa.selenium.Keys;
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * import org.openqa.selenium.WebDriver;
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * import org.openqa.selenium.WebElement;
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * import org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import org.openqa.selenium.support.ui.ExpectedConditions;
 * 
 * import org.openqa.selenium.support.ui.Select;
 * 
 * import org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * public class Assignment2 {
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * public static void main(String[] args) throws InterruptedException {
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * System.setProperty("webdriver.chrome.driver",
 * "/Users/rahulshetty/Documents/chromedriver");
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * WebDriver driver=new ChromeDriver();
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * driver.get("https://rahulshettyacademy.com/loginpagePractise/");
 * 
 * 
 * 
 * 
 * 
 * driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
 * 
 * driver.findElement(By.id("password")).sendKeys("learning");
 * 
 * driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
 * 
 * //Thread.sleep(3000);
 * 
 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
 * 
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
 * 
 * driver.findElement(By.id("okayBtn")).click();
 * 
 * WebElement options =
 * driver.findElement(By.xpath("//select[@class='form-control']"));
 * 
 * Select dropdown = new Select(options);
 * 
 * dropdown.selectByValue("consult");
 * 
 * driver.findElement(By.id("signInBtn")).click();
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(
 * "Checkout")));
 * 
 * List <WebElement> products =
 * driver.findElements(By.cssSelector(".card-footer .btn-info"));
 * 
 * for(int i =0;i<products.size();i++)
 * 
 * {
 * 
 * products.get(i).click();
 * 
 * }
 * 
 * driver.findElement(By.partialLinkText("Checkout")).click();}
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 */
