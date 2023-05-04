package May_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Actions action= new Actions(driver);
		
		WebElement img = driver.findElement(By.className("lnXdpd"));
		int x = img.getLocation().getX();
		int y = img.getLocation().getY();

		//action.moveToElement(img).contextClick().build().perform();
		
		//action.moveByOffset(x, y).contextClick().build().perform();
		action.moveToElement(img, 44,88).contextClick().build().perform();
	}

}
