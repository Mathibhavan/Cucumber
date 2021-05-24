package com.Automation.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
public static Properties p;

public ConfigurationReader() throws IOException {
	File f = new File("C:\\Users\\721901\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\Automation\\Properties\\Configuration.Properties");
	FileInputStream fis = new FileInputStream(f);
	Properties p = new Properties();
	p.load(fis);
	}
public String getBrowsename() {
	String Browsername=p.getProperty("Browsername");
	return Browsername;
}
public static String getURL() {
	String URL=p.getProperty("URL");
	return  URL;
}
}
