package waitsmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPractice {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait myWait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement txtUsername=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		txtUsername.sendKeys("Admin");
		WebElement txtPassword=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		txtPassword.sendKeys("admin123");
		
		WebElement login=myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Login ']")));
		login.click();
		
		driver.quit();
		
	}
}
