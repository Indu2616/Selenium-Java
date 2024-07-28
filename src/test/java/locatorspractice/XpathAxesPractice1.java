package locatorspractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesPractice1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		
		//self 
		String text=driver.findElement(By.xpath("//a[contains(text(),'Omax Auto')]/self::a")).getText();
		System.out.println("self:" +text);		//Omax Auto
		
		//parent
		text=driver.findElement(By.xpath("//a[contains(text(),'Omax Auto')]/parent::td")).getText();
		System.out.println("parent:" +text);		//Omax Auto
		
		//child
		List<WebElement> childNodes=driver.findElements(By.xpath("//a[contains(text(),'Omax Auto')]/ancestor::tr/child::td"));
		System.out.println("Child:" +childNodes.size());		//5
		
		//ancestor
		text=driver.findElement(By.xpath("//a[contains(text(),'Omax Auto')]/ancestor::tr")).getText();
		System.out.println("Ancestor:" +text);		//Omax Auto T 124.74 127.23 + 2.00
		
		//decendent
		List<WebElement> decendantNodes=driver.findElements(By.xpath("//a[contains(text(),'Omax Auto')]/ancestor::tr/descendant::*"));
		System.out.println("Number of Decendant nodes are:" +decendantNodes.size());		//7
		
		//Following
		List<WebElement> followingNodes=driver.findElements(By.xpath("//a[contains(text(),'Omax Auto')]/ancestor::tr/following::tr"));
		System.out.println("FollowingNodes are:" +followingNodes.size());		//1027
		
		//following-sibling
		List<WebElement> followingSiblingNodes=driver.findElements(By.xpath("//a[contains(text(),'Omax Auto')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Following-sibling nodes:" +followingSiblingNodes.size());		//1025
		
		//preceding
		List<WebElement> PrecedingNodes=driver.findElements(By.xpath("//a[contains(text(),'Omax Auto')]/parent::td/preceding::tr"));
		System.out.println("Number of preceding nodes:" +PrecedingNodes.size());		//693
		
		//preceding-sibling
		List<WebElement> precedingSiblingNodes=driver.findElements(By.xpath("//a[contains(text(),'Omax Auto')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of preceding nodes:" +precedingSiblingNodes.size());		//692

		driver.quit();
		
	}

}
