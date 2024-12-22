package testpackage;

import org.testng.annotations.Test;

import baseclasspackage.BaseClassJayshreetea;
import pagepackage.Pagejayshree;

public class Loginjayshreetea extends BaseClassJayshreetea {
	@Test
	public void login() throws InterruptedException {
	
	Pagejayshree ob=new Pagejayshree(driver);
	
	ob.signInClick();
	Thread.sleep(3000);
	ob.Login("mnn@gmail.com", "mnn@123qwe");
	ob.logbutton();
	
	
	
	
	}
	
	
	
	

}
