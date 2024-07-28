package locatorspractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesPractice {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		//self - Selects the current node
		String text=driver.findElement(By.xpath("//a[contains(text(),'Just Dial')]/self::a")).getText();
		System.out.println("Self: "+text);    	//Just Dial
		
		//parent - Selects the parent of the current node (always one)
		text=driver.findElement(By.xpath("//a[contains(text(),'Just Dial')]/parent::td")).getText();
		System.out.println("Parent:"+text);		//Just Dial
		
		//Child - Selects all children of the current node (one/many)
		List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr/child::td"));
		System.out.println("Number of child elements:"+childs.size());	//5
		
		//Ancestor - Selects all ancestors (parent, grand parent, etc.)
		text=driver.findElement(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr")).getText();
		System.out.println("Ancestor:"+text);
		
		//Descending - Selects all descendants of the current node in the document(children, grandchildren, etc.)
		List<WebElement> descendants=driver.findElements(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of decending nodes:"+descendants.size());	//7
		
		//Following - Selects everything in the document after closing tag of the current node
		List<WebElement> followingNodes=driver.findElements(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr/following::tr"));
		System.out.println("Number of following node:"+followingNodes.size());	//267
		
		//preceding - Selects all nodes that appear before the current node in the document
		List<WebElement> precedings=driver.findElements(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr/preceding::tr"));
		System.out.println("Nmumber is preceding nodes:"+precedings.size());	//31
		
		//Following-sibling - Selects all siblings after the current node
		List<WebElement> followingSbiblings=driver.findElements(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of following-Siblings:"+followingSbiblings.size());
		
		//Preceding-siblings - Selects all siblings before the current node
		List<WebElement> PrecedingSiblings=driver.findElements(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of preceding-Sibling:"+PrecedingSiblings.size());
		
		driver.quit();
		
	}

}
