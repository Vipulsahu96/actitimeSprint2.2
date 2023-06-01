package PopUP;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUploadUsingskill {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Pattern filename = new Pattern("C:\\Users\\Hp\\eclipse-selenium\\automation\\TestData\\Filename.PNG");
		Pattern open = new Pattern("C:\\Users\\Hp\\eclipse-selenium\\automation\\TestData\\open.PNG");
		
		Screen screen = new Screen(); 
		screen.wait(filename,20);
		screen.type(filename, "C:\\Users\\Hp\\eclipse-selenium\\automation\\TestData\\1501013995.pdf");
		screen.click(open);

	}

}
