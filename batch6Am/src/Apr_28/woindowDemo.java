package Apr_28;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class woindowDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String mainId = driver.getWindowHandle();
		System.out.println(mainId);
		//========================
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("terms-link")).click();  //-- child 1
		driver.switchTo().window(mainId);
		driver.findElement(By.id("privacy-link")).click();//-- child 2
		//===============================================================
		Set<String> allWin = driver.getWindowHandles();

		System.out.println("count win : " +allWin.size());
		
			
			for(String e : allWin) // p,c1,c2
			{
				if(e.matches(mainId))
				{
					driver.switchTo().window(e);
					System.out.println("parent   :"+driver.getTitle());
				}
				else
				{
				driver.switchTo().window(e);
				System.out.println("child   :"+driver.getCurrentUrl());
				}
			}
	}

}
