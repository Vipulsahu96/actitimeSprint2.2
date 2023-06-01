package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openfb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		   driver.findElement(By.id("email")).sendKeys("ahuvipul1996@gmail.com");
		  
		   Thread.sleep(1000);
		   
		   driver.findElement(By.id("pass")).sendKeys("Vipul@96");
		   
		   Thread.sleep(1000);
		   
		   driver.findElement(By.name("login")).click();
		   
		   Thread.sleep(3000);
		   
		   
		   
		   
		
		

	}

}
