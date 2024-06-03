package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Signatute {
	
	
	
	@Test
	public void signaturecanvas() {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://signature-generator.com/draw-signature/");
		WebElement canvas= driver.findElement(By.id("signature-pad"));
		
		/*
		 * target element to move to.
•xOffset Offset from the element's in-view center point. A negative value means an offset/mouse to left of the point.
•yOffset Offset from the element's in-view center point. A negative value means an offset/mouse above the point

		 */
		Actions act = new Actions(driver);
	Action sig= act.click(canvas).moveToElement(canvas, 10, -100)
		.clickAndHold(canvas)
		.moveByOffset(30, 10)
		.moveByOffset(15, 45).build();
	sig.perform();
		
		
	}
	

}
