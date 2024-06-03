package waitss;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ExceptionElem.EleException;

public class CustomWaitnor {

	static WebDriver driver;
	static By aa = By.cssSelector("button[type='submita']");

	public static WebElement RetryElement(By locator, int timeOut) {

		int attempt = 0;
		WebElement element = null;

		while (attempt < timeOut) {
			try {
				element = driver.findElement(locator);
				System.out.println("!!!!!!found the element " + locator + "timeOut ==" + timeOut + attempt);
				break;
			} catch (NoSuchElementException e) {
				System.out
						.println("!!!!!!!!!!!element is not found " + attempt + "timeOut interval" + timeOut + attempt);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {

					e1.printStackTrace();
				}
			}

			attempt++;
		}
		if (element == null) {
			System.out.println("!!!!!!!!element is not found");
			throw new EleException("!!!!!!ELEMENT NOT FOUND EXCEPTION");
		}
		System.out.println(element + "***********");
		return element;

	}

	public static void main(String[] args) {
	 	driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		RetryElement(aa, 10).click();

	}

}
