package Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingActions {
	
	/*
	 * https://reqres.in/
	 * SCrolling.
	 */
	
	
	WebDriver driver;
	public void ScrolltobotonPage() {
		
		driver = new ChromeDriver();
		driver.get("https://reqres.in/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME);
		
	}
	
	

}
