/*package shfre;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
    
    public static void main(String[] args) throws InterruptedException {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Set an implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Navigate to the URL
        driver.get("https://demo.opencart.com/admin/index.php");
        
     
        driver.manage().window().maximize();
        
        // Locate the username field and enter a value
        WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
        username.clear();
        username.sendKeys("demo");
        
        // Add a delay (if needed) and close the browser
        Thread.sleep(2000); // Optional, just to wait for 2 seconds
        
       / /WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
       // password.clear();
        //password.sendKeys("demo");
        
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        
       /* //close window is available
        if(driver.findElement(By.xpath("//buton[@class='btn-close']")).isDisplayed())
        {
        	driver.findElement(By.xpath("//buton[@class='btn-close']")).click();
        }
        */
       // driver.findElement(By.xpath("//a[@class='parent']")).click();//customrs main menu
       // driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
        
        // Close the driver
       // driver.quit();
    //}
//}
