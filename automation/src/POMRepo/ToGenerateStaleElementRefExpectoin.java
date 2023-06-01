package POMRepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenerateStaleElementRefExpectoin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("admin");
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("trainee");
		
		

	}

}
