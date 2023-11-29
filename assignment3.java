package package1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;

public class assignment3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // initialization
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.saucedemo.com/");
        driver.manage().window();
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        
        //relative path
        driver.findElement(By.xpath("//button[@id = 'add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
        
        
        //css path
        //driver.findElement(By.cssSelector("button#add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        
        //cart
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        
        //checkout
        
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("prapti");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("saha");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("1203");
		
		//continue
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		//finish
		driver.findElement(By.xpath("//button[@id='finish']")).click();	
        
    }

}