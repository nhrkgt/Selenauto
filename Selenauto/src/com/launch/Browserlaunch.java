package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserlaunch 
{

	public static void main(String[] args)
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\P.Thirupathi Reddy\\Desktop\\Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\P.Thirupathi Reddy\\Desktop\\Jars\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.bestbuy.com");

	}

}
