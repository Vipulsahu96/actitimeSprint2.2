package ActiveElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToswitchToActiveElement {

	public static void main(String[] args) {
		//launching the browser
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		// navigate to the url
		driver.get("https://www.facebook.com/");
		
		driver.switchTo().activeElement().sendKeys("selenium");

	}

}
