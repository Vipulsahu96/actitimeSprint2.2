package PopUP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.imacros.net/Automate/Downloads");
		driver.findElement(By.linkText("Download")).click();
		//if the the file download pop up comes then use this
		//Robot  robot=new Robot();
		//robot.keyPress(keyEven.VK_ENTER);
		//robot.keyRelease(keyEven.VK_ENTER);

	}

}
