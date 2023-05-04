package May_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo 
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("corover-close-btn")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]")).click();
		
		String txt = driver.switchTo().alert().getText();
		
		System.out.println(txt);
		
		if(txt.matches("Please select start place."))
		{
			driver.switchTo().alert().accept();   // ok
		}
		else
		{
			System.out.println("Invalid Alert....");
		}
		

	}

}
