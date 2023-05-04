package Apr_24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DayDemo 
{
     // System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
	static WebDriver driver = new ChromeDriver();
     
	public void daySelect() throws InterruptedException
	{
		WebElement day= driver.findElement(By.name("birthday_day"));
		Select s= new Select(day);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("4");
		Thread.sleep(1000);
		s.selectByVisibleText("10");
	}
	
	public void Allday() throws InterruptedException
	{
		WebElement day= driver.findElement(By.name("birthday_day"));
		Select s= new Select(day);
		
		List<WebElement>  allEle = s.getOptions();
		int cnt = allEle.size();
		System.out.println("count is : "+cnt);
		
//		for(int i=0 ; i<cnt ;i++ )
//		{
//			System.out.println(allEle.get(i).getText());
//			allEle.get(i).click();
//			Thread.sleep(300);
//		}
	
		for(WebElement e : allEle)
		{
			System.out.println(e.getText());
			e.click();
			Thread.sleep(300);
		}
		
		
	}
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		
		DayDemo d= new DayDemo();
		//d.daySelect();
		d.Allday();

	}

}
