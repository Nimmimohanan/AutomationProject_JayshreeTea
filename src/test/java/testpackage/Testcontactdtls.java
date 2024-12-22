package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import baseclasspackage.BaseClassJayshreetea;
import pagepackage.Pagejayshree;

public class Testcontactdtls extends BaseClassJayshreetea{
	
	@Test
	public void contactdtls() throws IOException {
		
		Pagejayshree pg=new Pagejayshree(driver);
		pg.contact();
		pg.contactDetails("annna", "mnn@gmail.com", "8075877194", "fgg", "test(23)");
		pg.linkDetails();
		
		
		
		
		
	}

}
