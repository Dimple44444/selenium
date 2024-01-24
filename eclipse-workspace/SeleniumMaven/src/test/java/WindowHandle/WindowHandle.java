package WindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
            WebElement button = driver.findElement(By.xpath("//*[@id=\"messageWindowButton\"]"));
            button.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        

        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Using enhanced for loop and Iterable to iterate through window handles
        for (String handle : windowHandles) {
            // Switch to the window
            driver.switchTo().window(handle);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            // Check if it's not the main window
            if (!handle.equals(driver.getWindowHandle())) {
                // Get the text from the child window
                String childWindowText = driver.findElement(By.tagName("body")).getText();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

                // Print the text
                System.out.println("Text from child window: " + childWindowText);

                // Close the child window
                //driver.close();
            }
        }

        // Close the main window
      //  driver.quit();

	}

}