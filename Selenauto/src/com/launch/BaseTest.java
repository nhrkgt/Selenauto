package com.launch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class BaseTest 
{

	public static WebDriver driver;
	public static Properties p;
	public static Properties or;
	public static String projectpath=System.getProperty("user.dir");
	
	
	public static void init() throws Exception
	{
    //FileInputStream fis=new FileInputStream("C:\\Users\\P.Thirupathi Reddy\\eclipse-workspace\\Selenauto\\data.properties");	
	FileInputStream fis=new FileInputStream(projectpath+"//data.properties");
	p=new Properties();
	p.load(fis);
	
	FileInputStream fis1=new FileInputStream(projectpath+"//or.properties");
	or=new Properties();
	or.load(fis1);
	
	}
	
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver.exe");
			
			ChromeOptions option=new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\P.Thirupathi Reddy\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 2");
			
			option.addArguments("--disable-notifications");
			option.addArguments("--disable-infobars");
			option.addArguments("--disable-maximized");
			
			//proxy IP Configuration
			//option.addArguments("--proxy-server=https://192.168.90.84.1234");
			
			
			driver=new ChromeDriver(option);
			
		}else if (p.getProperty(browser).contentEquals("firefox")) {
			
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "d://firefoxlogs.txt");
			System.setProperty("webdriver.gecko.driver", projectpath+"\\drivers\\geckodriver.exe");
		
			ProfilesIni p=new ProfilesIni();
			FirefoxProfile profile=p.getProfile("ffselprofile");
			
			//notifications
			profile.setPreference("dom.webnotifications.enabled", false);
			
			//proxyservers
			profile.setPreference("network.proxy.type", 1);
			profile.setPreference("network.proxy.socks", "192.168.89.90");
			profile.setPreference("network.proxy.socks_port", 1744);
			
			
			FirefoxOptions option=new FirefoxOptions();
			option.setProfile(profile);
			
			driver=new FirefoxDriver(option);
		}
	}
		public static void navigateUrl(String Url) 
		{
			//driver.get(p.getProperty(Url));
			driver.navigate().to(p.getProperty(Url));
		}
		public static void clickElement(String locatorkey) 
		{
		driver.findElement(By.xpath(or.getProperty(locatorkey))).click();
		}

		public static void typeValue(String locatorkey, String value)
		{
		driver.findElement(By.id(or.getProperty(locatorkey))).sendKeys(or.getProperty(value));	
		}
		public static void SelectOption(String locatorkey, String option)
		{
		driver.findElement(By.id(or.getProperty(locatorkey))).sendKeys(or.getProperty(option));
		}
		}

	
