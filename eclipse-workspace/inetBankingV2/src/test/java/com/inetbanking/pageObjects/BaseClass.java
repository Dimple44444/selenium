package com.inetbanking.pageObjects;

import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {

	
	public String baseURL  = "https://demo.guru99.com/V4/index.php";
	public String username = "mngr164225";
	public String password= "jahetAp";
	public static RemoteWebDriver driver;

	
	
	@Beforeclass
	public void setup();
	
	
}
