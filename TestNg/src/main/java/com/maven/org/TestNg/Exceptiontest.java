package com.maven.org.TestNg;

import org.testng.annotations.Test;

public class Exceptiontest {
	@Test
	private void add() {
		int i=30;
		int j=20;
		
		int a= i+j;
		System.out.println(a);
		}
	@Test(expectedExceptions =ArithmeticException.class)
	private void divide() {
		int i=20;
		int j=0;
		System.out.println(i/j);


}
}