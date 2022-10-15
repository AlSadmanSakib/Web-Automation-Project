package tests;
//import java.io.IOException;
//
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import drivers.BaseDriver;
//import drivers.PageDriver;
//import pages.Login;
//import utilities.ExtentFactory;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.Login;
import utilities.ExtentFactory;

public class LoginTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	
	public void startUrl() {
		
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Login Process</b></p>")
						.assignAuthor("QA TEAM").assignDevice("Windows");
		PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
	@Test(priority = 0) 

	public void clickOnloginwithgoogle() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click on loginwithgoogle</b></p>");
		Login login = new Login(childTest);

		login.clickOnloginwithgoogle();
		//Thread.sleep(10000);
}
	
	@Test(priority = 1) 

	public void sendemail() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>send email address</b></p>");
		Login login = new Login(childTest);

		login.sendemail();
		//Thread.sleep(10000);
}
	
	@Test(priority = 2) 

	public void clickOnnext() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click on next</b></p>");
		Login login = new Login(childTest);

		login.clickOnnext();
		//Thread.sleep(10000);
}
	
	@Test(priority = 3) 

	public void sendPassWord() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>send password</b></p>");
		Login login = new Login(childTest);

		login.sendPassWord();
		//Thread.sleep(10000);
}
	
	@Test(priority = 4) 

	public void clickOnnext2() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>click on next2</b></p>");
		Login login = new Login(childTest);

		login.clickOnnext2();
		//Thread.sleep(10000);
}
	
	@AfterClass
	public void afterClass() {
		report.flush();
}

}
