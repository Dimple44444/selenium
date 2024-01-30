package basicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogleDemo {

	public static void main(String[] args) {

		WebDriver driver;

		//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dimpl\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		ChromeOptions co = new ChromeOptions();
//
//		co.setBinary("C:\\Users\\dimpl\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
//		co.setCapability("browserVersion","120");

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.getTitle();

		//WebDriverManager.chromedriver().setup();
		driver.navigate().to("https://www.flipkart.com");

		driver.navigate().back();
		driver.close();


	}

}
