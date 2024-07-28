package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorsAssignment {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//tag#id
		driver.findElement(By.cssSelector("div#logo")).click();
		//tag.className
		//tag[attribute='value']
		//driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("Mac");
		//tag.className[attribute='value']
		//driver.findElement(By.cssSelector("img.img-fluid[alt='Your Store']"));
		
		
	}

}
