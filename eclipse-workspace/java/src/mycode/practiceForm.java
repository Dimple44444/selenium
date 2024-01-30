package mycode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiceForm {

	public static <webElement> void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
	       
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys("Nikita");
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys("Singh");
        driver.findElement(By.id("sex-1")).click();
        driver.findElement(By.id("exp-2")).click();
        driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.id("datepicker")).sendKeys("12/10/1996");
        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-2")).click();
        driver.findElement(By.id("continents")).click();
        WebElement dropdown = driver.findElement(By.id("continents"));
        dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();
        dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();
        
        
        WebElement dropdown1 = driver.findElement(By.id("selenium_commands"));
        dropdown1.findElement(By.xpath("//option[. = 'Browser Commands']")).click();
      //  JavascriptExecutor js = (JavascriptExecutor)driver;  
       // js.executeScript("scrollBy(0, 5000)");
        try {
        Thread.sleep(5000);
        }
        catch(Exception ignore) {
        	
        }
       Select dropdown11 = new Select(driver.findElement(By.linkText("https://www.techlistic.com/p/selenium-tutorials.html"))); 
      dropdown11.selectByVisibleText("JMETER: Performance Testing");  
          
        
        
        
        driver.findElement(By.id("submit")).click();
         
	}

}
