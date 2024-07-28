package tasks;

/* 
Go to "https://www.amazon.in/".
Search for iphone in the search Box.
Display IPhone products which contains 128GB in the search results page. 
*/

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> items=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']//parent::a"));
		for(WebElement allItems:items) {
			System.out.println(allItems.getText());
		}
		
		

	}

}
