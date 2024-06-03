/*
 * package basicweb;
 * 
 * import java.util.List;
 * 
 * import org.junit.After; import org.junit.Before; import org.junit.Test;
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import utilities.GenericMethods;
 * 
 * public class BascisActions {
 * 
 * WebDriver driver; boolean isChecked; GenericMethods gm;
 * 
 * 
 * 
 * @Before public void setUp() throws Exception { driver = new ChromeDriver();
 * driver.manage().window().maximize();
 * 
 * //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); }
 * 
 * 
 * 
 * @Test public void test() {
 * 
 * driver.get("https://www.letskodeit.com/practice");
 * 
 * 
 * driver.findElement(By.xpath("//a[@href='/login']")).click();
 * 
 * System.out.println(driver.findElement(By.xpath(
 * "//h4[@class='dynamic-heading']")).getText()); //ID
 * driver.findElement(By.id("email")).sendKeys("sud9eer@gmail.com");
 * 
 * //name driver.findElement(By.name("password")).sendKeys("Welcome@2023");
 * 
 * driver.findElement(By.id("login")).click();
 * 
 * 
 * 
 * gm = new GenericMethods(driver); List<WebElement> radios=
 * driver.findElements(By.
 * xpath("//input[contains(@name,'cars') and contains(@type,'radio')]"));
 * 
 * //List<WebElement> radios=
 * gm.getElements("//input[contains(@name,'cars') and contains(@type,'radio')]",
 * "xpath"); int radioSize=radios.size(); for(int i =0 ; i<radioSize;i++) {
 * //System.out.println(radios.get(i).getText()); isChecked=
 * radios.get(i).isSelected();
 * 
 * if(!isChecked) { radios.get(i).click(); }
 * 
 * 
 * } }
 * 
 * @Test public void test1() throws InterruptedException {
 * 
 * //title of page String titleofPage= driver.getTitle();
 * System.out.println("titleofPage " +titleofPage); //Curent url
 * Thread.sleep(2000); String cURL=driver.getCurrentUrl();
 * System.out.println("getCurrentUrl  "+ cURL); //Navigate back,front
 * 
 * driver.navigate().back(); driver.navigate().forward();
 * driver.navigate().refresh();
 * 
 * //pagesourse
 * 
 * 
 * //isenabled()---button enbled? //isselected --- radio button and checkbox
 * selected
 * 
 * //radiobutton-- type= radio
 * 
 * 
 * //checkbox-- type-checkbox }
 * 
 * 
 * 
 * //drop box
 * 
 * 
 * @After public void tearDown() throws Exception { //driver.quit(); }
 * 
 * }
 */