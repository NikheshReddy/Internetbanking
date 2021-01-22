package com.internetbankingv1.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {

	WebDriver ldriver;

	public AddNewCustomerPage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	WebElement lnkAddNewCustomer;

	@FindBy(xpath="//input[@name='name']")
	WebElement txtCustomerName;

	@FindBy(xpath="//input[@value='m']")
	WebElement rdGender;

	@FindBy(xpath="//input[@id='dob']")
	WebElement txtDOB;

	@FindBy(xpath="//textarea[@name='addr']")
	WebElement txtCusAddress;

	@FindBy(xpath="//input[@name='city']")
	WebElement txtCity;

	@FindBy(xpath="//input[@name='state']")
	WebElement txtState;

	@FindBy(xpath="//input[@name='pinno']")
	WebElement txtPincode;

	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement txtPhoneNumber;

	@FindBy(xpath="//input[@name='emailid']")
	WebElement txtEmail;

	@FindBy(xpath="//input[@name='password']")
	WebElement txtPassword;

	@FindBy(xpath="//input[@name='sub']")
	WebElement cusBtnSubmit;

	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
	}
	public void cusName(String cname) {
		txtCustomerName.sendKeys(cname);
	}
	public void cusGender(String cgender) {
		rdGender.click();
	}
	public void cusDOB(String dd,String mm,String yyyy) {
		txtDOB.sendKeys(dd);
		txtDOB.sendKeys(mm);
		txtDOB.sendKeys(yyyy);
	}
	public void cusAddress(String caddress) {
		txtCusAddress.sendKeys(caddress);
	}
	public void cusCity(String ccity) {
		txtCity.sendKeys(ccity);
	}
	public void cusState(String cstate) {
		txtState.sendKeys(cstate);
	}
	public void cusPincode(String cpincode) {
		txtPincode.sendKeys(cpincode);
	}
	public void cusPhoneNumber(String cphonenumber) {
		txtPhoneNumber.sendKeys(cphonenumber);
	}
	public void cusEmail(String cemail) {
		txtEmail.sendKeys(cemail);
	}
	public void cusPassword(String cpassword) {
		txtPassword.sendKeys(cpassword);
	}
	public void cussubmit() {
		cusBtnSubmit.click();
	}


}
