package AlersJS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFrameHandle {

	@Test

	public void iFrameHandle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		driver.switchTo().frame("frame-one748593425");
		Thread.sleep(4000);
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("sudheer");
		driver.switchTo().defaultContent();
		String aa = driver.findElement(By.cssSelector("h3.details__form-preview-title")).getText();
		
		System.out.println(aa);

	}

}
