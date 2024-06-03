package waitss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitlyWait {
	static WebDriver driver;
	
	@Test
	public void explicitlywaitEg() {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");
		By ph = By.id("Form_getForm_Contact");
		waitpresenceOfElementLocated(20, ph).sendKeys("4445551234");
		waitvisibilityOfElementLocated(10,ph).sendKeys("6032334555");
	
		
		/*
		 * WebDriverWait waita = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * WebElement phoe =
		 * waita.until(ExpectedConditions.presenceOfElementLocated(ph));
		 * phoe.sendKeys("6032334777");
		 */
	}
	
	public static WebElement waitpresenceOfElementLocated(long time,By gg) {
		WebDriverWait waita = new WebDriverWait(driver, Duration.ofSeconds(time));
		return waita.until(ExpectedConditions.presenceOfElementLocated(gg));
		//phoe.sendKeys(data);
		
	}
	
	public static WebElement waitvisibilityOfElementLocated(long time,By gg) {
		WebDriverWait waita = new WebDriverWait(driver, Duration.ofSeconds(time));
		return waita.until(ExpectedConditions.visibilityOfElementLocated(gg));
		//phoe.sendKeys(data);
		
	}
	
	

}
