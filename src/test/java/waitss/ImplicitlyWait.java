package waitss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitlyWait {

	
	@Test
	public void ImplicitlyWaita() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");
		
		
		//implicitlyWait is a global wait --> it is applied to all the elements by default
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(0));
		
		//implicitlyWait by default it will wait 10 seconds ,
		//if element found for 2 seconds then it will take only 2 seconds only ,8 seconds will be ignored
		//if we have 5 elements it will wait 5*10=50 seconds
		driver.findElement(By.id("Form_getForm_Name")).sendKeys("Hello");
		
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("sudheer@gmail.com");
		
	}
}
