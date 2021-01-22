package com.internetbanking.testcases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;
import com.internetbankingv1.PageObjects.AddNewCustomerPage;
import com.internetbankingv1.PageObjects.LoginPage;

public class TC_AddNewCustomer_003 extends BaseClass {

	@Test
	public void addNewCustomer() throws InterruptedException, IOException {

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("UserName is Provided");
		lp.setPassword(password);
		logger.info("Password is Provided");
		lp.clickSubmit();
		logger.info("Successfully login");

		Thread.sleep(3000);

		AddNewCustomerPage addnewcus = new AddNewCustomerPage(driver);
		addnewcus.clickAddNewCustomer();
		logger.info("Providing Customer Details.....!");
		addnewcus.cusName("Venkata Nikhesh Reddy");
		logger.info("Entered CustomerName");
		addnewcus.cusGender("male");
		logger.info("Selected Gender");
		addnewcus.cusDOB("21", "12", "1992");
		logger.info("Entered Date of Birth");
		addnewcus.cusAddress("Proddatur Kadapa dist");
		logger.info("Entered Address");
		addnewcus.cusCity("Proddatur");
		logger.info("Entered City");
		addnewcus.cusState("Andhra Pradesh");
		logger.info("Entered State");
		addnewcus.cusPincode("516360");
		logger.info("Entered Pincode");
		addnewcus.cusPhoneNumber("9052299888");
		logger.info("Entered Phonenumber");
		String email = randomString()+"@gmail.com";
		addnewcus.cusEmail(email);
		logger.info("Entered Email");
		addnewcus.cusPassword("Mani@1621");
		logger.info("Entered Password");
		addnewcus.cussubmit();
		logger.info("Clicked Submit Button");

		Thread.sleep(3000);

		logger.info("Validation Started....");

		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true) {
			Assert.assertTrue(true);
			logger.info("test case passed....");
		}
		else {
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
			logger.info("test case failed....");
		}
	}
}
