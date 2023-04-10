package opensourcedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multibrowser {
    //static variable declared and initialse
    static String baseUrl ="https://opensource-demo.orangehrmlive.com";
    static WebDriver driver;
    static String browser = "Edge";

    public static void main(String[] args) {
        //if condition to open different browser
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser Name");
        }
        //open URL
        driver.get(baseUrl);
        //maximise the window
        driver.manage().window().maximize();
        //we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
        //print the title page
        System.out.println(driver.getTitle());
        //print the currenturl
        System.out.println(driver.getCurrentUrl());
        //print the pagesource
        System.out.println(driver.getPageSource());
        //find username field and send the values to the username field
        driver.findElement(By.name("username")).sendKeys("Admin");
        // find password field and send the values to the password field
        driver.findElement(By.name("password")).sendKeys("admin123");
        //closing the browser
         driver.close();


    }
}
