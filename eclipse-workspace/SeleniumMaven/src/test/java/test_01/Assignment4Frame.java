package test_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Frame {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.lambdatest.com/blog/protractor-tutorial-handling-iframes-frames-in-selenium/");
	    driver.manage().window().maximize();
	  
	}
} 