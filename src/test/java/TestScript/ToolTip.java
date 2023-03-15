package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","H:\\Umang Personal\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.switchTo().frame(0);
		//actions.scrollByAmount(10, 500);
		Thread.sleep(3000);
		actions.moveToElement(driver.findElement(By.xpath("//input[@id='age']"))).perform();
		String Tooltip = driver.findElement(By.cssSelector("div.ui-tooltip-content")).getText();
		System.out.println("ToolTip : "+Tooltip);
		
		

	}

}
