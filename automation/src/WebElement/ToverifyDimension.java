package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		driver.get("https://demo.actitime.com/login.do");
		
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		
		 WebElement passwordTextField = driver.findElement(By.name("pwd"));
		 
		 Dimension usernameDimension = usernameTextField.getSize();
		 
		Dimension passwordDimension = passwordTextField.getSize();
		 
		 int usernameheight = usernameDimension.getHeight();
		int usernamewidth = usernameDimension.getWidth();
		
		System.out.println("The width of username text field is :"+usernamewidth);
		
		System.out.println("The Height of username text field is :"+usernameheight);
		
		int passwordheight = passwordDimension.getHeight();
		int passwordwidth = passwordDimension.getWidth();
		
		System.out.println("the width of password text field is :"+passwordwidth);
		System.out.println("the height of password text field is :"+passwordheight);
		
		if(usernameheight== passwordheight && usernamewidth == passwordwidth) {
			System.out.println("pass : the dimensions hasbeen verified");
		}
		else
			System.out.println("Fail : the dimensions has not been verified");
		
		
		
		
	}

}
