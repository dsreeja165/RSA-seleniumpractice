import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Greenkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String[] list = { "Cucumber", "Brocolli", "Beetroot","Cashews" }; ///fixed products
		//what we have new produts 
		int j = 0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split(" -"); // format name from Brocolli - 1 kg ....we need
																	// Brocolli
			String nameOfProducts = name[0];
			// convert "list" array into arraylist
			List veggiesList = Arrays.asList(list);

			if (veggiesList.contains(nameOfProducts)) {
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				//Thread.sleep(4000);
				j++;
				if (j == list.length) {
					break;
				}

			}
			

		}
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='action-block']//button[text()='PROCEED TO CHECKOUT']")).click();
	}

}
