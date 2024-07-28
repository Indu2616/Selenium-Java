package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDownAssignment {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]")).click();
		
		//count options in Dropdown
		List<WebElement> dropDown=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("Number of options in dropdown:" +dropDown.size());	//6
		//Printing options
		/*for(WebElement options:dropDown) {
			System.out.println(options.getText());
		}*/
		//select single option
		String select=driver.findElement(By.xpath("//span[contains(text(),'Full-Time Permanent')]")).getText();
		System.out.println("selected option is: "+select);	//Full-Time Permanent
		//selecting all options
		for(WebElement allOptions:dropDown) {
			System.out.println(allOptions.getText());
		}

	}

}
