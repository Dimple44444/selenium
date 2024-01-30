package mycode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googlelaunch {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		
       
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.id("APjFqb")).sendKeys("javatpoint tutorials");
   //     driver.findElement(By.name("q")).clear();  
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();
	}
	
	//public static void msg(String s) {
		//System.out.println(s);
	}


