package mycode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\dimple\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
//		//driver.get("https://www.google.com/");
//		System.out.println("hello");
		
		WebDriverManager.chromedriver().setup();
		
       
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println(driver.getTitle());
       	System.out.println(driver.getCurrentUrl());
       	driver.findElement(By.id("inputUsername")).sendKeys("Nikita");
       	driver.findElement(By.name("inputPassword")).sendKeys("hello123");
       	driver.findElement(By.className("signInBtn")).click();
       	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
       	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       	driver.findElement(By.linkText("Forgot your password?")).click();
       	Thread.sleep(1000);
       	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Nikita");
       	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Nikita23@gmail.com");
    	driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("nik@123");
       	driver.findElement(By.xpath("//form/input[3]")).sendKeys("23434");
       	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
       	System.out.println(driver.findElement(By.cssSelector("form p")).getText());
       	driver.quit();
       	
       		
       	
      
       	
	}

}




















