package newmaven;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Simpletest {
	@Test
	public void simple_Test()
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	
	driver.get("http://localhost:8084/newmaven/index.html");
	driver.manage().window().maximize();
	
	
	Assert.assertEquals(driver.getTitle(),"REGISTRATION EVENT");
	driver.close();
	}


}
