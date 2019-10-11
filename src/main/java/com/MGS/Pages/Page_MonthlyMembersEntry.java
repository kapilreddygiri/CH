
package com.MGS.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.MGS.CommonPages.Menu;
import com.MGS.CommonPages.Page_NewMember;
import com.MGS.PagesData.Member_SignUpPagedata;
import com.Utils.BasePages;
import com.Utils.WriteExcel;
import com.aventstack.extentreports.Status;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class Page_MonthlyMembersEntry extends BasePages {
	static Member_SignUpPagedata data = new Member_SignUpPagedata();
	static String ExpectedPageHeading = "New Member";

	/*
	 * public Page_MonthlyMembersEntry(int frameid) {
	 * 
	 * try { driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * frameSwitch(frameid); } catch (InterruptedException e) { // TODO } }
	 */

	public Page_MonthlyMembersEntry() {

	}

	// Objects from Application

	// Heading of the Page
	public static WebElement PageTitleObject() {
		return driver.findElement(By.xpath("//*[@class='pageType noSecondHeader']"));

	}

	public static WebElement invalidAmountForPayment() {
		return driver.findElement(By.xpath("//div[@class='invalid-feedback']"));

	}

	public static WebElement cancelForPayment() {
		return driver.findElement(By.xpath("//button[text()='Cancel']"));

	}

	// Wine Club Information
	public static WebElement txt_CardNumber() throws InterruptedException {
		return driver.findElement(By.xpath(
				"//*[text()='Card Number']/parent::th//following-sibling::td/child::div/child::input[@type='text']"));
	}

	public static WebElement txt_SignUpLocation() {
		return driver.findElement(By.xpath(
				"//*[text()='Sign Up Location']/parent::th//following-sibling::td/child::div/child::span/child::input"));
	}

	public static WebElement txt_FirstName() {
		return driver.findElement(By.xpath(
				"//*[text()='First Name']/parent::th//following-sibling::td/child::div/child::input[@type='text']"));
	}

	public static WebElement readTXT_MembershipType() {
		return driver.findElement(By.xpath("//*[text()='Membership Type']/following-sibling::td/child::span"));
	}

	public static WebElement readTXT_CostofMemberShip() {
		return driver.findElement(By.xpath("//*[text()='Cost of Membership']/following-sibling::td/child::span"));
	}

	public static WebElement txt_MiddleName() {
		return driver.findElement(
				By.xpath("//*[text()='Middle Name']/parent::th//following-sibling::td/child::input[@type='text']"));
	}

	public static WebElement txt_LastName() {
		return driver.findElement(By.xpath(
				"//*[text()='Last Name']/parent::th//following-sibling::td/child::div/child::input[@type='text']"));
	}

	public static WebElement dpd_Delivery() {
		return driver.findElement(
				By.xpath("//*[text()='Delivery']/parent::th//following-sibling::td[1]/child::div/child::select"));

	}

	public static WebElement dpd_ChargeTiming() {
		return driver.findElement(
				By.xpath("//*[text()='Charge Timing']/parent::th//following-sibling::td[1]/child::div/child::select"));
	}

	public static WebElement dpd_clubType() {
		return driver.findElement(By.xpath(
				"//*[@id='page:form:pb_member:pbs_cost:clubType'][@name='page:form:pb_member:pbs_cost:clubType']"));
	}

	public static WebElement dpd_NOofBottles() {
		return driver.findElement(
				By.xpath("//*[text()='# of Bottles']/parent::th//following-sibling::td[1]/child::div/child::select"));
	}

	// Each Object Performance Method

	public static void EnterCardNumber(int row) throws IOException, InterruptedException, BiffException {
		String Cardnumber = cardnumber();
		System.out.println("Card Number :" + Cardnumber);
		enterText(txt_CardNumber(), "Card Number", Cardnumber);
		data.setData("Card Number", row, Cardnumber);
	}

	public static void EnterSignUpLocation(int row) throws IOException {

		enterText(txt_SignUpLocation(), "Sign Up Location", data.Getdata("Sign Up Location", row));
	}

	public static void EnterFirstName(int row) throws IOException {

		enterText(txt_FirstName(), "First Name", data.Getdata("First Name", row));
	}

	public static void EnterMiddleName(int row) throws IOException {

		enterText(txt_MiddleName(), "Middle Name", data.Getdata("Middle Name", row));
	}

	public static void EnterLastName(int row) throws IOException {

		enterText(txt_LastName(), "Last Name", data.Getdata("Last Name", row));
	}

	public static void SelectDelivery(int row) throws IOException {

		selectByText(dpd_Delivery(), "Delivery", data.Getdata("Delivery", row));
	}

	public static void SelectClubType(int row) throws IOException {
		try {
			selectByTextwithoutReport(dpd_clubType(), "Club Type", data.Getdata("Club Type", row));
		} catch (Exception e) {
			selectByText(dpd_clubType(), "Club Type", data.Getdata("Club Type", row));
		}

	}

	public static void SelectNoOfBottles(int row) throws IOException, InterruptedException {

		Thread.sleep(1000);
		try {
			selectByTextwithoutReport(dpd_NOofBottles(), "# of Bottles", data.Getdata("# of Bottles", row));
		} catch (Exception e) {
			selectByText(dpd_NOofBottles(), "# of Bottles", data.Getdata("# of Bottles", row));
		}
	}

	public static void ReadOnlyCostofMembership(int row) throws IOException, InterruptedException {
		Thread.sleep(1000);

		int attempts = 0;
		while (attempts < 2) {
			try {
				verifyTextEqual(readTXT_CostofMemberShip(), formatAmountText(data.Getdata("Cost of Membership", row)),
						"Cost of MemberShip");

				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}

	}

	public static void ReadOnlyMembershipType(int row) throws IOException {
		try {
			verifyTextEqualWithoutCatchLog(readTXT_MembershipType(), data.Getdata("Membership Type", row),
					"MemberShip Type");
		} catch (Exception e) {
			verifyTextEqual(readTXT_MembershipType(), data.Getdata("Membership Type", row), "MemberShip Type");
		}

	}

	// Actual functional Method
	public void EnterMonthlyMemberInformation(int row) throws IOException, InterruptedException, BiffException

	{

		// driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='accessibility
		// title']")));
		Thread.sleep(5000);
		EnterCardNumber(row);
		EnterSignUpLocation(row);
		EnterFirstName(row);
		EnterMiddleName(row);
		EnterLastName(row);
		SelectDelivery(row);
		SelectClubType(row);
		SelectNoOfBottles(row);
		ReadOnlyMembershipType(row);
		ReadOnlyCostofMembership(row);
		Page_NewMember.EnterEmail(row);
		Page_NewMember.SelectGender(row);
		Page_NewMember.EnterBirthdate(row);
		Page_NewMember.EnterPhone(row);
		Page_NewMember.EnterStreet(row);
		Page_NewMember.EnterCity(row);
		Page_NewMember.SelectState(row);
		Page_NewMember.EnterZipcode(row);
		Page_NewMember.EnterShipStreet(row);
		Page_NewMember.EnterShipCity(row);
		Page_NewMember.SelectShipState(row);
		Page_NewMember.EnterShipZipcode(row);
		Page_NewMember.ClickCopyAndVerifyAddressWithShip(row);
		Page_NewMember.ClickProceedToPaymentDetails();
		// driver.switchTo().defaultContent();
		Page_NewMember.chargeNewCreditCard_StoreOnFile();

	}

	public void EnterMonthlyMemberInformationForLightning(int row)
			throws IOException, InterruptedException, BiffException

	{

		for (int i = 0; i < 10; i++) {
			try {
				driver.switchTo().defaultContent();
				driver.switchTo()
						.frame(driver.findElement(By.xpath("(//iframe[@title='accessibility title'])[" + i + "]")));
				if (txt_CardNumber().isDisplayed()) {
					Thread.sleep(5000);
					EnterCardNumber(row);
					EnterSignUpLocation(row);
					EnterFirstName(row);
					EnterMiddleName(row);
					EnterLastName(row);
					SelectDelivery(row);
					SelectClubType(row);
					SelectNoOfBottles(row);
					ReadOnlyMembershipType(row);
					ReadOnlyCostofMembership(row);
					Page_NewMember.EnterEmail(row);
					Page_NewMember.SelectGender(row);
					Page_NewMember.EnterBirthdate(row);
					Page_NewMember.EnterPhone(row);
					Page_NewMember.EnterStreet(row);
					Page_NewMember.EnterCity(row);
					Page_NewMember.SelectState(row);
					Page_NewMember.EnterZipcode(row);
					Page_NewMember.EnterShipStreet(row);
					Page_NewMember.EnterShipCity(row);
					Page_NewMember.SelectShipState(row);
					Page_NewMember.EnterShipZipcode(row);
					Page_NewMember.ClickCopyAndVerifyAddressWithShip(row);
					Page_NewMember.ClickProceedToPaymentDetails();
					driver.switchTo().defaultContent();
					break;
				}
			} catch (Exception e) {
				System.out.println("No frames found");
			}

		}

		chargeNewCreditCard_StoreOnFileLightning();

	}

	public static void chargeNewCreditCard_StoreOnFileClassic() throws InterruptedException, IOException {

		try {
			Thread.sleep(5000);
			if (Page_NewMember.btn_ChargeNewCreditCard_StoreOnFile().isDisplayed()) {
				Thread.sleep(2000);
				Page_NewMember.chargeNewCreditCard_StoreOnFile();
			}
		} catch (Exception e) {
			System.out.println("Payment Page not Displayed");
			ResultsLog.ReportInfo(driver, "Payment Page not Displayed");
		}

		try {
			if (invalidAmountForPayment().isDisplayed()) {
				Thread.sleep(5000);
				clickOnButton(cancelForPayment(), "Cancel");
			}
		} catch (Exception e) {
			System.out.println("Amount not displyed in Payment information");
		}

	}

	public static void chargeNewCreditCard_StoreOnFileLightning() throws InterruptedException, IOException {

		for (int i = 0; i < 10; i++) {
			try {
				driver.switchTo().defaultContent();
				driver.navigate().refresh();
				driver.switchTo()
						.frame(driver.findElement(By.xpath("(//iframe[@title='accessibility title'])[" + i + "]")));
				Thread.sleep(5000);
				if (Page_NewMember.btn_ChargeNewCreditCard_StoreOnFile().isDisplayed()) {
					Thread.sleep(2000);
					Page_NewMember.chargeNewCreditCard_StoreOnFile();
					break;
				}
			} catch (Exception e) {
				System.out.println("Payment Page Store on Card frame found");
			}

		}

		Thread.sleep(5000);
		try {
			if (invalidAmountForPayment().isDisplayed()) {
				Thread.sleep(5000);
				clickOnButton(cancelForPayment(), "Cancel");
			}
		} catch (Exception e) {
			System.out.println("Amount not displyed in Payment information");
		}

		driver.switchTo().defaultContent();

	}

}