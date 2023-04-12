package comutimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class MultiBrowser {

    static String browser = "Edge";
    static WebDriver driv;
    static String url = "https://courses.ultimateqa.com/users/sign_in";

    public static void main(String[] args) { //Main method declared
        if (browser.equalsIgnoreCase("Chrome")) { // Conditions applied for which browser to open
            driv = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) { // Conditions applied for which browser to open
            driv = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Fire Fox")) { // Conditions applied for which browser to open
            driv = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Internet Explorer")) { // Conditions applied for which browser to open
            driv = new InternetExplorerDriver();
        } else {
            System.out.println("Browser not found"); // Print the statement if browser is not found
        }
        driv.get(url); //Calling the url
        driv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Time out
        System.out.println("Tittle : " + driv.getTitle()); //Print the title of the page
        System.out.println("Current URL: " + driv.getCurrentUrl()); //Print the current URL of the page
        System.out.println("Page Source: " + driv.getPageSource()); //Print the page source
        WebElement username = driv.findElement(By.id("user[email]")); //Enter the username to username field
        username.sendKeys("mail2hardeek");
        WebElement password = driv.findElement(By.id("user[password]")); //Enter the password to password field
        password.sendKeys("abc1237");
        driv.close(); //Close the Browser
    }
}
