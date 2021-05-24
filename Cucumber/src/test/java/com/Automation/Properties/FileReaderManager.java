package com.Automation.Properties;

import java.io.IOException;

public class FileReaderManager {
	
	
 
	private FileReaderManager() {
	}
 
	 public static FileReaderManager getInstance( ) {
		 FileReaderManager fileReaderManager = new FileReaderManager();
	      return fileReaderManager;
	 }
 
	 public ConfigurationReader getConfigReader() throws IOException {
		 ConfigurationReader configFileReader = null;
		 return (configFileReader == null) ? new ConfigurationReader() : configFileReader;
	 }
}
