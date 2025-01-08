package pagepackage;

import java.io.File;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Pagejayshree {
	
	WebDriver driver;
	
	
	
	@FindBy (xpath="/html/body/div[4]/header/div[2]/li/a")
	WebElement signinclick;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span")
	WebElement creatAccount;
	
	@FindBy(id="firstname")
	WebElement fname;
	
	@FindBy(id="lastname")
	WebElement Lname;
	
	@FindBy(id="email_address")
	WebElement eaddress;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(id="password-confirmation")
	WebElement pConfirm;
	
	@FindBy(xpath="/html/body/div[4]/header/div[2]/li/a")
	WebElement signout;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/a[1]/span")
	WebElement editdtls;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/a[2]")
	WebElement changepassword;
	
	
	  @FindBy(xpath="//*[@id=\"email\"]") 
	  WebElement logemail;
	  
	  @FindBy(xpath="//*[@id=\"pass\"]")
	  WebElement logpassword;
	 
	  @FindBy(xpath="//*[@id=\"send2\"]/span")
	  WebElement loginbutton;
	  
	  @FindBy(xpath="//*[@id=\"navbar-content\"]/ul[1]/li[2]/a")
	  WebElement garden;
	  
	  @FindBy(xpath="//*[@id=\"navbar-content\"]/ul[1]/li[2]/ul/li[1]/a")
	  WebElement springfirstflush;
	  
		
     @FindBy(xpath= "//*[@id=\"m-navigation-product-list-wrapper\"]/div[2]/ol/li[1]/div/div/div[4]/div/div[1]/form/button/span")
     WebElement addclick;
		 
	  
	  @FindBy(xpath="//*[@id=\"m-navigation-product-list-wrapper\"]/div[2]/ol/li[1]/div/a/span/span/img")
	  WebElement firstElementtoadd;
	  
	  @FindBy(xpath="//*[@id=\"attribute143\"]")
	  WebElement dropproduct;
	  
	  @FindBy(id="product-addtocart-button")
	  WebElement productaddtocart;
	  
	  @FindBy(xpath="//*[@id=\"options_388_6\"]")
	  WebElement radiobuttn;
	  
	  @FindBy(xpath="//*[@id=\"shopping-cart-table\"]/tbody[1]/tr[2]/td/div/a[2]")
	  WebElement delete;
	  
	  @FindBy(xpath="//*[@id=\"search-link\"]")
	  WebElement search;
	  
	  @FindBy(xpath="//*[@id=\"search\"]")
	  WebElement searchfield;
	  
	  
	  @FindBy(xpath="//*[@id=\"sorter\"]")
	  WebElement sortbyfun;
	  
	  
	  @FindBy(xpath="/html/body/div[4]/header/div[2]/a/img")
	  WebElement logo;
	  
	  @FindBy(xpath="//*[@id=\"navbar-content\"]/ul[2]/li/a")
	  WebElement contactus;
	
	
	
	
	public Pagejayshree(WebDriver driver) {   //constructor 
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
	}
	
	//Screenshot
	
	
	
	public void screenShot() throws IOException {
		File ff=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ff, new File("F:\\jayshreetea\\jaysheescreenshot1"));
		
		WebElement scrn=driver.findElement(By.xpath("//*[@id=\"search-link\"]"));
		File search=scrn.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(search, new File("./screeshot//imageserachbar.png"));
		
		
		
	}
	
	
	public void titleVerification() {
		
		String expectedtitle="jayshreetea" ;
		String Actualtittle=driver.getTitle();
		System.out.println("Actual Title : "+Actualtittle);
		Assert.assertEquals(expectedtitle, Actualtittle);
	}
	
	public void signInClick() {
		signinclick.click();
	//	driver.navigate().back();
		
	}
	
	public void createAccountSwitch() {
		
		String homewindow=	"https://www.jayshreetea.com/black-tea";
	    
	    Set <String>acntcreatewindow=driver.getWindowHandles();
	    for(String Handles:acntcreatewindow) {
	    	if(!Handles.equalsIgnoreCase(homewindow))
	    	{
	    		driver.switchTo().window(Handles);
	    	    creatAccount.click();
	    		
	    	}
	    }
	}
	
	
	  public void createAccountDetails(String firstnm,String lastnm,String address,String passwrd,String con_pass) {
	  
	
		  fname.sendKeys(firstnm);
		  Lname.sendKeys(lastnm);
		  eaddress.sendKeys(address);
		  pass.sendKeys(passwrd);
		  pConfirm.sendKeys(con_pass,Keys.ENTER);
	  
	   }
	  
		
	  
	  public void signOut() {
		  signout.click();
	  }
	  
		
		  public void logbutton() 
		  {
			  loginbutton.click();
		   }
		 
	 
		
        public void Login(String email,String Passwordd) {
        	//driver.get("https://www.jayshreetea.com/customer/account/login/");
    	 
    	 String homewindow1="https://www.jayshreetea.com/black-tea";
    	 
    	  Set <String>acntcreatewindow1=driver.getWindowHandles();
    	  
    	  for(String Handles1:acntcreatewindow1)
    	   { 
    		
        if(!Handles1.equalsIgnoreCase(homewindow1))
         {
        	 
    	 driver.switchTo().window(Handles1);
    	  logemail.sendKeys(email); 
    	  logpassword.sendKeys(Passwordd);
    	  //loginbutton.click();
    	  
    	  
    		
    		  }
    	 
    	 }
    	
     }
        
        public void back() {
        	//driver.navigate().back();
        	driver.get("https://www.jayshreetea.com/black-tea");
        }
        
        
        public void mousehover() {
        	Actions act=new Actions(driver);
        	act.moveToElement(garden);
        	act.perform();
        	springfirstflush.click();
        	
        }
        
        public void clickAddtoCart() {
        	
        	
        	//Select sc=new Select(product);
        	//sc.selectByValue("name");
        	
        	JavascriptExecutor js=(JavascriptExecutor)driver;
        	js.executeScript("arguments[0].scrollIntoView(true);", firstElementtoadd);
        	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        	wait.until(ExpectedConditions.visibilityOf(firstElementtoadd));
			
			  Actions act=new Actions(driver);
			  act.moveToElement(firstElementtoadd);
			  act.perform();
			  
            addclick.click();
        	
        	
        	
        }
        
		public void packettpeadd() {
			JavascriptExecutor js=(JavascriptExecutor)driver;
        	js.executeScript("arguments[0].scrollIntoView(true);", productaddtocart);
        	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
        	wait.until(ExpectedConditions.visibilityOf(productaddtocart));
        	
        	Select sc=new Select(dropproduct);
        	sc.selectByValue("46");
        	
		}
        
		public void addproduct() {
			
			radiobuttn.click();
        	productaddtocart.click();
		}
        
		public void deleteproductcart() {
			
			delete.click();
		}
		
		public void searchtea() {
			Actions act=new Actions(driver);
        	act.moveToElement(search);
        	act.perform();
        	searchfield.sendKeys("tea",Keys.ENTER);
			
			
		}
		
		public void sortby() {
			sortbyfun.click();
			Select s=new Select(sortbyfun);
			s.selectByValue("name");
			
			
			
		}
		public void logodtls() {
			
			boolean logos=logo.isDisplayed();
			
			System.out.println(logos);
		}
        
		
		public void contact() {
			
			contactus.click();
		}
		
		
		
		@FindBy(id="uname_w")
		WebElement name;
		
		@FindBy(id="uemail_w")
		WebElement cemail;
		
		@FindBy(id="uphone_w")
		WebElement cphn;
		
		@FindBy(id="ulocation_w")
		WebElement clocation;
		
		@FindBy(xpath="//*[@id=\"requirement_w\"]")
		WebElement requirements;
		
		
		@FindBy(id="submit")
		WebElement csubmit;
		
		public void contactDetails(String cname,String emailc,String phoneno,String location,String req ) {
			name.sendKeys(cname);
			cemail.sendKeys(emailc);
			cphn.sendKeys(phoneno);
			clocation.sendKeys(location);

        	JavascriptExecutor js=(JavascriptExecutor)driver;
        	js.executeScript("arguments[0].scrollIntoView(true);", csubmit);
        	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
        	wait.until(ExpectedConditions.visibilityOf(csubmit));
			requirements.sendKeys(req);

        	
			csubmit.click();
			
		}
		
		
		@FindBy(tagName="a")
		WebElement link;
		
		
		@SuppressWarnings("deprecation")
		public void linkDetails() throws IOException {
			
			List<WebElement> links=(List<WebElement>) link;
			System.out.println("Total no of links  :"+links.size());
			for(WebElement linkdetails:links) {
				
				@SuppressWarnings("deprecation")
				String dtls=linkdetails.getAttribute("href");
				verifycodedtls(dtls);
				
				
			}
			
			
			
		}
		
		private void verifycodedtls(String dtls) throws IOException {
			
			@SuppressWarnings("deprecation")
			URL url=new URL(dtls);
			HttpURLConnection con=(HttpURLConnection)url.openConnection();
			int codedtls=con.getResponseCode();
			System.out.println(codedtls);
			System.out.println(dtls);
			
		}
		
		
	
		 
	 
}
