package Axis.a;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEg {
	
	@Test
	
	public void testsoftassert() {
		
		SoftAssert st= new SoftAssert();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dikshant\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "Orange";
		
		st.assertEquals(actualTitle, expectedTitle);
			
		
	}

}
