package com.webdriverscreenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2
{

	public static String projectpath=System.getProperty("user.dir");

	public static void main(String[] args) throws IOException 
	{
	System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver.exe");
    ChromeDriver driver=new  ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com");
    
    List<WebElement> links=driver.findElements(By.linkText("Rajnikanth"));
    System.out.println(links.size());
    if(links.size()==0)
    {
    
    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(src, new File("C:\\Users\\P.Thirupathi Reddy\\Desktop\\img.jpeg"));
    
	}

}}
