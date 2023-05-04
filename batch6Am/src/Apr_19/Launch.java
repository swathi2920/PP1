package Apr_19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String[] args) 
	{
		// open browser
		
//		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
		
		System.setProperty("webdriver.gecko.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		// open app url

	}

}
