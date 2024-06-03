/*
 * package waits;
 * 
 * import java.time.Duration;
 * 
 * import org.junit.After; import org.junit.Before; import org.junit.Test;
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * public class Explicitlywait {
 * 
 * WebDriver driver;
 * 
 * @Before public void setUp() throws Exception { driver = new ChromeDriver();
 * driver.manage().window().maximize();
 * 
 * }
 * 
 * @After public void tearDown() throws Exception { driver.quit(); }
 * 
 * @Test public void test() throws Exception {
 * driver.get("https://www.letskodeit.com/practice");
 * driver.findElement(By.xpath("//a[@href='/login']")).click(); WebDriverWait
 * wait = new WebDriverWait(driver, Duration.ofSeconds(3)); WebElement
 * emailField=
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
 * emailField.sendKeys("Entering ExplicitWait"); Thread.sleep(5000);
 * 
 * 
 * 
 * }
 * 
 * }
 */