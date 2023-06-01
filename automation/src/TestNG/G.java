package TestNG;

import org.testng.annotations.Test;

public class G {
	@Test
	public void a() {
		
		System.out.println("Hi");
	}
	@Test(enabled =false)
	public void b() {
		System.out.println("Will u go for a date");
	}
	@Test
	public void c() {
		System.out.println("Bye");
	}
}
