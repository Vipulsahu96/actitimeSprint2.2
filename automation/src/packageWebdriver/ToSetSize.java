package packageWebdriver;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetSize {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver() ;
		Dimension dim =new Dimension(900,600);
		driver.manage().window().setSize(dim);

	}

}
