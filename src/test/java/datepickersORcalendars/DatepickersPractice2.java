package datepickersORcalendars;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatepickersPractice2 {
	
	//user defined method for converting month from string--->Month
	static Month convertMonth(String month) {
		HashMap<String, Month> monthMap=new HashMap<String, Month>();
		
		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);
		
		Month vmonth=monthMap.get(month);
		if(vmonth==null) {
			System.out.println("Invalid month..");
		}
		return vmonth;
	}

	static void selectDate(WebDriver driver, String requiredYear, String requiredMonth, String requiredDate) {
		// selecting year
		WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectYear = new Select(yearDropdown);
		selectYear.selectByVisibleText(requiredYear); // error

		// selecting month
		while (true) {
			String displayMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			// convert requiredMonth and display month into month objects
			Month expectedMonth = convertMonth(requiredMonth);
			Month currentMonth = convertMonth(displayMonth);
			// compare
			int result = expectedMonth.compareTo(currentMonth); // 0-months equal, >0-future, <0-Past
			if (result < 0) { // past
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			} else if (result > 0) { // Future
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			} else {
				break;
			}
		}

		// selecting date
		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for (WebElement date : allDates) {
			if (date.getText().equals(requiredDate)) {
				date.click();
				break;
			}
		}
	}
			
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		String requiredYear="2020";
		String requiredMonth="June";
		String requiredDate="15";
		
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
		selectDate(driver, requiredYear, requiredMonth, requiredDate);
		
	}

}
