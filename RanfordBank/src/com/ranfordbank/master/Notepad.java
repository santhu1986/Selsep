package com.ranfordbank.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws IOException 
	{
	Library Lb=new Library();
	
	Lb.OpenApp("http://183.82.100.55/ranford2");
	Lb.AdminLgn("Admin","Admin");
	
	//To get text file path
	
	String Fpath="E:\\dinesh_project\\RanfordBank\\src\\com\\ranfordbank\\testdata\\Role.txt";
	
	//Results file path
	
	String Rpath="E:\\dinesh_project\\RanfordBank\\src\\com\\ranfordbank\\results\\Res_role.txt";
	String Sd;
	//To get file
	
	FileReader Fr=new FileReader(Fpath);
	BufferedReader Br=new BufferedReader(Fr);
	String Sread=Br.readLine();
	System.out.println(Sread);
	
	//To Write
	
	FileWriter Fw=new FileWriter(Rpath);
	BufferedWriter Bw=new BufferedWriter(Fw);
	Bw.write(Sread);
	Bw.newLine();
	
	//Multiple interations 
	
	while ((Sd=Br.readLine())!=null) 
	{
		System.out.println(Sd);
		
		String Sr[]=Sd.split("###");
		
		String Rname=Sr[0];
		String Rd=Sr[1];
		String Rt=Sr[2];
		
		String Res=Lb.RoleCre(Rname,Rd,Rt);
		System.out.println(Res);
		
		Bw.write(Sd+"&&&"+Res);
		Bw.newLine();
		
	}
	Bw.close();
	Br.close();
	}

}
