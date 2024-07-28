package handlingbrowserwindows;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Normal alert with OK button
		/*driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		//driver.switchTo().alert().accept();	//to close alert using OK button
		Alert myalert=driver.switchTo().alert(); //to do multiple actions on alert
		System.out.println(myalert.getText());		//I am a JS Alert
		myalert.accept();	*/
		
		
		//Confirmation alert with OK OR Cancel buttons
		/*driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();	//dismiss() - close the alert using cancel button
		//or
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());		//I am a JS Confirm
		myalert.accept();
		//myalert.dismiss();	*/
		
		
		//Prompting alert - Input box with OK & Cancel buttons
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());		//I am a JS prompt
		myalert.sendKeys("Welcome");
		myalert.accept();
		//myalert.dismiss();
		
	}

}
