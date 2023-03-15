package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\Umang Personal\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		
		//driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		
		//driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword!");
		
		//driver.findElement(By.className("radius")).click();
		//driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//button[@class='radius']")).click();
		
		boolean isMsg = driver.findElement(By.cssSelector(".flash.success")).isDisplayed();
		if (isMsg)
		{
			String strMsg = driver.findElement(By.cssSelector(".flash.success")).getText();
			System.out.println("Success Msg:" +strMsg);
		}
		
		//driver.findElement(By.linkText("Elemental Selenium")).click();
		driver.findElement(By.partialLinkText("Selenium")).click();
		
		

	}

}
