package handlingbrowserwindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticationPopups {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();

		//Syntax - http://username:password@the-internet.herokuapp.com/basic_auth
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
