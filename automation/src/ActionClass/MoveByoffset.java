package ActionClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByoffset {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver= new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	       driver.get("https://www.myntra.com/");
	     Thread.sleep(2000);  
	    Actions action = new Actions(driver);
	    action.moveByOffset(1300, 40).click().perform();
	       
	       }

	}


