/*
 * package Actions;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.interactions.Actions;
 * 
 * public class SendKeysWithPause {
 * 
 * public static void main(String[] args) {
 * 
 * 
 * WebDriver driver = new ChromeDriver();
 * driver.get("https://naveenautomationlabs.com/opencart/"); WebElement searchW
 * = driver.findElement(By.xpath("//input[@name='search']"));
 * 
 * Actions act = new Actions(driver);
 * 
 * 
 * String aa = "Macbook"; char[] a = aa.toCharArray(); for(char x : a) {
 * System.out.println(x); act.sendKeys(searchW,
 * String.valueOf(x)).pause(500).build().perform(); }
 * 
 * }
 * 
 * }
 */