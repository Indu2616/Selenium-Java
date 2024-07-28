package otherconcepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//location of properties file
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Config.Properties");
		
		//Loading properties file
		Properties propobj=new Properties();
		propobj.load(file);
		
		//Reading data from properties file
		String url=propobj.getProperty("appurl");
		String emailbox=propobj.getProperty("email");
		String pwdbox=propobj.getProperty("password");
		String ordid=propobj.getProperty("orderid");
		String cusid=propobj.getProperty("cutomerid");
		
		System.out.println(url+" "+emailbox+" "+pwdbox+" "+ordid+" "+cusid);
		
		//Reading all keys from properties file
		/*Set<String> keys=propobj.stringPropertyNames();
		System.out.println(keys);	//[password, orderid, customerid, appurl, email]
		OR
		Set<Object> keys=propobj.keySet();
		System.out.println(keys);	//[password, orderid, customerid, appurl, email]  */
		
		//Reading all the values from properties file
		Collection<Object> values=propobj.values();
		System.out.println(values);	//[abcxyz, 123, 234, https://demo.opencart.com/, abc@gmail.com]
		
		file.close();

	}

}
