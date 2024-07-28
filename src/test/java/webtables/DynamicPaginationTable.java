package webtables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		//login page
		WebElement userName=driver.findElement(By.xpath("//input[@id='input-username']"));
		userName.clear();
		userName.sendKeys("demo");
		WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		//closing notification if it is displayed 
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		
		//Showing 1 to 10 of 20322 (2033 Pages)
		String text=driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();
		int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));	//converts from string to int
		//System.out.println(total_pages);	//2033 (dynamic value)
		
		
		//clicking pages or repeting pages
		for(int p=1;p<=5;p++) {
			if(p>1) {
				WebElement activePage=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				activePage.click();
			}
			
			//reading data from the page
			int rows=driver.findElements(By.xpath("//div[@class='table-responsive']//tbody//tr")).size();
			for(int r=1; r<=rows;r++) {
				String customerNames=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String emails=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
			
				System.out.println(customerNames+"  "+emails+"  "+status);
			}
		}
		
		
	}

}
