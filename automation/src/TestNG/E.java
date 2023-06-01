package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class E {
	
	@Test
	public void a() {
		Assert.fail();
		System.out.println("Hi");
	}
	@Test(dependsOnMethods ="a")
	public void b() {
		System.out.println("Will u go for a date");
	}
	@Test(dependsOnMethods ="b")
	public void c() {
		System.out.println("Bye");
	}

}
