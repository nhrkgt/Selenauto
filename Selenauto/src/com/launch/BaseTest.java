package com.launch;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class BaseTest 
{

	public static WebDriver driver;
	public static Properties p;
	public static String projectpath=System.getProperty("user.dir");
	public static FileInputStream fis;
	
	public static void init() throws IOException
	{
    //FileInputStream fis=new FileInputStream("C:\\Users\\P.Thirupathi Reddy\\eclipse-workspace\\Selenauto\\data.properties");	
	fis=new FileInputStream(projectpath+"//data.properties");
	p=new Properties();
	p.load(fis);
	}
	
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
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

	
}
