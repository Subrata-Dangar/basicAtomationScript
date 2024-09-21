package Automation.Automation;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//Actions action = new Actions(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		WebElement Search = driver.findElement(By.xpath("//textArea[@title='Search']"));
		Search.sendKeys("speed test");
		Search.submit();
		
		
//		driver.findElement(By.xpath("//h3[text()='Speedtest by Ookla - The Global Broadband Speed Test']")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Your privacy is important to us. ']")));
		
//		Alert alert = 
//		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("//button[text()='Continue']")).click();		

//		driver.findElement(By.xpath("//span[text()='Go']")).click();
//		Thread.sleep(10000);
		
//		WebElement download = driver.findElement(By.xpath("//*[@class=\"result-data-large number result-data-value download-speed\"]"));
		
		driver.findElement(By.xpath("//div[text()='RUN SPEED TEST']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
//		driver.switchTo().alert();
		try {
		Thread.sleep(50000);
		WebElement download = driver.findElement(By.id("knowledge-verticals-internetspeedtest__download"));
		String data = download.getText();
		
		System.out.println("Download speed is " + data);
		
		WebElement upload = driver.findElement(By.id("knowledge-verticals-internetspeedtest__upload"));
		String data2 = upload.getText();
		
		System.out.println("Upload speed is " + data2);
		}
		catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		finally {
		driver.quit();}
	}

}
