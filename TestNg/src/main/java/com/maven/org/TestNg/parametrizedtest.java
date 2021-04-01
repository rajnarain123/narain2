package com.maven.org.TestNg;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parametrizedtest {
@Test

@Parameters({"username","password"})
private void Details(@Optional("Rajnarain") String username,String password) {
	System.out.println("Username = "+username+ "Password = " +password);
	

}

}
