package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginusingEnter {
	
	public static void main (String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernametextfield = driver.findElement(By.id("username"));
		WebElement passwordtextfield = driver.findElement(By.name("pwd"));
		
		Actions action =new Actions (driver);
	    action.sendKeys(usernametextfield, "admin").sendKeys(passwordtextfield, "manager").sendKeys(Keys.ENTER).perform();
	}

	
}
