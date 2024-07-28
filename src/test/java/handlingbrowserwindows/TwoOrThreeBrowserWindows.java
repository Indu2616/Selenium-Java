package handlingbrowserwindows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoOrThreeBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Set<String> allWindowIDs=driver.getWindowHandles();
		
		List<String> windowsList=new ArrayList(allWindowIDs); //converting Set to List
		
		String parentID=windowsList.get(0);
		String childID=windowsList.get(1);
		
		//Switch to child window
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());		//Human Resources Management Software | OrangeHRM
		
		//Switch to parent window
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());		//OrangeHRM
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
	}

}
