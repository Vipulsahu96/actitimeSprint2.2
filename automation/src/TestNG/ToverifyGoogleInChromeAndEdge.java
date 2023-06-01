package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ToverifyGoogleInChromeAndEdge {
	
	WebDriver driver;
	@Parameters("browser")
	@Test
	
	public void ToverifyGoogle(String browser) {
		if(browser.equals("Chrome")) {
		
		driver=new ChromeDriver();
		
	}
	if(browser.equals("edge")) {
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.google.com/");
	if (driver.getTitle().equals("Google")) {
		System.out.println("pass: the tilte is verified");
	}
	else
		System.out.println("Fail:the title is verified");
		
	}

	}
