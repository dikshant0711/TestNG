package Axis.a;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListnerClass.class)
public class InvokeFirefox {
	
	
	@Test
	public void invokeff() {
	
	
	System.setProperty("webdriver.Gecko.driver", 
			"C:\\Users\\Dikshant\\Documents\\Manipal\\gecko\\geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.selenium.dev/");
			
	}
			
			
			

}
