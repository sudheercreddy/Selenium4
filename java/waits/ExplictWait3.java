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
 * import utilities.GenericMethods; import utilities.waitTypes;
 * 
 * public class ExplictWait3 {
 * 
 * //https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
 * WebDriver driver; waitTypes wt; GenericMethods gm= new
 * GenericMethods(this.driver); String baseURL=
 * "https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver";
 * 
 * 
 * 
 * @Before public void setUp() throws Exception { driver= new ChromeDriver();
 * driver.manage().window().maximize(); wt= new waitTypes(driver) ; }
 * 
 * @After public void tearDown() throws Exception {
 * 
 * driver.quit(); }
 * 
 * 
 * 
 * @Test public void test() { driver.get(baseURL);
 * driver.findElement(By.id("enable-button")).click(); WebDriverWait wait = new
 * WebDriverWait(driver,Duration.ofSeconds(11));
 * wait.until(ExpectedConditions.elementToBeClickable(By.id("disable"))).click()
 * ;
 * 
 * 
 * }
 * 
 * 
 * @Test public void test2() { driver.get(baseURL);
 * driver.findElement(By.id("enable-button")).click(); WebElement ff=
 * wt.waittypee(By.id("disable"), 10); ff.click();
 * 
 * //gm.explicitelementToBeClickable(10, "disable","id").click();
 * //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
 * //wait.until(ExpectedConditions.elementToBeClickable(By.id("disable"))).click
 * (); } }
 */