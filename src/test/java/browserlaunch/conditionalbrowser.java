package browserlaunch;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class conditionalbrowser {

	public static void main(String[] args)throws InterruptedException{
		Scanner input=new Scanner(System.in);
			System.out.println("Enter Browser name that to be lauched");
			String Browser=input.nextLine();
			input.close();
			
			WebDriver driver=null;
			
		if(Browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			Thread.sleep(2000);
			driver.quit();
	}
		else if(Browser.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
			Thread.sleep(2000);
			driver.quit();
		}
		else if(Browser.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
			Thread.sleep(2000);
			driver.quit();
		}
	}
}

