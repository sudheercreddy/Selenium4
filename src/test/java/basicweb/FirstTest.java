/*
 * package basicweb; import java.time.Duration;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * 
 * 
 * public class FirstTest {
 * 
 * 
 * public static void main(String[] args) { WebDriver driver = new
 * ChromeDriver();
 * 
 * driver.manage().window().maximize();
 * driver.get("https://www.letskodeit.com/practice");
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 * 
 * //Xpath
 * 
 * driver.findElement(By.xpath("//a[@href='/login']")).click();
 * 
 * System.out.println(driver.findElement(By.xpath(
 * "//h4[@class='dynamic-heading']")).getText()); //ID
 * driver.findElement(By.id("email")).sendKeys("sud9eer@gmail.com");
 * 
 * //name driver.findElement(By.name("password")).sendKeys("Welcome@2023");
 * 
 * //LinkText/PartialLinkText
 * 
 * driver.findElement(By.id("login")).click();
 * 
 * }
 * 
 * }
 */