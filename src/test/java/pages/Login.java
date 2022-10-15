package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import junit.framework.Assert;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class Login extends CommonMethods{
	ExtentTest test;
	
	
	public Login(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
		
	}
	
	@FindBy(xpath = "//a[@class=\"login-google\"]")
	public WebElement loginwithgoogle;
	
	@FindBy(xpath = "//input[@id='identifierId']")
	public WebElement emailaddress;
	
	@FindBy(xpath = "//span[contains(text(),'পরবর্তী')]")
	public WebElement next;
	
	@FindBy(xpath ="//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement PassWord;
	
	@FindBy(xpath = "//span[contains(text(),'পরবর্তী')]")
	public WebElement next2;
	
	
	public void clickOnloginwithgoogle() throws IOException {
		
		test.info("click on loginwithgoogle");

	try {
		
		if (loginwithgoogle.isDisplayed()) {
			loginwithgoogle.click();
			timeOut(3000);
			windowHandling();
			PageDriver.getCurrentDriver().switchTo().window(windowHandling().get(1));
			test.pass("<p style=\"color:green; font-size:13px\"><b>click loginwithgoogle.</b></p>");
			timeOut(5000);
			
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "loginwithgooglePass");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "loginwithgooglePass.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		}
	} catch (Exception e) {
		test.fail("<p style=\"color:red; font-size:13px\"><b>loginwithgoogle location not avialble.</b></p>");
		Throwable t = new InterruptedException("Exception");
		test.fail(t);
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "loginwithgoogleFail");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "loginwithgoogleFail.png";
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		Assert.assertTrue(loginwithgoogle.isDisplayed());
		PageDriver.getCurrentDriver().quit();
	}
	}
	
	//

	
	
public void sendemail() throws IOException {
		
		test.info("send email address");

	try {
		//String email = emailGenerate();
		if (emailaddress.isDisplayed()) {
			//loginwithgoogle.click();
			//emailaddress.click();
			sendText(emailaddress, "ehsanbd92@gmail.com");
			//timeOut(10000);
			test.pass("<p style=\"color:green; font-size:13px\"><b>emailaddress.</b></p>");
			timeOut(5000);
			
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "emailaddressPass");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "emailaddressPass.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		}
	} catch (Exception e) {
		test.fail("<p style=\"color:red; font-size:13px\"><b>emailaddress location not avialble.</b></p>");
		Throwable t = new InterruptedException("Exception");
		test.fail(t);
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "emailaddressFail");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "emailaddressFail.png";
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		Assert.assertTrue(emailaddress.isDisplayed());
		PageDriver.getCurrentDriver().quit();
	}
	}

//

public void clickOnnext() throws IOException {
	
	test.info("click on next");

try {
	
	if (next.isDisplayed()) {
		next.click();
		timeOut(10000);
		windowHandling();
		PageDriver.getCurrentDriver().switchTo().window(windowHandling().get(1));
		test.pass("<p style=\"color:green; font-size:13px\"><b>click on next</b></p>");
		timeOut(5000);
		
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickOnnextPass");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickOnnextPass.png";
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		
	}
} catch (Exception e) {
	test.fail("<p style=\"color:red; font-size:13px\"><b>next button location not avialble.</b></p>");
	Throwable t = new InterruptedException("Exception");
	test.fail(t);
	@SuppressWarnings("unused")
	String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickOnnextFail");
	String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickOnnextFail.png";
	test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	Assert.assertTrue(next.isDisplayed());
	PageDriver.getCurrentDriver().quit();
}
}

	//
public void sendPassWord() throws IOException {
	
	test.info("send password");

try {
	//String email = emailGenerate();
	sendText(PassWord, "ehsanbd12345");
	timeOut(10000);
	if (PassWord.getText().equalsIgnoreCase("ehsanbd12345")) {
		//loginwithgoogle.click();
		//emailaddress.click();
		windowHandling();
		PageDriver.getCurrentDriver().switchTo().window(windowHandling().get(1));
		test.pass("<p style=\"color:green; font-size:13px\"><b>emailaddress.</b></p>");
		timeOut(5000);
		
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "emailaddressPass");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "emailaddressPass.png";
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		
	}
} catch (Exception e) {
	test.fail("<p style=\"color:red; font-size:13px\"><b>emailaddress location not avialble.</b></p>");
	Throwable t = new InterruptedException("Exception");
	test.fail(t);
	@SuppressWarnings("unused")
	String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "emailaddressFail");
	String dest = System.getProperty("user.dir") + "\\screenshots\\" + "emailaddressFail.png";
	test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	Assert.assertEquals(PassWord, "ehsanbd12345");
	PageDriver.getCurrentDriver().quit();
}
}

public void clickOnnext2() throws IOException {
	
	test.info("click on next");

try {
	
	if (next2.isDisplayed()) {
		next2.click();
		timeOut(10000);
		windowHandling();
		PageDriver.getCurrentDriver().switchTo().window(windowHandling().get(0));
		test.pass("<p style=\"color:green; font-size:13px\"><b>click on next2</b></p>");
		timeOut(5000);
		
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickOnnext2Pass");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickOnnext2Pass.png";
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		
	}
} catch (Exception e) {
	test.fail("<p style=\"color:red; font-size:13px\"><b>next button location not avialble.</b></p>");
	Throwable t = new InterruptedException("Exception");
	test.fail(t);
	@SuppressWarnings("unused")
	String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickOnnext2Fail");
	String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickOnnext2Fail.png";
	test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	Assert.assertTrue(next2.isDisplayed());
	PageDriver.getCurrentDriver().quit();
}
}
}
