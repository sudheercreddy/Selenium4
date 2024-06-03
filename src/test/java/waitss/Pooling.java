package waitss;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Pooling {

	/*
	 * Pooling/Interval
	 * 
	 * 
	 * 
	 */

	@Test

	public void intervalOrPooling() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//interval time =500ms
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10),Duration.ofSeconds(2));
		/*
		 * driver The WebDriver instance to pass to the expected conditions
			•timeout The timeout in seconds when an expectation is called
			•sleep The duration in milliseconds to sleep between polls.

		 */
		

	}

}
