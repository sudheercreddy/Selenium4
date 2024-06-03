package waitss;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitonPageTitle {
	/*
	 * @Test public void waittitle() { WebDriver driver = new ChromeDriver();
	 * driver.get("https://orangehrm.com/en/30-day-free-trial");
	 * 
	 * WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(50)); Boolean
	 * aa = wt.until(ExpectedConditions.titleContains("30-Day")); try{ if(aa) { }
	 * System.out.println("title is containing the title"); }catch(Exception e) {
	 * System.out.println("title is not conaining "); }
	 * 
	 * }
	 * 
	 * @Test public void waittitleIS() { WebDriver driver = new ChromeDriver();
	 * driver.get("https://orangehrm.com/en/30-day-free-trial"); String tit =
	 * driver.getTitle(); System.out.println(tit);
	 * 
	 * WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(50)); Boolean
	 * aa =
	 * wt.until(ExpectedConditions.titleIs("30-Day Advanced Free Trial | OrangeHRM")
	 * ); try{ if(aa) { } System.out.println("title is matching the title");
	 * }catch(Exception e) { System.out.println("title is not conaining "); }
	 * 
	 * }
	 */
	
/*	@Test
	public void waitURL() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com/");
		
		driver.findElement(By.id("Form_submitForm_action_request")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		boolean urlbookaFreeDemo = wait.until(ExpectedConditions.urlContains("30-day-free-trial"));
		try
		{
			if(urlbookaFreeDemo) {
				System.out.println("urlContains->30-day-free-trial");
			}
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		
		
	}
	
	
	@Test
	public void waiturlToBe() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com/");
		
		driver.findElement(By.id("Form_submitForm_action_request")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		boolean urlbookaFreeDemo = wait.until(ExpectedConditions.urlToBe("https://orangehrm.com/en/30-day-free-trial"));
		try
		{
			if(urlbookaFreeDemo) {
				System.out.println("urlToBe->Matching");
			}
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		
		
	}
}*/
	
	@Test
	public void alertWait() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
		driver.findElement(By.id("alertexamples")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(4000);
		alert.accept();
		
	}

	
}






