package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowSize {
	
	@Test
	
	public void windowsoze() throws InterruptedException {
		
		WebDriver driver;
		driver = new ChromeDriver();
		//driver.get("https://signature-generator.com/draw-signature/");
		/*
		 * driver.manage().window().maximize(); Thread.sleep(5000);
		 * driver.manage().window().fullscreen(); Thread.sleep(5000);
		 * driver.manage().window().minimize(); Thread.sleep(5000);
		 * driver.manage().window().maximize();
		 */
		
		Dimension dim = new Dimension (414,700);
		driver.manage().window().setSize(dim);
		
		
		//#APjFqb
		driver.get("https://www.google.com/");
		WebElement searchbutton = driver.findElement(By.cssSelector("#APjFqb"));
	System.out.println(searchbutton.getSize());
	System.out.println(searchbutton.getSize().getHeight());
	System.out.println(searchbutton.getSize().getWidth());
	System.out.println(searchbutton.getLocation());
	System.out.println(searchbutton.getLocation().getX());
	System.out.println(searchbutton.getLocation().getY());
	
//BackGroup colours:
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
	WebElement Submit = driver.findElement(By.xpath("//input[@value='Continue']"));
	System.out.println(Submit.getCssValue("background-color"));
	//
	//border-color
	System.out.println(Submit.getCssValue("border-color"));
	
	
		
	}

}
