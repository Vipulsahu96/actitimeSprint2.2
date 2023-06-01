package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class independantAndDependent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver =new ChromeDriver();
          
        driver.manage().window().maximize();
        
        driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
        
        WebElement starlightPrice = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']/../..//div[text()='₹64,999']"));
        
         String price = starlightPrice.getText();
        
        System.out.println(price);
	}

}
