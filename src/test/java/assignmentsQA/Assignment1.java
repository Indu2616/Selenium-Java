package assignmentsQA;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com");
		driver.manage().window().maximize();
		
		//select location page
		WebElement First_dropdown=driver.findElement(By.xpath("//select[@name='fromPort']"));
		First_dropdown.click();
		Select dropdown1=new Select(First_dropdown);
		dropdown1.selectByValue("Mexico City");	//selects city
		WebElement second_dropdown=driver.findElement(By.xpath("//select[@name='toPort']"));
		second_dropdown.click();
		Select dropdown2=new Select(second_dropdown);
		dropdown2.selectByValue("London");
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		//select flight tickets page
		List<WebElement> prices=driver.findElements(By.xpath("//table[@class='table']//tr//td[6]"));
		List<String> arr = new ArrayList<String>();
        for (int i = 0; i < prices.size(); i++) {
        	arr.add(prices.get(i).getText());
        }											
		 Collections.sort(arr); 					//sorting in ascending order
		 for (int i = 0; i < arr.size(); i++) {	
	            if(prices.get(i).getText().equals("$200.98")) {
	            	driver.findElement(By.xpath("//table[@class='table']//tr[3]//td[1]//input[@value='Choose This Flight']")).click();
	            	break;
	            }//table[@class='table']//tr[3]//td[1]//input
	        }
		 
		//purchase page
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Shiv");	//name input_box
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("456 main street"); //address
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Anytown");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("AnyState");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("67890");
		WebElement cardType=driver.findElement(By.xpath("//select[@id='cardType']"));
		cardType.click();
		Select cardIs=new Select(cardType);
		cardIs.selectByValue("amex");
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2024");
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("ShivShakti");
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
		//Confirmation page
		String confirmationText=driver.findElement(By.tagName("h1")).getText();
		if(confirmationText.equals("Thank you for your purchase today!")) {
			System.out.println("Confirmation: Thank you for your purchase today!");
		}
		
		System.out.println("End of program..");
	
		driver.quit();
	}
	

}
