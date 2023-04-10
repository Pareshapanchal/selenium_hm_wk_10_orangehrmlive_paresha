package opensourcedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
      String baseUrl = "https://opensource-demo.orangehrmlive.com";
      //launch Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open URL
        driver.get(baseUrl);
        //Maximise the window
        driver.manage().window().maximize();
        //we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //print the title of the page
        System.out.println(driver.getTitle());
        //print the current url
        System.out.println(driver.getCurrentUrl());
        //print the page source
        System.out.println(driver.getPageSource());
        //find username field and enter the value to username field
        driver.findElement(By.name("username")).sendKeys("Admin");
        //find password field and enter the value to password field
         driver.findElement(By.name("password")).sendKeys("admin123");
        //close the browser
       // driver.close();
    }
}
