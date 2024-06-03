/*
 * package basicweb;
 * 
 * import java.time.Duration; import java.util.List;
 * 
 * import org.junit.After; import org.junit.Before; import org.junit.Test;
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.firefox.FirefoxDriver;
 * 
 * public class CheckBox { WebDriver driver; String
 * baseURL="https://www.letskodeit.com/practice";
 * 
 * 
 * @Before public void setUp() throws Exception { driver= new FirefoxDriver();
 * driver.get(baseURL); driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 * 
 * }
 * 
 * 
 * @Test public void test() {
 * 
 * List<WebElement> carCheckbox =
 * driver.findElements(By.xpath("//input[@name='cars' and @type='checkbox']"));
 * int totalCheckBoxes = carCheckbox.size(); for(int i = 0 ; i < totalCheckBoxes
 * ; i ++) { carCheckbox.get(i).click();
 * System.out.println(carCheckbox.get(i).getAttribute("value")); }
 * 
 * }
 * 
 * 
 * @After public void tearDown() throws Exception { driver.quit(); }
 * 
 * 
 * }
 */