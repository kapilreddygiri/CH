package com.MGS.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.MGS.CommonPages.Page_NewMember;
import com.MGS.PagesData.Member_SignUpPagedata;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;

public class Page_CoopersHawkCaresEntry extends BasePages {

	Member_SignUpPagedata data = new Member_SignUpPagedata();
	String ExpectedPageHeading = "New Member";

	public Page_CoopersHawkCaresEntry() {

	}

	/*
	 * public Page_CoopersHawkCaresEntry(int frameid) {
	 * 
	 * try { driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * frameSwitch(frameid); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */

	public WebElement PageTitleObject() {

		return driver.findElement(By.xpath("//*[@class='pageType noSecondHeader']"));
	}

	// Objects from Application
	// Wine Club Information

	public WebElement txt_CardNumber() {

		return driver.findElement(By.xpath(
				"//*[text()='Card Number']/parent::th//following-sibling::td/child::div/child::input[@type='text']"));
	}

	public WebElement txt_SignUpLocation() {

		return driver.findElement(By.xpath(
				"//*[text()='Sign Up Location']/parent::th//following-sibling::td/child::div/child::span/child::input"));
	}

	public WebElement readTXT_MembershipType() {

		return driver.findElement(By.xpath("//*[text()='Membership Type']/parent::tr/child::td/child::span"));
	}

	public WebElement readTXT_CHCDelivery() {

		return driver.findElement(By.xpath("(//*[text()='Delivery']/parent::tr/child::td/child::span)[1]"));
	}

	public WebElement readTXT_CHCClubType() {

		return driver.findElement(By.xpath("(//*[text()='Delivery']/parent::tr/child::td/child::span)[2]"));
	}

	public WebElement readTXT_CHCNoOfBottles() {

		return driver.findElement(By.xpath("(//*[text()='# of Bottles']/parent::tr/child::td/child::span)[1]"));
	}

	public WebElement readTXT_CHCDurationofMembership() {

		return driver.findElement(By.xpath("(//*[text()='# of Bottles']/parent::tr/child::td/child::span)[2]"));
	}

// Address Information  Section	

	public WebElement txt_CHCStreet() {

		return driver.findElement(By.xpath(
				"//*[@id='page:form:pb_member:pbs_addrSection:homeSt'][@name='page:form:pb_member:pbs_addrSection:homeSt']"));
	}

	public WebElement txt_CHCCity() {

		return driver.findElement(By.xpath(
				"//*[@id='page:form:pb_member:pbs_addrSection:homeCity'][@name='page:form:pb_member:pbs_addrSection:homeCity']"));
	}

	public WebElement dpd_CHCState() {

		return driver.findElement(By.xpath(
				"//*[@id='page:form:pb_member:pbs_addrSection:homeState'][@name='page:form:pb_member:pbs_addrSection:homeState']"));
	}

	public WebElement txt_CHCZipcode() {

		return driver.findElement(By.xpath(
				"//*[@id='page:form:pb_member:pbs_addrSection:homeZip'][@name='page:form:pb_member:pbs_addrSection:homeZip']"));
	}

// Each Object Performance Method

	public void EnterCardNumber(int row) throws IOException, BiffException {
		String Cardnumber = cardnumber();
		enterText(txt_CardNumber(), "Card Number", Cardnumber);
		data.setData("Card Number", row, Cardnumber);
	}

	public void EnterSignUpLocation(int row) throws IOException {

		enterText(txt_SignUpLocation(), "Sign Up Location", data.Getdata("Sign Up Location", row));
	}

	public void ReadOnlyMemberShipType(int row) throws IOException {

		verifyTextEqual(readTXT_MembershipType(), data.Getdata("Membership Type", row), "Membership Type");
	}

	public void ReadOnlyDelivery(int row) throws IOException {

		verifyTextEqual(readTXT_CHCDelivery(), data.Getdata("Delivery", row), "Delivery");
	}

	public void ReadOnlyClubType(int row) throws IOException {

		verifyTextEqual(readTXT_CHCClubType(), data.Getdata("Club Type", row), "Club Type");
	}

	public void ReadOnlyNoOfBottles(int row) throws IOException {

		verifyTextEqual(readTXT_CHCNoOfBottles(), data.Getdata("# of Bottles", row), "# of Bottles");
	}

	public void ReadOnlyDurationofMembership(int row) throws IOException {

		verifyTextEqual(readTXT_CHCDurationofMembership(), data.Getdata("Duration of Membership", row),
				"Duration of Membership");
	}

	// Actual functional Method

	public void EnterClassicCoopersHawkCareInformation(int row)
			throws IOException, InterruptedException, BiffException {

		// verifyCorrectPageHeading(PageTitleObject(), ExpectedPageHeading);

		try {
			EnterCardNumber(row);
			EnterSignUpLocation(row);
			ReadOnlyMemberShipType(row);
			ReadOnlyDelivery(row);
			ReadOnlyClubType(row);
			ReadOnlyNoOfBottles(row);
			ReadOnlyDurationofMembership(row);
			Page_NewMember.EnterStreet(row);
			Page_NewMember.EnterCity(row);
			Page_NewMember.SelectState(row);
			Page_NewMember.EnterZipcode(row);
			Page_NewMember.ClickSave();
			 
		} catch (Exception e) {
			System.out.println("CH Care Page is not Displayed");
			ResultsLog.ReportInfo(driver, "CH Care Page is not Displayed");
		}

	}

	public void EnterLightningCoopersHawkCareInformation(int row) throws IOException, InterruptedException, BiffException {

		// verifyCorrectPageHeading(PageTitleObject(), ExpectedPageHeading);

		for (int i = 0; i < 10; i++) {
			try {

				driver.switchTo().defaultContent();
				driver.switchTo()
						.frame(driver.findElement(By.xpath("(//iframe[@title='accessibility title'])[" + i + "]")));
				if (txt_CardNumber().isDisplayed()) {
					EnterCardNumber(row);
					EnterSignUpLocation(row);
					ReadOnlyMemberShipType(row);
					ReadOnlyDelivery(row);
					ReadOnlyClubType(row);
					ReadOnlyNoOfBottles(row);
					ReadOnlyDurationofMembership(row);
					Page_NewMember.EnterStreet(row);
					Page_NewMember.EnterCity(row);
					Page_NewMember.SelectState(row);
					Page_NewMember.EnterZipcode(row);
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

}
