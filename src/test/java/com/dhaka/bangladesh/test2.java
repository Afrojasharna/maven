package com.dhaka.bangladesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class test2 {
	@Test
	
	public  void ruby() throws Exception  {
		
			System.setProperty("webdriver.chorme.driver", "C:\\Users\\16158\\OneDrive\\Desktop");
			
			ChromeOptions obj = new ChromeOptions();
			obj.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver();
			driver.get("http://walmart.com/ ");
			driver.manage().window().maximize();
			Thread.sleep(90000);
			driver.close();
		
	}
	
	
	

}
