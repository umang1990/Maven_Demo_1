package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Radiobutton_checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\Umang Personal\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/samplepagetest/");

	}

}
