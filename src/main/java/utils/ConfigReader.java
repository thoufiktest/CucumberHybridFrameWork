package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	
	public static Properties initializeProperties()
	{
		Properties prop=new Properties();
		File proFile=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(proFile);
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}

}
