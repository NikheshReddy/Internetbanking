package com.internetbanking.testcases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.internetbankingv1.PageObjects.EditCustomerPage;
import com.internetbankingv1.PageObjects.LoginPage;

public class TC_EditCustomer_004 extends BaseClass {

	@Test
	public void editcustomerinfo() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username Provided");
		lp.setPassword(password);
		logger.info("Password Provided");
		lp.clickSubmit();
		logger.info("Successfully Login");

		Thread.sleep(3000);

		EditCustomerPage edt = new EditCustomerPage(driver);
		edt.clickEdtcustomer();
		logger.info("Clicked EditCustomer");
		edt.setCusid("83403");
		logger.info("CustomerID Provided");
		edt.clickEdtsubmit();
		logger.info("Clicked Edit Submit Button");
		edt.edtCusAddress("Kadapa");
		logger.info("Address Provided");
		String phnnum = randomNum();
		edt.edtCusPhonenumber(phnnum);
		logger.info("Phonenumber Provided");
		edt.clickSubmit();
		logger.info("Clicked Submit Button");

		Thread.sleep(3000);

		logger.info("Validation started");


		boolean res = driver.getPageSource().contains("Customer details updated Successfully!!!");
		if(res==true) {
			Assert.assertTrue(true);
			logger.info("Testcase passed");
		}else {
			captureScreen(driver,"editcustomerinfo");
			Assert.assertTrue(false);
			logger.info("Testcase failed");
		}
	}

}
