package assignmentQATest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class womanSectionpage 
{
	WebDriver driver;
	@FindBy(xpath = "(//a[@class='sf-with-ul'])[1]")
	private WebElement women;
	@FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[8]")
	private WebElement view;
	// @FindBy(xpath="//input [@class='text']")
	// private WebElement quantity1;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement quantity1;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement quantity2;
	@FindBy(xpath = "//span[text()='Add to cart']")
	private WebElement addcart1;

	// driver.findElement(By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed
	// to checkout']/span")).click();
	@FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
	private WebElement proceed;

	@FindBy(xpath = "//a[@class='button btnbtn-default standard-checkout button-medium']")
	private WebElement proceedcnt;
	// driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
	// driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();

	@FindBy(xpath = "//button[@class='button btnbtn-default button-medium']")
	private WebElement proceedcheck;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement selectcheckbox;

	// driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
	// driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span")).click();

	@FindBy(xpath = "//button[@class='button btnbtn-default standard-checkout button-medium']")
	private WebElement proceedcheck1;

	// driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")).click();

	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement pay;
	@FindBy(xpath = "//button[@class='button btnbtn-default button-medium']")
	private WebElement confromorder;
	@FindBy(xpath = "//span[text()='shilpa']")
	private WebElement profile;
	// driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();

	@FindBy(xpath = "//span[text()='Order history and details']")
	private WebElement orders;
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement signout;

	public womanSectionpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickwomensection() throws InterruptedException {
		women.click();

		Thread.sleep(2000);
	}

	public void clickwomensectionview() throws InterruptedException {
		view.click();
		Thread.sleep(2000);
	}

	public void clickwomensectionquantity() {

		quantity1.clear();

	}

	public void clickwomensectionquantity1(String qat) {
		quantity2.sendKeys(qat);
	}

	public void clickwomensectionaddcart() {
		addcart1.click();
	}

	public void clickwomensectionproceedchk() {
//		Actions act =new Actions(driver);
//		act.moveToElement(proceed).click();
		proceed.click();
	}

	public void clickwomensectionproceedchk1() throws InterruptedException {

		Actions act = new Actions(driver);
		act.moveToElement(proceed).perform();
		act.sendKeys(Keys.ENTER).perform();
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement element1 = wait1.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Proceed to checkout')]")));
		element1.click();

	}

	public void clickwomensectionproceedcontinue() {
		proceedcnt.click();
	}

	public void clickwomensectionproceedcheckout() {
		proceedcheck.click();
	}

	public void clickwomensectioncheckbox() {
		selectcheckbox.click();
	}

	public void clickwomensectionproceedcheck() {
		proceedcheck1.click();
	}

	public void clickwomensectionpayment() {
		pay.click();
	}

	public void clickwomensectionconfromorder() {
		confromorder.click();
	}

	public void clickwomensectionprofile() {
		profile.click();

	}

	public void clickwomensectionordershistory() {
		orders.click();
	}

	public void clickwomensectionsignout() {
		signout.click();
	}


}


