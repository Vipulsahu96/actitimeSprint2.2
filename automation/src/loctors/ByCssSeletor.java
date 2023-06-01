package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSeletor {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
     WebDriver driver =new ChromeDriver();
     // Maximize the browser
     driver.manage().window().maximize();
     //navigate to the URL
     driver.get("file:///C:/Users/Hp/Desktop/Automation.HTML");
     WebElement checkbox = driver . findElement(By.cssSelector("input[type='checkbox']"));
     checkbox.click();
     Thread.sleep(2000);
     checkbox.click();
     		

	}

}
 