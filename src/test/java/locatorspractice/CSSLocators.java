package locatorspractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mac");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Mac");  - tag is optinal
		
		//tag.className
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Mac");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Mac");	  - tag is optinal
		
		//tag[attribute='value']
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Mac");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Mac"); - tag is optinal
		
		//tag.class[attribute='value']
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Mac");
		//driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Mac");
		
	}

}
