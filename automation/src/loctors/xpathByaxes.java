package loctors;
//import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByaxes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/s?k=iphone+13&crid=15U4JV3CGBHVL&sprefix=%2Caps%2C1107&ref=nb_sb_ss_recent_1_0_recent");
		
		  WebElement price = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Mini (512GB) - Starlight']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[text()='94,900']"));

	          String iphoneprice = price.getText();
	           
	          System.out.println(iphoneprice);
}
	
	
	
}