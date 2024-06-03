package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SendKeysVPause {

	WebDriver driver;

	@Test
	public void sendKeysWithPause() {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		WebElement searchText = driver.findElement(By.name("search"));

		String textData = "sudheerReddy";
		Actions act = new Actions(driver);// Create Object for Actions class

		char[] aa = textData.toCharArray();
		for (char bb : aa) {
			System.out.println(bb);
			// sendKeys method ,supply the Keys
			act.sendKeys(searchText, String.valueOf(bb)).pause(500).build().perform();

		}

	}

}
