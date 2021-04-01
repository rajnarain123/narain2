package com.maven.org.TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviders {
	@Test(dataProvider="test")
	private void Details(String username,String password) {
		System.out.println("username = "+username+"Password = "+password);
		

	}
	@DataProvider
	private Object[][] test(){
		return new Object[][] { {"aaa,123"},
			                    {"bbb,234"},
			
		};
	}
}
	


