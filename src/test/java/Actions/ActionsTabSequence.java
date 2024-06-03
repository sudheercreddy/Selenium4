package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsTabSequence {
	
	@Test
	
	public void ActionsTabSeq() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement firstName = driver.findElement(By.name("firstname"));
		
		Actions act = new Actions(driver);
		act.sendKeys(firstName, ("Sudheer"))
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys("chittireddy")
		.pause(500)
		.sendKeys(Keys.TAB)
		.sendKeys("sud9eer@gmail.cok")
		.pause(500)
		.sendKeys(Keys.TAB)
		.sendKeys("7778885641")
		.pause(500)
		.sendKeys(Keys.TAB)
		.sendKeys("123456")
		.pause(500)
		.sendKeys(Keys.TAB)
		.sendKeys("123456")
		.sendKeys(Keys.ENTER)
		.build().perform();
		
	}
	


}
