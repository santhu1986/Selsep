package com.ranfordbank.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicScript {

	public static void main(String[] args) 
	{

		//Launch
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://183.82.100.55/ranford2");
        driver.manage().window().maximize();
      
        //Admin Login
		
        driver.findElement(By.id("txtuId")).sendKeys("Admin");
        driver.findElement(By.id("txtPword")).sendKeys("Admin");
        driver.findElement(By.xpath(".//*[@id='login']")).click();
		
		
		//Branches
        
        driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
        
        
        
        
        
        
        
        
        
        
		//Roles
		//Employees
	}

}
