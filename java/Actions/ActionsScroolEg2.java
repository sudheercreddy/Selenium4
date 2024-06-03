/*
 * package Actions;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.Keys; import
 * org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.interactions.Action; import
 * org.openqa.selenium.interactions.Actions;
 * 
 * public class ActionsScroolEg2 {
 * 
 * public static void main(String[] args) throws InterruptedException {
 * WebDriver driver = new ChromeDriver();
 * driver.get("https://www.google.com/gmail/about/");
 * driver.manage().window().maximize(); Actions act = new Actions(driver);
 * //act.sendKeys(Keys.PAGE_DOWN).perform();
 * 
 * act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
 * 
 * Thread.sleep(3000);
 * 
 * act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
 * //act.sendKeys(Keys.PAGE_UP).perform();
 * 
 * 
 * By privacy = By.xpath("//a[contains(@href,'privacy')]"); By policy =
 * By.xpath("//a[contains(@href,'policy')] ");
 * 
 * Action aaa=
 * act.scrollToElement(driver.findElement(privacy)).click(driver.findElement(
 * policy)).build(); aaa.perform(); }
 * 
 * }
 */