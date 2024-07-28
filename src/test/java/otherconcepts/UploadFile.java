package otherconcepts;
	
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
				//filepath not found (error) - InvalidArgumentException
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//single file upload - To become SDET.docs
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Automation\\Automation Files\\Test1.txt");
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Test1.txt")) {
			System.out.println("File is successfully uploaded");
		}
		else {
			System.out.println("Upload failed");
		}*/
		
		
		
		//Multiple files upload
		String file1="C:\\Automation\\Automation Files\\Test1.txt";
		String file2="C:\\Automation\\Automation Files\\Test2.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		int noOfFilesUploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		//Validation1 - Number of files 
		if(noOfFilesUploaded==2) {
			System.out.println("All files are uploaded");
		}
		else {
			System.out.println("Files are not uploaded or incorrect files uploaded");
		}
		
		//Validation2 - file names
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Test1.txt")
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Test2.txt")) {
			System.out.println("File names matching");
		}
		else {
			System.out.println("Files not matching");
		}

	}

}
