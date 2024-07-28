package webdriverMethods;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodsPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//get() - used to launch the application URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		
		//getTitle() - used to get title of the application
		System.out.println(driver.getTitle());		//OrangeHRM
		
		//getCurrentUrl() - used to retrieve current url of the application
		System.out.println(driver.getCurrentUrl());		//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		//getPageSource() - used to retrieve the source code of the entire page
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle() - used to retrieve ID of single browser window
		//String windowID=driver.getWindowHandle();
		//System.out.println("Window ID: "+windowID);		//2B8221F254FFE4CAE301621B9DD5EEC3
		
		//getWindowHandles()- used to retrieve IDs of all browser windows
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Thread.sleep(3000);
		Set<String> allWindowIDs=driver.getWindowHandles();
		System.out.println("All Window Ids: " +allWindowIDs);	//[6AE1AF7B14FF095CF4EC183CACAA7067, 912841367C57FB9C0FD7C6880C5D2C0C]
		
		//Close() - used to close only 1 single browser window at a time
		//driver.close();
		
		//quit() - used to close all browser windows at a time
		driver.quit();
	}

}
