package com.ranfordbank.master;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AdminbaseNG 
{
  Library LB=new Library();
  
  @BeforeTest
  public void beforeTest() 
  {
  LB.AdminLgn("Admin","Admin");
  }

  @AfterTest
  public void afterTest() 
  {
  LB.admlgt();
  }

  @BeforeSuite
  public void beforeSuite() throws IOException 
  {
  LB.OpenApp("http://183.82.100.55/ranford2");
  }

  @AfterSuite
  public void afterSuite() 
  {
  LB.Appc();
  }

}
