package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandles {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		WebElement searchRes=driver.findElement(By.xpath("//div[@id='wikipedia-search-result-link']"));
		System.out.println("Search result count is: "+searchRes.getSize());
		
		driver.findElement(By.xpath("//a[text()='Selenium']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Selenium in biology')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Selenium (software)')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Selenium disulfide')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Selenium dioxide')]")).click();
		
		Set<String> windowIds=driver.getWindowHandles();
		
		for(String allIDs:windowIds) {
			String title=driver.switchTo().window(allIDs).getTitle();
			System.out.println(title);
			
			if(title.equals("Selenium dioxide - Wikipedia")
					&& title.equals("Selenium (software) - Wikipedia") 
					&& (title.equals("Selenium in biology - Wikipedia"))) {
			driver.close();
		}
		}
	}
}
