package shfre;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxAllcaseExamples {
 

	public static void main(String[] args) 
	{ 
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//selecting single checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//selecting multiple chckboxes

		List<WebElement> li=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("size"+li.size());
		
		//for selecting use for loop or for each loop

		/*for(int i=0;i<li.size();i++)
		{
			li.get(i).click();		
		}
		}
		*/
		
for(WebElement cb:li)
	{
		cb.click();
	}
	

	
		//selecting checkboxes by choice(Monday friday sunday)
		/*for(WebElement cb:li)
		{
			
			String cbname=cb.getAttribute("id");
			if(cbname.equals("monday") || cbname.equals("sunday") || cbname.equals("friday"))
			{
				cb.click();
			}
			
		}
		*/
		
		
		//select last 3 check boxes
		//total nomof check boxes-how many check boxes you want tp select=datrting index (7-3)=4
		
		/*for(int i=4;i<li.size();i++)
		{
			li.get(i).click();
		}
		*/
		//select first three boxes
		/*for(int i=0;i<3;i++)
		{
			li.get(i).click();		
			
		}*/
		
		//unselect all the checkboxes if they are selected
		
		for(WebElement cb:li)
		{
			cb.click();
		}
		
		driver.close();
		}
		
	
	}

