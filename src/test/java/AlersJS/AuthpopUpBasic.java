package AlersJS;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AuthpopUpBasic {
	
	@Test
	public void basicPopUp() {
		WebDriver driver = new ChromeDriver();
		
		String username ="admin";
		String password ="admin";
		
		//1- Base authentication popup 
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//2 - if we have @ in the password use below 
		((HasAuthentication)driver).register(()->new UsernameAndPassword(username,password));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
	}

}
