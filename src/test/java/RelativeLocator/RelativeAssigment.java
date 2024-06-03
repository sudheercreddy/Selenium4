package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class RelativeAssigment {

	@Test
	public void relativeAssig() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement ele = driver.findElement(By.linkText("Privacy Policy"));
		Thread.sleep(4000);
		
		//driver.findElement(RelativeLocator.with(By.xpath("//input[@name ='agree']")).toRightOf(ele)).click();
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(ele)).click();
		
	}

}
