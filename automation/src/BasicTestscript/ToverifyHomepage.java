package BasicTestscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POMRepo.HomePage;
import POMRepo.LoginPage;

public class ToverifyHomepage {
  public static void main(String [] args)
	

	 {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		
		
		
		LoginPage login=new LoginPage(driver);
		login.loginAction("admin", "manager");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		String homepagetitle = driver.getTitle();
		if(homepagetitle.contains("Enter")) {
			System.out.println("pass:the title has been verified");
		}
		else
			System.out.println("fail:the title has been verified");
		  
		HomePage home=new HomePage(driver);
		home.logoutAction();
		
		driver.quit();
	}

}  
