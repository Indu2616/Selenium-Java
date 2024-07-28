package webtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//finding total number of rows in a table
		List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));	//7-preferred when multiple tables are present in page
		//List<WebElement> rows=driver.findElements(By.tagName("tr"));		// 14-preferred when single table is present in the page
		System.out.println("Number of rows in the table: "+rows.size());	//7
		
		
		//finding total number of colums in a table
		List<WebElement> colums=driver.findElements(By.xpath("//table[@name='BookTable']//th"));	//4-multiple tables
		//List<WebElement> colums=driver.findElements(By.tagName("th"));		//8-pferreable for single table approach 
		System.out.println("Number of colums in the table: "+colums.size());	//4
		
		
		//Read data from specific row and colum
		WebElement readData=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]"));
		System.out.println("specific WebElement in the web table: "+readData.getText());	//Master In Selenium
		
		//Read all the data from the web table
		/*System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		for(int r=2; r<=rows.size();r++) {
			for(int c=1; c<=colums.size();c++) {
				String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(data+"\t");
			}
			System.out.println();
		}*/
		
		
		//Print books names whose author is Mukesh
		/*for(int r=2;r<=rows.size();r++) {
		String autherName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		if(autherName.equals("Mukesh")) {
			String get_bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			System.out.println(get_bookName+"\t"+autherName);
		}*/
		
		
		//Find total price of all the books
		int total=0;
		for(int r=2; r<=rows.size();r++) {
		String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr//td[4]")).getText();
		total=total+Integer.parseInt(price);
		}
		System.out.println("Total price of the books:"+total);	//1800
	}
	}

