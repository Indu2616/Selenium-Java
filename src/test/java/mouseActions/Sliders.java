package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		//Left Slider
		WebElement leftSlider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		System.out.println("Default locaton of left slider is: "+leftSlider.getLocation());	//(59, 250)
		act.dragAndDropBy(leftSlider, 100, 250).perform();
		System.out.println("Location of the left slider after moving: "+leftSlider.getLocation());	//(158, 250)
		
		//Right Slider
		WebElement rightSlider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Default locaton of Right slider is: "+rightSlider.getLocation());	//(612, 250)
		act.dragAndDropBy(rightSlider, -100, 250).perform();
		System.out.println("Location of the Right slider after moving: "+rightSlider.getLocation()); //(512, 250)

	}

}
