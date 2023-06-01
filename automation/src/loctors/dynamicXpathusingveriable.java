package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicXpathusingveriable {

	public static void main(String[] args) {
		
		String productprice ="₹64,999";
		
		String productName ="APPLE iPhone 13 (Starlight, 128 GB)";
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
		
	  WebElement price = driver.findElement(By.xpath("//div[text()='"+productName+"']/ancestor::div[@class=\"_3pLy-c row\"]/descendant::div[text()='"+productprice+"']"));
		
		   String iphoneprice = price.getText();
		   System.out.println(iphoneprice);
		  
		
		 
		
		

	}

}
