package TestNG;

import org.testng.annotations.Test;

public class H {
	
	@Test(groups = "smoke" ,priority =1)
	public void signup() {
		System.out.println("the user has signed up");
	}
	@Test(groups = "smoke" ,priority =2)
	public void signin() {
		System.out.println("the user has signed In");
	}
	@Test(groups = "regression" ,priority =3)
	public void compose() {
		System.out.println("the user has composed");
	}

}
