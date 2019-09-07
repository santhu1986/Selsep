package com.ranfordbank.master;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid 
{
DesiredCapabilities cap=null;

@Parameters("browser")
@Test
public void Gd(String Br) throws MalformedURLException
{
	if (Br.equalsIgnoreCase("firefox")) 
	{
		cap=new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
	
	}
	else if (Br.equalsIgnoreCase("chrome")) 
	{
		cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
	
	}
		
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.119:4444/wd/hub"),cap);
     driver.manage().window().maximize();
		driver.get("http://183.82.100.55/ranford2");
        driver.manage().window().maximize();
      
        //Admin Login
		
        driver.findElement(By.id("txtuId")).sendKeys("Admin");
        driver.findElement(By.id("txtPword")).sendKeys("Admin");
    	Sleeper.sleepTightInSeconds(5);
    	driver.findElement(By.xpath(".//*[@id='login']")).click();
		
		Sleeper.sleepTightInSeconds(5);
		//Branches
        
        driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
        
        
}
}
