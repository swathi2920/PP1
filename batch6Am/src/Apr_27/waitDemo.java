package Apr_27;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class waitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement Unm= driver.findElement(By.name("userName"));
		Unm.sendKeys("user1");
		
		WebElement pwd= driver.findElement(By.name("password123"));
		pwd.sendKeys("user1");
		
		WebElement log= driver.findElement(By.name("submit"));
		log.click();

	}

}
