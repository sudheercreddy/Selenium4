/*
 * package basicweb;
 * 
 * import java.time.Duration; import java.util.List;
 * 
 * import org.junit.After; import org.junit.Before; import org.junit.Test;
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.firefox.FirefoxDriver; import
 * org.openqa.selenium.support.ui.Select;
 * 
 * public class MultipleSelect { WebDriver driver; String
 * baseURL="https://www.letskodeit.com/practice";
 * 
 * @Before public void setUp() throws Exception {
 * 
 * 
 * driver= new FirefoxDriver(); driver.get(baseURL);
 * driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); }
 * 
 * @After public void tearDown() throws Exception { driver.quit(); }
 * 
 * @Test public void test() throws InterruptedException { //DROPDOWN WebElement
 * multiOptions= driver.findElement(By.id("multiple-select-example")); Select
 * sel = new Select(multiOptions); List<WebElement> aa= sel.getOptions();
 * sel.selectByValue("orange"); sel.selectByIndex(1);
 * sel.selectByVisibleText("Peach"); List<WebElement> selok=
 * sel.getAllSelectedOptions(); for(WebElement ee : selok) {
 * System.out.println(ee.getText()); } }
 * 
 * }
 */