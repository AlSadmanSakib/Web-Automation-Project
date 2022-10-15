package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class AddToCart extends CommonMethods{
	
ExtentTest test;
	
	
	public AddToCart(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
		
	}
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/app-pages[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[3]/app-product-details[1]/section[1]/div[1]/div[3]/div[2]/button[1]")
	public WebElement addtocart;
	
	@FindBy(xpath = "//header/div[4]/a[1]")
	public WebElement mycart;
	
	@FindBy(xpath = "//a[contains(text(),'Proceed to checkout')]")
	public WebElement proceedtocheckout;
	
	
	
	public void clickOnaddtocart() throws IOException {
		
		test.info("click on addtocart");
	
	try {
		
		if (addtocart.isDisplayed()) {
			addtocart.click();
			//timeOut(10000);
			test.pass("<p style=\"color:green; font-size:13px\"><b>click addtocart.</b></p>");
			timeOut(5000);
			
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "addtocartPass");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addtocartPass.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		}
	} catch (Exception e) {
		test.fail("<p style=\"color:red; font-size:13px\"><b>addtocart location not avialble.</b></p>");
		Throwable t = new InterruptedException("Exception");
		test.fail(t);
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "addtocartFail");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addtocartFail.png";
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		Assert.assertTrue(addtocart.isDisplayed());
		PageDriver.getCurrentDriver().quit();
	}
}
	
public void clickOnmycart() throws IOException {
		
		test.info("click on mycart");
	
	try {
		
		if (mycart.isDisplayed()) {
			mycart.click();
			//timeOut(10000);
			test.pass("<p style=\"color:green; font-size:13px\"><b>click mycart.</b></p>");
			timeOut(5000);
			
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "mycartPass");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "mycartPass.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			
		}
	} catch (Exception e) {
		test.fail("<p style=\"color:red; font-size:13px\"><b>mycart location not avialble.</b></p>");
		Throwable t = new InterruptedException("Exception");
		test.fail(t);
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "mycartFail");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "mycartFail.png";
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		Assert.assertTrue(mycart.isDisplayed());
		PageDriver.getCurrentDriver().quit();
	}
}

public void clickOnproceedtocheckout() throws IOException {
	
	test.info("click on proceedtocheckout");

try {
	
	if (proceedtocheckout.isDisplayed()) {
		proceedtocheckout.click();
		//timeOut(10000);
		test.pass("<p style=\"color:green; font-size:13px\"><b>click proceedtocheckout.</b></p>");
		timeOut(5000);
		
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "proceedtocheckoutPass");
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + "proceedtocheckoutPass.png";
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		
	}
} catch (Exception e) {
	test.fail("<p style=\"color:red; font-size:13px\"><b>proceedtocheckout location not avialble.</b></p>");
	Throwable t = new InterruptedException("Exception");
	test.fail(t);
	@SuppressWarnings("unused")
	String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "proceedtocheckoutFail");
	String dest = System.getProperty("user.dir") + "\\screenshots\\" + "proceedtocheckoutFail.png";
	test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	Assert.assertTrue(proceedtocheckout.isDisplayed());
	PageDriver.getCurrentDriver().quit();
}
}

}
