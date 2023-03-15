package TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\Umang Personal\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		
		//Example: Drop-down
		Select singleselect = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
		singleselect.selectByValue("Tuesday");
		
		//Example: Multi-select Dropdown
		Select multiselect = new Select(driver.findElement(By.id("multi-select")));
		if(multiselect.isMultiple())
		{
			multiselect.selectByIndex(1);
			multiselect.selectByValue("Texas");
			multiselect.selectByVisibleText("New York");
			List<WebElement> ListEle = multiselect.getAllSelectedOptions();
			System.out.println("Total Selected city :"+ListEle.size());
		}

	}

}
