package com.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
	
	Properties prop;
	
	public Properties init_prop() throws IOException {
		prop=new Properties();
		try {
			FileInputStream ip= new FileInputStream("./src/test/resources/com/config/config.properties");
			 prop.load(ip);
			//System.out.println(prop);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}
	

}
