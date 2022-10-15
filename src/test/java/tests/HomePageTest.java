package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.HomePage;
import utilities.ExtentFactory;

public class HomePageTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	
	public void startUrl() {
		
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>HomePage Process</b></p>")
						.assignAuthor("QA TEAM").assignDevice("Windows");
		
		PageDriver.getCurrentDriver().get(baseUrl);
		PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
	@Test(priority = 0) 
	
	public void hoverOnsubject() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>hover on subject</b></p>");
		HomePage homepage = new HomePage(childTest);
		
		homepage.hoverOnsubject();
		Thread.sleep(10000);
	}
	
@Test(priority = 1) 
	
	public void selectউপন্যাস() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>select উপন্যাস</b></p>");
		HomePage homepage = new HomePage(childTest);
		
		homepage.selectউপন্যাস();
		Thread.sleep(10000);
	}

@Test(priority = 2) 

public void clickOnView_Details() throws InterruptedException, IOException {
	childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>View_Details</b></p>");
	HomePage homepage = new HomePage(childTest);
	
	homepage.clickOnView_Details();
	Thread.sleep(10000);
}

	@AfterClass
	public void afterClass() {
	report.flush();
}
	
	
}
