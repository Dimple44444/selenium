package test_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1 {

	public static void main(String[] args) {
		WebDriver driver;
		 WebDriverManager.chromedriver().setup();
	
		driver = new ChromeDriver();
		
		// Navigate to Google
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	//    driver.manage().timeouts().implicitlyWait(Duration.OfSeconds(60));
			
		driver.navigate().to("https://www.flipkart.com");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().back();
		
		driver.close(); // close the current window
		driver.quit(); // close all the opened windows
	}

	}


