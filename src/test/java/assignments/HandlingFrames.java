package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("selenium");
		driver.findElement(By.xpath("//a[contains(text(),'https://a9t9.com')]")).click();
		driver.findElement(By.xpath("//input[@name='EMAIL']")).sendKeys("abc@xyz.com");
		
		driver.switchTo().defaultContent();
		
		System.out.println("End of program...");
		
	}

}
