package WebElement;
//To verify the selected or Not checkbox of actitime loginpage 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyselectedorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		checkbox.click();
		
		boolean selected = checkbox.isSelected();
		
		if (selected) {
			System.out.println("pass: the checkbox is seleted");
		}
		else 
			System.out.println("Fail:the checkbox is not seleted");
		

	}

}
