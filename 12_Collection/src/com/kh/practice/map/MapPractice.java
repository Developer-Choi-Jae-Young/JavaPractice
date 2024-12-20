package com.kh.practice.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class MapPractice {

	public static void main(String[] args) {
		propertiesTest();
		//hashMapTest();
	}
	
	public static void propertiesTest() {
		Properties prop = new Properties();
		Properties prop2 = new Properties();
		
		prop.put("List", "ArrayList");
		prop.put("Set", "HashSet");
		prop.put("Map", "HashMap");
		prop.put("Map", "Properties");
		
		try {			
			prop.store(new FileOutputStream("test.properties"), "PropertiesTest");
			prop.storeToXML(new FileOutputStream("test.xml"), "XmlTest");
			
			prop2.load(new FileInputStream("test.properties"));
			System.out.println(prop2);
			
			prop2.loadFromXML(new FileInputStream("test.xml"));
			System.out.println(prop2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
	}
	
	public static void hashMapTest() {
		HashMap<String, String> hMap = new HashMap<>();
		
		hMap.put("List", "ArrayList");
		hMap.put("Set", "HashSet");
		hMap.put("Map", "HashMap");
		hMap.put("Map", "Properties");
		
		System.out.println(hMap);
	}
}
