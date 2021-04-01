package com.maven.org.TestNg;

import org.testng.annotations.Test;

public class Grouptestng {
	@Test(groups="Company details")
	private void empName() {
		System.out.println("Narain");
		

	}
	@Test(groups="Company Details")
	private void empId() {
		System.out.println("3012");
		

	}
	@Test(groups="Personal Details")
	private void empsalary() {
		System.out.println("15LPA");
		

	}
	@Test(groups="Personal Details")
	private void empMobile() {
		System.out.println("9361093709");
	

	}
	
	


}
