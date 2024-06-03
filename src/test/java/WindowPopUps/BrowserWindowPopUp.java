package WindowPopUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserWindowPopUp {

	/*
	 * Click on webelemnt in parent window is launching the new page or new window
	 * or New Tab
	 */

	static By linkedin = By.xpath("//a[contains(@href,'linkedin')]");
	static By facebook = By.xpath("//a[contains(@href,'facebook')]");
	static By twitter = By.xpath("//a[contains(@href,'twitter')]");
	static By youtube = By.xpath("//a[contains(@href,'youtube')]");

	@Test
	public void windowPopUp() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		String parentWindowID = driver.getWindowHandle();

		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(linkedin).click();
		
		Set<String> windowHan = driver.getWindowHandles();
		Iterator<String> it  = windowHan.iterator();
		it.next();
		driver.switchTo().window(it.next());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
