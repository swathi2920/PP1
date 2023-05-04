package Apr_19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyApp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String title= driver.getTitle();
		System.out.println("Title is : " + title);
		
		if(title.matches("Facebook – log in or sign up"))
		{
			System.out.println("valid app launched...");
		}
		else
		{
			System.out.println("Invalid app ...");
		}
//========================
		System.out.println("url  is :  " + driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().matches("https://www.facebook.coms/"))
		{
			System.out.println("valid ...");
		}
		else
		{
			System.out.println("Invalid url ...");
		}
	}

}
