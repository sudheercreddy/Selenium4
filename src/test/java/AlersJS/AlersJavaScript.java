package AlersJS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AlersJavaScript {

	@Test
	public void AlertsExample() throws InterruptedException {

		/*
		 * Alerts are 3 types 1- alerts-OK 2-confirmation-OK & Cancel 3-popup box- Text
		 * box , Ok and Cancel
		 */

		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
		driver.findElement(By.id("alertexamples")).click();
		// 1- Alert Box with OK botton and Text
		
		  Alert alt = driver.switchTo().alert();
		   Thread.sleep(500); String alText=
		  alt.getText();
		   System.out.println(alText);
		    alt.accept();
		 
		
	//	2- Confirm box with Text ,OK and Cancel 
		
		//driver.findElement(By.id("confirmexample")).click();
		
		
		  Alert alt2 = driver.switchTo().alert(); Thread.sleep(5000); String altText =
				  alt2.getText();
		   System.out.println("altText==>"+ altText); 
		   alt2.dismiss();
		 
		
	// 3- prompt dialog - with Text to enter , ok and Cancel
		
		Actions act = new Actions(driver);
		act.scrollToElement(driver.findElement(By.id("promptexample"))).click(driver.findElement(By.id("promptexample"))).build().perform();
		Thread.sleep(5000);
		Alert alt3 = driver.switchTo().alert();
		Thread.sleep(2000);
		alt3.sendKeys("sudheer Kumar reddy");
		Thread.sleep(2000);
		alt3.accept();
		

		
	}
}
