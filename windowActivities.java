import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowActivities {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\sreej\\Downloads\\chromedriver-win32.zip\\chromedriver-win32");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();;
		driver.get("https://www.google.com"); ///selenium waits untill componenets are full loaded 
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");// but in thi scase it doesnt wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.navigate().back();
	    driver.navigate().forward();
	}

}
