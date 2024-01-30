package Exchange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ExchangeOpen {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver;
       FirefoxOptions options = new FirefoxOptions();
         driver = new FirefoxDriver(options);
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		
		driver.get("https://exchange-staging-v3.lcx.com/");
		driver.manage().window().maximize();
		Thread.sleep(50);
	}

}
