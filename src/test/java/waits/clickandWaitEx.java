/*
 * package waits;
 * 
 * import org.junit.After; import org.junit.Before; import org.junit.Test;
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import utilities.waitTypes;
 * 
 * public class clickandWaitEx {
 * 
 * WebDriver driver; waitTypes wc; String baseUrl=
 * "https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver";
 * 
 * @Before public void setUp() throws Exception { driver = new ChromeDriver();
 * driver.manage().window().maximize(); wc= new waitTypes(driver);
 * 
 * }
 * 
 * @After public void tearDown() throws Exception { driver.quit(); }
 * 
 * @Test public void test() { driver.get(baseUrl);
 * wc.click(By.id("enable-button"));
 * //driver.findElement(By.id("enable-button")).click();
 * wc.waitAndclick(By.id("disable"), 20);
 * 
 * 
 * }
 * 
 * @Test public void Enterdetails() {
 * driver.get("https://www.letskodeit.com/login"); wc.sendKeys(By.id("email"),
 * "HelloWorld"); }
 * 
 * }
 */