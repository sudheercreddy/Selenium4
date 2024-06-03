/*
 * package basicweb;
 * 
 * import java.time.Duration; import java.util.ArrayList; import java.util.List;
 * 
 * import org.junit.After; import org.junit.Before; import org.junit.Test;
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.firefox.FirefoxDriver;
 * 
 * public class RadioB { WebDriver driver; boolean isSelected;
 * 
 * @Before public void setUp() throws Exception { driver = new FirefoxDriver();
 * driver.get("https://www.letskodeit.com/practice");
 * driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 * 
 * }
 * 
 * @Test public void test() { List<WebElement> carsRadioButton =
 * driver.findElements(By.xpath("//input[@name='cars' and @type='radio']")); int
 * TotalRadioButton = carsRadioButton.size(); for(int i = 0 ; i
 * <TotalRadioButton ; i ++) {
 * System.out.println(carsRadioButton.get(i).getAttribute("value"));
 * 
 * isSelected=carsRadioButton.get(i).isSelected(); if(!isSelected) {
 * carsRadioButton.get(i).click();
 * 
 * } } }
 * 
 * @After public void tearDown() throws Exception { driver.quit();
 * 
 * }
 * 
 * }
 */