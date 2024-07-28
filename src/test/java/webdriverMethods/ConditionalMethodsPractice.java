package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethodsPractice {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed() - displayes the element is present in the page or not
		//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("Display status of Logo: "+logo.isDisplayed());		//true
		//or
		//boolean logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println("Display logo status is: "+logo);		//true
		
		//isEnabled() - checks the element is in working condition/is enabled or not
		//boolean status=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		//System.out.println("Enabled status: "+status);		//true
		
		//isSelected() - used to check radio buttons & check boxes are selected or not
		 /*WebElement maleRadiobox=driver.findElement(By.xpath("//input[@id='gender-male']"));
		 WebElement femaleRadiobox=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before Selection....");
		System.out.println(maleRadiobox.isSelected());		//false
		System.out.println(femaleRadiobox.isSelected());	//false
		
		System.out.println("After Selecting male Radio Button....");
		maleRadiobox.click();
		System.out.println(maleRadiobox.isSelected());		//true
		System.out.println(femaleRadiobox.isSelected());	//false
		
		System.out.println("After Selecting female Radio Button....");
		femaleRadiobox.click();
		System.out.println(maleRadiobox.isSelected());		//false
		System.out.println(femaleRadiobox.isSelected());	//true*/
		
		WebElement newsletter=driver.findElement(By.xpath("//input[@id='Newsletter']"));
		System.out.println("newsletter status: "+newsletter.isSelected());		//true
		
		driver.quit();
		
	}

}
