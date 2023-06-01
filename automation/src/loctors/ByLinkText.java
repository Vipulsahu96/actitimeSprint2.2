package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkText {

	public static void main(String[] args) {
		
		
    WebDriver driver = new ChromeDriver();
    
    
    driver.manage().window().maximize();
    
    
    driver.get("file:///C:/Users/Hp/Desktop/Automation.HTML");
    
    
    WebElement link = driver.findElement(By.linkText("Goto Selenium"));
    
    
	}

}
