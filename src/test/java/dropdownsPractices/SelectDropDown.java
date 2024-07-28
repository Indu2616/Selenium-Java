package dropdownsPractices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drp_CountryEle=driver.findElement(By.xpath("//select[@id='country']"));
		Select drp_Country=new Select(drp_CountryEle);
		
		//Select method
		//drp_Country.selectByVisibleText("France"); //using text that are visible in UI
		//drp_Country.selectByValue("uk");	//using 'value' attribute
		//drp_Country.selectByIndex(3);		//using index - index starts from 0
		
		
		//to retrieve text of options in dropdown
		List<WebElement> options=drp_Country.getOptions();
		System.out.println("Number of options in the dropdown:"+options.size());	//10
		//using for loop
		/*for(int i=0; i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}*/
		
		//using enhanced for loop
		/*for(WebElement drptext:options) {
			System.out.println(drptext.getText());
		}*/

	}

}
