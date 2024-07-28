package pageobjectmodel;

// ** Page object class using page factory method **
//there is no change in loginTest class with or without using page factory - only change is in page object class

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageUsingPageFactory {
	
	WebDriver driver;
	
	//Constructor
	loginPageUsingPageFactory(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this); /*mandatory statement for page factory - initElements is a method which will initiate all the elements using driver */
	}
	
	
	//Locator 
	@FindBy(xpath="//input[@name='username']") WebElement username_txtbox;
	@FindBy(xpath="//input[@name='password']") WebElement password_txtbox;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement login_click;
	
	
	//Action methods
	public void username_txtbox(String user) {
		username_txtbox.sendKeys(user);
	}
	public void password_txtbox(String pwd) {
		password_txtbox.sendKeys(pwd);
	}
	public void login_click() {
		login_click.click();
	}

}
