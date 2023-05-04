package Apr_21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//WebElement ele = driver.findElement(By.className("fb_logo _8ilh img"));
		WebElement ele = driver.findElement(By.xpath("//div[@id='content']//img[@class='fb_logo _8ilh img']"));
		
		boolean s1= ele.isDisplayed();
		System.out.println(s1);
		
		System.out.println(ele.isEnabled());
		
		System.out.println(ele.isSelected());
	}

}
