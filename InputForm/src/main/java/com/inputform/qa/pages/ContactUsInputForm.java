package com.inputform.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.inputform.qa.testbase.TestBase;

public class ContactUsInputForm extends TestBase {

	public ContactUsInputForm() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "first_name")
	@CacheLookup
	WebElement contactUsFirstName;

	@FindBy(name = "last_name")
	@CacheLookup
	WebElement contactUsLasttName;

	@FindBy(name = "email")
	@CacheLookup
	WebElement contactUsEmail;

	@FindBy(name = "phone")
	@CacheLookup
	WebElement contactUsPhone;

	@FindBy(name = "address")
	@CacheLookup
	WebElement contactUsAddress;

	@FindBy(name = "city")
	@CacheLookup
	WebElement contactUsCity;

	@FindBy(name = "state")
	@CacheLookup
	WebElement contactUsState;

	@FindBy(name = "zip")
	@CacheLookup
	WebElement contactUsZip;

	@FindBy(name = "website")
	@CacheLookup
	WebElement contactUsWebsite;

	@FindBy(name = "comment")
	@CacheLookup
	WebElement contactUsComment;

	@FindBy(xpath = "//input[@value='no']")
	@CacheLookup
	WebElement contactUsRadioButtonNo;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement contactUsSendButton;

	public void stateSelection() {

		Select selectbyState = new Select(contactUsState);

		selectbyState.selectByIndex(3);
	}

	public void selectHosting() {

		contactUsRadioButtonNo.click();
	}

	public void fillForm(String client_first_name, String client_last_name, String client_email_id,
			String client_phone_number, String client_address, String client_city, 
			String client_zipCode, String client_Website, String client_comment) {

		contactUsFirstName.sendKeys(client_first_name);
		contactUsLasttName.sendKeys(client_last_name);
		contactUsEmail.sendKeys(client_email_id);
		contactUsPhone.sendKeys(client_phone_number);
		contactUsAddress.sendKeys(client_address);
		contactUsCity.sendKeys(client_city);
		contactUsZip.sendKeys(client_zipCode);
		contactUsWebsite.sendKeys(client_Website);
		contactUsComment.sendKeys(client_comment);

	}

	public void clickSendButton() {
		contactUsSendButton.submit();

	}

}
