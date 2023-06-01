package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLogintoJavaScript {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		WebElement usernameTextField = driver.findElement(By.name("email"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='ahuvipul@gmail.com'", usernameTextField);
		
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		JavascriptExecutor jp=(JavascriptExecutor)driver;
		jp.executeScript("arguments[0].value='vipul@6'", passwordTextField);
		driver.findElement(By.name("login")).click();
		
 
	}

}
