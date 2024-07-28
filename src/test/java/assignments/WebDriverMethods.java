package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//getMethods
		//getURL
		driver.get("https://testautomationpractice.blogspot.com");
		//getTitle
		System.out.println(driver.getTitle());		//Automation Testing Practice
		//getCurrentURL
		System.out.println(driver.getCurrentUrl());	//https://testautomationpractice.blogspot.com/
		//getPageSource
		//System.out.println(driver.getPageSource());
		//getWindowHandle()
		String windowId=driver.getWindowHandle();
		System.out.println("Window ID: "+windowId);		//BB5478D3CB96D23ACE455F06AE2922BE
		//getWindowHandles()
		driver.findElement(By.xpath("//button[contains(text(),'New Browser Window')]")).click();
		Set<String> allWindowIds=driver.getWindowHandles();
		System.out.println("All window Ids:" +allWindowIds);	//[C9001DB18C437E3FE91300A8901C3D91, 4806E12DF53F1241E3B9572F6F6CAAF2]
		
		
		//Conditional methods
		//isDisplayed()
		boolean icon=driver.findElement(By.xpath("//img[@class='wikipedia-icon']")).isDisplayed();
		System.out.println("Wikipedia Icon status: "+icon);		//true
		//isEnabled()
		Thread.sleep(5000);
		boolean status=driver.findElement(By.xpath("//input[@id='name']")).isEnabled();
		System.out.println("First name enable button status:" +status);		//true
		//isSelected()
		WebElement femaleRadiobutton=driver.findElement(By.xpath("//input[@id='female']"));
		System.out.println("felame Radio button status before: "+ femaleRadiobutton.isSelected());	//false
		femaleRadiobutton.click();
		System.out.println("felame Radio button status after: "+femaleRadiobutton.isSelected());	//true
		//checkboxes
		WebElement monCheckbox=driver.findElement(By.xpath("//input[@id='monday']"));
		WebElement friCheckbox=driver.findElement(By.xpath("//input[@id='friday']"));
		System.out.println("Before checking the box:" + monCheckbox.isSelected() + friCheckbox.isSelected());	//falsefalse
		monCheckbox.click();
		friCheckbox.click();
		System.out.println("After checking the box:" + monCheckbox.isSelected() + friCheckbox.isSelected());	//truetrue
				
		
		//Browser methods
		//close
		//driver.close();
		//quit
		driver.quit();
	}

}
