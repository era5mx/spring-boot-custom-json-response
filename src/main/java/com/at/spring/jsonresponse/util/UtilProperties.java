package com.at.spring.jsonresponse.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UtilProperties {
	
	private static Properties prop = new Properties();
	private static String propFileName = "config";
	
	public static String getPropValue(String key) throws IOException {
		getProp();
		return prop.getProperty(key);
	}
	
	public static void getProp() throws IOException {
		InputStream is = UtilProperties.class.getClassLoader().getResourceAsStream(propFileName.concat(".properties"));
		if(is!=null) {
			prop.load(is);
		}
		else {
			throw new FileNotFoundException("property file '" + propFileName +"' not found in classpath");
		}
	}

}
