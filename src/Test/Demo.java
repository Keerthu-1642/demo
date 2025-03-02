package Test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void hello() {
	 System.out.println("hi");
	 Assert.assertTrue(false);
 }
	@BeforeSuite
	public void no1() {
		System.out.println("i'm no 1");
	}
	@AfterSuite
	public void last1() {
		System.out.println("i'm no 1 from last");
	}
}
