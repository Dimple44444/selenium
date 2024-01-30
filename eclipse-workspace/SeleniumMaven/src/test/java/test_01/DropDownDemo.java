package test_01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement dropdown= driver.findElement(By.id("oldSelectMenu"));
		Select select = new Select(dropdown);
		dropdown.click();
		
       List<WebElement> lst = select.getOptions();
		
		//Looping through the options and printing dropDown options
		System.out.println("The dropdown options are:");
		
		for(WebElement option : lst)
			System.out.println(option.getText());
		
		Thread.sleep(30);
		
		System.out.println("option present at Index at 3");
		select.selectByIndex(2);
		
		String currentValue=select.getFirstSelectedOption().getText();
		System.out.println("Selected value is: " + currentValue);
		
		
		System.out.println("select option by visible text ");
		select.selectByVisibleText("Magenta");
		System.out.println("Selected value is: " + select.getFirstSelectedOption().getText());
		
		
		System.out.println("Select the Option by value 6");
		select.selectByValue("5");
		System.out.println("Selected value is: " + select.getFirstSelectedOption().getText());
		
		
	
	}

}
