package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tosubmittheerrormsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Rectangle usernameRect = driver.findElement(By.id("email")).getRect();
		
		Rectangle passwordRect = driver.findElement(By.name("pass")).getRect();
		
		int usernamecoordinate = usernameRect.getY();
		
		int usernameHeight = usernameRect.getHeight();
		
		int usernameEndY = usernamecoordinate + usernameHeight;
		
		int passwordstartY = passwordRect.getY();
		
		int space = passwordstartY - usernameEndY;
		                
		System.out.println("The space is:"+ space);
		
		
		
	

	}

}
