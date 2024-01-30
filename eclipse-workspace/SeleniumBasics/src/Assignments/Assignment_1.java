package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_1 {
	WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver;
		
		driver= new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	//	driver.manage().
		
		
		
		WebElement Search= driver.findElement(By.name("q"));
		Search.sendKeys("selenium");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		//driver.findElement(By.name("btnK")).click();
		Search.sendKeys(Keys.RETURN);
		try {
            Thread.sleep(5000); // Sleep for 5 seconds (you may use WebDriverWait instead)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		// For current URL and page title

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
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		WebElement search = driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
		search.click();
		
		//for scrolling the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		
		//Explicit wait 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement SearchLink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='selenium-button selenium-webdriver text-uppercase fw-bold']")));
		
		SearchLink.click();
		
		
		//Again it will scroll the whole page till the end of the page
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,350)");
		
		
		
		WebElement search_field = driver.findElement(By.xpath("/html/body/header/nav/div/div/div/div/button/span[1]/span"));
		search_field.click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		WebElement search_field2= driver.findElement(By.xpath("//input[@id='docsearch-input']"));
		search_field2.sendKeys("selenium");
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
	
	}
	


