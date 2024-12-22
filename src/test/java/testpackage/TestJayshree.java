package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import baseclasspackage.BaseClassJayshreetea;
import pagepackage.Pagejayshree;

public class TestJayshree extends BaseClassJayshreetea {
	
	@Test
	public void SignIn() throws IOException {
		Pagejayshree obj=new Pagejayshree(driver);
		
		obj.screenShot();
		obj.signInClick();
		obj.createAccountSwitch();
		obj.createAccountDetails("Anna", "E", "mnn@gmail.com", "mnn@123qwe", "mnn@123qwe");
		obj.back();
		obj.titleVerification();
		
	//	obj.signOut();      //sign out
	   // obj.signInClick(); //sign in
	                      
	    
	    
	}
	
	

	
}
