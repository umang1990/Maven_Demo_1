package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action {

	public static void main(String[] args) throws InterruptedException {
	//Using Action Class we can interact with Mouse actions
		System.setProperty("webdriver.chrome.driver","H:\\Umang Personal\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		/*driver.get("https://demo.opencart.com/");
		
		WebElement menu = driver.findElement(By.cssSelector("ul.nav.navbar-nav> li:nth-child(3)"));
		WebElement menuitem = driver.findElement(By.xpath("//a[contains(text(),'Monitors')]"));
		
		//Way 1
		//actions.moveToElement(menu).perform();
		//actions.click(menuitem).perform();
		//Way 2
		actions.moveToElement(menu).click(menuitem).perform();
		
		*/
		//Double Click and Multiple Click
		driver.get("https://www.stqatools.com/demo/DoubleClick.php");
		Thread.sleep(2000);
		actions.doubleClick(driver.findElement(By.xpath("//button[contains(text(), 'Double Click Me!')]"))).perform();
		
		
		
	}

}
