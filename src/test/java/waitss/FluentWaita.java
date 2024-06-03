package waitss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class FluentWaita {
	
	@Test
	public void fluentwait() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		long rr= driver.manage().timeouts().getPageLoadTimeout().getSeconds();
		By aa = By.xpath("//button[@type='submit']");
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2));
		 wait.until(ExpectedConditions.jsReturnsValue(""));
	
		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		//long rr1= driver.manage().timeouts().getPageLoadTimeout().getSeconds();
		System.out.println(rr);
		
		
	}

}
