package com.ranfordbank.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pom 
{
@Test
	public void Exepom()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://183.82.100.55/ranford2/home.aspx");
		driver.manage().window().maximize();
        
		RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
		RHP.login();
		
		AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
		AHP.Br();
		
	}
}
