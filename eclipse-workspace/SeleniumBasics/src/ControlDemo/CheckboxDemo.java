package ControlDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxDemo {

	public static void main(String[] args) {
		WebDriver driver;

		// WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement tglButton = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
		tglButton.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement chkBox = driver.findElement(By.xpath(
				"//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]"));
		// chkBox.click();

		boolean isSelected = chkBox.isSelected();

		// performing click operation if element is not selected
		if (isSelected == false) {
			chkBox.click();
			System.out.println("CheckBox-Home Selected");

		}

	}

}
