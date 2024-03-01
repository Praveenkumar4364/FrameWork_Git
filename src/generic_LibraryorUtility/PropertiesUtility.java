package generic_LibraryorUtility;

import java.io.FileInputStream;
import java.util.Properties;
public class PropertiesUtility {
public String getdataFromProperties(String data) throws Exception
{
	FileInputStream fis=new FileInputStream(IconstantUtility.PropertiesPath);
	Properties pobj=new Properties();
	pobj.load(fis);
	String Data=pobj.getProperty(data);
	return Data;
}
}
