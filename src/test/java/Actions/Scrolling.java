package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scrolling {
	
	/*
	 * SCrolling - Page Down,UP,bottom of Page
	 * 
	 */
	@Test
	public void scrolling() {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://reqres.in/");
		
		Actions act= new Actions(driver);
		
		
		
		/*
		 * Scrool to element and click on element
		 */
		WebElement buttom = driver.findElement(By.cssSelector("#trigger-pro"));
		//act.sendKeys(Keys.CONTROL).sendKeys(Keys.END);
		act.scrollToElement(buttom).click(buttom).build().perform();
		
		
	}

}
