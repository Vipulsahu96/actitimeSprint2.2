package Loctors2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyFireFlinkXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/s?k=iphone+13&crid=233XMGJZUU0GA&sprefix=i%2Caps%2C932&ref=nb_sb_ss_ts-doa-p_2_1");
		WebElement midnight = driver.findElement(By.xpath("//DIV[@data-component-id='2']/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV[1]/H2/A/SPAN[@class='a-size-medium a-color-base a-text-normal']"));
		//WebElement midnightPrice = driver.findElement(By.xpath("//DIV[@data-component-id='2']/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV[3]/DIV[1]/DIV/DIV[1]/DIV[1]/A/SPAN/SPAN[2]/SPAN[@class='a-price-whole']"));
			
			//String price = midnightPrice.getText();
			//System.out.println(price);
	}

}
