/*
 * package utilities;
 * 
 * import java.time.Duration; import java.util.ArrayList; import java.util.List;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * public class GenericMethods {
 * 
 * WebDriver driver;
 * 
 * public GenericMethods(WebDriver driver) { this.driver = driver; }
 * 
 * public WebElement getElement(String locator, String type) {
 * 
 * type = type.toLowerCase(); if (type.equals("id")) {
 * System.out.println("The element found for " + locator + "is " + type); return
 * this.driver.findElement(By.id(locator)); } else if (type.equals("xpath")) {
 * System.out.println("The element found for " + locator + "is" + type); return
 * this.driver.findElement(By.xpath(locator)); } else if (type.equals("css")) {
 * System.out.println("The element found for " + locator + "is" + type); return
 * this.driver.findElement(By.cssSelector(locator)); } else if
 * (type.equals("id")) { System.out.println("The element found for " + locator +
 * "is" + type); return this.driver.findElement(By.name(locator)); } else if
 * (type.equals("id")) { System.out.println("The element found for " + locator +
 * "is" + type); return this.driver.findElement(By.linkText(locator)); } else {
 * System.out.println("Locator is not supported" + locator); return null; }
 * 
 * }
 * 
 * public List<WebElement> getElementList(String locator, String type) {
 * List<WebElement> elList = new ArrayList<WebElement>(); type =
 * type.toLowerCase(); if (type.equals("id")) {
 * 
 * elList=driver.findElements(By.id(locator)); } else if (type.equals("xpath"))
 * {
 * 
 * elList=driver.findElements(By.xpath(locator)); } else if (type.equals("css"))
 * { elList=driver.findElements(By.cssSelector(locator)); } else if
 * (type.equals("id")) { elList=driver.findElements(By.name(locator)); } else if
 * (type.equals("id")) { elList=driver.findElements(By.linkText(locator)); }
 * else { System.out.println("Locator is not supported" + locator); }
 * if(elList.isEmpty()) { System.out.println("Elemet not found"); }else {
 * System.out.println("Element Found" + type +": "+locator); }
 * 
 * return elList;
 * 
 * }
 * 
 * public boolean isElementPresent(String locator, String type) {
 * List<WebElement> eleList = getElementList(locator, type); int size =
 * eleList.size();
 * 
 * //System.out.println(size+ "size");
 * 
 * if(size > 0) { return true; }else { return false; }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * }
 */