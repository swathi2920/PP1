package Apr_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReadDEmo {
	/*
	 *  (.properties)
	 *  KEY-VLAUE pair
	 */

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("src\\Apr_13\\stud.properties");
			
			Properties p = new Properties();
			p.load(fis);
			
			String nm= p.getProperty("sname");
			System.out.println(nm);
			
			System.out.println(p.getProperty("course"));
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
