package handlingbrowserwindows;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		for(String allIDs:windowIDs) {
			String title=driver.switchTo().window(allIDs).getTitle();
			System.out.println(title);
			if(title.equals("Human Resources Management Software | OrangeHRM")) {
			driver.findElement(By.xpath("//input[@name='action_request']")).click();
			System.out.println(driver.getTitle());
			}
			if(title.equals("OrangeHRM")/*&& title.equals("30-Day Advanced Free Trial | OrangeHRM")*/) {
			driver.close();
			}
		}
	
	}
}
