package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\Umang Personal\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("http://watir.com/examples/shadow_dom.html");
		
		//USe Shadow Element (We can not directly access)
		WebElement ShadowHost = driver.findElement(By.cssSelector("#shadow_host"));
		SearchContext Shadowroot = ShadowHost.getShadowRoot();//using Shadow context and getshadowroot >> we can access shadow element.
		String StrText = Shadowroot.findElement(By.cssSelector("#shadow_content")).getText();
		System.out.println("Shadow Text is : "+StrText);
		

	}

}
