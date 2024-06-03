import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutora {
	
	/*
	 * JavaScriptExecutor-- interface
	 * ExecuteScript-- method
	 * highlight border
	 */
	@Test
	public void JsScriptEg() {
		
		//create webdriver refrence 
		WebDriver driver = new ChromeDriver();
		
		//a class can implement multiple interfaces, top casting with webdriver interface.
		
		
		//convert the driver into javaScript
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?");
		
		//casting from one interface to other interface
		
		//(JavascriptExecutor)driver-coverting  driver into JavascriptExecutor
		//JavascriptExecutor js= store in JavascriptExecutor js.
		
		//one interface is casted into other intrface
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title= js.executeScript("return document.title;").toString();
		System.out.println(title);
		//******************************
		// To execute JS code we write --JavascriptExecutor js=(JavascriptExecutor)driver
		//coverting  driver into JavascriptExecutor, get a new reference ,with this reference 
		//we executeScript.
		String url= js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		//Dcocument.documentelement.innertext;-- get complete text on the page
		//window.scrollTo(0,document.body.scrolHeight))// scroll to botton of the page
		//window.scrollTo(document.body.scrolHeight,0)// scroll to Top of the page
		//window.scrollTo(document.body.scrolHeight,0)// scroll to Top of the page
		//window.scrollTo(0,300)// scroll to 300 pixel height  of the page
		//window.scrollTo(document.body.scrolHeight/2)middle of the page
		//Scroll upto the element - js.execute(argument[0].sctrollIntoView(true)",element);
		
		//document.body.style= '100.0%' - zoom the page 
		//document.body.style= '400.0%'
		
		//Click---js.executeScript("argument[0].click();",clickrate );
		
		
		//sendkey using js
		//js.executeScript("document.getElementById('username').value="sudheer@gmail.com;",clickrate );
	
		
	}

	

	
	
	
}
