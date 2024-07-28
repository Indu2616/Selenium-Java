package webdriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethodsPractice {

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.nopcommerce.com/");		//accepts URL only in string format

		//navigate().to(String)
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//or
		//URL myurl=new URL("https://demo.nopcommerce.com/");
		//driver.navigate().to(myurl);
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		
		//navigate().back()
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());		//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		//navigate().forward()
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());		//https://demo.nopcommerce.com/
		
		//navigate.refresh()
		driver.navigate().refresh();
		System.out.println("After refresh the page, the current URL is: " +driver.getCurrentUrl());	//https://demo.nopcommerce.com/
	
		driver.quit();
	}
}
