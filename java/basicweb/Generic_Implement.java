/*
 * package basicweb;
 * 
 * 
 * 
 * import java.time.Duration; import java.util.List;
 * 
 * import org.junit.After; import org.junit.Before; import org.junit.Test;
 * import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
 * import org.openqa.selenium.firefox.FirefoxDriver; import
 * org.openqa.selenium.support.ui.Select;
 * 
 * import utilities.GenericMethods;
 * 
 * public class Generic_Implement { WebDriver driver; GenericMethods gm;
 * 
 * @Before public void setUp() throws Exception { driver= new FirefoxDriver();
 * driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); gm= new
 * GenericMethods(driver);
 * 
 * }
 * 
 * 
 * @Test public void test() { driver.get("https://www.letskodeit.com/practice");
 * gm.getElement("name", "id").sendKeys("Hello");
 * 
 * 
 * }
 * 
 * @Test public void test2() {
 * driver.get("https://www.letskodeit.com/practice"); boolean isPreenabText=
 * gm.isElementPresent("name", "id"); System.out.println("Total size is "
 * +isPreenabText);
 * 
 * }
 * 
 * 
 * @After public void tearDown() throws Exception { driver.close(); }
 * 
 * 
 * }
 */