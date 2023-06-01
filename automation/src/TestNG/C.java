package TestNG;

import org.testng.annotations.Test;

public class C {
	@Test(priority=6)
	public void akash() {
		System.out.println("Name=Akash");
	}
	@Test(priority=2)
	public void vipul() {
		System.out.println("Name=Vipul");
	}
	@Test(priority=1)
	public void subrat() {
		System.out.println("Name=subrat");
	}

}
