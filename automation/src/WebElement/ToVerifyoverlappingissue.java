package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyoverlappingissue {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Hp/Desktop/Automation.HTML");
		
		Rectangle usernameRect = driver.findElement(By.id("123")).getRect();
		Rectangle passwordRect = driver.findElement(By.name("sonu")).getRect();
		
		int usernamecoordinate = usernameRect.getY();
		int usernameHeight = usernameRect.getHeight();
		
		int usernameEndY = usernamecoordinate + usernameHeight;
	     int passwordstartY = passwordRect.getY();
	   
	     int space = passwordstartY - usernameEndY;
	   
	 System.out.println("The space is :"+space);
		
	if (passwordstartY>=usernameEndY) {
		
		System.out.println("pass:the there is no overlapping");
	}
	else
		System.out.println("Fail:the there is overlapping");
	}

}
 