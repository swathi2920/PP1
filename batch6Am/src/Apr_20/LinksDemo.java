package Apr_20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//System.out.println(driver.getPageSource());
//	WebElement lnk	= driver.findElement(By.linkText("Forgotten password?"));
//	lnk.click();
		
		driver.findElement(By.partialLinkText("password?")).click();
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().to("https://www.google.com/");
		
		
		//======================

//		driver.findElement(By.linkText("Create new account")).click();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.id("terms-link")).click();
//		Thread.sleep(1000);
//		
//		//driver.close();
//		driver.quit();
	}

}
