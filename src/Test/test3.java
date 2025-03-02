package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test3 {
@BeforeTest
public void first() {
	System.out.println("im execute first");
}
@Test
public void mid() {
	System.out.println("mid execution");
}
@AfterTest
public void last() {
	System.out.println("i'm execute last");
}
	
}
