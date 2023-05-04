package May_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DargDropDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\bhagya-grid\\JarDownload\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		Actions action= new Actions(driver);
		
		WebElement FrameEle = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(FrameEle);
		
		WebElement ele1 = driver.findElement(By.id("draggable"));
		WebElement ele2 = driver.findElement(By.id("droppable"));
		
		//action.dragAndDrop(ele1, ele2).perform();
		
		action.dragAndDropBy(ele1, 66, 44).perform();
		
		if(ele2.getText().matches("Dropped!"))
		{
			System.out.println("success...");
		}
		else
		{
			System.out.println("Invalid Drop...");
		}

	}

}
