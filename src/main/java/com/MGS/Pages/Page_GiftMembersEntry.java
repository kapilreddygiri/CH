package com.MGS.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.MGS.CommonPages.Page_NewMember;
import com.MGS.PagesData.Member_SignUpPagedata;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;

public class Page_GiftMembersEntry extends BasePages {

	static Member_SignUpPagedata data = new Member_SignUpPagedata();

	String ExpectedPageHeading = "New Member";

	public Page_GiftMembersEntry() {

	}

	public Page_GiftMembersEntry(int frameid) {

		try {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			frameSwitch(frameid);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Heading of the Page
	public WebElement PageTitleObject() {

		return driver.findElement(By.xpath("//*[@class='pageType noSecondHeader']"));
	}

	// Objects from Application
	// Wine Club Information

	public WebElement txt_GiftCardNumber() {

		return driver.findElement(
				By.xpath("(//*[text()='Card Number']/parent::th/following-sibling::td/child::div/child::input)[1]"));
	}

	public WebElement txt_GiftSignUpLocation() {

		return driver.findElement(By.xpath(
				"//*[text()='Sign Up Location']/parent::th/following-sibling::td/child::div/child::span/child::input"));
	}

	public WebElement readTXT_GiftMembershipType() {

		return driver.findElement(By.xpath("//*[text()='Membership Type']/following-sibling::td/child::span"));
	}

	public WebElement readTXT_GiftCostofMemberShip() {

		return driver.findElement(By.xpath("//*[text()='Cost of Membership']/following-sibling::td/child::span"));
	}

	public WebElement dpd_GiftDelivery() {

		return driver.findElement(
				By.xpath("(//*[text()='Delivery']/parent::th/following-sibling::td/child::div/child::select)[1]"));
	}

	public WebElement dpd_GiftDurationofMembership() {

		return driver.findElement(
				By.xpath("(//*[text()='# of Bottles']/parent::th/following-sibling::td/child::div/child::select)[2]"));
	}

	public WebElement dpd_GiftclubType() {

		return driver.findElement(
				By.xpath("(//*[text()='Delivery']/parent::th/following-sibling::td/child::div/child::select)[2]"));
	}

	public WebElement dpd_GiftNOofBottles() {

		return driver.findElement(
				By.xpath("(//*[text()='# of Bottles']/parent::th/following-sibling::td/child::div/child::select)[1]"));
	}

	// Address Information Section

	public static WebElement txt_Street() {
		return driver.findElement(By.xpath("//*[contains(@id,'homeSt')][@type='text']"));
	}

	public static WebElement txt_City() {
		return driver.findElement(By.xpath("//*[contains(@id,'homeCity')][@type='text']"));
	}

	public static WebElement dpd_State() {
		return driver.findElement(By.xpath("//select[contains(@id,'homeState')]"));
	}

	public static WebElement txt_Zipcode() {
		return driver.findElement(By.xpath("//*[contains(@id,'homeZip')][@type='text']"));
	}

	public static void ClickProceedToPaymentDetails() throws IOException {

		clickOnButton(btn_ProceedToPaymentDetails(), "Proceed To Payment Details");
	}

	public static void ClickVerifyAddressWithShipComplaint() throws IOException {

		clickOnButton(btn_VerifyAddressWithShipCompliant(), "Verify Address With Ship Complaint");

	}

	// Shipping Address Information Section
	public static WebElement txt_ShipStreet() {

		return driver.findElement(By.xpath("//*[contains(@id,'ShipSt')][@type='text']"));
	}

	public static WebElement txt_ShipCity() {

		return driver.findElement(By.xpath("//*[contains(@id,'ShipCity')][@type='text']"));
	}

	public static WebElement dpd_ShipState() {

		return driver.findElement(By.xpath("//select[contains(@id,'ShipState')]"));
	}

	public static WebElement txt_SHipZipcode() {

		return driver.findElement(By.xpath("//*[contains(@id,'ShipZip')][@type='text']"));
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

	// Each Object Performance Method

	public void EnterGiftCardNumber(int row) throws IOException, BiffException {
		enterText(txt_GiftCardNumber(), "Card Number", cardnumber());
		data.setData("Card Number", row, EnteredCardNumber);
		data.setData("Card Generated Date", row, getCurrentDateStampWithYYYYMMDD());
	}

	public void EnterGiftSignUpLocation(int row) throws IOException {

		enterText(txt_GiftSignUpLocation(), "Sign Up Location", data.Getdata("Sign Up Location", row));
	}

	public void SelectGiftDelivery(int row) throws IOException {

		selectByText(dpd_GiftDelivery(), "Delivery", data.Getdata("Delivery", row));
	}

	public void SelectGiftClubType(int row) throws IOException {

		selectByValue(dpd_GiftclubType(), "Club Type", data.Getdata("Club Type", row));
	}

	public void SelectGiftNoOfBottles(int row) throws IOException, InterruptedException {

		Thread.sleep(1000);
		try {
			selectByTextwithoutReport(dpd_GiftNOofBottles(), "# of Bottles", data.Getdata("# of Bottles", row));
		} catch (Exception e) {
			selectByText(dpd_GiftNOofBottles(), "# of Bottles", data.Getdata("# of Bottles", row));
		}
	}

	public void SelectGiftDurationOfMembership(int row) throws IOException {

		try {
			selectByTextwithoutReport(dpd_GiftDurationofMembership(), "Duration of Membership",
					data.Getdata("Duration of Membership", row));
		} catch (Exception e) {
			selectByText(dpd_GiftDurationofMembership(), "Duration of Membership",
					data.Getdata("Duration of Membership", row));
		}

	}

	public void ReadOnlyGiftCostofMembership(int row) throws IOException, InterruptedException {
		Thread.sleep(1000);
		try {
			verifyTextEqualWithOutLog(readTXT_GiftCostofMemberShip(),
					formatAmountText(data.Getdata("Cost of Membership", row)), "Cost of MemberShip");
		} catch (Exception e) {

			verifyTextEqual(readTXT_GiftCostofMemberShip(), formatAmountText(data.Getdata("Cost of Membership", row)),
					"Cost of MemberShip");

		}
	}

	public void ReadOnlyGiftMembershipType(int row) throws IOException {
		verifyTextEqual(readTXT_GiftMembershipType(), data.Getdata("Membership Type", row), "MemberShip Type");
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

	// Actual functional Method
public void EnterClassicGiftMemberInformation(int row) throws IOException, InterruptedException, BiffException {
		
			try {
					EnterGiftCardNumber(row);
					EnterGiftSignUpLocation(row);
					SelectGiftDelivery(row);
					SelectGiftClubType(row);
					SelectGiftNoOfBottles(row);
					SelectGiftDurationOfMembership(row);
					ReadOnlyGiftCostofMembership(row);
					ReadOnlyGiftMembershipType(row);
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
									
			} catch (Exception e) {
				System.out.println("Page Not Displayed");
				ResultsLog.ReportInfo(driver, "Gift Page Not Displayed");
			}
		 
		
		
		Thread.sleep(5000);
		Page_MonthlyMembersEntry.chargeNewCreditCard_StoreOnFileClassic();

	}



	public void EnterLightningGiftMemberInformation(int row) throws IOException, InterruptedException, BiffException {
		
		for(int i=0;i<10;i++) {
			try {
				
				driver.switchTo().defaultContent();
				driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@title='accessibility title'])[" + i + "]")));
				if(txt_GiftCardNumber().isDisplayed()) {
					EnterGiftCardNumber(row);
					EnterGiftSignUpLocation(row);
					SelectGiftDelivery(row);
					SelectGiftClubType(row);
					SelectGiftNoOfBottles(row);
					SelectGiftDurationOfMembership(row);
					ReadOnlyGiftCostofMembership(row);
					ReadOnlyGiftMembershipType(row);
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
					driver.switchTo().defaultContent();
					break;
				} else {
					System.out.println("Required frame not found");
				}
				
			} catch (Exception e) {
				System.out.println("No frame found");
			}
		}
		
		
		Thread.sleep(5000);
		Page_MonthlyMembersEntry.chargeNewCreditCard_StoreOnFileLightning();

	}

}
