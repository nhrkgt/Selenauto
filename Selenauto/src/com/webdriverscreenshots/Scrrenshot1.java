package com.webdriverscreenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrrenshot1 
{
	public static String projectpath=System.getProperty("user.dir");

	public static void main(String[] args) throws IOException 
	{
	System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver.exe");
    ChromeDriver driver=new  ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in");
    
    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(src, new File("C:\\Users\\P.Thirupathi Reddy\\Desktop\\gmail.jpeg"));
    
	}

}
