package Apr_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//	WebElement unm	= driver.findElement(By.id("email"));
//	unm.sendKeys("user1");
	
		driver.findElement(By.id("email")).sendKeys("mmm");
		
		
	WebElement pwd = driver.findElement(By.id("pass"));
	pwd.sendKeys("test");
	Thread.sleep(1000);
	pwd.clear();
	Thread.sleep(1000);
	pwd.sendKeys("aaa");
	
	WebElement log = driver.findElement(By.name("login"));
	log.click();

	//driver.findElement(By.name("login")).click();
	}

}
