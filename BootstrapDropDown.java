package shfre;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {
	 public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
	        driver.manage().window().maximize();
	        //dropdown is selected 
	        
	        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
	        
	        //selecting one option
	        
	        //driver.findElement(By.xpath("//input[@value='Java']")).click();
	        
	        //scaptuing all options and get the size
	        
	        List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	        System.out.println("Number of options:"+options.size());
	        
	        //printing options from dropdown
	        
	       /*for(WebElement op:options)
	       {
	    	   System.out.println(op.getText());
	       }*/
	        
	        //selecting multiple options
	        
	        for(WebElement op:options)
		       {
	        	  String abc=op.getText();
	        	  if(abc.equals("Java") || abc.equals("Python") || abc.equals("Oracle"))
{
		    	 op.click();
		       }
		       }
	        
	   //     driver.close();
	        

}
}
