package pageobjectmodel;

// ** Page object class without using Page factory method **
//there is no change in loginTest class with or without using page factory - only change is in page object class

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;
	
	//Constructor
	loginPage(WebDriver driver){
		this.driver=driver;
	}
	
	
	//Locator
	By username_txt_loc=By.xpath("//input[@name='username']");
	By password_txt_loc=By.xpath("//input[@name='password']");
	By login_button_loc=By.xpath("//button[normalize-space()='Login']");
	
	
	//Action methods
	public void username_txtbox(String user) {
		driver.findElement(username_txt_loc).sendKeys(user);
	}
	public void password_txtbox(String pwd) {
		driver.findElement(password_txt_loc).sendKeys(pwd);
	}
	public void login_click() {
		driver.findElement(login_button_loc).click();
	}

}
