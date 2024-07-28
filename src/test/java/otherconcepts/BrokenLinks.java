package otherconcepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Conditions to verify broken links 

1.Link must have href attribute --> href = "https://xyz.com" 
2.After validating first point, once we hit the url to server—then server will return the status code
		https://xyz.com -- server -- status code 
3.status code >=400 - broken link, 
  status code <400 - not a broken link	*/


public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		//Capture all links from website
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		int noOfBrokenLinks=0;
		for(WebElement linkElement:allLinks) {
			String hrefAtValue=linkElement.getAttribute("href");
			if(hrefAtValue==null || hrefAtValue.isEmpty()) {
				System.out.println("href attribute value is null or empty. so Not possible to check");
				continue;
			}
			
			//hit url to the server
			try {
			URL linkUrl=new URL(hrefAtValue); //converted href value from string to URL
			HttpURLConnection conn=(HttpURLConnection) linkUrl.openConnection(); //open connection to the server
			conn.connect(); //connect to server and sent request to the server
			if(conn.getResponseCode()>=400) {
				System.out.println(hrefAtValue+"----> Broken Link");
				noOfBrokenLinks++;
			}
			else {
				System.out.println(hrefAtValue+"----> Not a Broken Link");
			}
			}
			catch(Exception e) {
			}
		}
		System.out.println("Total number of Broken links: "+noOfBrokenLinks);
		driver.quit();
	}
}
