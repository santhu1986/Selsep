package com.ranfordbank.master;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Sgrid 
{
DesiredCapabilities Cap=null;

@Parameters("browser")
@Test
public void gd(String Br) throws MalformedURLException
{
	
	if (Br.equalsIgnoreCase("firefox")) 
	{
		Cap=new DesiredCapabilities();
		Cap.setBrowserName("firefox");
		Cap.setPlatform(Platform.WINDOWS);
	
	}
	else if (Br.equalsIgnoreCase("chrome")) 
	{
		Cap=new DesiredCapabilities();
		Cap.setBrowserName("chrome");
		Cap.setPlatform(Platform.WINDOWS);
	
	}
		   
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.157:4444/wd/hub"),Cap);
	driver.get("http://183.82.100.55/ranford2");
    driver.manage().window().maximize();
  
    //Admin Login

    driver.findElement(By.id("txtuId")).sendKeys("Admin");
    driver.findElement(By.id("txtPword")).sendKeys("Admin");
    driver.findElement(By.xpath(".//*[@id='login']")).click();
	
	
	//Branches
    
    driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
      
    
    

}
}
