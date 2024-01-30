package basicPrograms;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserOpen {

	public static void main(String[] args) {
		WebDriver driver;
		
	//	WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.navigate().back();
		driver.quit();
		
		
		
		
		
		
	}

}
