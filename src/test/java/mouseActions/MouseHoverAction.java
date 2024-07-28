package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement computers=driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		WebElement desktops=driver.findElement(By.xpath("//a[contains(text(),'Desktops')]"));
		
		Actions act=new Actions(driver);
		//movehover action
		act.moveToElement(computers).moveToElement(desktops).click().build().perform();
		
		//act.moveToElement(computers).moveToElement(desktops).click().perform();
		
	}

}
