package TestScript;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript_Executor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\Umang Personal\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		//Example 1
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String StrTitle = (String) js.executeScript("return document.title");
		System.out.println("Title is : " +StrTitle);
		
		//Example 2 (Add return keyword because user want do further action after getting element)
		WebElement w1 = (WebElement) js.executeScript("return document.getElementsByName('search')[0]");
		w1.sendKeys("Phone Wale");
		
		//Example 3
		js.executeScript("window.scrollBy(10,document.body.scrollHeight);");
		
		
	}

}
