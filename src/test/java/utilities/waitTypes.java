/*
 * package utilities;
 * 
 * import java.time.Duration;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * public class waitTypes {
 * 
 * WebDriver driver;
 * 
 * public waitTypes(WebDriver driver){ this.driver=driver; }
 * 
 * 
 * public WebElement waittypee(By locator,int timeout) {
 * 
 * WebElement element=null; try { WebDriverWait wait = new
 * WebDriverWait(driver,Duration.ofSeconds(timeout)); element=
 * wait.until(ExpectedConditions.elementToBeClickable(locator));
 * System.out.println("Elemen appeared on the web page"); }catch (Exception e){
 * System.out.println("element not appeared on web Page"); } return element; }
 * 
 * public void waitAndclick(By locator,int timeDura) { try {
 * 
 * WebElement element = null; WebDriverWait wait = new WebDriverWait(driver,
 * Duration.ofSeconds(timeDura));
 * wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
 * System.out.println("Element is clicked successfully");
 * 
 * }catch(Exception e) { System.out.println("We are unable to click"); }
 * 
 * 
 * }
 * 
 * public void sendKeys(By locator, String EnterKey) {
 * 
 * driver.findElement(locator).clear();
 * driver.findElement(locator).sendKeys(EnterKey); }
 * 
 * public void click(By locator) { driver.findElement(locator).click(); }
 * 
 * 
 * 
 * }
 */