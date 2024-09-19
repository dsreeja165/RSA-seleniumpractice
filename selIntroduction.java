import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoking Chrome driver 
		//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\sreej\\Downloads\\chromedriver-win32.zip\\chromedriver-win32");
		//invoking browser
		//Chrome Browser
		//ChromeDriver driver2= new ChromeDriver();
		//Firefox Browser
		//FirefoxDriver driver1 = new FirefoxDriver();
		//Edge Browser
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		String Title = driver.getTitle();
		System.out.println(Title);
		String URL =driver.getCurrentUrl();
		System.out.println(URL);
		//String Source = driver.getPageSource(); //to retrive all the source code of current url
		//System.out.println(Source);
		driver.close();

	}

}
