/*
 * package basicweb;
 * 
 * import java.util.List;
 * 
 * import org.junit.After; import org.junit.Before; import org.junit.Test;
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.ui.Select;
 * 
 * public class selectDropDown {
 * 
 * WebDriver driver;
 * 
 * @Before public void setUp() throws Exception { driver = new ChromeDriver();
 * driver.manage().window().maximize(); }
 * 
 * 
 * 
 * @Test public void test() { driver.get("https://www.letskodeit.com/practice");
 * WebElement element = driver.findElement(By.id("carselect")); Select sel = new
 * Select(element);
 * 
 * sel.selectByIndex(2); sel.selectByVisibleText("BMW");
 * sel.selectByValue("honda"); List<WebElement> ele = sel.getOptions(); int
 * dropdownlist = ele.size(); System.out.println("dropdownlist" + dropdownlist);
 * 
 * for(int j=0 ; j <dropdownlist;j++) {
 * System.out.println(ele.get(j).getText()); }
 * 
 * }
 * 
 * @After public void tearDown() throws Exception { }
 * 
 * }
 */