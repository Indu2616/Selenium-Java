package javascriptExecutorConcept;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//1. scroll the page till the element is visible 
		//WebElement ele=driver.findElement(By.xpath("//strong[contains(text(),'Community poll')]"));
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		
		//2. scroll page by pixel number 
		//js.executeScript("window.scrollBy(0,1500)", " ");
		//System.out.println(js.executeScript("return window.pageYOffset;"));	//to print pixels - 1500
		
		//3. scrolling to end 
		/*js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		//scroll up to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)"); */
		
	}

}
