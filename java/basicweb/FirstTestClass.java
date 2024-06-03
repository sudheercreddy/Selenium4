/*
 * package basicweb;
 * 
 * import java.time.Duration;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.chrome.ChromeOptions; import
 * org.openqa.selenium.firefox.FirefoxDriver; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * public class FirstTestClass {
 * 
 * public static void main(String[] args) { WebDriver driver = new
 * FirefoxDriver(); WebDriver driver1 = new ChromeDriver(); //Implicit wait
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //explicit
 * wait WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
 * WebElement element =
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[]")));
 * 
 * //Desired capabilities
 * 
 * ChromeOptions options = new ChromeOptions(); }
 * 
 * }
 */