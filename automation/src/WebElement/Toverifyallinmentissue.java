package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toverifyallinmentissue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver =new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("file:///C:/Users/Hp/Desktop/Automation.HTML");
     Point usernameLocation = driver.findElement(By.id("123")).getLocation();
     Point passwordLocation = driver.findElement(By.name("sonu")).getLocation();
     
     System.out.println(usernameLocation);
     System.out.println(passwordLocation);
     
      int usernameXcoordinate = usernameLocation.getX();
      
      int passwordXcoordinate = passwordLocation.getX();
      
      if(usernameXcoordinate==passwordXcoordinate) {
    	  
    	  System.out.println("Pass:the alliignment is proper");
    	  
      }
      else
    	  System.out.println("Fail.:the alliigment is not proper");
      driver.quit();
	}

}