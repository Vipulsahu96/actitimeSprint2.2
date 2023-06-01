package WebElement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class lunchthebrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(3000);
		
	    String errorMsg = driver.findElement(By.className("errormsg")).getText();
	    
	    if(errorMsg.contains("Username or password is invlid.")) {
	    	
	    System.out.println("pass: the error msg is verified");	
	    }
	    else
	    	System.out.println("Fail: the error msg is not verified");
	    	
	}

}
