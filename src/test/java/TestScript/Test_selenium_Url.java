package TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Different Xpath Combination
public class Test_selenium_Url {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\Umang Personal\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		
		//Xpath Combination 1
	   /* WebElement w1 = driver.findElement(By.xpath("//td[contains(text(),'B. Wagner')]//following::td[5]"));
	    String str1 = w1.getText();
	    System.out.println("Salary is : "+str1);*/
		
		//Example: Drop-down
		driver.findElement(By.xpath("//select[@id='select-demo']")).click();
		
	  
	   

	}

}
