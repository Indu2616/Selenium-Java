package locatorspractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Xpath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("MacBook");
		
		//Xpath with multiple attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search'] [@name='search']")).sendKeys("MacBook");
		
		//Xpath with 'and' 'or' attribute
		//and - both attributes of the element must be true
		//driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("MacBook");
		//or - Atleast one attribute of the element must be true
		//driver.findElement(By.xpath("//input[@placeholder='Search' or @name='arch']")).sendKeys("MacBook");
	
		//Xpath with text() - inner text
		//driver.findElement(By.xpath("//a[text()='Desktops']")).click();
		
		//Xpath with contains() - Specifies the partial value of the element
		//driver.findElement(By.xpath("//input[contains(@placeholder,'arch')]")).sendKeys("MacBook");
		
		//Xpath with starts-with() - Specifies the partial value of the element
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("MacBook");
		
		//***handling dynamic elements - using contains() and starts-with() also with 'or' operator***
	
		/*chained Xpath - if attributes and inner text are not available for particular element then by using
		parent tag elements we can navigate to the child element.*/
		//boolean imgStatus=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		//System.out.println(imgStatus);
		
	}

}
