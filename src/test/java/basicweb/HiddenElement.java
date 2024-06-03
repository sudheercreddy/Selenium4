/*
 * package basicweb;
 * 
 * import java.time.Duration;
 * 
 * import org.junit.After; import org.junit.Before; import org.junit.Test;
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.firefox.FirefoxDriver; import
 * org.openqa.selenium.firefox.FirefoxOptions; import
 * org.openqa.selenium.firefox.FirefoxProfile; import
 * org.openqa.selenium.firefox.ProfilesIni;
 * 
 * public class HiddenElement { WebDriver driver = new FirefoxDriver(); String
 * baseURL="https://www.letskodeit.com/practice";
 * 
 * @Before public void setUp() throws Exception {
 * 
 * driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); }
 * 
 * @Test public void test() {
 * 
 * //Profile
 * 
 * ProfilesIni profile = new ProfilesIni(); FirefoxProfile fxProfile =
 * profile.getProfile("automationProfile");
 * 
 * FirefoxOptions options = new FirefoxOptions(); options.setProfile(fxProfile);
 * driver.get(baseURL);
 * 
 * 
 * 
 * }
 * 
 * @After public void tearDown() throws Exception { //driver.close(); }
 * 
 * 
 * }
 */