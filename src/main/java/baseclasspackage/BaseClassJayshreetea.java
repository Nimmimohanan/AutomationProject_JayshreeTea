package baseclasspackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClassJayshreetea {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		driver=new EdgeDriver();
		driver.get("https://www.jayshreetea.com/black-tea");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

}
