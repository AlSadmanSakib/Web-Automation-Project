package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class HomePage extends CommonMethods{ 
	
	ExtentTest test;
	
	
	public HomePage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
		
	
	}
	
	
			
		@FindBy(xpath = "//body/app-root[1]/div[1]/app-pages[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-menu[1]/nav[1]/ul[1]/li[3]/a[1]")
		public WebElement subject;
		
		
		@FindBy(xpath = "//body/app-root[1]/div[1]/app-pages[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-menu[1]/nav[1]/ul[1]/li[3]/div[1]/ul[1]/li[6]/a[1]")	
		public WebElement উপন্যাস;
		
		
		@FindBy(xpath = "//body/app-root[1]/div[1]/app-pages[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[3]/app-category-products[1]/div[1]/div[2]/div[3]/a[11]/div[5]/button[1]")
		public WebElement View_Details;
		
		
		
		public void hoverOnsubject() throws IOException {
			
			test.info("hover on subject");
			
			try {
				if (subject.isDisplayed()) {
					hover(subject);
					timeOut(3000);
					test.pass("<p style=\"color:green; font-size:13px\"><b>hover on subject</b></p>");
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "hoverPass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "hoverPass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>hover on subject location not avialble.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "hoverFail");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "hoverFail.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(subject.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			
		}
		
		public void selectউপন্যাস() throws IOException {
			
			
				test.info("select উপন্যাস");
			
			try {
				if (উপন্যাস.isDisplayed()) {
					উপন্যাস.click();
					//scrollToElement(উপন্যাস);
					test.pass("<p style=\"color:green; font-size:13px\"><b>click on উপন্যাস.</b></p>");
					timeOut(5000);
					
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "hoverPass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "hoverPass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>click on উপন্যাস location not avialble.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "selectউপন্যাসFail");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selectউপন্যাসFail.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(উপন্যাস.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
		}
		//
		
		
		public void clickOnView_Details() throws IOException {
			
			
			test.info("click View_Details");
		
		try {
			if (View_Details.isDisplayed()) {
				//উপন্যাস.click();
		       // scrollToElement(View_Details);
				View_Details.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>View_Details.</b></p>");
				timeOut(5000);
				
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "View_DetailsPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "View_DetailsPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>View_Details location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "View_DetailsFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "View_DetailsFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(View_Details.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
		
		///
		//public void hover() {
		//বিষয়.click();
		//}
		
//		public void clickOnউপন্যাস() {
//			উপন্যাস.click();
//		}
		
//		public void scrollPageDown() {
//			//উপন্
//		}
}

