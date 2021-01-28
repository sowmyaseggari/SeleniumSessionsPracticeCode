package Testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDemo {
	@Test
	public void addtest1() {
		System.out.println("hiii");
		
		int a=5;
		int b=10;
		int c=a+b;
		System.out.println(c);
	    Assert.assertEquals(c,15);
	}

}
