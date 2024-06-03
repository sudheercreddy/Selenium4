package waitss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitsPratc2 {
	
	@Test
	public void explWait() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");
		//By sele = By.id("Form_getForm_Country");
		
		//Select sl = new Select(driver.findElement(sele));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
		wait.until(ExpectedConditions.invisibilityOfAllElements(driver.findElements(null)));
	//	sl.selectByIndex(1);
		
		
	}

}
