package assignmentQATest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class createAccountpage {
	@FindBy(xpath="//div[@class='header_user_info']") private WebElement signin;
	@FindBy(xpath="//input[@name='email_create']")private WebElement emailid;

	@FindBy(xpath="//button[@name='SubmitCreate']")private 
     WebElement submitcreate;

	@FindBy(xpath="//input[@name='customer_firstname']")private WebElement firstname; 

	@FindBy(xpath="//input[@name='customer_lastname']")private WebElement lastname;

	@FindBy(xpath="//input[@name='passwd']")private WebElement password;
	   
	@FindBy(xpath="//select[@id='day']") private WebElement day;

	@FindBy(xpath="//select[@id='month']") private WebElement month;

		
	@FindBy(xpath="//select[@id='year']") private WebElement year;

	
    @FindBy(xpath="//input[@name='address1']")private WebElement address;
	    
	@FindBy(xpath="//input[@name='city']")private WebElement city;
	    
			
	@FindBy(xpath="//select[@name='id_state']")private WebElement state1;
	   
			
	@FindBy(xpath="//input[@name='postcode']")private WebElement postcode;
					
	@FindBy(xpath="//select[@name='id_country']")private WebElement country;
			
	@FindBy(xpath="//input[@name='phone']")private WebElement phoneno;
	  
	@FindBy(xpath="//input[@name='phone_mobile']")private WebElement mobileno;
	   
	@FindBy(xpath="//input[@name='alias']")private WebElement address1;
	
	@FindBy(xpath="//button[@name='submitAccount']")private WebElement submitacc;
	    
	@FindBy(xpath="//a[@class='logout']")private WebElement signout;
		
	    //Thread.sleep(5000);
	 public createAccountpage(WebDriver driver)
	 {
		PageFactory.initElements(driver, this);
		 }
		
	public void clickloginnewsignin()
		{
			signin.click();
		}
	public void setcreateaccountemailcreateemail(String emailidno)
	 {
		emailid.sendKeys(emailidno);
		 }

	public void clickcreateaccountemailcreatebutton()
	 {
		submitcreate.click();
		 }
	public void setcreateaccountemailcreatefirstname(String fist)
	 {
		firstname.sendKeys(fist);
		 }
	public void setcreateaccountemailcreatelastname(String last)
	 {
		lastname.sendKeys(last);
		 }
	public void setcreateaccountemailcreatepassword(String pwd)
	 {
		password .sendKeys(pwd);
		
		 }
//	public void setloginneday(String day1)
//	{
//		Select s = new Select(day);
//		//	s.selectByVisibleText("23");
//	day.sendKeys(day1);
//	}
//	public void setloginnemonth(String month1)
//	{
//		Select s3 = new Select(month);
//		//	s1.selectByIndex(3);
//
//	month.sendKeys(month1);
//	}
//	public void setloginneyear(String year1)
//	{
//		Select s2 = new Select(year);
//		//	s2.selectByVisibleText("1997");
//	year.sendKeys(year1);
	//}

	public void setcreateaccountemailcreateaddress(String addr)
	 {
		address.sendKeys(addr);
		
		 }
	public void setcreateaccountemailcreatecity(String cityy)
	 {
		city.sendKeys(cityy);
		 }
	public void setcreateaccountemailcreatestate(String state12)
	 {
		 Select s1=new Select(state1);
		s1.selectByIndex(2);
		state1.sendKeys(state12);
		 }
	public void setcreateaccountemailcreatepostcode(String post)
	 {
		postcode.sendKeys(post);
		 }

	public void setcreateaccountemailcreatecountry(String coutry)
	 {
		country.sendKeys(coutry);
		 }
	public void setcreateaccountemailcreatephoneno(String phonno)
	 {
		phoneno.sendKeys(phonno);
		 }

	public void setcreateaccountemailcreatemobileno(String mobilenoo)
	 {
		mobileno.sendKeys(mobilenoo);
		 }

	public void setcreateaccountemailcreateadd1(String addresss)
	 {
		address1.sendKeys(addresss);
		 }
	public void clickcreateaccountemailcreatsubeacc()
	 {
		submitacc.click();
		
		 }
	public void clickcreateaccountsignout()
	 {
		signout.click();
		
		 }

	




}