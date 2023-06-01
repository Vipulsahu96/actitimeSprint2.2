package TestNG;

import org.testng.annotations.Test;

public class D {
	
	@Test(invocationCount =2)
	public void a() {
		System.out.println("oh");
	}
 @Test
 public void b() {
	 System.out.println("jaane");
 }
 @Test(invocationCount=3)
 public void c() {
	 System.out.println("jaana");
 }
}
