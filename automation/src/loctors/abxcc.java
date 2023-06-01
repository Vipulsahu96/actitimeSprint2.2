package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class abxcc {

	public static void main(String[] args) {
	
		WebDriver driver =new ChromeDriver();

		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
		
		WebElement starlightPrice = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']/../..//div[text()='₹61,999']"));
		
		String price = starlightPrice.getText();
		
		System.out.println(price);
		
		
		
		
	}

}
