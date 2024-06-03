package WindowPopUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandlersmultplecircle {

	static By linkedin = By.xpath("//a[contains(@href,'linkedin')]");
	static By facebook = By.xpath("//a[contains(@href,'facebook')]");
	static By twitter = By.xpath("//a[contains(@href,'twitter')]");
	static By youtube = By.xpath("//a[contains(@href,'youtube')]");

	@Test
	public void windowhandleCircle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		String parentWindowID = driver.getWindowHandle();
		driver.findElement(twitter).click();
		//System.out.println(driver.getCurrentUrl());
		driver.findElement(facebook).click();
		//System.out.println(driver.getCurrentUrl());
		driver.findElement(linkedin).click();
		//System.out.println(driver.getCurrentUrl());
		driver.findElement(youtube).click();
		//System.out.println(driver.getCurrentUrl());

		Set<String> handlers = driver.getWindowHandles();
		Iterator<String> it = handlers.iterator();
		
		while(it.hasNext()) {
			String windowc = it.next();
			driver.switchTo().window(windowc);
			System.out.println(driver.getCurrentUrl()+" " + windowc);
			if(!windowc.equals(parentWindowID)) {
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowID);
		driver.quit();
		
		

	}

}
