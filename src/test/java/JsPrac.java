import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JsPrac {
	
	@Test
	public void jsPrac () throws InterruptedException
	{
		
		// creating the object of Wb and type casting the ChromeDriver class
		//ChromeDriver is referecing to the Webdriver interface
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?");
		
		
		//coverting  driver into JavascriptExecutor , get a reference JS and executescript
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom = '400.0%'");
		Thread.sleep(4000);
		js.executeScript("document.body.style.zoom = '100.0%'");
		
		
		WebElement clickrate = driver.findElement(By.cssSelector("#cart-total"));
		//
		//js.executeScript();
		Thread.sleep(4000);
		
		//Click tge element
		js.executeScript("argument[0].click();",clickrate );
		
		//sendkey using js
		//js.executeScript("document.getElementById('username').value="sudheer@gmail.com;",clickrate );
	}
}
