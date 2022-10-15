package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.AddToCart;
import utilities.ExtentFactory;

public class AddToCartTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	
	public void startUrl() {
		
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>AddToCart Process</b></p>")
						.assignAuthor("QA TEAM").assignDevice("Windows");
		PageDriver.getCurrentDriver().manage().window().maximize();
	}

	@Test(priority = 0) 

		public void clickOnaddtocart() throws InterruptedException, IOException {
	childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click on addtocart</b></p>");
	AddToCart addtocart = new AddToCart(childTest);
	
	addtocart.clickOnaddtocart();
	Thread.sleep(10000);
}

	@Test(priority = 1) 

	public void clickOnmycart() throws InterruptedException, IOException {
	childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click on mycart</b></p>");
	AddToCart addtocart = new AddToCart(childTest);
	
	addtocart.clickOnmycart();
	Thread.sleep(10000);
}

	@Test(priority = 2) 

	public void clickOnproceedtocheckout() throws InterruptedException, IOException {
	childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click on proceedtocheckout</b></p>");
	AddToCart addtocart = new AddToCart(childTest);
	
	addtocart.clickOnproceedtocheckout();
	Thread.sleep(10000);
}
	
	@AfterClass
	public void afterClass() {
		report.flush();
}
}
