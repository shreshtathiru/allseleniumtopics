package shfre;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopUpExample {
	
	public static void main(String[] args) throws InterruptedException {
	

        WebDriver driver = new ChromeDriver();
       
       // driver.get("https://the-internet.herokuapp.com/basic_auth");
        //Syntax http://username:password@the-internet.herokkuapp.com/basicx_auth
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Thread.sleep(2000);
        
  driver.close();
  
  /*
  package shfre;

  import java.time.Duration;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;
  import org.openqa.selenium.chrome.ChromeOptions;
  import io.github.bonigarcia.wdm.WebDriverManager;

  public class AuthenticatedPopUpExample {
      
      public static void main(String[] args) throws InterruptedException {
      
          // Set ChromeOptions to handle authentication without popups
          ChromeOptions options = new ChromeOptions();
          
          // Replace "username" and "password" with the actual credentials for the site
          String username = "admin";
          String password = "admin";
          String authUrl = "https://the-internet.herokuapp.com/basic_auth";
          
          // Encode the username and password in the URL format
          String credentials = username + ":" + password + "@" + authUrl.replace("https://", "");
          
          // Add the URL with embedded credentials to the ChromeOptions
          options.addArguments("start-maximized");
          
          // Launch the Chrome browser with the specified options
          WebDriver driver = new ChromeDriver(options);
          
          // Access the authenticated page
          driver.get("https://" + credentials);
          
          // Optional: Wait for a few seconds to observe the action
          Thread.sleep(5000);
          
          // Close the browser
          driver.quit();
      }
  }


        
*/

}

}