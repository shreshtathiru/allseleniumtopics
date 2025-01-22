package shfre;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsAllTypes {
 

	public static void main(String[] args) throws InterruptedException 
	{ 
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//simple Alert
		driver.findElement(By.cssSelector("#alertBtn")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		Thread.sleep(4000);
		
		// confiramtion alert comes with ok and cancel button
		
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		System.out.println("message after clicking dismiss for confiramatuon"+alert.getText());
		alert.dismiss();
	
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		System.out.println("message after clicking accept in confirmationn "+alert.getText());
		alert.accept();

		Thread.sleep(4000);
		
		//prompt alert comes with onetext box and ok and camcel button
		
		driver.findElement(By.cssSelector("#promptBtn")).click();
		alert.sendKeys("Shreshta");
		alert.accept();

		
		WebElement txt=driver.findElement(By.cssSelector("#demo"));
		System.out.println("txt ++++"+txt.getText());
		
		
		
		
		
		}
}
