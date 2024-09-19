import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("WebDriver.chrome.driver",
			//	"C:\\Users\\sreej\\Downloads\\chromedriver-win32.zip\\chromedriver-win32");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		//explicit -webdriverwait
		WebDriverWait wedwait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wedwait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='start'] button")));
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		//explicit - fluent wait
		
		  Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		   WebElement Helloworld =driver.findElement(By.cssSelector("[id='finish'] h4"));
		  WebElement elemnt= wait.until(new Function<WebDriver , WebElement>() 
				  {
			  public WebElement apply(WebDriver driver) {
				  
			  if( Helloworld.isDisplayed()) {
				  return Helloworld;               //webelement is present in html code but not visible on webpage to capture
			  }else {                                //thats why we are iterating until webelement match with return type of webelement
				  return null;
			 }
				  }
				  });
		  System.out.println(Helloworld.getText());
	}

}
