package shfre;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertEgUsingExplicitWait {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Simple Alert
        driver.findElement(By.cssSelector("#alertBtn")).click();
        System.out.println("Clicked on simple alert button.");
        try {
            wait.until(ExpectedConditions.alertIsPresent()); // Wait for alert to be present
            Alert alert = driver.switchTo().alert();
            System.out.println("Simple Alert Message: " + alert.getText());
            alert.accept();
        } catch (Exception e) {
            System.out.println("No Simple Alert present.");
        }

        Thread.sleep(2000); // Wait for 2 seconds to see the next interaction

        // Confirmation Alert with OK and Cancel buttons
        driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
        System.out.println("Clicked on confirmation alert button.");
        try {
            wait.until(ExpectedConditions.alertIsPresent()); // Wait for alert to be present
            Alert alert = driver.switchTo().alert();
            System.out.println("Confirmation Alert Message (before dismissing): " + alert.getText());
            alert.dismiss(); // Dismissing the alert
        } catch (Exception e) {
            System.out.println("No Confirmation Alert present.");
        }

        Thread.sleep(2000);

        // Click again to trigger the confirmation alert
        driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
        System.out.println("Clicked on confirmation alert button again.");
        try {
            wait.until(ExpectedConditions.alertIsPresent()); // Wait for alert to be present
            Alert alert = driver.switchTo().alert();
            System.out.println("Confirmation Alert Message (after accepting): " + alert.getText());
            alert.accept(); // Accepting the alert
        } catch (Exception e) {
            System.out.println("No Confirmation Alert present.");
        }

        Thread.sleep(2000);

        // Prompt Alert with input box, OK and Cancel buttons
        driver.findElement(By.cssSelector("#promptBtn")).click();
        System.out.println("Clicked on prompt alert button.");
        try {
            wait.until(ExpectedConditions.alertIsPresent()); // Wait for alert to be present
            Alert alert = driver.switchTo().alert();
            alert.sendKeys("Shreshta"); // Inputting text in prompt
            alert.accept(); // Accepting the prompt alert
            System.out.println("Prompt Alert Message after accepting: " + alert.getText());
        } catch (Exception e) {
            System.out.println("No Prompt Alert present.");
        }

        // Capturing the displayed text on the webpage
        WebElement txt = driver.findElement(By.cssSelector("#demo"));
        System.out.println("Text displayed on the webpage after prompt: " + txt.getText());

        // Closing the browser
        driver.quit();
    }
}
