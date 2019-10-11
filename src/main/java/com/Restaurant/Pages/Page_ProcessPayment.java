package com.Restaurant.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Restaurant.CommonPages.Resaurant_Menu;

import com.Restaurant.PageData.Restaurant_SignUpPagedata;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;

public class Page_ProcessPayment extends BasePages {
	static Restaurant_SignUpPagedata data = new Restaurant_SignUpPagedata();
	static String ExpireYear = null;
	static String ExpireMonth = null;
	static String Creditcardnumber = null;
	Resaurant_Menu Menu = new Resaurant_Menu();

	public Page_ProcessPayment() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	// Objects from Application

	public static WebElement txtFirstName() {
		return driver.findElement(By.xpath("//*[@name='NAME1']"));
	}

	public static WebElement txtLastName() {
		return driver.findElement(By.xpath("//*[@name='NAME2']"));
	}

	public static WebElement txtCreditCardNumber() {
		return driver.findElement(By.xpath("//*[@name='CC_NUM']"));
	}

	public static WebElement txtCVV2() {
		return driver.findElement(By.xpath("//*[@name='CVCCVV2']"));
	}

	public static WebElement txtExpirationDateMonth() {
		return driver.findElement(By.xpath("//*[@name='CC_EXPIRES_MONTH']"));
	}

	public static WebElement txtExpirationDateYear() {
		return driver.findElement(By.xpath("//*[@name='CC_EXPIRES_YEAR']"));
	}

	public static WebElement btnProcess() {
		return driver.findElement(By.xpath("//*[@name='submitform']"));
	}

	public static WebElement btnReset() {
		return driver.findElement(By.xpath("//*[@value='Reset']"));
	}

	public static WebElement lblAmount() {
		return driver.findElement(By.xpath("//td[@align='center']/h1"));
	}

	public static WebElement btnBack() {
		return driver.findElement(By.xpath("//*[text()='Go Back']"));
	}

	// Each Object Performance Method

	public void EnterFirstName(int row) throws IOException {
		enterText(txtFirstName(), "First Name", data.Getdata("First Name", row));
	}

	public void EnterLastName(int row) throws IOException {
		enterText(txtLastName(), "Last Name", data.Getdata("Last Name", row));
	}

	public void EnterCreditCardNumber() throws IOException {

		Creditcardnumber = "4444333322221111";
		enterText(txtCreditCardNumber(), "Credit Card#", Creditcardnumber);
	}

	public void SelectExpirationMonth() throws IOException {
		ExpireMonth = "01";
		selectByValue(txtExpirationDateMonth(), "ExpiryMonth", ExpireMonth);
	}

	public void SelectExpirationYear() throws IOException {
		ExpireYear = "24";
		selectByValue(txtExpirationDateYear(), "ExpiryYear", ExpireYear);
	}

	public void clickProcess() throws IOException {
		clickOnButton(btnProcess(), "Process");
	}

	// Actual Functional Method

	public void PaymentProcess(int row) throws IOException {
		EnterFirstName(row);
		EnterLastName(row);
		EnterCreditCardNumber();
		SelectExpirationMonth();
		SelectExpirationYear();
		clickProcess();

	}
}
