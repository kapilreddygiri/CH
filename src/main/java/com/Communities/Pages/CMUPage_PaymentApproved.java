package com.Communities.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Communities.PagesData.CommunitiesMember_SignUpPagedata;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;

public class CMUPage_PaymentApproved extends BasePages {

	CommunitiesMember_SignUpPagedata data = new CommunitiesMember_SignUpPagedata();

	public CMUPage_PaymentApproved() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();

	}

// Objects from Application
// Payment Approved
	
	public static WebElement ReadOnly_PaymentConfirmationMessage() {
		return driver.findElement(By.xpath("//h2[contains(text(),'Payment Approved')]"));

	}
	public static WebElement ReadOnly_CardNumber() {
		return driver.findElement(By.xpath("//strong"));

	}

	public static WebElement txt_EnterPassword() {
		return driver.findElement(By.id("password"));

	}

	public static WebElement txt_EnterPassword2() {
		return driver.findElement(By.id("password2"));

	}

	public static WebElement btn_CreatePassword() {
		return driver.findElement(By.id("create"));

	}
	public static WebElement lnkDashboard() {
		return driver.findElement(By.xpath("//a[text()='dashboard']"));

	}
	

// Each Object Performance Method
// Payment Approved	

	public void CopyCardNumber(int row) throws IOException, BiffException, InterruptedException {
		Thread.sleep(5000);
		String cardnumber = ReadOnly_CardNumber().getText();
		System.out.println("card Number :" + cardnumber);
		data.setData("Card Number", row, cardnumber);
		ResultsLog.ReportPass(driver, "Card Number" + cardnumber, "Card Number");
	}

	public void EnterPassword(int row) throws IOException, BiffException, InterruptedException {
		Thread.sleep(3000);
        //System.out.println(data.Getdata("Password", row));
		enterText(txt_EnterPassword(), "Password", data.Getdata("Password", row));
		Thread.sleep(3000);
		
		ResultsLog.ReportPass(driver, "Password" + data.Getdata("Password", row), "Password");
	}

	public void EnterPassword2() throws IOException {

		enterText(txt_EnterPassword2(), " Confirm Password ", "abcd1234");
	}

	public void ClickCreatePassword() throws IOException {

		clickOnButton(btn_CreatePassword(), "Create Password");
	}
	public void ClickLinkDashboard() throws IOException {

		clickOnLink(lnkDashboard(), "Return to Dashboard");
	}

// Logic Methods

// Each Section Method

	public void CreatePasswordandCopyCardNumber(int row) throws IOException, BiffException, InterruptedException {
		Thread.sleep(2000);
		CopyCardNumber(row);
		EnterPassword(row);
		EnterPassword2();
		ClickCreatePassword();
	}
	public void copyCardNumber(int row) throws Exception {
		Thread.sleep(2000);
		CopyCardNumber(row);
	}
	public void validatePaymentConfirmationMessage() throws IOException, BiffException, InterruptedException {
	verifyTextEqual(ReadOnly_PaymentConfirmationMessage(), "Payment Approved", "Payment Approval Message");	
	Thread.sleep(2000);
	ClickLinkDashboard();
	}

}
