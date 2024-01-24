package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver= new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		
		WebElement SearchBox= driver.findElement(By.name("q"));
		SearchBox.sendKeys("selenium");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		//driver.findElement(By.name("btnK")).click();
		SearchBox.sendKeys(Keys.RETURN);
		try {
            Thread.sleep(5000); // Sleep for 5 seconds (you may use WebDriverWait instead)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		

		String CurrentUrl= driver.getCurrentUrl();
		String PageTitle= driver.getTitle();
		System.out.println("current Url is: "+ CurrentUrl);
		System.out.println("Page title is: "+ PageTitle );
		
		if (PageTitle.equals("selenium - Google Search"))
		{
			System.out.println("Test passed");
		}
		else
		
			{
				System.out.println("Test failed");
				
			}
		}
		
		
	}


