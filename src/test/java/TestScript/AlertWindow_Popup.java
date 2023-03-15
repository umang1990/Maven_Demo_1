package TestScript;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWindow_Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\Umang Personal\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
		//Simple Alert (only ok button there)And Explicit Wait Example
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@Class='btn btn-default']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		System.out.println("Simple Alert Message : "+alert.getText());
		alert.accept();
		
		//Confirmation Alert (Ok and cancel button there)
		driver.findElement(By.xpath("(//button[@Class='btn btn-default btn-lg'])[1]")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println("Simple Alert Message : "+alert1.getText());
		alert1.dismiss();
		
		
		//Prompt Alert (Add User Input and there is available ok and cancel button)
		driver.findElement(By.xpath("//button[contains(text(), 'Click for Prompt Box')]")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Umang");
		alert2.accept();

	}

}
