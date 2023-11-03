package com.demo;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

public class Demo {
	
	@Before
	public void urlLaunch() {

		System.out.println("Url Launched");
		
	}
	
	@Test
	public void loginFunction() {

		System.out.println("Username and Password successfully Enter");
		
	}
	
	@After
	public void deleteCookies() {
		
		System.out.println("Delete the Cookiess");
		
	}
	
	

}
