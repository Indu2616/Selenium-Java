package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAssignment {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		WebElement drpoptions=driver.findElement(By.xpath("//select[@id='country-list']"));
		drpoptions.click();
		Select options=new Select(drpoptions);
		
		//count total number of options
		List<WebElement> allOptions=options.getOptions();
		System.out.println("Number of options:" +allOptions.size());	//6
		
		//Print all the options
		for(WebElement aops:allOptions) {
			System.out.println(aops.getText());
		}
		
		//select 1 option
		options.selectByIndex(4);
		

	}

}
