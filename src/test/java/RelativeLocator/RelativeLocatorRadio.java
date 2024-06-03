package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class RelativeLocatorRadio {

	@Test

	public void radioRelative() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//WebElement registerLText = driver.findElement(By.linkText("Downloads"));
		WebElement lastName = driver.findElement(By.cssSelector("label[for='input-lastname']"));
		Thread.sleep(3000);
		/*
		 * 
		 * String aa =
		 * driver.findElement(RelativeLocator.with(By.tagName("a")).below(registerLText)
		 * ).getText(); System.out.println(aa + "below"); String bb =
		 * driver.findElement(RelativeLocator.with(By.tagName("a")).above(registerLText)
		 * ).getText(); System.out.println(bb + "above");
		 */
			
		String aa = driver.findElement(RelativeLocator.with(By.tagName("label")).below(lastName)).getText();
		System.out.println(aa + "below");
		String bb = driver.findElement(RelativeLocator.with(By.tagName("label")).above(lastName)).getText();
		System.out.println(bb + "above");

	}
}
