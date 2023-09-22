package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PropertyFIleReader {

	public static String username;
	public static String password;

	public static List<String> readProperties() {

		List<String> LoginData=new ArrayList<String>();

		Properties properties = new Properties();
		FileInputStream file = null;

		try {
			file = new FileInputStream("src/test/resources/Properties/Config.properties");
			properties.load(file);

			String user = properties.getProperty("username");
			String pass = properties.getProperty("password");
			
			LoginData.add(user);
			LoginData.add(pass);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return LoginData;
	}
	
	public static String getuserName() {
          List<String>userlist= readProperties();
          username= userlist.get(0);
          return username;
	}
	
	public static String getPassword() {
        List<String>userlist= readProperties();
        password= userlist.get(1);
        return password;
	}
	
	public static void main(String[] args) {
		String a= getPassword();
		System.out.println(a);
	}
	
}
