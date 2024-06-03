package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class RelativeLocatorEx {

	@Test
	public void relTest1() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(4000);
		WebElement city = driver.findElement(By.linkText("Creston, Canada"));

		String rightAQIUS = driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(city)).getText();
		System.out.println(rightAQIUS);

		String leftOf = driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(city)).getText();
		System.out.println(leftOf);

		String aboveText = driver.findElement(RelativeLocator.with(By.tagName("p")).above(city)).getText();

		System.out.println(aboveText);

		String belowText = driver.findElement(RelativeLocator.with(By.tagName("p")).below(city)).getText();
		System.out.println(belowText);
	}

}
