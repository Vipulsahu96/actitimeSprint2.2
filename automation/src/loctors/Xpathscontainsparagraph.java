package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathscontainsparagraph {

	public static void main(String[] args) {
	//Lunch the browser
		WebDriver driver = new ChromeDriver();
		 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		WebElement para = driver.findElement(By.xpath("//p[contains(text(),'If you want to create robust,browser-based')]"));
		
		String text =para.getText();
		
		
		System.out.println(text);
		
		if(text.contains("browser")) {
			System.out.println("Pass:the text is present in the paragraph");
		}
		else
			System.out.println("Fail:the text is not present in the paragraph");

	}
	

}