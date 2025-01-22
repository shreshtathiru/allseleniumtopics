package shfre;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDownExample {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
        Select dropdown=new Select(country);
        //selected dropdown based on visible text
      // dropdown.selectByVisibleText("Germany");
        //System.out.println(dropdown.getFirstSelectedOption().getText());
        
        //selected dropdown bsed on value
        
        //dropdown.selectByValue("uk");
        //System.out.println(dropdown.getFirstSelectedOption().getText());
        
        //select dropdown based on indesx
        
        dropdown.selectByIndex(4);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        //capture the options from dropdown
     
        List<WebElement> optionslist=dropdown.getOptions();
        System.out.println("options size"+optionslist.size());
        
        //printing the options
      /*  
       for(int i=0;i<optionslist.size();i++)
       {
    	   System.out.println(optionslist.get(i).getText());
       }
      */
       //enhancesd for loop
       
       for(WebElement option:optionslist)
       {
    	   System.out.println(option.getText());
       }
        
    }

}