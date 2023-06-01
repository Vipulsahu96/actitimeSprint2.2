package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class opendescendant {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/s?k=iphone+13&crid=39O7UGQRB8FKP&sprefix=i%2Caps%2C279&ref=nb_sb_ss_ts-doa-p_2_1");
		
		 WebElement starlightPrice = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Mini (512GB) - Starlight']/../..//span[text()='94,900']"));
		 
		 String price = starlightPrice.getText();

		 System.out.println(price);
		 
		
	}

}
