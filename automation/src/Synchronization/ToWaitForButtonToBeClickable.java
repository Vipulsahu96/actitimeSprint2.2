package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToWaitForButtonToBeClickable {

	private static WebElement button;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		
		WebElement emailTextBox= driver.findElement(By.id("email"));
		
	    emailTextBox.sendKeys("akashdeb@gmail.com");
	    
	    driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
	    
	     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	     
		wait.until(ExpectedConditions.elementToBeClickable(button));
	     
	     button.click();

	}

}
