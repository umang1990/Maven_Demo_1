package TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","H:\\Umang Personal\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//Search on google >> Get all List >> Click on fourth option
		WebElement w1 = driver.findElement(By.xpath("//input[@title='Search']"));
		w1.sendKeys("Java Tutorial");
		Thread.sleep(5000);
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
		
		

	}
}

