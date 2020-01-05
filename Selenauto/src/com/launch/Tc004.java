package com.launch;

import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.LogStatus;

public class Tc004 extends BaseTest
{
   private static final Logger log=Logger.getLogger(Tc004.class.getName());
   
	public static void main(String[] args) throws Exception 
	{
        test=report.startTest("Tc004");
		
		init();
		test.log(LogStatus.INFO, "initializing the property files..");
		
		launch("chromebrowser");
		test.log(LogStatus.INFO,"launched the browser:"+p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO,"Navigated to url:"+p.getProperty("amazonurl"));
		
		SelectOption("amazonsearchdrop_id","amazondropvalue");
		test.log(LogStatus.INFO, "selected the option:" +or.getProperty("amazondropvalue")+"by using the locator:" +or.getProperty("amazonsearchdrop_id"));
		
		typeValue("amazonsearchtext_id","amazontestvalue");
		test.log(LogStatus.INFO, "entered the value:" +or.getProperty("amazontestvalue")+"by using the locator: "+or.getProperty("amazonsearchtext_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.INFO,"clicked on button by using the locator:" +or.getProperty("amazonsearchbutton_xpath"));
		
		report.endTest(test);
		report.flush();
		/*
		 * driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		 * driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harrypotter");
		 * driver.findElement(By.
		 * xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']"
		 * )).click();
		 */
	}

	
	

}
