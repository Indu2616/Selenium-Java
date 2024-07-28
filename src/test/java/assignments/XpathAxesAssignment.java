package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesAssignment {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/r.php/");
		//driver.get("https://www.google.com/");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		//find the signup button from the registration from present in the facebook application (with child)
		//boolean fbSignUpButton=driver.findElement(By.xpath("//div[@id='reg_form_box']/child::div[11]/button")).isDisplayed();
		//System.out.println("FaceBook Signup button displayed: " +fbSignUpButton);		//true
		
		//Locate firstname field from signup button in facebook(with parent)
		//boolean	signupToFirstName=driver.findElement(By.xpath("//button[@name='websubmit']//parent::*/parent::*/child::div[1]/div[1]")).isDisplayed();
		//System.out.println("FirstName button is displayed:" +signupToFirstName);		//true
		
		//Identify the password from mobile number field in facebook (with following)
		//boolean passwordField=driver.findElement(By.xpath("//input[@name='reg_email__']/following::input[2]")).isDisplayed();
		//System.out.println("Password field is displayed:"+passwordField);	//true
		
		//Locate mobile number from new password field in facebook (with preceding)
		//boolean mobileNumField=driver.findElement(By.xpath("//input[@id='password_step_input']/preceding::input[2]")).isDisplayed();
		//System.out.println("Mobile number field is displayed:" +mobileNumField);		//true
		
		//Locate surname from female radio button in facebook (using ancestor)
		//boolean surnameButton=driver.findElement(By.xpath("//label[contains(text(),'Female')]/ancestor::div[2]/div[1]/div/div[2]")).isDisplayed();
		//boolean surnameButton=driver.findElement(By.xpath("//label[contains(text(),'Female')]/ancestor::div[2]|input[@name='lastname']")).isDisplayed();
		//System.out.println("Surname button is displayed:" +surnameButton);		//true //true
		
		//Identify the search text box from the google search button present in the google search home page (with parent)
		//boolean googleSearchBar=driver.findElement(By.xpath("//input[@value='Google Search']/parent::*/parent::*/parent::*/div[1]")).isDisplayed();
		//System.out.println("Google search bar is displayed:" +googleSearchBar);		//true
		
		//Identify the Today's Deals link from the amazon search text box present in the amazon home page (with FOllowing)
		//boolean amazon=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/following::a[contains(text(),\"Today's Deals\")]")).isDisplayed();
		//System.out.println("Today's Deals displayed:" +amazon);		//true
		
		//Identify the Hello, sign-in from the amazon search text box present in the amazon home page (following)
		//boolean helloSignIn=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/following::a[@id='nav-link-accountList']")).isDisplayed();
		//System.out.println("Hello, signin in amazon home page is displayed:" +helloSignIn);		//true
		
		//Identify mobiles link which is part of Menu bar-Amazon (Decendant)
		boolean mobilesInAmazon=driver.findElement(By.xpath("//div[@id='nav-xshop']/descendant::a[contains(text(),'Mobiles')]")).isDisplayed();
		System.out.println("Mobiles in amazon is located:" +mobilesInAmazon);		//true
		
		
		
		driver.quit();
		
	}
}
