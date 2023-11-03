package com.demo;

import java.util.HashMap;

import java.util.Map;

public class Map_Practice {
	
	public Map_Practice() {

		System.out.println("I am a Constructor");
		
	}
	
	public static void main(String[] args) {
		
		Map<Object, Object> hm = new HashMap<Object, Object>();
		
		hm.put(10, "Sachin");
		
		hm.put(7, "Dhoni");
		
		hm.put(10, "Kohli");
		
		System.out.println(hm);
		
		Map_Practice mp = new Map_Practice();
		

		
	}

}
