package pageobjectmodel;

//Testcase class

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeMethod
	void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	void testLogin() {
		
		//loginPage lp=new loginPage(driver);   							 //without using page factory method
		loginPageUsingPageFactory lp=new loginPageUsingPageFactory(driver);  //using page factory method
		
		lp.username_txtbox("Admin");
		lp.password_txtbox("admin123");
		lp.login_click();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterMethod
	void tearDown(){
		driver.quit();
	}

	
	
}
