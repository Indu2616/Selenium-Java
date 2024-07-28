package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocatorsAssignment {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/");
		
		//total number of links and print them
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links is:"+links.size());	//86
		
		//total number of images
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println("Total number if images is:"+images.size());	//10
		
		//click on any product link using linkText/partialLinkText
		driver.findElement(By.linkText("Cart")).click();
		String actualCartPage=driver.getTitle();
		if(actualCartPage.equals("STORE")){
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}
}
