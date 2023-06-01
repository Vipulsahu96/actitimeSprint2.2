package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAllSuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> allsugestions = driver.findElements(By.xpath("//span[contains(text(), 'selenium')]"));
		
              int totalsuggestion = allsugestions.size();	
              
              System.out.println("The no of suggestion are :"+totalsuggestion);
              
              for(WebElement suggestion:allsugestions) {
            	  
            	  System.out.println(suggestion.getText());
              }

	}

}
