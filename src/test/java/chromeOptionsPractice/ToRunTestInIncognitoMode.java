package chromeOptionsPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToRunTestInIncognitoMode {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		if(title.equals("Your Store")) {
			System.out.println("Testcase Passed");
		}
		else {
			System.out.println("Testcase Failed");
		}
		
	}

}
