package May_04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook 
{
  @Test
  public void FBTc()
  {
	  System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
  }
}
