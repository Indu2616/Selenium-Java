package datepickersORcalendars;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickersPractice {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);	//switching to frames
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//Method1 -using sendkeys()
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("05/18/2024");
		
		
		//Method2 - using datePicker
		
		/*String expectedYear="2025";
		String expectedMonth="February";
		String expectedDate="17";	*/
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the year");
		String expectedYear=input.next();
		System.out.println("Enter the month");
		String expectedMonth=input.next();
		System.out.println("Enter the Date");
		String expectedDate=input.next();
		input.close();
		
		//selecting year and month
		while(true) {
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if((currentYear.equals(expectedYear))&& (currentMonth.equals(expectedMonth))) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
		
		//selecting date
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//a"));
		for(WebElement date:allDates) {
			if(date.getText().equals(expectedDate)) {
				date.click();
				break;
			}
		}

	}

}
