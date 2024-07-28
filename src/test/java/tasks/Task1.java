package tasks;

/*Task 01 Description:
 * 
Go to "https://www.amazon.in/".
Search for mobiles in the search Box
Display Mobile Products Titles in the search results page.	*/

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");;
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	
	List<WebElement> items=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	System.out.println(items.size());				//22
	for(WebElement allitems:items) {
		System.out.println(allitems.getText());
	}
		driver.quit();
	}
}
