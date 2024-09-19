import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement Staticdropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(Staticdropdown);
		//select dropdown based on index
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//select dropdown based on visible text
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
	}

}
