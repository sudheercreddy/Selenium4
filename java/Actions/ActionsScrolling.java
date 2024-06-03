/*
 * package Actions;
 * 
 * import org.openqa.selenium.Keys; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.interactions.Actions;
 * 
 * public class ActionsScrolling {
 * 
 * public static void main(String[] args) throws InterruptedException {
 * WebDriver driver = new ChromeDriver();
 * driver.get("https://www.freshworks.com/");
 * driver.manage().window().maximize();
 * //driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"))
 * ;
 * 
 * Actions act = new Actions(driver); act.sendKeys(Keys.PAGE_DOWN).perform();
 * Thread.sleep(4000); act.sendKeys(Keys.PAGE_UP).perform(); Thread.sleep(4000);
 * driver.quit();
 * 
 * 
 * }
 * 
 * }
 */