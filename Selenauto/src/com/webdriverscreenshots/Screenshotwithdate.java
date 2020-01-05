package com.webdriverscreenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotwithdate
{
	public static String projectpath=System.getProperty("user.dir");

	public static void main(String[] args) throws IOException 
	{
	System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver.exe");
    ChromeDriver driver=new  ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.in");
    
    Date dt=new Date();
    System.out.println(dt);
    //String df=dt.toString().replace(':', '_').replace(' ', '_');
    //System.out.println(df);
    
    SimpleDateFormat dateF=new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
    System.out.println(dateF.format(dt));
    
    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(src, new File("C:\\Users\\P.Thirupathi Reddy\\Desktop\\"+dateF.format(dt)+".png"));
    //FileHandler.copy(src, new File("C:\\Users\\P.Thirupathi Reddy\\Desktop\\"+df));
}
}