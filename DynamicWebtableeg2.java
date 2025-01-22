package shfre;



	
	

	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DynamicWebtableeg2 {

		public static void main(String[] args)
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://practice.expandtesting.com/dynamic-table");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			List<WebElement>rows=driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
			System.out.println("Number of rows :"+rows.size());
			// //table[@class='table table-striped']/tbody/tr[2 ]/td[1]
			for(int r=1;r<=rows.size();r++)
			{
				WebElement names=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+r+"]/td[1]"));
				//System.out.println(names.getText());
				if(names.getText().equals("Chrome"))
				{

					String cpuload= driver.findElement(By.xpath("//td[normalize-space(text())='Chrome']/following-sibling::td[contains(text(),'%')]")).getText();
					String value =driver.findElement(By.xpath("//p[@id='chrome-cpu']")).getText();
					//if(cpuload.equals(value))		
					if(value.contains(cpuload))
					{
						System.out.println("Matched...");
					}
					else
					{
						System.out.println("Not Matched...");
					}
					break;

				}
			}



		}

	}

