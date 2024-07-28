package dropdownsPractices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BootstrapDropDown {

	public static void main(String[] args) {
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();	//opens dropdown option
		
		//Selecting single option in a bootstrap
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		
		//capture all the options and find size
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Number of elements in Dropdown:" +options.size());	//14
		
		
		//printing options from dropdown
		//for loop
		/*for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}*/
		
		//enhanced for loop
		/*for(WebElement temp:options) {
			System.out.println(temp.getText());
		}*/
		
		
		//To select multiple options from the dropdown
		/*for(WebElement temp:options) {
			String op=temp.getText();
			
			if(op.equals("Java") ||op.equals("MySQL")||op.equals("Oracle") ) {
				temp.click();
			}
		}*/
		
	}
}
