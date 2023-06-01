package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TosearchAndPressEnter {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		driver.get("https://www.google.com/");
		WebElement textfield = driver.findElement(By.name("q"));
		
		Actions action =new Actions (driver);
		Thread.sleep(2000);
		action.sendKeys(textfield,"pentesting").sendKeys(Keys.ENTER).perform();
	}

}
