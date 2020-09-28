package assignmentQATest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class assignmentQAlogintest {
	WebDriver driver;
	createAccountpage page1;
	loginNewUserpage page2;
	womanSectionpage page3;

		@BeforeClass
			public void CreateAcc() throws InterruptedException
			{
				Reporter.log("createaccount",true);
				ChromeOptions option=new ChromeOptions();
				option.addArguments("--disable-notifications");
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Fantastic\\Desktop\\New folder (2)\\chromedriver.exe");
				WebDriver driver=new ChromeDriver(option);
			
				driver.get("http://automationpractice.com/index.php");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				page1=new createAccountpage(driver);
				page2=new loginNewUserpage(driver);
				page3=new womanSectionpage(driver);
			
				page1.clickloginnewsignin();
				page1.setcreateaccountemailcreateemail("shilppatil29@gmail.com");
				page1.clickcreateaccountemailcreatebutton();
				page1.setcreateaccountemailcreatefirstname("shilpa");
				page1.setcreateaccountemailcreatelastname("patil");
				page1.setcreateaccountemailcreatepassword("suraj12346");
				page1.setcreateaccountemailcreateaddress("mood frics");
				page1.setcreateaccountemailcreatecity("NEW YORK");
				Thread.sleep(2000);
				page1.setcreateaccountemailcreatestate("2");
				page1.setcreateaccountemailcreatepostcode("10001");
				page1.setcreateaccountemailcreatecountry("United States");
				page1.setcreateaccountemailcreatephoneno("2345678901");
				page1.setcreateaccountemailcreatemobileno("7777777777");
				page1.setcreateaccountemailcreateadd1("WALL STREET");
				page1.clickcreateaccountemailcreatsubeacc();
				page1.clickcreateaccountsignout();
			}
		@BeforeMethod
		public void logintoapp()
		{
			Reporter.log("Login with new credentials",true);
			page2.setloginnewsignin();
			page2.setloginnewemail("shilppatil29@gmail.com");
			page2.setloginnewpwd("suraj12345");
			page2.clickloginnewsubmitlogin();
		}
		@Test
		public void womensection() throws InterruptedException
		{
			Reporter.log("Go to women section",true);
			page3.clickwomensection();
			page3.clickwomensectionview();
			page3.clickwomensectionaddcart();
			page3.clickwomensectionproceedchk();
			page3.clickwomensectionquantity();
			page3.clickwomensectionquantity1("2");
			Thread.sleep(4000);
			
		//page3.clickwomensectionaddcart();		
		page3.clickwomensectionproceedchk1();
					
			page3.clickwomensectionproceedcontinue();
			page3.clickwomensectionproceedcheckout();
			page3.clickwomensectioncheckbox();
			page3.clickwomensectionproceedcheck();
			page3.clickwomensectionpayment();
			page3.clickwomensectionconfromorder();
			page3.clickwomensectionprofile();
			page3.clickwomensectionordershistory();
			page3.clickwomensectionsignout();
		}
		@AfterMethod
		public void logoutapp()
		{
			Reporter.log("Logout from app",true);
		}
		@AfterClass
		public void closebrowser()
		{
			Reporter.log("close browser,true");
			//driver.close();
			
			
			
		}


}


