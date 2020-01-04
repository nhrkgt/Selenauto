package com.launch;

import java.io.IOException;

import org.openqa.selenium.By;

public class Tc001 extends BaseTest
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		init();
		
		launch("chromebrowser");

		navigateUrl("iciciurl");
		
        driver.findElement(By.linkText("KNOW MORE")).click();
		
		Thread.sleep(4000);
		
		//driver.close();
		
		driver.quit();
	}

}
