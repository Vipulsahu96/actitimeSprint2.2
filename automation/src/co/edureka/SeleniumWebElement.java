package co.edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElement {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotebsearchtextbox")).sendKeys("Poco F1");
		Thread.sleep(2000);
		driver.findElement(By.className("non-input")).click();
		
				

	}

}
