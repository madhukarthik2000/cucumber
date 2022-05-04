package com.propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {

	public static Properties p;

	public Config_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Cucumber_Project\\src\\main\\java\\com\\propertyfile\\Config_Reader.java");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String get_url() {
		String url = p.getProperty("url");
		return url;

	}

	public String get_username() {
		String username = p.getProperty("username");
		return username;
	}

	public String get_password() {
		String password = p.getProperty("password");
		return password;

	}

}
