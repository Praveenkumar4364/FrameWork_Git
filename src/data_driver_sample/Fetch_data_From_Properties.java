package data_driver_sample;

import java.io.FileInputStream;
import java.util.Properties;

public class Fetch_data_From_Properties {
public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("D:\\Our_Class\\PropertiesFile.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	String un=pobj.getProperty("username");
	String pwd=pobj.getProperty("password");
	String url=pobj.getProperty("url");
	System.out.println(un);
	System.out.println(pwd);
	System.out.println(url);
}
}
