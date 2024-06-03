/*
 * package waits;
 * 
 * import java.time.Duration;
 * 
 * import org.junit.After; import org.junit.Before; import org.junit.Test;
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * public class implicitWaitEg { WebDriver driver;
 * 
 * @Before public void setUp() throws Exception { driver= new ChromeDriver();
 * driver.manage().window().maximize();
 * //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 * 
 * }
 * 
 * @After public void tearDown() throws Exception { driver.quit(); }
 * 
 * @Test public void test() throws InterruptedException {
 * driver.get("https://www.letskodeit.com/practice");
 * driver.findElement(By.xpath("//a[@href='/login']")).click();
 * driver.findElement(By.id("email")).sendKeys("Helloworld");
 * Thread.sleep(5000);
 * 
 * }
 * 
 * }
 */