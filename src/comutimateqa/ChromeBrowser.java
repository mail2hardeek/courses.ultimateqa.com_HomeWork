package comutimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String url = "https://courses.ultimateqa.com/users/sign_in";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        System.out.println("Tittle: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Source: " + driver.getPageSource());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement username = driver.findElement(By.id("user[email]"));
        username.sendKeys("mail2hardeek");
        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("abc1237");

    }

}
