package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver;
	@BeforeSuite
	
	public void bs() {
		
		System.out.println("Data base connection has been established");
		
	}
	@BeforeClass
	public void bc() {
		driver =new ChromeDriver();
		System.out.println("The browser has been launched");
		
		System.out.println("The URL has been Nevigate");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("Loged in to the application");
		
	}
	@AfterMethod
	public void am() {
		System.out.println("Logged out to the Application");
	}
	@AfterClass
	public void ac() {
		System.out.println("The browser has been closed");
	}
	@AfterSuite
	public void as() {
		System.out.println("The data base connection has been closed");
	}
}
