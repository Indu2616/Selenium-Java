package selenium4features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSwitchingCommands {

	public static void main(String[] args) {
		
		//TabsAndWindows
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		
		//driver.switchTo().newWindow(WindowType.TAB);  //switches to new tab in the browser
		driver.switchTo().newWindow(WindowType.WINDOW); // switches to new browser
		
		driver.get("https://orangehrm.com/");
		
	}

}
