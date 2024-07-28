package browserlaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {

	public static void main(String[] args) {
		
		//1.selenium 3.141.59 version (old version)
		//System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");
		//new ChromeDriver();

		//2.Using selenium any version and WebDriver Manager jar
		//WebDriverManager .chromedriver().setup();
		//new ChromeDriver();
				
		//3.selenium 4.12.1 version  (after 4.6 version)
			new ChromeDriver();

	}

}
