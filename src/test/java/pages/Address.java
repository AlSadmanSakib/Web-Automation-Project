package pages;

import java.io.IOException;
//import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import junit.framework.Assert;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class Address extends CommonMethods {
	ExtentTest test;
	
	public Address(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
		
	}
	
	@FindBy(xpath= "//span[contains(text(),'Address')]")
	public WebElement address;
	
	@FindBy(xpath = "//button[@class=\"mat-focus-indicator mat-button mat-button-base mat-primary\"]")
	public WebElement AddNewAddress;
	
	@FindBy(xpath = "//input[@id='mat-input-42']")
	public WebElement FullName;
	
public void clickOnaddress() throws IOException {
		
		test.info("click on address");

	try {
		
		if (address.isDisplayed()) {
			address.click();
			timeOut(3000);
			//windowHandling();
			//PageDriver.getCurrentDriver().switchTo().window(windowHandling().get(1));
			test.pass("<p style=\"color:green; font-size:13px\"><b>click on address.</b></p>");
			timeOut(5000);
			
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "addressPass");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addressPass.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		}
	} catch (Exception e) {
		test.fail("<p style=\"color:red; font-size:13px\"><b>address location not avialble.</b></p>");
		Throwable t = new InterruptedException("Exception");
		test.fail(t);
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "addressFail");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addressFail.png";
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		Assert.assertTrue(address.isDisplayed());
		PageDriver.getCurrentDriver().quit();
	}
	}

public void clickOnaddnewaddress() throws IOException {
	
	test.info("click on addnewaddress");

try {
	
	if (AddNewAddress.isDisplayed()) {
		AddNewAddress.click();
		timeOut(5000);
//		PopUpHandle();
//		PageDriver.getCurrentDriver().switchTo().alert();
	    //windowHandling();
		//PageDriver.getCurrentDriver().switchTo().window(windowHandling().get(1));
	
		//shadowDomePopup(AddNewAddress, FullName);
		test.pass("<p style=\"color:green; font-size:13px\"><b>click on addnewaddress.</b></p>");
		timeOut(5000);
		
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "addnewaddressPass");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addnewaddressPass.png";
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		
	}
} catch (Exception e) {
	test.fail("<p style=\"color:red; font-size:13px\"><b>addnewaddress location not avialble.</b></p>");
	Throwable t = new InterruptedException("Exception");
	test.fail(t);
	@SuppressWarnings("unused")
	String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "addnewaddressFail");
	String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addnewaddressFail.png";
	test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	Assert.assertTrue(AddNewAddress.isDisplayed());
	PageDriver.getCurrentDriver().quit();
}
}
	
public void sendFullName() throws IOException {
	
	test.info("send full name");

try {
	
	if (FullName.isDisplayed()) {
		//loginwithgoogle.click();
		//emailaddress.click();
		//waitUntilElementVisible(FullName);
		sendText(FullName, "Sadman Sakib");
		//timeOut(10000);
		test.pass("<p style=\"color:green; font-size:13px\"><b>FullName.</b></p>");
		timeOut(5000);
		
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FullNamePass");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FullNamePass.png";
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		
	}
} catch (Exception e) {
	test.fail("<p style=\"color:red; font-size:13px\"><b>FullName location not avialble.</b></p>");
	Throwable t = new InterruptedException("Exception");
	test.fail(t);
	@SuppressWarnings("unused")
	String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FullNameFail");
	String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FullNameFail.png";
	test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	Assert.assertTrue(FullName.isDisplayed());
	PageDriver.getCurrentDriver().quit();
}
}
}
