package browserlaunch;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxAndEdgeOld {

	public static void main(String[] args) {
		
		//selenium 3.141.59 version (old version)
		
		System.setProperty("webdriver.gecko.driver","D:\\Tools\\geckodriver-v0.34.0-win64/geckodriver.exe");
		new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver", "D:\\Tools\\edgedriver_win64 (1)/msedgedriver.exe");
		new EdgeDriver();

	}

}
