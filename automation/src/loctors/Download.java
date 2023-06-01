package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.selenium.dev/");
		
		Thread.sleep(5000);

		WebElement link = driver.findElement(By.xpath("//span[text()='Downloads']"));
		
		link.click();


	}

}
