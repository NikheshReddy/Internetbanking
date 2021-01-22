package com.internetbankingv1.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {

	WebDriver ldriver;
	
	public EditCustomerPage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[3]/a")
	WebElement lnkEdtCustomer;
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement txtEdtCustID;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement edtSubmit;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement txtEdtCusAddress;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement txtEdtPhoneNumber;
	
	@FindBy(xpath="//input[@name='sub']")
	WebElement edtCustSubmit;
	
	public void clickEdtcustomer() {
		lnkEdtCustomer.click();
	}
	
	public void setCusid(String custid) {
		txtEdtCustID.sendKeys(custid);
	}
	
	public void clickEdtsubmit() {
		edtSubmit.click();
	}
	
	public void edtCusAddress(String edtaddr) {
		txtEdtCusAddress.sendKeys(edtaddr);
	}
	
	public void edtCusPhonenumber(String edtphnnum) {
		txtEdtPhoneNumber.sendKeys(edtphnnum);
	}
	
	public void clickSubmit() {
		edtCustSubmit.click();
	}
}
