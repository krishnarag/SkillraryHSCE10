package genericLibraries;
/**
 * this class contains all reusable methods to prefrom operation, on properties file
 * @author dell
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesUtility {
private Properties property;
/**
 * This methods is used to initialize properties file
 * @param filePath
 */
	
	public void propertiesInit(String filePath) {
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream(filePath);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 property = new Properties();
		try{
		property.load(fis);
	}catch(IOException e) {
		e.printStackTrace();
	}
}  
	/**
	 * This method is used to fetch data from properties file using key
	 * @param key
	 * @return
	 */
	public String readDataFromProperties( String key) {
	return property.getProperty(key);
	}
/**
 * 	This method is used too write data properties file
 * @param key
 * @param value
 * @param filePath
 * @param comments
 */
public void writeToProperties(String key,String value, String filePath, String comments) {
    property.put(key, value);
    {
    FileOutputStream fos = null;
   try {
	   fos = new FileOutputStream(filePath);
   }catch(FileNotFoundException e) {
	   e.printStackTrace();
   }
   try {
	   property.store(fos, comments);
   }catch (IOException e) {
   e.printStackTrace();
   }
}
}
}
   