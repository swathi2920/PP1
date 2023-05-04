package Apr_28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * date picker
 * calender
 * 
 * 
 */

public class calenderDEmo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		
		driver.findElement(By.id("txtJourneyDate")).click();
		
		//driver.findElement(By.xpath("//table/tbody/tr[5]/td[6]/a[text()='28']")).click();

		List<WebElement> allEle = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
		
		//int cnt= allEle.size();
		System.out.println("count is :  "+ allEle.size());
		
		for(int i=0 ;i<allEle.size() ; i++)
		{
			driver.findElement(By.id("txtJourneyDate")).click();
			List<WebElement> Ele = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
			Ele.get(i).click();
			Thread.sleep(2000);
			System.out.println("hi");
			System.out.println(driver.findElement(By.id("txtJourneyDate")));	
			System.out.println("done");
		}
	}

}
