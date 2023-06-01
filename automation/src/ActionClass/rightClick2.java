package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		  WebElement click = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		  Actions actions = new Actions(driver);
		  actions.contextClick(click).perform();

	}

}
