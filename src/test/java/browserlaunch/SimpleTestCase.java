package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* 
Test Case

1.Launch  browser (chrome)
2.Open URL (https://demo.opencart.com/)
3.Validate title should be "Your Store"
4.close page
*/

public class SimpleTestCase {

	public static void main(String[] args) {
		
		//1.Launch  browser (chrome)
		//ChromeDriver driver=new ChromeDriver();
		 WebDriver driver=new ChromeDriver();

		//2.Open URL (https://demo.opencart.com/)
		 driver.get("https://demo.opencart.com/");
		 
		//3.Validate title should be "Your Store"
		 String actualResult= driver.getTitle();
		 if(actualResult.equals("Your Store")) {
			 System.out.println("Test Passed");
		 }
		 else {
			 System.out.println("Test Failed");
		 }
		 
		 //4.close page
		 driver.close(); 
	}
}
