package com.happyday.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class myfirsttest {
 



@Test
 public void onebrowser() throws Exception
 {
	 System.setProperty("webdriver.chorme.driver.", "C:\\Users\\16158\\OneDrive\\Desktop\\chorme driver");
	 
	 ChromeOptions obj = new ChromeOptions();
	 obj.addArguments("--remote-allow-origins=*");
	 
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("http://nexttechitc.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(10000);
	 driver.close();
	 
	 
 }
		 
}

