package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ById {

	public static void main(String[] args) {
		 
		WebDriver driver;
		
	    driver = new FirefoxDriver();
	    
	    driver.get("https://www.flipkart.com/");
	    
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	   
	 
	  WebElement btn_AddToCart= driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]"));
	 //  driver.findElement(By.name("q"));
	  btn_AddToCart.click();
	  
	  
	  driver.findElement(By.name("btnK")).click();
	   driver.quit();
	   
	   
	   
	    
	  
	    
	    
		
		
		

	}

}
