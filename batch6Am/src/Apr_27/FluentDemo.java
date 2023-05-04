package Apr_27;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		FluentWait wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(3))
				.pollingEvery(Duration.ofMillis(100));
		
		wait.until(ExpectedConditions.attributeToBe(By.name("userName"), "name", "userName"));
		WebElement Unm= driver.findElement(By.name("userName"));
		Unm.sendKeys("user1");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		WebElement pwd= driver.findElement(By.name("password"));
		pwd.sendKeys("user1");
		
		WebElement log= driver.findElement(By.name("submit"));
		wait.until(ExpectedConditions.numberOfElementsToBe(By.name("submit"), 3));
		log.click();

	}

}
