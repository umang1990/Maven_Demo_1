package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\Umang Personal\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		String str1 = driver.findElement(By.cssSelector("label span")).getText();
		System.out.println("Lable in main page:"+str1);
		
		//Main page to Frame1
		driver.switchTo().frame("frame1");//using ifarmeid
		driver.findElement(By.tagName("input")).sendKeys("Hello");
		
		//Frame1 to Frame3
		WebElement framethree = driver.findElement(By.id("frame3"));
		//driver.switchTo().frame(framethree);(located using frameid)
		driver.switchTo().frame(0);//Located using index
		WebElement chkbox = driver.findElement(By.id("a"));
		if(!chkbox.isSelected())
		{
			chkbox.click();
		}
		
		//Go back to frame 1 to modified text(go to parent Frame)
		driver.switchTo().parentFrame();
		driver.findElement(By.tagName("input")).clear();
		driver.findElement(By.tagName("input")).sendKeys("Welcome Back");
		
		//From any of the Frame to go back to the main page
		driver.switchTo().defaultContent();
		String str2 = driver.findElement(By.cssSelector("label span")).getText();
		System.out.println("After returning main page >> Lable in main page:"+str2);
		
		//Access Frame 2
		driver.switchTo().frame(1);
		Select singleselect = new Select(driver.findElement(By.xpath("//select[@id='animals']")));
		singleselect.selectByVisibleText("Avatar");
		
		
		
		
	}

}
