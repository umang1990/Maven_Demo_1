package TestScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Take_Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","H:\\Umang Personal\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		
		//Screen shot 
		TakesScreenshot screen = (TakesScreenshot)driver;
        File scr = screen.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scr, new File("H:\\Umang Personal\\FullScreen.png"));
        
        //Scroll image to next image
        actions.scrollByAmount(200, 900);
        

	}

}
