package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import drivers.BaseDriver;
import drivers.PageDriver;
import pages.Address;
import utilities.ExtentFactory;

public class AddressTest extends BaseDriver {
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
@BeforeClass
	
	public void startUrl() {
		
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Address Process</b></p>")
						.assignAuthor("QA TEAM").assignDevice("Windows");
		PageDriver.getCurrentDriver().manage().window().maximize();
	}

	@Test(priority = 0) 

	public void clickOnaddress() throws InterruptedException, IOException {
	childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click on address</b></p>");
	Address address =new Address(childTest);

	address.clickOnaddress();
	//Thread.sleep(10000);
}

	@Test(priority = 1) 

	public void clickOnaddnewaddress() throws InterruptedException, IOException {
	childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click on address</b></p>");
	Address address =new Address(childTest);

	address.clickOnaddnewaddress();
	//Thread.sleep(10000);
}

	@Test(priority = 2) 

	public void sendFullName() throws InterruptedException, IOException {
	childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>send full name</b></p>");
	Address address =new Address(childTest);

	address.sendFullName();
	//Thread.sleep(10000);
}

	@AfterClass
	public void afterClass() {
	report.flush();
}
}
