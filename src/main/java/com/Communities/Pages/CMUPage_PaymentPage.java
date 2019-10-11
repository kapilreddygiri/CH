package com.Communities.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Communities.PagesData.CommunitiesMember_SignUpPagedata;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;

public class CMUPage_PaymentPage extends BasePages {

	CommunitiesMember_SignUpPagedata data = new CommunitiesMember_SignUpPagedata();

	public CMUPage_PaymentPage(int frameid) {

		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("framesize:" + size);
		driver.switchTo().frame(frameid);

	}

// Objects from Application
// Payment CC Info

	public static WebElement txt_CreditCardNumber() {
		return driver.findElement(By.xpath("//*[@name='CC_NUM']"));

	}

	public static WebElement dpd_ExpirationMonth() {
		return driver.findElement(By.id("CC_EXPIRES"));
	}

	public static WebElement dpd_ExpirationYear() {
		return driver.findElement(By.xpath("//select[@name='CC_EXPIRES_YEAR']"));

	}

// Objects from Application
// Billing Contact Info

	public static WebElement txt_FirstName() {
		return driver.findElement(By.xpath("//*[@name='NAME1']"));

	}

	public static WebElement txt_LastName() {
		return driver.findElement(By.xpath("//*[@name='NAME2']"));

	}

	public static WebElement txt_Email() {
		return driver.findElement(By.xpath("//*[@name='EMAIL']"));

	}

	public static WebElement txt_BillingAddress1() {
		return driver.findElement(By.xpath("//*[@name='ADDR1']"));

	}

	public static WebElement txt_BillingAddress2() {
		return driver.findElement(By.xpath("//*[@name='ADDR2']"));

	}

	public static WebElement txt_City() {
		return driver.findElement(By.xpath("//*[@name='CITY']"));

	}

	public static WebElement txt_ProvinceState() {
		return driver.findElement(By.xpath("//*[@name='STATE']"));

	}

	public static WebElement txt_PostalCode() {
		return driver.findElement(By.xpath("//*[@name='ZIPCODE']"));

	}

	public static WebElement txt_Phone() {
		return driver.findElement(By.xpath("//*[@name='PHONE']"));

	}

// Objects from Application
// Submit Section

	public static WebElement btn_ProcessPayment() {
		return driver.findElement(By.xpath("//*[@class='button--primary']"));

	}
	public static WebElement btn_StoreCreditCard() {
		return driver.findElement(By.xpath("//input[@value='Store Credit Card']"));

	}
	
	

// Each Object Performance Method
// Payment CC Info

	public void EnterCreditCardNumber() throws IOException {

		enterText(txt_CreditCardNumber(), "Credit Card", "4444333322221111");
	}

	public void SelectExpirationMonth() throws IOException {

		selectByValue(dpd_ExpirationMonth(), "Payment-Details Expiration Month", "01");
	}

	public void SelectExpirationYear() throws IOException {

		selectByValue(dpd_ExpirationYear(), "Payment-Details Expiration Month", "2024");
	}

// Each Object Performance Method
// Billing Contact Info	

	public void ValidateFirstName(int row) throws IOException, BiffException {
		verifyTextEqualwithAttributeValue(txt_FirstName(), data.Getdata("First Name", row).trim(), " First Name");

	}

	public void ValidateLastName(int row) throws IOException, BiffException {
		verifyTextEqualwithAttributeValue(txt_LastName(), data.Getdata("Last Name", row).trim(), " Last Name");

	}

	public void ValidateEmail(int row) throws IOException, BiffException {
		verifyTextEqualwithAttributeValue(txt_Email(), data.Getdata("Email", row).trim(), " Email");

	}

	public void ValidateHomeStreet(int row) throws IOException, BiffException {
		verifyTextEqualwithAttributeValue(txt_BillingAddress1(), data.Getdata("Home Street", row).trim(),
				" Home Street");

	}

	public void ValidateHomeCity(int row) throws IOException, BiffException {
		verifyTextEqualwithAttributeValue(txt_City(), data.Getdata("Home City", row).trim(), " Home City");

	}

	public void ValidateHomeStateProvince(int row) throws IOException, BiffException {
		verifyTextEqualwithAttributeValue(txt_ProvinceState(), data.Getdata("Home State/Province", row).trim(),
				" Home State/Province");

	}

	public void ValidateHomeZipPostalCode(int row) throws IOException, BiffException {
		verifyTextEqualwithAttributeValue(txt_PostalCode(), data.Getdata("Home Zip/Postal Code", row).trim(),
				" Home Zip/Postal Code");

	}

	public void ValidatePhone(int row) throws IOException, BiffException {
		verifyTextEqualwithAttributeValue(txt_Phone(), data.Getdata("Phone", row).trim(), " Phone");

	}

// Each Object Performance Method
// Submit Section

	public void ClickProcessPayment() throws IOException, BiffException {

		clickOnButton(btn_ProcessPayment(), "Process payment");
	}
	public void clickStoreCreditCard() throws IOException, BiffException {

		clickOnButton(btn_StoreCreditCard(), "StoreCreditCard");
	}

// Logic Methods

// Each Section Method
	public void EnterPaymentSection() throws IOException, InterruptedException {
		EnterCreditCardNumber();
		Select test = new Select(driver.findElement(By.id("CC_EXPIRES")));
		test.selectByValue("01");
		Select test1 = new Select(driver.findElement(By.name("CC_EXPIRES_YEAR")));
		test1.selectByValue("24");

	}

	public void ValidateBillingContactInfoSection(int row) throws IOException, BiffException {
		ValidateFirstName(row);
		ValidateLastName(row);
		ValidateEmail(row);
		ValidateHomeStreet(row);
		ValidateHomeCity(row);
		ValidateHomeStateProvince(row);
		ValidateHomeZipPostalCode(row);
		ValidatePhone(row);
	}

// Actual functional Method

	public void EnterandValidate_PaymentPage(int row) throws IOException, BiffException, InterruptedException {
		try {
			for(int i=0;i<5;i++) {
				driver.switchTo().defaultContent();
				driver.switchTo().frame(i);
				if(txt_CreditCardNumber().isDisplayed()) {
					System.out.println("Frame switched at : "+i);
					Thread.sleep(3000);
					EnterPaymentSection();
					ValidateBillingContactInfoSection(row);
					ClickProcessPayment();
					driver.switchTo().defaultContent();
				} else {
					System.out.println("Required frame not found");
				}
				
			}
		} catch(Exception e) {
			
			System.out.println("no such frame");
		}
		
	

	}
	

}
