package AlersJS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandling {
	
	@Test
	public void frameHandling() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		//sud9eer/Welcome@2024;
		driver.findElement(By.name("username")).sendKeys("sud9eer");
		driver.findElement(By.name("password")).sendKeys("Welcome@2024");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		Thread.sleep(4000);
		driver.findElement(By.linkText("CONTACTS")).click();
		
	}

}
