package com.MGS.CommonPages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.MGS.PagesData.Member_SignUpPagedata;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;

public class Page_NewMember extends BasePages {
	static Member_SignUpPagedata data = new Member_SignUpPagedata();

	public Page_NewMember() {

	}

	public Page_NewMember(int frameid) {

		try {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			frameSwitch(frameid);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// Objects from Application

	// Heading of the Page

	public WebElement PageTitleObject() {
		return driver.findElement(By.xpath("//*[@class='pageType noSecondHeader']"));
	}

	// Wine Club Information
	public WebElement dpd_DurationOfMemberShip() {

		return driver.findElement(By.xpath(
				"//*[text()='Duration of Membership']/parent::th//following-sibling::td[1]/child::div/child::select"));
	}
	
	public WebElement dpd_DurationOfMemberShipComplimentary() {

		return driver.findElement(By.xpath(
				"//*[text()='Duration of Membership']/parent::th//following-sibling::td[1]/child::div/child::select"));
	}

	public WebElement readTXT_ClubType() {

		return driver.findElement(By.id("page:form:pb_member:pbs_wcInfoCompliment:clubType"));
	}

	public WebElement txt_CardNumber() throws InterruptedException {
		return driver.findElement(By.xpath(
				"//*[text()='Card Number']/parent::th//following-sibling::td/child::div/child::input[@type='text']"));
	}

	public WebElement txt_SignUpLocation() {
		return driver.findElement(By.xpath(
				"//*[text()='Sign Up Location']/parent::th//following-sibling::td/child::div/child::span/child::input"));
	}

	public WebElement txt_FirstName() {
		return driver.findElement(By.xpath(
				"//*[text()='First Name']/parent::th//following-sibling::td/child::div/child::input[@type='text']"));
	}

	public WebElement readTXT_MembershipType() {
		return driver.findElement(By.xpath("//*[text()='Membership Type']/following-sibling::td/child::span"));
	}

	public WebElement readTXT_CostofMemberShip() {
		return driver.findElement(By.xpath("//*[text()='Cost of Membership']/following-sibling::td/child::span"));
	}

	public WebElement txt_MiddleName() {
		return driver.findElement(
				By.xpath("//*[text()='Middle Name']/parent::th//following-sibling::td/child::input[@type='text']"));
	}

	public WebElement txt_LastName() {
		return driver.findElement(By.xpath(
				"//*[text()='Last Name']/parent::th//following-sibling::td/child::div/child::input[@type='text']"));
	}

	public WebElement dpd_Delivery() {
		return driver.findElement(
				By.xpath("//*[text()='Delivery']/parent::th//following-sibling::td[1]/child::div/child::select"));

	}

	public WebElement dpd_ChargeTiming() {
		return driver.findElement(
				By.xpath("//*[text()='Charge Timing']/parent::th//following-sibling::td[1]/child::div/child::select"));
	}

	public WebElement dpd_clubType() {
		return driver.findElement(By.xpath(
				"//*[@id='page:form:pb_member:pbs_cost:clubType'][@name='page:form:pb_member:pbs_cost:clubType']"));
	}

	public WebElement dpd_NOofBottles() {
		return driver.findElement(
				By.xpath("//*[text()='# of Bottles']/parent::th//following-sibling::td[1]/child::div/child::select"));
	}
	
	public WebElement dpd_ComplimentaryNOofBottles() {
		return driver.findElement(
				By.xpath("//*[text()='# of Bottles']/parent::th//following-sibling::td[1]/child::select"));
	}

	// Contact Information Section

	public static WebElement txt_Email() {
		return driver.findElement(
				By.xpath("//*[text()='Email']/parent::th//following-sibling::td/child::input[@type='text']"));
	}

	public static WebElement dpd_Gender() {
		return driver.findElement(
				By.xpath("//*[text()='Gender']/parent::th//following-sibling::td[1]/child::div/child::select"));
	}

	public static WebElement txt_Birthdate() {
		return driver.findElement(
				By.xpath("//*[text()='Birthdate']/parent::th//following-sibling::td/child::span/input[@type='text']"));
	}

	public static WebElement txt_Phone() {
		return driver.findElement(
				By.xpath("//*[text()='Phone']/parent::th//following-sibling::td/child::input[@type='text']"));
	}

	// Address Information Section

	public static WebElement txt_Street() {
		return driver
				.findElement(By.xpath("//*[contains(@id,'homeSt')][@type='text']"));
	}

	public static WebElement txt_City() {
		return driver.findElement(
				By.xpath("//*[contains(@id,'homeCity')][@type='text']"));
	}

	public static WebElement dpd_State() {
		return driver.findElement(
				By.xpath("//select[contains(@id,'homeState')]"));
	}

	public static WebElement txt_Zipcode() {
		return driver.findElement(By.xpath(
				"//*[contains(@id,'homeZip')][@type='text']"));
	}

	// Shipping Address Information Section
	public static WebElement txt_ShipStreet() {

		return driver.findElement(By.xpath("//*[contains(@id,'ShipSt')][@type='text']"));
	}

	public static WebElement txt_ShipCity() {

		return driver.findElement(
				By.xpath("//*[contains(@id,'ShipCity')][@type='text']"));
	}

	public static WebElement dpd_ShipState() {

		return driver.findElement(By.xpath("//select[contains(@id,'ShipState')]"));
	}

	public static WebElement txt_SHipZipcode() {

		return driver.findElement(
				By.xpath("//*[contains(@id,'ShipZip')][@type='text']"));
	}

	public static WebElement lnk_CopyHomeAddresstoShipingAddress() {

		return driver.findElement(By.xpath("//*[text()='Copy Home Address to Shipping Address']"));
	}

	// Submit Section Objects

	public static WebElement btn_Cancel() {

		return driver.findElement(By.xpath("//*[@type='submit'][@value='Cancel']"));
	}

	public static WebElement btn_VerifyAddressWithShipCompliant() {

		return driver.findElement(By.xpath("//*[@type='submit'][@value='Verify Address with ShipCompliant']"));
	}

	public static WebElement btn_ProceedToPaymentDetails() {

		return driver.findElement(By.xpath("//*[@type='submit'][@value='Proceed to Payment Details']"));
	}
	public static WebElement btn_ChargeNewCreditCard_StoreOnFile() {

		return driver.findElement(By.xpath("//*[@id='store_new_card']"));
			}
	public static WebElement btn_CHCSave() {

		return driver.findElement(
				By.xpath("//*[@id='page:form:pb_member:j_id31:saveOth'][@name='page:form:pb_member:j_id31:saveOth']")); // Shoulud
	} // change
		// this
		// object

	// Each Object Performance Method

	public void EnterCardNumber(int row) throws IOException, InterruptedException, BiffException {
		String Cardnumber = cardnumber();
		enterText(txt_CardNumber(), "Card Number", Cardnumber);
		data.setData("Card Number", row, Cardnumber);
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

	public void SelectClubType(int row) throws IOException {

		selectByText(dpd_clubType(), "Club Type", data.Getdata("Club Type", row));
	}

	public void SelectNoOfBottles(int row) throws IOException, InterruptedException {

		Thread.sleep(1000);
		try {
			selectByTextwithoutReport(dpd_NOofBottles(), "# of Bottles", data.Getdata("# of Bottles", row));
		} catch (Exception e) {
			selectByText(dpd_NOofBottles(), "# of Bottles", data.Getdata("# of Bottles", row));
		}
	}
	
	public void SelectNoOfBottlescomplimentary(int row) throws IOException, InterruptedException {

		Thread.sleep(1000);
		try {
			selectByTextwithoutReport(dpd_ComplimentaryNOofBottles(), "# of Bottles", data.Getdata("# of Bottles", row));
		} catch (Exception e) {
			selectByText(dpd_ComplimentaryNOofBottles(), "# of Bottles", data.Getdata("# of Bottles", row));
		}
	}

	public void ReadOnlyCostofMembership(int row) throws IOException, InterruptedException {
		Thread.sleep(1000);
		verifyTextEqual(readTXT_CostofMemberShip(), formatAmountText(data.Getdata("Cost of Membership", row)),
				"Cost of MemberShip");
	}

	public void ReadOnlyMembershipType(int row) throws IOException {
		try {
			verifyTextEqualWithoutCatchLog(readTXT_MembershipType(), data.Getdata("Membership Type", row),
					"MemberShip Type");
		} catch (Exception e) {
			verifyTextEqual(readTXT_MembershipType(), data.Getdata("Membership Type", row), "MemberShip Type");
		}

	}
	// Contact Information entry methods

	public static void EnterEmail(int row) throws IOException {

		enterText(txt_Email(), "Email", data.Getdata("Email", row));
	}

	public static void SelectGender(int row) throws IOException {

		selectByText(dpd_Gender(), "Gender", data.Getdata("Gender", row));
	}

	public static void EnterBirthdate(int row) throws IOException {

		enterText(txt_Birthdate(), "Birthdate", data.Getdata("Birthdate", row));
	}

	public static void EnterPhone(int row) throws IOException {

		enterText(txt_Phone(), "Phone", data.Getdata("Phone", row));
	}

	// Address entry methods

	public static void EnterStreet(int row) throws IOException {

		enterText(txt_Street(), "Home Street", data.Getdata("Home Street", row));
	}

	public static void EnterCity(int row) throws IOException {

		enterText(txt_City(), "Home City", data.Getdata("Home City", row));
	}

	public static void SelectState(int row) throws IOException {

		selectByText(dpd_State(), "Home State/Province", data.Getdata("Home State/Province", row));
	}

	public static void EnterZipcode(int row) throws IOException {

		enterText(txt_Zipcode(), "Home Zip/Postal Code", data.Getdata("Home Zip/Postal Code", row));
	}

	// Shipping Address Entry

	public static void EnterShipStreet(int row) throws IOException {

		enterText(txt_ShipStreet(), "Shipping Street", data.Getdata("Shipping Street", row));
	}

	public static void EnterShipCity(int row) throws IOException {

		enterText(txt_ShipCity(), "Shipping City", data.Getdata("Shipping City", row));
	}

	public static void SelectShipState(int row) throws IOException {

		selectByText(dpd_ShipState(), "Shipping State/Province", data.Getdata("Shipping State/Province", row));
	}

	public static void EnterShipZipcode(int row) throws IOException {

		enterText(txt_SHipZipcode(), "Shipping Zip/Postal Code", data.Getdata("Shipping Zip/Postal Code", row));
	}

	public static void ClickCopyHomeAddresstoShipingAddress(String LinkName) throws IOException {

		clickOnLink(lnk_CopyHomeAddresstoShipingAddress(), LinkName);
	}

//	Submit Section Click Methods
	public static void chargeNewCreditCard_StoreOnFile() throws IOException {

		clickOnButton(btn_ChargeNewCreditCard_StoreOnFile(), "Charge New Credit Card_Store on File");
	}

	public static void ClickProceedToPaymentDetails() throws IOException {

		clickOnButton(btn_ProceedToPaymentDetails(), "Proceed To Payment Details");
	}

	public static void ClickVerifyAddressWithShipComplaint() throws IOException {

		clickOnButton(btn_VerifyAddressWithShipCompliant(), "Verify Address With Ship Complaint");

	}

	public static void ClickSave() throws IOException {

		clickOnButton(btn_CHCSave(), "Save");
	}

	public static void ClickCancel() throws IOException {

		clickOnLink(btn_Cancel(), "Cancel");
	}

// Shipping Address logic Method

	public static void ClickCopyAndVerifyAddressWithShip(int row) throws IOException {

		if (data.Getdata("Delivery", row).trim().equalsIgnoreCase("Delivery")) {
			int ShipingStreet = data.Getdata("Shipping Street", row).trim().length();
			int ShipingCity = data.Getdata("Shipping City", row).trim().length();
			int ShipingState = data.Getdata("Shipping State/Province", row).trim().length();
			int ShipingZip = data.Getdata("Shipping Zip/Postal Code", row).trim().length();
			if (ShipingStreet > 2 && ShipingCity > 2 && ShipingState > 2 && ShipingZip > 2) {

				ClickVerifyAddressWithShipComplaint();
			}

			else {
				ClickCopyHomeAddresstoShipingAddress(
						"Copy Home Address to Shipping Address Link, When atleast one field from shipping address is empty");
				ClickVerifyAddressWithShipComplaint();

			}

		}

		else {

			ResultsLog.ReportDoneEvent(
					"Delivery Type is not Equal to Delivery, So not clicking on (Verify Address With Ship Complaint)");
		}
	}

	public void SelectDurationofMemberSHip(int row) throws IOException, InterruptedException {

		Thread.sleep(1000);
		try {
			selectByTextwithoutReport(dpd_DurationOfMemberShip(), "Duration of Membership",
					data.Getdata("Duration of Membership", row));
		} catch (Exception e) {
			selectByText(dpd_DurationOfMemberShip(), "Duration of Membership",
					data.Getdata("Duration of Membership", row));
		}
	}
	
	public void SelectDurationofMemberSHipComplimentary(int row) throws IOException, InterruptedException {

		Thread.sleep(1000);
		try {
			selectByTextwithoutReport(dpd_DurationOfMemberShipComplimentary(), "Duration of Membership",
					data.Getdata("Duration of Membership", row));
		} catch (Exception e) {
			selectByText(dpd_DurationOfMemberShipComplimentary(), "Duration of Membership",
					data.Getdata("Duration of Membership", row));
		}
	}

	public void ReadOnlyClubType(int row) throws IOException {

		verifyTextEqual(readTXT_ClubType(), data.Getdata("Club Type", row), "Club Type");
	}

	// Actual functional Method
	public void EnterMonthlyMemberInformation(int row) throws IOException, InterruptedException, BiffException {

		// verifyCorrectPageHeading(PageTitleObject(), ExpectedPageHeading);
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
		EnterEmail(row);
		SelectGender(row);
		EnterBirthdate(row);
		EnterPhone(row);
		EnterStreet(row);
		EnterCity(row);
		SelectState(row);
		EnterZipcode(row);
		EnterShipStreet(row);
		EnterShipCity(row);
		SelectShipState(row);
		EnterShipZipcode(row);
		ClickCopyAndVerifyAddressWithShip(row);
		ClickProceedToPaymentDetails();

	}

// Complimentary Entry

	public void EnterComplimentaryInformation(int row) throws IOException, InterruptedException, BiffException {
		// verifyCorrectPageHeading(PageTitleObject(), ExpectedPageHeading);

		EnterCardNumber(row);
		EnterSignUpLocation(row);
		EnterFirstName(row);
		EnterMiddleName(row);
		EnterLastName(row);
		SelectDelivery(row);
		SelectNoOfBottlescomplimentary(row);
		SelectDurationofMemberSHipComplimentary(row);
		ReadOnlyMembershipType(row);
		ReadOnlyClubType(row);
		EnterEmail(row);
		SelectGender(row);
		EnterBirthdate(row);
		EnterPhone(row);
		EnterStreet(row);
		EnterCity(row);
		SelectState(row);
		EnterZipcode(row);
		EnterShipStreet(row);
		EnterShipCity(row);
		SelectShipState(row);
		EnterShipZipcode(row);
		ClickCopyAndVerifyAddressWithShip(row);
		ClickSave();

	}

// Copers Hawk Cares Entry	

	public WebElement readTXT_CHCDurationofMembership() {

		return driver.findElement(By.id("page:form:pb_member:pbs_wcInfoCHCare:j_id62"));
	}

	public WebElement readTXT_CHCDelivery() {

		return driver.findElement(By.id("page:form:pb_member:pbs_wcInfoCHCare:j_id59"));
	}

	public WebElement readTXT_CHCNoOfBottles() {

		return driver.findElement(By.id("page:form:pb_member:pbs_wcInfoCHCare:j_id61"));
	}

	public void ReadOnlyMemberShipType(int row) throws IOException {

		verifyTextEqual(readTXT_MembershipType(), data.Getdata("Membership Type", row), "Membership Type");
	}

	public void ReadOnlyDelivery(int row) throws IOException {

		verifyTextEqual(readTXT_CHCDelivery(), data.Getdata("Delivery", row), "Delivery");
	}

	public void ReadOnlyNoOfBottles(int row) throws IOException {

		verifyTextEqual(readTXT_CHCNoOfBottles(), data.Getdata("# of Bottles", row), "# of Bottles");
	}

	public void ReadOnlyDurationofMembership(int row) throws IOException {

		verifyTextEqual(readTXT_CHCDurationofMembership(), data.Getdata("Duration of Membership", row),
				"Duration of Membership");
	}

	public void EnterCoopersHawkCareInformation(int row) throws IOException, InterruptedException, BiffException {

		// verifyCorrectPageHeading(PageTitleObject(), ExpectedPageHeading);

		EnterCardNumber(row);
		EnterSignUpLocation(row);
		ReadOnlyMemberShipType(row);
		ReadOnlyDelivery(row);
		ReadOnlyClubType(row);
		ReadOnlyNoOfBottles(row);
		ReadOnlyDurationofMembership(row);
		EnterStreet(row);
		EnterCity(row);
		SelectState(row);
		EnterZipcode(row);
		ClickSave();

	}

// Founder Entry	
	public void EnterFounderInformation(int row) throws IOException, InterruptedException, BiffException {
		EnterCardNumber(row);
		EnterSignUpLocation(row);
		EnterFirstName(row);
		EnterMiddleName(row);
		EnterLastName(row);
		SelectDelivery(row);
		ReadOnlyMembershipType(row);
		ReadOnlyNoOfBottles(row);
		ReadOnlyClubType(row);
		EnterEmail(row);
		SelectGender(row);
		EnterBirthdate(row);
		EnterPhone(row);
		EnterStreet(row);
		EnterCity(row);
		SelectState(row);
		EnterZipcode(row);
		EnterShipStreet(row);
		EnterShipCity(row);
		SelectShipState(row);
		EnterShipZipcode(row);
		ClickCopyAndVerifyAddressWithShip(row);
		ClickSave();

	}

// Gift Member Entry

	public WebElement dpd_DurationofMembership() {

		return driver.findElement(By.xpath(
				"//*[@id='page:form:pb_member:pbs_costGift:j_id99'][@name='page:form:pb_member:pbs_costGift:j_id99']"));
	}

	public void SelectDurationOfMembership(int row) throws IOException {

		try {
			selectByTextwithoutReport(dpd_DurationofMembership(), "Duration of Membership",
					data.Getdata("Duration of Membership", row));
		} catch (Exception e) {
			selectByText(dpd_DurationofMembership(), "Duration of Membership",
					data.Getdata("Duration of Membership", row));
		}

	}

	public void EnterGiftMemberInformation(int row) throws IOException, InterruptedException, BiffException {

		// verifyCorrectPageHeading(PageTitleObject(), ExpectedPageHeading);

		EnterCardNumber(row);
		EnterSignUpLocation(row);
		SelectDelivery(row);
		SelectClubType(row);
		SelectNoOfBottles(row);
		SelectDurationOfMembership(row);
		ReadOnlyCostofMembership(row);
		ReadOnlyMembershipType(row);
		EnterStreet(row);
		EnterCity(row);
		SelectState(row);
		EnterZipcode(row);
		EnterShipStreet(row);
		EnterShipCity(row);
		SelectShipState(row);
		EnterShipZipcode(row);
		ClickCopyAndVerifyAddressWithShip(row);
		ClickProceedToPaymentDetails();

	}

// Promotion Entry

	public WebElement dpd_Promotion() {

		return driver.findElement(By.xpath(
				"//*[@id='page:form:pb_member:pbs_wcInfoPromo:j_id72'][@name='page:form:pb_member:pbs_wcInfoPromo:j_id72']"));
	}

	public void SelectDurationofMembership(int row) throws IOException {

		selectByText(dpd_DurationofMembership(), "Duration of Membership", data.Getdata("Duration of Membership", row));
	}

	public void SelectPromotion(int row) throws IOException {

		selectByText(dpd_Promotion(), "Promotion", data.Getdata("Promotion", row));
	}

	public void EnterPromotionInformation(int row) throws IOException, InterruptedException, BiffException {

		// verifyCorrectPageHeading(PageTitleObject(), ExpectedPageHeading);

		EnterCardNumber(row);
		EnterSignUpLocation(row);
		ReadOnlyMembershipType(row);
		ReadOnlyDelivery(row);
		SelectClubType(row);
		SelectNoOfBottles(row);
		SelectDurationofMembership(row);
		SelectPromotion(row);
		EnterStreet(row);
		EnterCity(row);
		SelectState(row);
		EnterZipcode(row);
		ClickSave();

	}

}
