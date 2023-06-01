package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Hp/Desktop/Xpat.html");
		
		WebElement zTextField= driver.findElement(By.xpath("//input[@value='Z']"));
		
		
		zTextField.clear();
		
		zTextField.sendKeys("chor do");
		
		

	}

}
