package browserlaunch;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchBrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Browser Name");
		String Browser=input.next();
		input.close();
		
		WebDriver driver=null;
		
		switch(Browser.toLowerCase())
		{
			case "chrome":
				driver=new ChromeDriver();
				Thread.sleep(2000);
				System.out.println("chrome Browser lauched");
				driver.quit();
				break;
				
			case "Edge":
				driver=new EdgeDriver();
				Thread.sleep(2000);
				System.out.println("Edge Browser lauched");
				driver.quit();
				break;
				
			case "firfox":
				driver=new FirefoxDriver();
				Thread.sleep(2000);
				System.out.println("firfox Browser lauched");
				driver.quit();
				break;
				
			case "Invalid":
				System.out.println("Invalid");
				break;
		}
			
		
		
}

}


