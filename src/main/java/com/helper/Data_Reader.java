package com.helper;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;

public class Data_Reader {
	
//	Classname refname = new ConstructorName();
	
	Properties p;
	
	public Data_Reader() throws IOException {
		
		File f = new File(
				"D:\\Selenium8AmSep\\CucumberPractice\\src\\main\\java\\com\\propertyfile\\Adactin_Info.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);
		
	}

	public String getPropUrl() throws IOException {

		String url = p.getProperty("url");

		return url;

	}

	public String getPropUsername() throws IOException {
		
		String username = p.getProperty("username");
		
		return username;

	}

	public String getPropPassword() throws IOException {
		
		String pass = p.getProperty("pass");
		
		return pass;

	}

}
