package Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class scroolActions {
	
	static WebDriver driver;
	
	@Test
	public void scrollQuick() {
		driver = new ChromeDriver();
		driver.get("https://reqres.in/");
		
		Actions act = new Actions(driver);
		
		/*
		 * Page Down and {Page UP
		 */
		//act.sendKeys(Keys.PAGE_DOWN).build().perform();
		//act.sendKeys(Keys.PAGE_UP).build().perform();
		//driver.close();
		
		/*
		 * Page End- Button
		 */
		
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		
		
	}

}
