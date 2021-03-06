package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

public class Tc005 extends BaseTest

{

	public static void main(String[] args) throws Exception 
	{
       test=report.startTest("Tc004");
		
		init();
		test.log(LogStatus.INFO, "initializing the property files..");
		
		launch("chromebrowser");
		test.log(LogStatus.INFO,"launched the browser:"+p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO,"Navigated to url:"+p.getProperty("amazonurl"));
		
		/*
		 * //String actualLink=driver.findElement(By.linkText("Amazon Pay")).getText();
		 * String
		 * actualLink=driver.findElement(By.linkText("Amazon Pay")).getAttribute("href")
		 * ; String expectedLink="Amazon Pa";
		 * 
		 * System.out.println("Actual link :" + actualLink);
		 * System.out.println("Expected link :" + expectedLink);
		 * 
		 * //if(actualLink.equals(expectedLink))
		 * //if(actualLink.equalsIgnoreCase(expectedLink))
		 * if(actualLink.contains(expectedLink))
		 * System.out.println("both links are equal.."); else
		 * System.out.println("both links are not equal.. ");
		 */
		
		/*
		 * WebElement loc=driver.findElement(By.id("twotabsearchtextbox"));
		 * loc.sendKeys("sony"); String text = loc.getAttribute("value");
		 * System.out.println("Text is :" +text);
		 */
		
		/*
		 * String actualLink=driver.findElement(By.linkText("Amazon Pay")).getAttribute(
		 * "innerHTML"); String expectedLink="Amazon Pay";
		 * 
		 * System.out.println("Actual link :" + actualLink);
		 * System.out.println("Expected link :" + expectedLink);
		 * 
		 * //Assert.assertEquals(actualLink, expectedLink);
		 * Assert.assertTrue(actualLink.equals(expectedLink),
		 * "both links are not equal.." );
		 * 
		 * driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");
		 */
		
		
		String actualLink=driver.findElement(By.linkText("Amazon Pay")).getAttribute("innerHTML");
		String expectedLink="Amazon Pa";
		
		System.out.println("Actual link :" + actualLink);
		System.out.println("Expected link :" + expectedLink);
		
		SoftAssert s=new SoftAssert();
		//s.assertEquals(actualLink, expectedLink);
		s.assertTrue(actualLink.equals(expectedLink), "both links are not equal..");
		
		s.assertTrue(false, "err1");
		
		s.assertTrue(false, "err2");
		
		s.assertTrue(true, "err3");
		
		s.assertTrue(false, "err4");
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");
		s.assertAll();
		
        report.endTest(test);
        report.flush();
	}

}
