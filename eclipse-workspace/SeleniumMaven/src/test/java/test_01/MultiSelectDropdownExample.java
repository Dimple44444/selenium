package test_01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDropdownExample {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement dropdown= driver.findElement(By.id("cars"));
		
		Select select = new Select(dropdown);
		
		List<WebElement> lst = select.getOptions();
		
		for(WebElement option : lst)
			System.out.println(option.getText());
		
		System.out.println("The multi-dropdown options are:");
		
		if(select.isMultiple())
		{
			System.out.println(" selecting option by index");
			select.selectByIndex(2);
			
			System.out.println(" selecting option by value");
			select.selectByValue("saab");
			
			System.out.println(" selecting option by visable text");
			select.selectByVisibleText("Audi");
			
			System.out.println("Listing all the selected options");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			List<WebElement> selectedList = select.getAllSelectedOptions();
			
			for(WebElement getSelOption : selectedList)
				System.out.println(getSelOption.getText());
			
			select.deselectAll();
			
			driver.quit();
			
			
			
		}
		
	
		
		
		
		
		
		
	
		
	}

}
