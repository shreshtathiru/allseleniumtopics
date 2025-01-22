package shfre;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	 public static void main(String[] args) throws InterruptedException {
		 
		  WebDriver driver = new ChromeDriver();

		  driver.manage().window().maximize();
	        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	        
	        //single window
	       /* String parentwindow=driver.getWindowHandle();
	        System.out.println("parent window::"+parentwindow+driver.getTitle());	      
	        driver.findElement(By.id("newWindowBtn")).click();
	        Set<String> windowHandles=driver.getWindowHandles();
	        for(String windowhandle:windowHandles)

	 {
	        	if(!windowhandle.equals(windowHandles))
	        	{
	        		driver.switchTo().window(windowhandle);
	        		driver.manage().window().maximize();
	        
	        		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("shreshta");
	        		Thread.sleep(3000);
	        		driver.close();
	        		Thread.sleep(3000);
	        		
	        	}
	        
	        	
	 } 
	 */
	        
	        String parentwindow=driver.getWindowHandle();
	        System.out.println("parent window::"+parentwindow+driver.getTitle());	      
	        driver.findElement(By.id("newTabBtn")).click();
	        Set<String> windowHandles=driver.getWindowHandles();
	        for(String windowhandle:windowHandles)

	 {
	        	if(!windowhandle.equals(windowHandles))
	        	{
	        		driver.switchTo().window(windowhandle);
	    System.out.println(driver.findElement(By.id("output")).getText());
	    driver.findElement(By.id("alertbox")).click();
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	    System.out.println(driver.findElement(By.id("output")).getText());
	    
	        	
	        		Thread.sleep(3000);
	        		driver.close();
	        	
	        	}
	        
	        	
	 } 
	        driver.switchTo().window(parentwindow);
	        driver.findElement(By.id("name")).sendKeys("HYR Turtliroals");
	        Thread.sleep(3000);
	        
	        
	        //single tab
	        
	        
	        driver.quit();
	 }

}
