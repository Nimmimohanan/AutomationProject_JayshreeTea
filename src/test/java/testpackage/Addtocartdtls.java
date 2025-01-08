package testpackage;

import java.io.IOException;
import org.testng.annotations.Test;

import baseclasspackage.BaseClassJayshreetea;
import pagepackage.Pagejayshree;

public class Addtocartdtls extends BaseClassJayshreetea {
	
	
	@Test
	public void addtocart() throws IOException {
		
	
	Pagejayshree n=new Pagejayshree(driver);
	n.mousehover();
	n.clickAddtoCart();
	n.packettpeadd();
	n.addproduct();
	n.deleteproductcart();
	n.back();
	n.searchtea();
	n.sortby();
	n.logodtls();
	
	
	}

}
