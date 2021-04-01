package com.maven.org.TestNg;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Simpleannotation {

@BeforeSuite
private void Setup() {
	System.out.println("Google chrome");
}

@BeforeTest
private void browserLaunch() {
	System.out.println("Browser Launch");
	

}
@BeforeClass
private void url() {
	System.out.println("Url");

}
@BeforeMethod
private void login() {
	System.out.println("Login");
}
@Test
private void searchMobile() {
	System.out.println("Search Mobile");

}



@Test
private void logOut() {
	System.out.println("Logout");

}
@AfterMethod
private void searchLaptop() {
	System.out.println("Search Laptop");
	
	

}
@AfterClass
private void browserclose() {
System.out.println("browser close");
}
@AfterTest
private void Cookiesdelete() {
	System.out.println("Cookies delete");
	

}
@AfterSuite
private void Verify() {
	System.out.println("Verify");

}



}

	


