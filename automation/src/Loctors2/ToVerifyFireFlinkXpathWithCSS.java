package Loctors2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyFireFlinkXpathWithCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=iphone+13&crid=233XMGJZUU0GA&sprefix=i%2Caps%2C932&ref=nb_sb_ss_ts-doa-p_2_1");
		WebElement image = driver.findElement(By.cssSelector("div#search > div > div:nth-child(1) > div > span > div:nth-child(1) > div:nth-of-type(5) > div > div > div > div > div > div:nth-child(1) > div > div:nth-of-type(2) > div > span > a > div > img"));
	}

}
