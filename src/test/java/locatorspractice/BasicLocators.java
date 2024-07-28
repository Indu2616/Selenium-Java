package locatorspractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");

		//id
		//boolean logoDisplayStatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplayStatus);			//true
		
		//LinkText and partialLinkText - for locating links
		//driver.findElement(By.linkText("Software")).click();
		//driver.findElement(By.partialLinkText("Softwa")).click();
		
		//TagName and ClassName - for location group of webElements
		//ClassName
		//List<WebElement>headerLinks=driver.findElements(By.className("list-inline-item"));
		//System.out.println(headerLinks.size());				//7
		
		//TagName
		//List<WebElement>allLinks=driver.findElements(By.tagName("a"));
		//System.out.println("Total number of links in page:" +allLinks.size());	//76
		List<WebElement> allImages=driver.findElements(By.tagName("img"));
		System.out.println("All images in the page:"+allImages.size());				//18
		
	}

}
