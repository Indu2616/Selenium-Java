package assignments;

/* 
 Test Case 

 1.Launch  browser (Edge)
 2.Open URL (https://demo.nopcommerce.com/)
 3.Validate title should be "nopCommerce demo store"
 4.close page
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SImpleAssignment {

	public static void main(String[] args) {
		
		//1.Launch  browser (Edge)
		//EdgeDriver driver=new EdgeDriver();
		WebDriver driver=new EdgeDriver();
		
		//2.Open URL (https://demo.nopcommerce.com/)
		driver.get("https://demo.nopcommerce.com/");
		
		//3.Validate title should be "nopCommerce demo store"
		String actualResult=driver.getTitle();
		if(actualResult.equals("nopCommerce demo store")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		//4.close page
		driver.close();	
	}
}
