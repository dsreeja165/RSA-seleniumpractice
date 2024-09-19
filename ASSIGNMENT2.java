import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ASSIGNMENT2 {
	
	public static String password() {
		return "password1";
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/angularpractice/");
			driver.findElement(By.cssSelector("input[name='name']")).sendKeys("sreeja dasari");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dasarisreeja165@gmail.com");
			driver.findElement (By.id("exampleInputPassword1")).sendKeys(password());
			System.out.println(password());
			WebElement checkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));
			checkbox.click();
			WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
			Select dd = new Select(dropdown);
			dd.selectByVisibleText("Female");
			driver.findElement(By.cssSelector("input[id='inlineRadio1']")).click();
			driver.findElement(By.xpath("//input[@type='date']")).sendKeys("16/05/2000");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(2000);
			String successmessage = driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText();
			System.out.println(successmessage);
			
			/*Rahul sheety code--driver.get("https://rahulshettyacademy.com/angularpractice/");

driver.findElement(By.name("name")).sendKeys("rahul");

driver.findElement(By.name("email")).sendKeys("hello@abc.com");

driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");

driver.findElement(By.id("exampleCheck1")).click();

WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));

Select abc = new Select(dropdown);

abc.selectByVisibleText("Female");

driver.findElement(By.id("inlineRadio1")).click();

driver.findElement(By.name("bday")).sendKeys("02/02/1992");

driver.findElement(By.cssSelector(".btn-success")).click();

System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());*/
	}

}
