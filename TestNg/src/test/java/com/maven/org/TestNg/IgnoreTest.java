package com.maven.org.TestNg;

import org.testng.annotations.Test;

public class IgnoreTest {
	@Test
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}
		@Test(timeOut=5000)
		private void login() throws InterruptedException {
			Thread.sleep(5000);
				System.out.println("login");
		}
		@Test
		private void SearchLaptop() {
			System.out.println("Search Laptop");

		}
		@Test(enabled=false)
		private void Searchmobile() {
			System.out.println("search Mobile");
			

		}
	
		
		
		
		

	}
	


