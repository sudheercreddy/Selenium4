/*
 * package waits;
 * 
 * import static org.junit.Assert.*;
 * 
 * import java.time.Duration;
 * 
 * import org.junit.After; import org.junit.Before; import org.junit.Test;
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.firefox.FirefoxDriver; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * public class Explicit2 {
 * 
 * WebDriver driver; String baseURL=
 * "https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver";
 * 
 * @Before public void setUp() throws Exception { driver = new FirefoxDriver();
 * driver.manage().window().maximize(); }
 * 
 * @After public void tearDown() throws Exception { driver.close(); }
 * 
 * @Test public void test() { driver.get(baseURL);
 * driver.findElement(By.id("display-other-button")).click(); WebDriverWait wait
 * = new WebDriverWait(driver, Duration.ofSeconds(20));
 * wait.until(ExpectedConditions.elementToBeClickable(By.id("hidden"))).click();
 * 
 * 
 * }
 * 
 * @Test public void test2() { driver.get(baseURL);
 * driver.findElement(By.id("populate-text")).click(); WebDriverWait wait2 = new
 * WebDriverWait(driver,Duration.ofSeconds(15)); Boolean zzz=
 * wait2.until(ExpectedConditions.textToBe(By.id("h2"), "Selenium Webdriver"));
 * System.out.println(zzz); }
 * 
 * @Test public void test3() {
 * 
 * }
 * 
 * }
 */