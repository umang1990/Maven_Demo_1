package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
//import static org.openqa.selenium.support.locators.RelativeLocator.with;/*add Static xpath for With keyword*/

//Example of find nearest element.
public class Relator_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\Umang Personal\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		
		String book1 = driver.findElement(RelativeLocator.with(By.tagName("li"))
                .toLeftOf(By.id("pid6"))
                .below(By.id("pid1")))
				.getAttribute("id");
        System.out.println("Id of searced book is : "+ book1);
        
        //Enter Send keys along with special key.(Example: Sendkeys Display with Upper case)
        driver.findElement(By.xpath("//input[@id='searchBar']")).sendKeys(Keys.chord(Keys.SHIFT+"Test"));
        
        
	}

}
