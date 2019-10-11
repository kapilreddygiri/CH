package com.Restaurant.Pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Restaurant.PageData.Restaurant_SignUpPagedata;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;

public class Page_MemberSearch extends BasePages {

	static Restaurant_SignUpPagedata data = new Restaurant_SignUpPagedata();

	public Page_MemberSearch() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

// Objects from Application	
// Member Search

	public static WebElement txtCardNumber() {
		return driver.findElement(By.xpath("(//input[@class='textbox_class'])[1]"));
	}

	public static WebElement txtPhoneNumber() {
		return driver.findElement(By.id("ContentPlaceHolder1_PhoneNumber"));
	}

	public static WebElement txtLastName() {
		return driver.findElement(By.id("ContentPlaceHolder1_LastName"));
	}

	public static WebElement txtFirstName() {
		return driver.findElement(By.id("ContentPlaceHolder1_FirstName"));
	}

	public static WebElement txtZip() {
		return driver.findElement(By.id("ContentPlaceHolder1_ZipCode"));
	}

	public static WebElement txtEmail() {
		return driver.findElement(By.id("ContentPlaceHolder1_Email"));
	}

	public static WebElement btnSearch() {
		return driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_Search']"));
	}

	public static WebElement btnClearALL() {
		return driver.findElement(By.id("ContentPlaceHolder1_ClearAll"));
	}
// Each Object Performance Method	
// member Search

	public static void EnterCardNumber(int row) throws IOException, InterruptedException, BiffException {
		String Cardnumber = cardnumber();
		enterText(txtCardNumber(), "Card Number", Cardnumber);
		data.setData("Card Number", row, Cardnumber);
	}

	public static void EnterCardNumber1(int row) throws IOException, InterruptedException, BiffException {
		try {
			String Cardnumber = data.Getdata("Card Number", row);
			System.out.println("Card Number :" + Cardnumber);
			enterText(txtCardNumber(), "Card Number", Cardnumber);
			data.setData("Card Number", row, Cardnumber);
		} catch (Exception e) {
			System.out.println("excel data exception");
			e.printStackTrace();
		}

	}

	public static void EnterCardNumberforActivation(int row) throws IOException, InterruptedException, BiffException {
		try {

			System.out.println("Card Number : " + Page_NewGiftMember.newCardNumber);
			enterText(txtCardNumber(), "Card Number", Page_NewGiftMember.newCardNumber);
			clickOnButton(btnSearch(), "Search");
		} catch (Exception e) {
			System.out.println("excel data exception");
			e.printStackTrace();
		}

	}

	public static void enterCardNumberforSearch(int row) throws IOException, InterruptedException, BiffException {
		try {

			enterText(txtCardNumber(), "Card Number", data.Getdata("Card Number", row));
			clickOnButton(btnSearch(), "Search");
		} catch (Exception e) {
			System.out.println("excel data exception");
			e.printStackTrace();
		}

	}

	public static void EnterPhoneNumber(int row) throws IOException, InterruptedException, BiffException {
		enterText(txtPhoneNumber(), "Phone #", data.Getdata("Phone", row));
	}

	public static void EnterLastName(int row) throws IOException, InterruptedException, BiffException {
		enterText(txtLastName(), "Last Name", data.Getdata("Last Name", row));
	}

	public static void EnterFirstName(int row) throws IOException, InterruptedException, BiffException {
		enterText(txtFirstName(), "First Name", data.Getdata("First Name", row));
	}

	public static void EnterEmail(int row) throws IOException, InterruptedException, BiffException {
		enterText(txtZip(), "Email", data.Getdata("Email", row));
	}

	public static void EnterZip(int row) throws IOException, InterruptedException, BiffException {
		enterText(txtEmail(), "Home Zip/Postal Code", data.Getdata("Home Zip/Postal Code", row));
	}

	public static void ClickSearch() throws IOException, InterruptedException, BiffException {

		clickOnButton(btnSearch(), "Search");

	}

	public static void ClicClearAll(int row) throws IOException, InterruptedException, BiffException {
		clickOnButton(btnClearALL(), "Search");
	}

// Actual functional Method
	public static void EnterMemberInformation(int row) throws IOException, InterruptedException, BiffException {
		// EnterCardNumber(row);
		EnterCardNumber1(row);
		// EnterPhoneNumber(row);
		// EnterLastName(row);
		// EnterFirstName(row);
		// EnterEmail(row);
		// EnterZip(row);

		ClickSearch();
	}

	public static void searchMember(int row) throws IOException, InterruptedException, BiffException {

		enterCardNumberforSearch(row);
	}

	public  void searchCardforActivation(int row) throws IOException, BiffException, InterruptedException {
		EnterCardNumberforActivation(row);
	}
}
