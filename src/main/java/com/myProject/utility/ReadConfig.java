package com.myProject.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		File src = new File(".\\config\\config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername()
	{
	String username=pro.getProperty("username");
	return username;
	}
	
	public String getPassword()
	{
	String password=pro.getProperty("password");
	return password;
	}
	
	public String getBrowser()
	{
	String browser=pro.getProperty("browser");
	return browser;
	}
	
	public int getImplicitWait()
	{
	int implicitWait=Integer.parseInt(pro.getProperty("implicitWait"));
	return implicitWait;
	}
	
	public int getpageLoadTimeOut()
	{
	int pageLoadTimeOut=Integer.parseInt(pro.getProperty("pageLoadTimeOut"));
	return pageLoadTimeOut;
	}
	
	/*public String getIEPath()
	{
	String iepath=pro.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}*/

	
}




