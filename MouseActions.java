package shfre;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	 public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        //move to ELement
	        /*driver.get("https://demo.opencart.com/");
	        driver.manage().window().maximize();
	     WebElement  desktops=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	     WebElement  macbook=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	        
	     Actions actions=new Actions(driver);
	     
	     actions.moveToElement(desktops).moveToElement(macbook).click().build().perform();*/
	        
	        //right click --context click 
	       /* driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	        driver.manage().window().maximize();
	        WebElement hi=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	        Actions act=new Actions(driver);
	        act.contextClick(hi).perform();
	       
	        //click on copy
	        driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
	        //switch to alert
	        
	    driver.switchTo().alert().accept();
	    */
	        // Double click example
	        /*driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	        driver.manage().window().maximize();  
	        
	        driver.switchTo().frame("iframeResult");
	        
	        WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
	        WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
	        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	    
	        // Clear and enter text in box1
	        box1.clear();
	        box1.sendKeys("shreshta");
	        
	        // Double click action on the button
	        Actions actions = new Actions(driver);
	        actions.doubleClick(button).click().perform();
	        
	        // Validate the copied text
	        String txt = box2.getAttribute("value");

	        System.out.println("Captured text: " + txt);

	        if(txt.equals("shreshta")) {
	            System.out.println("Text copied successfully.");
	        } else {
	            System.out.println("Text not copied properly.");
	        }
	        */
	        
	        //drag and drop eg
	        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	        driver.manage().window().maximize();  
	        
	        
	        
	        WebElement srcseoul= driver.findElement(By.xpath("//div[@id='box5']"));
	        WebElement  destkorea= driver.findElement(By.xpath("//div[@id='box105']"));
	        
	        Actions act=new Actions(driver);
	        act.dragAndDrop(srcseoul, destkorea).build().perform();
	        
	        Thread.sleep(2000);
	        
	        driver.close();
	 
	 }
	 

}
