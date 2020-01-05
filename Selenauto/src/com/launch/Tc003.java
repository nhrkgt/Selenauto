package com.launch;

import org.apache.log4j.Logger;

public class Tc003 extends BaseTest
{
   private static final Logger log=Logger.getLogger(Tc003.class.getName());
   
	public static void main(String[] args) throws Exception 
	{
        
		init();
		log.info("initializing the properties files..");
		
		launch("chromebrowser");
		log.info("Launched the browser :" +p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigate to url :" +p.getProperty("amazonurl"));
		
		SelectOption("amazonsearchdrop_id","amazondropvalue");
		log.info("selected the option:" +or.getProperty("amazondropvalue")+"by using the locator:" +or.getProperty("amazonsearchdrop_id"));
		
		typeValue("amazonsearchtext_id","amazontestvalue");
		log.info("entered the value:" +or.getProperty("amazontestvalue")+"by using the locator: "+or.getProperty("amazonsearchtext_id"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("clicked on button by using the locator:" +or.getProperty("amazonsearchbutton_xpath"));
		
		/*
		 * driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		 * driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harrypotter");
		 * driver.findElement(By.
		 * xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']"
		 * )).click();
		 */
	}

	
	

}
