package shfre;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorScrollingPage {
	
	public static void main(String[] args) 
	{ 
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//scrooldown the page by pixel number
		//js.executeScript("window.scrollBy(0,1500)","");
		
		//scroll the page till elemeent is visible
		
		//WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		//js.executeScript("arguments[0].scrollintoView();",ele);
		
		//scroll page till the end of the lage 
		
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//scrool upto initial posiition
	
	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

}
}
