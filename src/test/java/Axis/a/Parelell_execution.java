package Axis.a;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Parelell_execution {
	@Test
	public void invokechrome() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dikshant\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		  driver.get("https://www.selenium.dev/");

	
	}
	@Test
	public void invokeedge() {
		 System.setProperty("webdriver.Gecko.driver",
					"C:\\Users\\Dikshant\\Documents\\Manipal\\gecko\\geckodriver.exe");
						
							WebDriver driver=new FirefoxDriver();
							 driver.get("https://www.selenium.dev/");
		
	}

}
