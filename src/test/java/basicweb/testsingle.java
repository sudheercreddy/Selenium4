/*
 * package basicweb;
 * 
 * import static org.junit.Assert.fail;
 * 
 * import java.time.Duration; import java.util.List;
 * 
 * import org.junit.After; import org.junit.Before; import org.junit.Test;
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.firefox.FirefoxDriver;
 * 
 * import utilities.GenericMethods;
 * 
 * public class testsingle { WebDriver driver; GenericMethods gm;
 * 
 * @Before
 * 
 * public void setUp() throws Exception {
 * 
 * driver= new FirefoxDriver(); driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); gm= new
 * GenericMethods(driver); }
 * 
 * @After
 * 
 * public void tearDown() throws Exception { driver.close(); }
 * 
 * @Test
 * 
 * public void test() { driver.get("https://www.letskodeit.com/practice");
 * //boolean isPreenabText= gm.isElementPresent("nameaa", "id");
 * gm.getElement("name", "id").sendKeys("Sudheer"); //
 * System.out.println("Element is present : -- " +isPreenabText);
 * 
 * 
 * }
 * 
 * }
 */