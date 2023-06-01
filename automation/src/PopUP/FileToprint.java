package PopUP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileToprint {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		   driver.findElement(By.id("background")).click();
	        
		  //Create object of the Actions class
        Actions actions = new Actions(driver);
		// Select the Current Address using CTRL + p
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("p");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
      //  driver.findElement(By.id("background")).click();
        

	
		

	}

}
