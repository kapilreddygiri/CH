package com.MGS.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.MGS.CommonPages.Page_NewMember;
import com.MGS.PagesData.Member_SignUpPagedata;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;

public class Page_FounderEntry extends BasePages {

	Member_SignUpPagedata data = new Member_SignUpPagedata();
	String ExpectedPageHeading = "New Member";

	public Page_FounderEntry() {

	}

	/*
	 * public Page_FounderEntry(int frameid) {
	 * 
	 * try { driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * frameSwitch(frameid); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */
	// Heading of the Page
	public WebElement PageTitleObject() {

		return driver.findElement(By.xpath("//*[@class='pageType noSecondHeader']"));
	}

	// Objects from Application
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

	public WebElement readTXT_ClubType() {

		return driver.findElement(By.xpath("//*[text()='Club Type']/parent::tr/child::td/child::span"));
	}

	public WebElement readTXT_NoOfBottles() {

		return driver.findElement(By.xpath("(//*[text()='# of Bottles']/parent::tr/child::td/child::span)[1]"));
	}

	// Each Object Function Method

	public void EnterCardNumber(int row) throws IOException, BiffException, InterruptedException {
		String Cardnumber = cardnumber();
		enterText(txt_CardNumber(), "Card Number", Cardnumber); // Should Store this Card Number in SpreadSheet --
		data.setData("Card Number", row, Cardnumber); // Pradeep
	}

	public void EnterSignUpLocation(int row) throws IOException {

		enterText(txt_SignUpLocation(), "Sign Up Location", data.Getdata("Sign Up Location", row));
	}

	public void EnterFirstName(int row) throws IOException {

		enterText(txt_FirstName(), "First Name", data.Getdata("First Name", row));
	}

	public void EnterMiddleName(int row) throws IOException {

		enterText(txt_MiddleName(), "Middle Name", data.Getdata("Middle Name", row));
	}

	public void EnterLastName(int row) throws IOException {

		enterText(txt_LastName(), "Last Name", data.Getdata("Last Name", row));
	}

	public void SelectDelivery(int row) throws IOException {

		selectByText(dpd_Delivery(), "Delivery", data.Getdata("Delivery", row));

	}

	public void ReadOnlyMembershipType(int row) throws IOException {
		verifyTextEqual(readTXT_MembershipType(), data.Getdata("Membership Type", row), "MemberShip Type");
	}

	public void ReadOnlyNoOfBottles(int row) throws IOException {

		verifyTextEqual(readTXT_NoOfBottles(), data.Getdata("# of Bottles", row), "# of Bottles");
	}

	public void ReadOnlyClubType(int row) throws IOException {

		verifyTextEqual(readTXT_ClubType(), data.Getdata("Club Type", row), "Club Type");
	}

	// Actual functional Method
	public void EnterLightningFounderInformation(int row) throws IOException, InterruptedException, BiffException {

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
					ReadOnlyMembershipType(row);
					ReadOnlyNoOfBottles(row);
					ReadOnlyClubType(row);
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
					Page_NewMember.ClickSave();
					driver.switchTo().defaultContent();

					break;
				} else {
					System.out.println("Required frame not found");
				}

			} catch (Exception e) {
				System.out.println("No frame found");
			}
		}
	}

	public void EnterClassicFounderInformation(int row) throws IOException, InterruptedException, BiffException {

		try {
			Thread.sleep(5000);
			EnterCardNumber(row);
			EnterSignUpLocation(row);
			EnterFirstName(row);
			EnterMiddleName(row);
			EnterLastName(row);
			SelectDelivery(row);
			ReadOnlyMembershipType(row);
			ReadOnlyNoOfBottles(row);
			ReadOnlyClubType(row);
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
			Page_NewMember.ClickSave();
 
		} catch (Exception e) {
			System.out.println("Founder Page not Found");
			ResultsLog.ReportInfo(driver, "Founder Page not Found");
		}

	}
}
