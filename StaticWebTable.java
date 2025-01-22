package shfre;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {
	
	public static void main(String[] args) 
	{ 
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1.find total number of rows
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("no o rows"+rows);
		
		//2.find no of columns
		
		int colns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("no of colns"+colns);
		
		//3.Read data from specific row and colmn
		
		String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(bookname);
		
		//4.read data from rows and colns
		System.out.println("bookname"+"\t"+"Author"+"\t"+"SUbject"+"\t"+"Price");
		for(int r=2;r<=rows;r++) {
			
			for(int c=1;c<=colns;c++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(value+"\t");
				
			}
		}
		
	}

}
