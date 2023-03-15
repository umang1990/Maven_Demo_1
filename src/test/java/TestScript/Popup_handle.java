package TestScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_handle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\Umang Personal\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		
		//Click to open new Tab
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("Number of Size"+tabs.size());
		
		for(String child:tabs)
		{
			System.out.println(child);
			if(!child.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(child);
			}
		}
		driver.findElement(By.xpath("(//span[@class='menu-item-text'])[2]")).click();
		driver.close();//Close only focus tab or window
		
		//Click to open new window
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[2]")).click();
		//driver.close();(why we hide because if i am not hide this code then this is not allow to navigate open new window as below code. it must focus on parent window.)
		
		//open new window / new application/New URL  itself
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.google.com");
		
		//	driver.quit();//Close All the window.
		
		

	}

}
