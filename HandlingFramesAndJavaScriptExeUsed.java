package shfre;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingFramesAndJavaScriptExeUsed {
	 public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://ui.vision/demo/webtest/frames/");
	        driver.manage().window().maximize();
	        
//passing frame1 as webelemeent
	        WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	        driver.switchTo().frame(frame1);
	        driver.findElement(By.xpath("// input[@name='mytext1']")).sendKeys("Hello");
	        Thread.sleep(4000);
//if you try to switch to from frame 1 to frame 2 we will get no such element exception beacause driver is pointimg out tpo frame 1 only 
//to not get error we need to come out of the frame and got back to the main lpage and then from the main page you can switch to frame 2
	        driver.switchTo().defaultContent();
	        
	        //frame 2
	        
	        WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	        driver.switchTo().frame(frame2);
	        driver.findElement(By.xpath("// input[@name='mytext2']")).sendKeys("Selenium");
	        Thread.sleep(4000);
	        driver.switchTo().defaultContent();
	        
	      //  frame 3:
	        	  WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	        driver.switchTo().frame(frame3);
	        driver.findElement(By.xpath("// input[@name='mytext3']")).sendKeys("java");
	    //inner frame-it is part of frame 3
	        driver.switchTo().frame(0); //her done switching using index
	      //driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
	        
	        WebElement rdbtn=driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
	        
	        JavascriptExecutor js=(JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", rdbtn);
	        Thread.sleep(4000);
	        driver.switchTo().defaultContent();
	        
	        //we can also switch the framw using id and name of the frame
	        //t return to the parent frame we can use parentFrameswitchTo.parfentFrame();
	        
	        driver.close();

}
}
