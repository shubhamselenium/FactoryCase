package com.jbk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropTest {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("config.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String status=prop.getProperty("photo");
		System.out.println(status+"line no date ");
		if(status.equals("Y")) {
			System.out.println("photo nikalo ..");
		}else {
			System.out.println("photo mat nikalo ..");
		}
		
		
	}
}







