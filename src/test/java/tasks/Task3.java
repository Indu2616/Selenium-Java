package tasks;

/*
 Go to "https://www.news.google.com/".
Click on "India" Tab.
check logo displayed or not
Click on "Local" Tab.
Check it is navigated to local news page or not
*/

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.news.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@aria-label='India']")).click();
		Boolean logo=driver.findElement(By.xpath("//img[@class='JAEwC ']")).isDisplayed();
		System.out.println("Logo displayed"+logo);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Local']")).click();
		System.out.println("navigated to: "+driver.findElement(By.xpath("//h1[normalize-space()='Your local news']")).getText());
		
		driver.quit();
	}

}
