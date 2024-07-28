package handlingbrowserwindows;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlngCheckboxes {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//selecting specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//selecting all the checkboxes
		List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		/*for(WebElement allcheckboxes:checkBoxes) {
			allcheckboxes.click();
		}	*/
		//or
		/*for(int i=0; i<checkBoxes.size();i++) {
			checkBoxes.get(i).click();
		}	*/
		
		//selecting last 3 checkboxes
		//total no of checkboxes-how many checkboxes we want to select=starting index (7-3=4)
		/*for(int i=4; i<checkBoxes.size(); i++) {
			checkBoxes.get(i).click();
		}*/
		
		//selecting first 4 checkboxes
		/*for(int i=0; i<5;i++) {
			checkBoxes.get(i).click();
		}*/
		
		//Uncheck checkboxes if they are selected
		//for loop - to work on specific checkboxes
		/*for(int i=0; i<5; i++) {
			checkBoxes.get(i).click();
		}
		for(int i=0; i<5; i++) {
			if(checkBoxes.get(i).isSelected()) {
			checkBoxes.get(i).click();
		}
		}*/
		//or - for each loop - to work on all checkboxes
		for(WebElement allcheckboxes:checkBoxes) {
			allcheckboxes.click();
		}
		for(WebElement allcheckboxes:checkBoxes) {
			if(allcheckboxes.isSelected()) {
			allcheckboxes.click();
		}
	}
	}
}
