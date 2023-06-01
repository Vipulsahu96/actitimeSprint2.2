package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsolueXpath {

	public static void main(String[] args) {
	
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Hp/Desktop/Xpaths.html");
		driver.findElement(By.xpath("html/body/div[1]/input"));  

	}

}
