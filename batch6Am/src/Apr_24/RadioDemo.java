package Apr_24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo 
{
	static WebDriver driver;

	public void femaleClk()
	{
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
	}
	
	public void maleClk()
	{
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
	}
	
	public void allRadio() throws InterruptedException
	{
		//input[@name='sex']
		List<WebElement> allEle = driver.findElements(By.xpath("//input[@class='_8esa']"));
		int cnt= allEle.size();
		System.out.println("count is :  "+ cnt);
		
		for(int i=0 ;i<cnt ; i++)
		{
			allEle.get(i).click();
			Thread.sleep(1000);
		}
	}
	
	public void allLabel() throws InterruptedException
	{
		//input[@name='sex']
		List<WebElement> allEle = driver.findElements(By.xpath("//label[@class='_58mt']"));
		int cnt= allEle.size();
		System.out.println("count is :  "+ cnt);
		
//		for(int i=0 ;i<cnt ; i++)
//		{
//			allEle.get(i).click();
//			String txt= allEle.get(i).getText();
//			System.out.println(txt);
//			Thread.sleep(1000);
//		}
		
//		for(WebElement e : allEle) // F M C
//		{
//			System.out.println(e.getText());
//			e.click();
//			Thread.sleep(1000);
//		}
		
//		for(WebElement e : allEle) // F M C
//		{
//			
//			if(e.getText().matches("Male"))
//			{
//				System.out.println(e.getText());
//				e.click();
//				break;
//			}
//		
//		}
		
		for(WebElement e : allEle) // F M C
		{
			
			if(e.getText().matches("Male"))
			{
				if(!e.isSelected())
				{
				System.out.println(e.getText());
				e.click();
				break;
				}
			}
		
		}
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		
		RadioDemo r= new RadioDemo();
		//r.femaleClk();
		//r.allRadio();
		r.allLabel();
		
		

	}

}
