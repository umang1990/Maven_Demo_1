package TestScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","H:\\Umang Personal\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Page Load Synchronization
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//Explict Wait Example availble in AlertWindow_popup Class
		
		//implicit Wait Example is below
		//conditional Synchronization (Set implicit wait on driver level)
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//Search on google >> Get all List >> Click on fourth option
		WebElement w1 = driver.findElement(By.xpath("//input[@title='Search']"));
		w1.sendKeys("Java Tutorial");
		
		//Unconditional Synchronization
		//Thread.sleep(5000);
		
		
		List<WebElement> Items = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]//li//descendant::div[@class='pcTkSc']"));
		System.out.println("List:"+Items.size());
		for(int i=0; i<Items.size(); i++)
		{
			System.out.println(Items.get(i).getText());
			if(Items.get(i).getText().equalsIgnoreCase("java tutorial pdf"))
			{
				Items.get(i).click();
				break;
			}
			
		}
		
		//Page Load Synchronization
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

	}

}
