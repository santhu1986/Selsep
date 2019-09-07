package com.ranfordbank.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoleNg extends AdminbaseNG
{
	@Test(dataProvider="Rdata")
public void Role(String Rn,String Rd,String Rt)
{
	LB.RoleCre(Rn,Rd,Rt);
}
	@DataProvider
	
	public Object[][] Rdata()
	{
		Object[][] obj=new Object[4][3];
		
		obj[0][0]="cashier25";
		obj[0][1]="cashier";
		obj[0][2]="E";
		
		obj[1][0]="cashier28";
		obj[1][1]="cashier";
		obj[1][2]="E";
		
		obj[2][0]="cashier29";
		obj[2][1]="cashier";
		obj[2][2]="E";
		
		obj[3][0]="cashier35";
		obj[3][1]="cashier";
		obj[3][2]="E";
		
		return obj;
	}
}
