package com.launch;

import java.io.IOException;

import org.openqa.selenium.By;

public class Tc003 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
        
		init();
		launch("chromebrowser");
		navigateUrl("amazonurl");
		
		SelectOption("amazonsearchdrop_id","amazondropvalue");
		
		typeValue("amazonsearchtext_id","amazontestvalue");
		
		clickElement("amazonsearchbutton_xpath");
		
		/*
		 * driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		 * driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harrypotter");
		 * driver.findElement(By.
		 * xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']"
		 * )).click();
		 */
	}

	
	

}
