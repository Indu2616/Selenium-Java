package handlingbrowserwindows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		//multiple browser handles
		Set<String> WindowsIDs=driver.getWindowHandles();
		for(String allIDs:WindowsIDs) {
			String title=driver.switchTo().window(allIDs).getTitle();
			if(title.equals("OrangeHRM")) {
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");		
			}
			if(title.equals("Human Resources Management Software | OrangeHRM")) {
				driver.findElement(By.xpath("//input[@placeholder='Enter your email address here']")).sendKeys("abc@email.com");
			}
		}
		//driver.quit();
	}

}
