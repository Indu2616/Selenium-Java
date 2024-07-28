package screenshotConcepts;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotsCapturing {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1. Full page screenshot
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\FullPage.png");
		sourceFile.renameTo(targetFile);	*/
		
		//2. Specific Area of the page
		/*WebElement featuiredProduct=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourceFile=featuiredProduct.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\SpecificArea SS.png");
		sourceFile.renameTo(targetFile);	*/
		
		//3. Specific WebElement
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourceFile=logo.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\Specific ss.png");
		sourceFile.renameTo(targetFile);
				
		
		driver.quit();
		
	}

}
