package NestedFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NestedFramesEx {

	@Test
	public void NframeEg() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");

		// Frame 1
		driver.switchTo().frame("pact1");
		// driver.findElement(By.cssSelector("#inp_val")).sendKeys("First Frame");

		// Frame 2
		driver.switchTo().frame("pact2");
		driver.findElement(By.cssSelector("#jex")).sendKeys("Second Frame");
		//// Frame 3
		driver.switchTo().frame("pact3");
		driver.findElement(By.cssSelector("#glaf")).sendKeys("Third Frame");
		// SwitchTo--> parentFrame -->goes to 2nd from 3rd
		driver.switchTo().parentFrame();
		driver.findElement(By.cssSelector("#jex")).sendKeys("First Frame");
		// SwitchTo--> parentFrame -->goes to 1st from 2ND
		driver.switchTo().parentFrame();
		driver.findElement(By.cssSelector("#inp_val")).sendKeys("First Frame");

		// defualt to fo default page/Home out of all frames
		driver.switchTo().defaultContent();

		String defaultContent = driver.findElement(By.tagName("h3")).getText();
		System.out.println(defaultContent);

	}

}
