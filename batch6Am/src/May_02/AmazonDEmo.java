package May_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonDEmo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Actions action= new Actions(driver);

		driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(2000);
		
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Your Wish List']"));

		action.moveToElement(ele1)
		.moveToElement(ele2)
		.doubleClick()
		.build().perform();
	}

}
