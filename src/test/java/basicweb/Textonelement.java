/*
 * package basicweb;
 * 
 * import static org.junit.Assert.*;
 * 
 * import java.time.Duration;
 * 
 * import org.junit.After; import org.junit.Before; import org.junit.Test;
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.firefox.FirefoxDriver;
 * 
 * public class Textonelement { WebDriver driver; String baseURL =
 * "https://www.letskodeit.com/practice";
 * 
 * @Before public void setUp() throws Exception {
 * 
 * driver= new FirefoxDriver(); driver.get(baseURL);
 * driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); }
 * 
 * @After public void tearDown() throws Exception { }
 * 
 * @Test public void test() { String hideShow =
 * driver.findElement(By.id("displayed-text")).getAttribute("placeholder");
 * System.out.println(hideShow); String openTab =
 * driver.findElement(By.id("opentab")).getText(); String openTab1 =
 * driver.findElement(By.id("opentab")).getAttribute("href");
 * System.out.println(openTab); System.out.println(openTab1);
 * if(openTab1.contains("courses")) { System.out.println("courses present ");}
 * 
 * else { System.out.println("not prsent"); } } }
 * 
 */