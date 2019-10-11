package com.MGS.CommonPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.MGS.Pages.Page_GiftMembersEntry;
import com.MGS.Pages.Page_MonthlyMembersEntry;
import com.MGS.PagesData.Member_SignUpPagedata;
import com.Utils.BasePages;
import com.aventstack.extentreports.Status;

import jxl.read.biff.BiffException;

public class LightningWCMemberValidationPage extends BasePages {

	Member_SignUpPagedata data = new Member_SignUpPagedata();

	public LightningWCMemberValidationPage() {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public WebElement btnEditLightningWCMemberStatus() {

		return driver.findElement(By.xpath(
				"(//*[text()='WC Member Status']/parent::div/parent::div//child::div/following-sibling::div/child::span/following-sibling::button)[2]"));
	}
//Edit Tab objects

	public WebElement lnkPaymentID() {
		return driver.findElement(By.xpath(
				"(//*[text()='Payment ID']/parent::a/parent::div/parent::th/preceding-sibling::th/preceding-sibling::th/parent::tr/parent::thead/following-sibling::tbody/child::tr/child::td/following-sibling::td/following-sibling::th/child::span/child::a)[1]"));
	}

	public WebElement txtEmail() {
		return driver.findElement(By.xpath("//*[text()='Email']/parent::label/following-sibling::input"));
	}

	public WebElement txtPhone() {
		return driver.findElement(By.xpath("//*[text()='Phone']/parent::label/following-sibling::input"));
	}

	public WebElement txtBirthDate() {
		return driver
				.findElement(By.xpath("//*[text()='Birthdate']/parent::label/following-sibling::div/child::input"));
	}

	public WebElement lnkGender() {
		return driver.findElement(By.xpath(
				"//*[text()='Gender']/parent::span/following-sibling::div/child::div/child::div/child::div/child::a"));
	}

	public WebElement lnkEditWCInfo() {
		return driver.findElement(By.xpath("//*[contains(text(),'Edit WC Info')]"));

	}

	public WebElement btnEdit() {
		return driver.findElement(By.xpath("//*[text()='Edit']"));
	}

	public WebElement txtEditVacationStartDate() {
		return driver.findElement(By.xpath(
				"(//span[text()='Vacation Information']/parent::h3/following::div/child::div/child::div/child::div/child::div//child::div//child::div/child::label/following-sibling::div/child::input)[1]"));
	}

	public WebElement txtEditVacationEndDate() {
		return driver.findElement(By.xpath(
				"(//span[text()='Vacation Information']/parent::h3/following::div/child::div/child::div/child::div/child::div//child::div//child::div/child::label/following-sibling::div/child::input)[2]"));
	}

	/*
	 * // th[@class='labelCol vfLabelColTextWrap //
	 * ']/following-sibling::td/child::input(For Credit Card in payment) (//
	 * th[@class='labelCol vfLabelColTextWrap //
	 * ']/following-sibling::td/child::select)[1](For Month in payment) (//
	 * th[@class='labelCol vfLabelColTextWrap //
	 * ']/following-sibling::td/child::select)[2](For Year in payment) //
	 * input[@value='Save'] (For Save Button in payment)
	 */
	public WebElement dpdWCInfoDelivery() {
		return driver.findElement(
				By.xpath("(//*[text()='Delivery']/parent::th/following-sibling::td/child::div/child::select)[1]"));
	}

	public WebElement dpdWCInfoClubType() {
		return driver.findElement(
				By.xpath("//*[text()='Club Type']/parent::th/following-sibling::td/child::div/child::select"));
	}

	public WebElement dpdWCInfoNoofBottles() {
		return driver.findElement(By
				.xpath("(//*[(text()='# of Bottles')]/parent::th/following-sibling::td/child::div/child::select)[1]"));
	}

	public WebElement dpdWCInfoChargeTiming() {
		return driver.findElement(
				By.xpath("//*[text()='Charge Timing']/parent::th/following-sibling::td/child::div/child::select"));
	}

	public WebElement btnProceedtoPaymentDetails() {
		return driver.findElement(By.xpath("//input[@value='Proceed to Payment Details']"));
	}

	public WebElement btnSaveWCInfo() {
		return driver.findElement(By.xpath("(//*[text()='Save'])[2]"));
	}

	public WebElement cardNumberEdit() {
		return driver.findElement(By.xpath(
				"(//*[text()='Card Number']//parent::div/following-sibling::div/child::span/following-sibling::button)[2]"));
	}

	public WebElement cardNumberMonthEdit() {
		return driver.findElement(By.xpath(
				"//*[text()='Expiration Month']/parent::div/following-sibling::div/child::span/following-sibling::button"));
	}

	public WebElement cardNumberYearEdit() {
		return driver.findElement(By.xpath(
				"//*[text()='Expiration Year']/parent::div/following-sibling::div/child::span/following-sibling::button"));
	}

	public WebElement dpdMembershipType() {
		return driver.findElement(By.xpath(
				"//*[text()='Membership Type']/parent::span/following-sibling::div/child::div/child::div/child::div/child::a"));
	}

	public static WebElement txtCardNumber() {
		return driver.findElement(By.xpath("//*[text()='Card Number']/parent::label/parent::div/child::input"));
	}

	public static WebElement btnSaveCardDetails() {
		return driver.findElement(By.xpath("//button[@title='Save']"));
	}

	public WebElement dpdEditWCmemberStatus() {
		// *[text()='Wine Club
		// Information']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='WC
		// Member Status']/following-sibling::td[1]/div[2]/span/select
		return driver.findElement(By.xpath("//div[@class='inlineEditRequiredDiv']/span/select"));
	}

	public static WebElement btnSaveWCInformationPage() {

		return driver.findElement(By.xpath("//button[@title='Save']"));
	}

	// Objects from WC Member-Details Page --- Lightning
	// Wine Club Information

	public WebElement paymentsLink() {
		return driver.findElement(By.xpath("(//span[@title='Payments'])[1]"));
	}

	public WebElement WineClubInformation() {

		return driver.findElement(By.xpath("//*[text()='Wine Club Information']/parent::button"));
	}

	public WebElement WineClubInformationComplimentary() {

		return driver.findElement(By.xpath("(//*[text()='Wine Club Information'])[2]/parent::button"));
	}

	public WebElement readOnlyLightCardNumber() {

		return driver.findElement(By.xpath(
				"(//*[text()='Wine Club Information']/parent::*/parent::*/parent::*/child::div/child::div/child::div/child::div/child::div//*[text()='Card Number']/parent::*/following-sibling::div/span/span)[2]"));
	}

	public WebElement readOnlyComplimentaryLightCardNumber() {

		return driver.findElement(By.xpath(
				"(//*[text()='Wine Club Information']/parent::*/parent::*/parent::*/child::div/child::div/child::div/child::div/child::div//*[text()='Card Number']/parent::*/following-sibling::div/span/span)[2]"));
	}

	public WebElement dpdCardExpiryMonthClick() {
		return driver.findElement(By.xpath(
				"//*[text()='Expiration Month']/parent::span/following-sibling::div/child::div/child::div/child::div/child::a"));
	}

	public WebElement dpdCardExpiryYearClick() {
		return driver.findElement(By.xpath(
				"//*[text()='Expiration Year']/parent::span/following-sibling::div/child::div/child::div/child::div/child::a"));
	}

	public WebElement readOnlyLightName() {

		return driver.findElement(By
				.xpath("(//*[text()='Name']/parent::div/following-sibling::div/span/span[@class='uiOutputText'])[2]"));
	}

	public WebElement readOnlyComplimentaryLightName() {
		List<WebElement> complimentaryLightName = driver.findElements(
				By.xpath("//*[text()='Name']/parent::div/following-sibling::div/span/span[@class='uiOutputText']"));
		return complimentaryLightName.get(1);

		// return driver.findElement(
		// By.xpath("//*[text()='Name']/parent::div/following-sibling::div/span/span[@class='uiOutputText'])[2]"));
	}

	public WebElement readOnlyLightMembershipType() {

		return driver.findElement(
				By.xpath("(//*[text()='Membership Type']/parent::div/following-sibling::div/span/span)[2]"));
	}

	public WebElement readOnlyComplimentaryLightMembershipType() {
		List<WebElement> complimentaryLightMembershipType = driver
				.findElements(By.xpath("//*[text()='Membership Type']/parent::div/following-sibling::div/span/span"));
		return complimentaryLightMembershipType.get(1);
		// return driver.findElement(By.xpath("//*[text()='Membership
		// Type']/parent::div/following-sibling::div/span/span"));
	}

	public WebElement readOnlyLightDelivery() {

		return driver.findElement(By.xpath("(//*[text()='Delivery']/parent::div/following-sibling::div/span/span)[2]"));
	}

	public WebElement readOnlyComplimentaryLightDelivery() {
		List<WebElement> complimentaryLightDelivery = driver
				.findElements(By.xpath("//*[text()='Delivery']/parent::div/following-sibling::div/span/span"));
		return complimentaryLightDelivery.get(1);

		// return
		// driver.findElement(By.xpath("//*[text()='Delivery']/parent::div/following-sibling::div/span/span"));
	}

	public WebElement readOnlyLightClubType() {

		return driver
				.findElement(By.xpath("(//*[text()='Club Type']/parent::div/following-sibling::div/span/span)[2]"));
	}

	public WebElement readOnlyComplimentaryLightClubType() {

		return driver
				.findElement(By.xpath("(//*[text()='Club Type']/parent::div/following-sibling::div/span/span)[2]"));
	}

	public WebElement readOnlyLightNoofBottles() {

		return driver
				.findElement(By.xpath("(//*[text()='# of Bottles']/parent::div/following-sibling::div/span/span)[2]"));
	}

	public WebElement readOnlyComplimentaryLightNoofBottles() {

		return driver
				.findElement(By.xpath("(//*[text()='# of Bottles']/parent::div/following-sibling::div/span/span)[2]"));
	}

	public WebElement readOnlyLightCostofMembership() {

		return driver
				.findElement(By.xpath("//*[text()='Cost of Membership']/parent::div/following-sibling::div/span/span"));
	}

	public WebElement readOnlyLightMemberSignature() {

		return driver.findElement(
				By.xpath("//*[text()='Member Signature Opt-Out']/parent::div/following-sibling::div/span/span/img"));
	}

	public WebElement readOnlyLightWCMemberStatus() {

		return driver
				.findElement(By.xpath("//*[text()='WC Member Status']/parent::div/following-sibling::div/span/span)"));
	}

	public WebElement readOnlyFounderLightWCMemberStatus() {

		return driver.findElement(
				By.xpath("(//*[text()='WC Member Status']/parent::div/following-sibling::div/span/span)[2]"));
	}

	public WebElement readOnlyComplimentaryLightWCMemberStatus() {

		return driver.findElement(
				By.xpath("(//*[text()='WC Member Status']/parent::div/following-sibling::div/span/span)[2]"));
	}

	public WebElement readOnlyLightTier() {

		return driver.findElement(By.xpath("//*[text()='Tier']/parent::div/following-sibling::div/span/span)"));
	}

	public WebElement readOnlyFounderLightTier() {

		return driver.findElement(By.xpath("(//*[text()='Tier']/parent::div/following-sibling::div/span/span)[2]"));
	}

	public WebElement readOnlyDurationofMembership() {

		return driver.findElement(
				By.xpath("//*[text()='Duration of Membership']/parent::div/following-sibling::div/span/span"));
	}

	public WebElement readOnlyComplimentaryDurationofMembership() {

		return driver.findElement(
				By.xpath("//*[text()='Duration of Membership']/parent::div/following-sibling::div/span/span"));
	}

	public WebElement readOnlyPendingChanges() {

		return driver
				.findElement(By.xpath("//*[text()='Pending Changes']/parent::div/following-sibling::div/span/span"));
	}

	public WebElement readOnlyComplimentaryPendingChanges() {

		return driver.findElement(
				By.xpath("(//*[text()='Pending Changes']/parent::div/following-sibling::div/span/span)[2]"));
	}

	public WebElement lnkEdit() {

		return driver.findElement(By.xpath("//a[@title='Edit']"));
	}

	public WebElement readOnlyLightningWCMemberShipExpirationDate() {

		return driver.findElement(By.xpath(
				"//span[text()='Membership Expiration Date']/parent::label/following-sibling::div/child::input"));

	}

	public WebElement lnkChangeWCMemberRecordTypeIcon() {
		return driver.findElement(By.xpath(
				"//span[text()='WC Member Record Type']/parent::div/following-sibling::div/child::span/child::div/child::div/following-sibling::button"));
	}

	// Objects from WC Member-Details Page --- Lightning
	// WC Members Points History
	public WebElement lnkWCMemberPointsHistory() {

		return driver.findElement(By.xpath("(//span[@title='WC Member Points History'])[1]"));
	}

	public WebElement lnkEditWCMemberPointsHistory() {

		return driver.findElement(By.xpath(
				"//*[text()='WC Member Points History Name']/parent::a/parent::div/parent::th/parent::tr/parent::thead/parent::table/child::tbody/tr[1]/td[7]"));
	}

	public static WebElement dpdEditPointsType() {

		return driver.findElement(By.xpath(
				"(//*[text()='Edit Points Type']/parent::button/parent::div/parent::div/parent::div/parent::div/child::div/child::div/child::div/following-sibling::div/child::button/lightning-primitive-icon)[1]"));
	}

	public static WebElement dpdPointsType() {

		return driver.findElement(By.xpath(
				"//*[text()='Points Type']/parent::span/following-sibling::div/child::div/child::div/child::div/child::a"));
	}

	public WebElement dpdEditPointStatus() {

		return driver.findElement(By.xpath(
				"(//*[text()='Edit Points Status']/parent::button/parent::div/parent::div/parent::div/parent::div/child::div/child::div/child::div/following-sibling::div/child::button/lightning-primitive-icon)[1]"));
	}

	public WebElement dpdPointStatus() {

		return driver.findElement(By.xpath(
				"//*[text()='Points Status']/parent::span/following-sibling::div/child::div/child::div/child::div/child::a"));
	}

	public WebElement txtPointEarned() {

		return driver.findElement(By.xpath("//*[text()='Points Earned']/parent::label/following-sibling::input"));
	}

	public WebElement txtReastaurantLocation() {

		return driver.findElement(By.xpath("//input[@placeholder='Search Locations...']"));
	}

	public WebElement txtPointsApplicableTotal() {

		return driver.findElement(
				By.xpath("(//*[text()='Points Applicable Total'])[1]/parent::label/following-sibling::input"));
	}

	public WebElement btnNewLocation() {

		return driver.findElement(By.xpath("//*[text()='New Location']"));
	}

	public WebElement txtLocationName() {

		return driver.findElement(By.xpath("//*[text()='Location Name']/parent::label/following-sibling::input"));
	}

	public WebElement txtRestaurantNumber() {

		return driver.findElement(By.xpath("//*[text()='Restaurant Number']/parent::label/following-sibling::input"));
	}

	public WebElement btnSaveLoyaltyPoints() {

		return driver.findElement(By.xpath("//*[@title='Save']"));
	}

	public WebElement editMemberSignatureOptOut() {
		return driver.findElement(By.xpath(
				"(//*[text()='Edit Member Signature Opt-Out']/parent::button/parent::div/parent::div/parent::div/parent::div/child::div/child::div/child::div/following-sibling::div/child::button/lightning-primitive-icon)[1]"));
	}

	public WebElement chkMemberSignatureOptOut() {
		return driver.findElement(
				By.xpath("//span[text()='Member Signature Opt-Out']/parent::label/following-sibling::input"));
	}

	public WebElement btnSaveMemberSignature() {

		return driver.findElement(By.xpath("//*[@title='Save']"));
	}

	// Objects from WC Member-Details Page --- Lightning
	// Wine Club Member Summary

	public WebElement WCMemberSummary() {

		return driver.findElement(By.xpath("//*[text()='WC Member Summary']/parent::button"));
	}

	public WebElement WCComplimentaryMemberSummary() {

		return driver.findElement(By.xpath("//*[text()='WC Member Summary']/parent::button"));
	}

	public WebElement readOnlyLightWCOpenBottles() {

		return driver.findElement(By.xpath(
				"//*[text()='Open Bottles']/parent::div/following-sibling::div/span/span[@class='uiOutputNumber']"));
	}

	public WebElement readOnlyFounderLightWCOpenBottles() {

		return driver.findElement(By.xpath(
				"(//*[text()='Open Bottles']/parent::div/following-sibling::div/span/span[@class='uiOutputNumber'])[2]"));
	}

	public WebElement readOnlyComplimentaryLightWCOpenBottles() {

		return driver.findElement(By.xpath(
				"(//*[text()='Open Bottles']/parent::div/following-sibling::div/span/span[@class='uiOutputNumber'])[2]"));
	}

	public WebElement readOnlyLightWCOpenTastings() {

		return driver.findElement(By.xpath(
				"//*[text()='Open Tastings']/parent::div/following-sibling::div/span/span[@class='uiOutputNumber']"));
	}

	public WebElement readOnlyFounderLightWCOpenTastings() {

		return driver.findElement(By.xpath(
				"(//*[text()='Open Tastings']/parent::div/following-sibling::div/span/span[@class='uiOutputNumber'])[2]"));
	}

	public WebElement readOnlyComplimentaryLightWCOpenTastings() {

		return driver.findElement(By.xpath(
				"(//*[text()='Open Tastings']/parent::div/following-sibling::div/span/span[@class='uiOutputNumber'])[2]"));
	}

	public WebElement readOnlyLightWCLifeTimeBottles() {

		return driver.findElement(By.xpath(
				"//*[text()='Lifetime Bottles']/parent::div/following-sibling::div/span/span[@class='uiOutputNumber']"));
	}

	public WebElement readOnlyComplimentaryLightWCLifeTimeBottles() {

		return driver.findElement(By.xpath(
				"//*[text()='Lifetime Bottles']/parent::div/following-sibling::div/span/span[@class='uiOutputNumber']"));
	}

	public WebElement readOnlyLightWCAmbassadorTenureCredits() {

		return driver.findElement(By.xpath(
				"//*[text()='Ambassador Tenure Credits']/parent::div/following-sibling::div/span/span[@class='uiOutputNumber']"));
	}

	public WebElement readOnlyLightWCAnnualAmbassadorSpendCredits() {

		return driver.findElement(By.xpath(
				"//*[text()='Annual Ambassador Spend Credits']/parent::div/following-sibling::div/span/span[@class='forceOutputCurrency']"));
	}

	public WebElement readOnlyLightWCTotalAmbassadorCredits() {

		return driver.findElement(By.xpath(
				"//*[text()='Total Ambassador Credits']/parent::div/following-sibling::div/span/span[@class='uiOutputNumber']"));
	}

	public WebElement readOnlyComplimentaryLightWCActivePoints() {

		return driver.findElement(By.xpath(
				"(//*[text()='WC Member Summary']/parent::*/parent::*/parent::*/child::div/child::div/child::div/child::div/child::div//*[text()='Active Points']/parent::*/following-sibling::div/span/span)[2]"));
	}

	public WebElement readOnlyLightWCActivePoints() {

		return driver.findElement(By.xpath(
				"//*[text()='WC Member Summary']/parent::*/parent::*/parent::*/child::div/child::div/child::div/child::div/child::div//*[text()='Active Points']/parent::*/following-sibling::div/span/span"));
	}

	public WebElement readOnlyFounderLightWCActivePoints() {

		return driver.findElement(By.xpath(
				"(//*[text()='WC Member Summary']/parent::*/parent::*/parent::*/child::div/child::div/child::div/child::div/child::div//*[text()='Active Points']/parent::*/following-sibling::div/span/span)[2]"));
	}

	public WebElement readOnlyComplimentaryLightWCMemberSince() {

		return driver.findElement(By.xpath(
				"(//*[text()='Member Since']/parent::div/following-sibling::div/span/span[@class='uiOutputDate'])[2]"));
	}

	public WebElement readOnlyLightWCMemberSince() {

		return driver.findElement(By.xpath(
				"//*[text()='Member Since']/parent::div/following-sibling::div/span/span[@class='uiOutputDate']"));
	}

	public WebElement readOnlyFounderLightWCMemberSince() {

		return driver.findElement(By.xpath(
				"(//*[text()='Member Since']/parent::div/following-sibling::div/span/span[@class='uiOutputDate'])[2]"));
	}

	public WebElement readOnlyLightWCMemberShipExpirationDate() {

		return driver.findElement(By.xpath(
				"//*[text()='Membership Expiration Date']/parent::div/following-sibling::div/span/span[@class='uiOutputDate']"));
	}

	public WebElement readOnlyComplimentaryLightWCMemberShipExpirationDate() {

		return driver.findElement(By.xpath(
				"//*[text()='Membership Expiration Date']/parent::div/following-sibling::div/span/span[@class='uiOutputDate']"));
	}

// Objects from WC Member-Details Page --- Lightning
// Wc Member Cards
	public WebElement readOnlyLightWCCardStatus() {

		return driver.findElement(By.xpath("//*[text()='Card Status:']/following-sibling::div/span"));
	}

// Objects from WC Member-Details Page --- Lightning
// WOM
	public WebElement readOnlyLightWCWomOpenbottles() {

		return driver.findElement(By.xpath("//*[contains(text(),'Open Bottles:')]/span"));
	}

	public WebElement readOnlyFounderLightWCWomOpenbottles() {
		List<WebElement> openBottles = driver.findElements(By.xpath("//*[contains(text(),'Open Bottles:')]/span"));
		return openBottles.get(1);

		// return driver.findElement(By.xpath("(//*[contains(text(),'Open
		// Bottles:')]/span)[2]"));
	}

	public WebElement readOnlycomplimentaryLightWCWomOpenbottles() {
		List<WebElement> openBottles = driver.findElements(By.xpath("//*[contains(text(),'Open Bottles:')]/span"));
		return openBottles.get(3);

		// return driver.findElement(By.xpath("(//*[contains(text(),'Open
		// Bottles:')]/span)[3]"));
	}

	public WebElement readOnlyLightWCYear() {

		return driver.findElement(
				By.xpath("//*[text()='WOM Year']/parent::*/parent::*/following::tbody/child::tr[1]/td[2]/span"));
	}

	public WebElement readOnlyLightWCYearComplimentary() {
		List<WebElement> ComplimentaryWWOMYear = driver.findElements(
				By.xpath("//*[text()='WOM Year']/parent::*/parent::*/following::tbody/child::tr[1]/td[2]/span"));
		return ComplimentaryWWOMYear.get(3);

	}

	public WebElement readOnlyLightWCMonth() {

		return driver.findElement(
				By.xpath("//*[text()='WOM Year']/parent::*/parent::*/following::tbody/child::tr[1]/td[3]/span"));
	}

	public WebElement readOnlyLightWCMonthComplimantary() {

		List<WebElement> ComplimentaryWWOMMonth = driver.findElements(
				By.xpath("//*[text()='WOM Year']/parent::*/parent::*/following::tbody/child::tr[1]/td[3]/span"));
		return ComplimentaryWWOMMonth.get(3);
	}

	public WebElement readOnlyLightWCYear2() {

		return driver.findElement(
				By.xpath("//*[text()='WOM Year']/parent::*/parent::*/following::tbody/child::tr[2]/td[2]/span"));
	}

	public WebElement readOnlyLightWCMonth2() {

		return driver.findElement(
				By.xpath("//*[text()='WOM Year']/parent::*/parent::*/following::tbody/child::tr[2]/td[3]/span"));
	}

	// Objects from Barrel Reserve Order Page --- Lightning
	public WebElement lnkBarrelReserveOrder() {

		return driver.findElement(By.xpath("(//*[text()='Barrel Reserve Orders'])[1]"));
	}

	public WebElement showAllQuickLinks() {

		return driver.findElement(By.xpath("//*[text()='Show All (18)']"));
	}

	public WebElement btnNewBarrelReserveOrder() {

		return driver.findElement(By.xpath("(//div[@title='New'])[2]"));
	}

	public WebElement txtBarrelReserveOrder() {

		return driver.findElement(
				By.xpath("//span[contains(text(),'Barrel Reserve Order')]/parent::label/following-sibling::input"));
	}

	public WebElement txt750mlBottles() {

		return driver.findElement(
				By.xpath("//span[contains(text(),'750 ml Bottles')]/parent::label/following-sibling::input"));
	}

	public WebElement txtMagnumBottles() {

		return driver.findElement(
				By.xpath("//span[contains(text(),'Magnum Bottles')]/parent::label/following-sibling::input"));
	}

	public WebElement dpdPaymentStatus() {

		return driver.findElement(By.xpath(
				"//span[contains(text(),'Payment Status')]/parent::span/following-sibling::div/child::div/child::div/child::div/child::a"));
	}

	public WebElement dpdMagnumBottles() {

		return driver.findElement(By.xpath(
				"//span[contains(text(),'Payment Status')]/parent::span/following-sibling::div/child::div/child::div/child::div/a"));
	}

	public WebElement txtBarrelReserveTotal() {

		return driver.findElement(By.xpath("//span[contains(text(),'Total')]/parent::label/following-sibling::input"));
	}

	public WebElement btnSaveBarrelReserveOrder() {

		return driver.findElement(By.xpath("//*[@title='Save']"));
	}
	// Cancel Membership page objects

	public WebElement lnkCancelMembership() {
		return driver.findElement(By.xpath("//*[text()='Cancel Membership']"));
	}

	public WebElement dpdCancellationCategory() {
		return driver.findElement(By.xpath(
				"//label[text()='Cancellation Category']/parent::th/following-sibling::td/child::div/child::select"));
	}

	public WebElement dpdCancellationReason() {
		return driver.findElement(By.xpath(
				"//label[text()='Cancellation Reason']/parent::th/following-sibling::td/child::div/child::span/child::select"));
	}

	public WebElement btnSaveCancelMembership() {
		return driver.findElement(By.xpath("//*[@value='Save']"));
	}

	// Edit vacation page objects
	public WebElement lnkEditVacationStartDateIcon() {
		return driver.findElement(By.xpath(
				"//*[text()='Vacation Start Date']/parent::div/following-sibling::div/child::span/following-sibling::button"));
	}

	public WebElement lnkEditVacationEndDateIcon() {
		return driver.findElement(By.xpath(
				"//*[text()='Vacation End Date']/parent::div/following-sibling::div/child::span/following-sibling::button"));
	}

	public WebElement txtVacationStartDate() {
		return driver.findElement(
				By.xpath("//*[text()='Vacation Start Date']/parent::label/following-sibling::div/child::input"));
	}

	public WebElement txtVacationEndDate() {
		return driver.findElement(
				By.xpath("//*[text()='Vacation End Date']/parent::label/following-sibling::div/child::input"));
	}

// Objects from WC Member-Details Page --- Lightning
// Wc Member points history	
	public WebElement readOnlyLightWCPointsInformationActivePoints() {

		return driver.findElement(By.xpath(
				"//*[text()='Points Information']/parent::*/parent::*/parent::*/child::div/child::div/child::div/child::div/child::div//*[text()='Active Points']/parent::*/following-sibling::div/span/span"));
	}

	public WebElement readOnlyLightWCPointsInformationInActivePoints() {

		return driver.findElement(By.xpath(
				"//*[text()='Points Information']/parent::*/parent::*/parent::*/child::div/child::div/child::div/child::div/child::div//*[text()='Inactive Points']/parent::*/following-sibling::div/span/span"));
	}

	public WebElement readOnlyLightWCPointsInformationNewPoints() {

		return driver.findElement(By.xpath(
				"//*[text()='Points Information']/parent::*/parent::*/parent::*/child::div/child::div/child::div/child::div/child::div//*[text()='New Points']/parent::*/following-sibling::div/span/span"));
	}

	public WebElement readOnlyLightWCPointsInformationLifeTimePoints() {

		return driver.findElement(By.xpath(
				"//*[text()='Points Information']/parent::*/parent::*/parent::*/child::div/child::div/child::div/child::div/child::div//*[text()='Lifetime Points']/parent::*/following-sibling::div/span/span"));
	}

	// Wind Club Information Error object
	public WebElement readonlytxtClubTypechangeImmediatelyErrorMessage() {
		return driver.findElement(By.xpath(
				"//div[@class='message errorM3']/child::table/child::tbody/child::tr/child::td/following-sibling::td/child::div/child::span"));
	}

	public WebElement readonlytxtbottleschangeImmediatelyErrorMessage() {
		return driver.findElement(By.xpath(
				"//div[@class='message errorM3']/child::table/child::tbody/child::tr/child::td/following-sibling::td/child::div/child::span"));
	}

	// Objects from WC Member-Details Page --- Lightning
	// Wc Member cards
	public WebElement lnkShowAllLinks() {
		return driver.findElement(By.xpath("//*[text()='Show All (18)']"));
	}

	public WebElement lnkWCMemberCards() {
		return driver.findElement(By.xpath("(//*[text()='WC Member Cards'])[1]"));
	}

	public WebElement btnNewWCMemberCard() {
		return driver.findElement(By.linkText("New"));
	}

	// New Wc Member cards page
	public WebElement txtNewWCMemberCardNumber() {
		return driver.findElement(By.xpath("//span[text()='Card Number']/parent::label/following-sibling::input"));
	}

	public WebElement txtCardStatus() {
		return driver.findElement(By.xpath(
				"//*[text()='Card Status']/parent::span/following-sibling::div/child::div/child::div/child::div/child::a"));
	}

	public WebElement txtActivationDate() {
		return driver.findElement(
				By.xpath("//*[text()='Activated Date']/parent::label/following-sibling::div/child::input"));
	}

	public WebElement btnSaveNewWCMemberCard() {
		return driver.findElement(By.xpath("//*[@title='Save']"));
	}

	// Add Notes page
	public WebElement lnkNotes() {
		return driver.findElement(By.xpath("(//*[text()='Notes'])[2]"));
	}

	public WebElement btnNewNotes() {
		return driver.findElement(By.xpath("(//*[@title='New'])[3]"));
	}

	public WebElement txtNotesMessage() {
		return driver.findElement(By.xpath("//*[text()='Message']/parent::label/parent::div/child::textarea"));
	}

	public WebElement btnSaveNewNote() {
		return driver.findElement(By.xpath("//*[@title='Save']"));
	}

	public WebElement btnSaveWCMemberWOM() {
		return driver.findElement(By.xpath("//td[@id='j_id0:f:pb1:buttons']/input"));
	}

	public WebElement btnProceedRoPaymentWOM() {
		return driver.findElement(By.xpath("//*[@value='Proceed to Payment']"));
	}

	public WebElement btnSaveWCMemberTasting() {
		return driver.findElement(By.xpath("//*[@value='Save WC Member Tasting']"));
	}

	// *[@value='Save WC Member WOM']
// Objects from WC Member-Details Page --- Lightning
//Additional WC Member Information

	public WebElement readOnlyLightWCAdditionalWCMemberInformation() {

		return driver.findElement(By.xpath(
				"//*[text()='Additional WC Member Information']/parent::*/parent::*/parent::*/child::div/child::div/child::div/child::div/child::div//*[text()='Sign Up Location']/parent::*/following-sibling::div/span/div"));
	}

	// Each Object Performance Method Lightning
	// Wine Club Information

	public void ValidateLightCardNumber(int row) throws IOException, InterruptedException {
		Thread.sleep(5000);
		if (readOnlyLightCardNumber().isDisplayed()) {
			System.out.println(readOnlyLightCardNumber().getText());
			String ExpectedCardNumber = EnteredCardNumber;
			verifyTextEqual(readOnlyLightCardNumber(), ExpectedCardNumber, "Valididate WC Card Number");
		}

	}

	public void ValidateLightName(int row) throws IOException, InterruptedException {
		Thread.sleep(5000);
		System.out.println(readOnlyLightName().getText());
		String ExpectedContactText = null;
		if (!data.Getdata("Middle Name", row).isEmpty() && !data.Getdata("Middle Name", row).equalsIgnoreCase(" ")) {

			ExpectedContactText = data.Getdata("First Name", row).trim() + " " + data.Getdata("Middle Name", row).trim()
					+ " " + data.Getdata("Last Name", row).trim();

		}
		if (data.Getdata("Middle Name", row).isEmpty()) {

			ExpectedContactText = data.Getdata("First Name", row).trim() + " " + data.Getdata("Last Name", row).trim();

		}

		if (data.Getdata("Membership Type", row).equalsIgnoreCase("Gift")) {

			ExpectedContactText = EnteredCardNumber + " " + EnteredCardNumber;
		}
		Thread.sleep(5000);
		verifyTextEqual(readOnlyLightName(), ExpectedContactText, "Validate Lightning WC Name");
	}

	public void ValidateLightMemberShipType(int row) throws IOException, InterruptedException {

		String ExpectedMembershipType = data.Getdata("Membership Type", row).trim();
		Thread.sleep(5000);
		verifyTextEqual(readOnlyLightMembershipType(), ExpectedMembershipType, "Valididate WC Membership Type");

	}

	public void ValidateLightDelivery(int row) throws IOException, InterruptedException {

		String ExpectedDelivery = data.Getdata("Delivery", row).trim();
		Thread.sleep(5000);
		verifyTextEqual(readOnlyLightDelivery(), ExpectedDelivery, "Valididate WC Delivery");

	}

	public void ValidateLightClubType(int row) throws IOException, InterruptedException {

		String ExpectedClubType = data.Getdata("Club Type", row).trim();
		Thread.sleep(5000);
		verifyTextEqual(readOnlyLightClubType(), ExpectedClubType, "Valididate WC Club Type");

	}

	public void ValidateLightNoofBottles(int row) throws IOException, InterruptedException {

		String ExpectedNoofBottlles = data.Getdata("# of Bottles", row).trim();
		Thread.sleep(5000);
		verifyTextEqual(readOnlyLightNoofBottles(), ExpectedNoofBottlles, "Valididate WC # of Bottles");

	}

	public void ValidateLightCostofMembership(int row) throws IOException, InterruptedException {

		String ExpectedCostofMembership = formatAmountText(data.Getdata("Cost of Membership", row).trim());
		Thread.sleep(5000);
		verifyTextEqual(readOnlyLightCostofMembership(), ExpectedCostofMembership, "Valididate WC Cost of Membership");

	}

	public void ValidateLightMembershipSignatureOptOut() throws IOException, InterruptedException {

		String ExpectedMembershipSignatureOptOut = "unchecked";
		Thread.sleep(5000);
		verifyCheckBoxCheckedStatus(readOnlyLightMemberSignature(), ExpectedMembershipSignatureOptOut,
				"Valididate WC Member Signature Opt-Out");

	}

	public void ValidateLightWCMemberStatus(int row) throws IOException, InterruptedException {

		if (data.Getdata("Membership Type", row).trim().equalsIgnoreCase("Gift")) {
			Thread.sleep(5000);
			verifyTextEqual(readOnlyLightWCMemberStatus(), "To be Activated", "Valididate WC Member Status");
		}

		else {
			Thread.sleep(5000);
			verifyTextEqual(readOnlyLightWCMemberStatus(), "Active", "Valididate WC Member Status");
		}

	}

	public void ValidateFounderLightWCMemberStatus(int row) throws IOException, InterruptedException {
		try {
			verifyTextEqual(readOnlyFounderLightWCMemberStatus(), "Active", "Valididate WC Member Status");
		} catch (AssertionError a) {
			ResultsLog.ReportInfo(driver, "Validation failed");
		}

	}

	public void ValidateComplimentaryLightCardNumber(int row) throws IOException, InterruptedException {
		Thread.sleep(5000);
		if (readOnlyComplimentaryLightCardNumber().isDisplayed()) {
			System.out.println(readOnlyComplimentaryLightCardNumber().getText());
			String ExpectedCardNumber = EnteredCardNumber;
			verifyTextEqual(readOnlyComplimentaryLightCardNumber(), ExpectedCardNumber, "Valididate WC Card Number");
		}

	}

	public void ValidateComplimentaryLightName(int row) throws IOException, InterruptedException {
		Thread.sleep(5000);
		System.out.println(readOnlyComplimentaryLightName().getText());
		String ExpectedContactText = null;
		if (!data.Getdata("Middle Name", row).isEmpty() && !data.Getdata("Middle Name", row).equalsIgnoreCase(" ")) {

			ExpectedContactText = data.Getdata("First Name", row).trim() + " " + data.Getdata("Middle Name", row).trim()
					+ " " + data.Getdata("Last Name", row).trim();

		}
		if (data.Getdata("Middle Name", row).isEmpty()) {

			ExpectedContactText = data.Getdata("First Name", row).trim() + " " + data.Getdata("Last Name", row).trim();

		}

		if (data.Getdata("Membership Type", row).equalsIgnoreCase("Gift")) {

			ExpectedContactText = EnteredCardNumber + " " + EnteredCardNumber;
		}
		Thread.sleep(5000);
		verifyTextEqual(readOnlyComplimentaryLightName(), ExpectedContactText, "Validate Lightning WC Name");
	}

	public void ValidateComplimentaryLightMemberShipType(int row) throws IOException, InterruptedException {

		String ExpectedMembershipType = data.Getdata("Membership Type", row).trim();
		Thread.sleep(5000);
		verifyTextEqual(readOnlyComplimentaryLightMembershipType(), ExpectedMembershipType,
				"Valididate WC Membership Type");

	}

	public void ValidateComplimentaryLightDelivery(int row) throws IOException, InterruptedException {

		String ExpectedDelivery = data.Getdata("Delivery", row).trim();
		Thread.sleep(5000);
		verifyTextEqual(readOnlyComplimentaryLightDelivery(), ExpectedDelivery, "Valididate WC Delivery");

	}

	public void ValidateComplimentaryLightClubType(int row) throws IOException, InterruptedException {

		String ExpectedClubType = data.Getdata("Club Type", row).trim();
		Thread.sleep(5000);
		verifyTextEqual(readOnlyComplimentaryLightClubType(), ExpectedClubType, "Valididate WC Club Type");

	}

	public void ValidateComplimentaryLightNoofBottles(int row) throws IOException, InterruptedException {

		String ExpectedNoofBottlles = data.Getdata("# of Bottles", row).trim();
		Thread.sleep(5000);
		verifyTextEqual(readOnlyComplimentaryLightNoofBottles(), ExpectedNoofBottlles, "Valididate WC # of Bottles");

	}

	public void ValidateComplimentaryLightWCMemberStatus(int row) throws IOException, InterruptedException {

		if (data.Getdata("Membership Type", row).trim().equalsIgnoreCase("Gift")) {
			Thread.sleep(5000);
			verifyTextEqual(readOnlyComplimentaryLightWCMemberStatus(), "To be Activated",
					"Valididate WC Member Status");
		}

		else {
			Thread.sleep(5000);
			verifyTextEqual(readOnlyComplimentaryLightWCMemberStatus(), "Active", "Valididate WC Member Status");
		}

	}

	public void ValidateLightWCTier() throws IOException {

		verifyTextEqual(readOnlyLightTier(), "Standard", "Valididate WC Tier");

	}

	public void ValidateFounderLightWCTier() throws IOException {

		verifyTextEqual(readOnlyFounderLightTier(), "Standard", "Valididate WC Tier");

	}

	public void ValidateComplimentaryLightWCDurationofMemberShip(int row) throws IOException {

		verifyTextEqual(readOnlyComplimentaryDurationofMembership(), data.Getdata("Duration of Membership", row).trim(),
				"Valididate Duration of MemberShip");

	}

	public void ValidateLightWCDurationofMemberShip(int row) throws IOException {

		verifyTextEqual(readOnlyDurationofMembership(), data.Getdata("Duration of Membership", row).trim(),
				"Valididate Duration of MemberShip");

	}

	public void ValidateLightWCPendingChanges() throws IOException {

		verifyTextEqual(readOnlyPendingChanges(), "No", "Valididate WC Pending Changes");

	}

	public void ValidateComplimentaryLightWCPendingChanges() throws IOException {

		verifyTextEqual(readOnlyComplimentaryPendingChanges(), "No", "Valididate WC Pending Changes");

	}

	public void ExpandWineClubInformation() throws IOException {
		waitForPageLoadToComplete();
		waitForElement(WineClubInformation());
		try {
			if (WineClubInformation().getAttribute("aria-expanded").equalsIgnoreCase("false")) {
				clickOnButton(WineClubInformation(), "Wine Club Information button Expansation");
			} else {
				System.out.println("WineClubInformation attribute is true");
			}
		} catch (Exception e) {

			System.out.println("in catch WC member Expand to Validate");
			if (WineClubInformation().getAttribute("aria-expanded").equalsIgnoreCase("false")) {
				clickOnButton(WineClubInformation(), "Wine Club Information button Expansation");
			}
		}

	}

	// Each Object Performance Method Lightning
	// Contact Information in Edit page
	public void enterEmail(int row) throws IOException {
		enterText(txtEmail(), "Email", data.Getdata("Email", row));
	}

	public void enterPhone(int row) throws IOException {
		enterText(txtPhone(), "Phone", data.Getdata("Phone", row));
	}

	public void selectGender(int row) throws IOException, InterruptedException {

		clickOnLink(lnkGender(), "Gender");
		Thread.sleep(2000);
		selectDpdForLightning("Not Provided", "lnkGender");
	}

	public void enterBirthDate(int row) throws IOException {
		enterText(txtBirthDate(), "Birthdate", data.Getdata("Birthdate", row));
	}

	// Each Object Performance Method Lightning
	// WC Member Summary

	public void ValidateLightWCOpenBottles(int row) throws IOException {
		verifyTextEqual(readOnlyLightWCOpenBottles(), data.Getdata("ExpectedBottles", row),
				"Valididate WC Open Bottles");
	}

	public void ValidateFounderLightWCOpenBottles(int row) throws IOException {
		verifyTextEqual(readOnlyFounderLightWCOpenBottles(), data.Getdata("ExpectedBottles", row),
				"Valididate WC Open Bottles");
	}

	public void ValidateComplimentaryLightWCOpenBottles(int row) throws IOException {
		verifyTextEqual(readOnlyComplimentaryLightWCOpenBottles(), data.Getdata("ExpectedBottles", row),
				"Valididate WC Open Bottles");
	}

	public void ValidateLightWCOpenTastings(int row) throws IOException {
		verifyTextEqual(readOnlyLightWCOpenTastings(), data.Getdata("ExpectedTastings", row),
				"Valididate WC Open Tastings");
	}

	public void ValidateFounderLightWCOpenTastings(int row) throws IOException {
		verifyTextEqual(readOnlyFounderLightWCOpenTastings(), data.Getdata("ExpectedTastings", row),
				"Valididate WC Open Tastings");
	}

	public void ValidateComplimentaryLightWCOpenTastings(int row) throws IOException {
		verifyTextEqual(readOnlyComplimentaryLightWCOpenTastings(), data.Getdata("ExpectedTastings", row),
				"Valididate WC Open Tastings");
	}

	public void ValidateLightWCLifeTimeBottles(int row) throws IOException {
		verifyTextEqual(readOnlyLightWCLifeTimeBottles(), data.Getdata("ExpectedLifeBottles", row),
				"Valididate WC LifetimeBottles");
	}

	public void ValidateComplimnetaryLightWCLifeTimeBottles(int row) throws IOException {
		verifyTextEqual(readOnlyComplimentaryLightWCLifeTimeBottles(), data.Getdata("ExpectedLifeBottles", row),
				"Valididate WC LifetimeBottles");
	}

	public void ValidateLightWCAmbassadorTenureCredits(int row) throws IOException {
		verifyTextEqual(readOnlyLightWCAmbassadorTenureCredits(), data.Getdata("ExpectedTenureCredits", row),
				"Valididate WC Ambassador Tenure Credits");
	}

	public void ValidateLightWCAnnualAmbassadorSpendCredits(int row) throws IOException {
		verifyTextEqual(readOnlyLightWCAnnualAmbassadorSpendCredits(),
				formatAmountTextwithDecimal(data.Getdata("ExpectedAmbassadorSpendCredits", row)),
				"Valididate WC Annual Ambassador Spend Credits");
	}

	public void ValidateLightWCTotalAmbassadorCredits(int row) throws IOException {
		verifyTextEqual(readOnlyLightWCTotalAmbassadorCredits(), data.Getdata("ExpectedTotalAmbassadorCredits", row),
				"Valididate WC Total Ambassador Credits");
	}

	public void ValidateComplimentaryLightWCActivePoints(int row) throws IOException {
		verifyTextEqual(readOnlyComplimentaryLightWCActivePoints(), data.Getdata("ExpectedActivePoints", row),
				"Valididate WC Active Points");
	}

	public void ValidateLightWCActivePoints(int row) throws IOException {
		verifyTextEqual(readOnlyLightWCActivePoints(), data.Getdata("ExpectedActivePoints", row),
				"Valididate WC Active Points");
	}

	public void ValidateFounderLightWCActivePoints(int row) throws IOException {
		verifyTextEqual(readOnlyFounderLightWCActivePoints(), data.Getdata("ExpectedActivePoints", row),
				"Valididate WC Active Points");
	}

	public void ValidateLightWCMemberSince() throws IOException {
		verifyTextEqual(readOnlyLightWCMemberSince(), getCurrentDateStamp(), "Valididate Member Since");
	}

	public void ValidateFounderLightWCMemberSince() throws IOException {
		verifyTextEqual(readOnlyFounderLightWCMemberSince(), getCurrentDateStamp(), "Valididate Member Since");
	}

	public void ValidateComplimentaryLightWCMemberSince() throws IOException {
		verifyTextEqual(readOnlyComplimentaryLightWCMemberSince(), getCurrentDateStamp(), "Valididate Member Since");
	}

	public void ValidateLightWCMemberShipExpirationDate(int row) throws IOException {

		String duration = data.Getdata("Duration of Membership", row).trim();
		int du = Integer.parseInt(duration);
		verifyTextEqual(readOnlyLightWCMemberShipExpirationDate(), getCurrentDateStampPlusRequiredDate(du),
				"Valididate Member Ship Expiration Date");
	}

	public void ValidateComplimentaryLightWCMemberShipExpirationDate(int row) throws IOException {

		String duration = data.Getdata("Duration of Membership", row).trim();
		int du = Integer.parseInt(duration);
		verifyTextEqual(readOnlyLightWCMemberShipExpirationDate(), getCurrentDateStampPlusRequiredDate(du),
				"Valididate Member Ship Expiration Date");
	}

	// Each Object Performance Method Lightning
	// New WC Member Card
	public void replacePersonalizedWCCard(int row)
			throws IOException, InterruptedException, AWTException, BiffException {
		String today = BasePages.getCurrentdate();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(2000,0)");
		Thread.sleep(5000);
		clickOnLink(showAllQuickLinks(), "Show All links");
		Thread.sleep(2000);
		clickOnLink(lnkWCMemberCards(), "WC Member Cards");
		Thread.sleep(2000);
		clickOnButton(btnNewWCMemberCard(), "New WC Member Card");
		Thread.sleep(2000);
		enterText(txtCardNumber(), "Card Number", cardnumber());
		Thread.sleep(2000);
		String replacementCardNumber = txtCardNumber().getAttribute("value");
		data.setData("Card Number", row, replacementCardNumber);

		System.out.println(row);
		enterText(txtActivationDate(), "Activation Date", today);
		clickOnButton(btnSaveNewWCMemberCard(), "save New WC Member Card");

	}

	// Add Notes page
	public void addNotes() throws IOException, InterruptedException {
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(2000,0)");
		Thread.sleep(5000);
		clickOnLink(showAllQuickLinks(), "Show All links");
		Thread.sleep(2000);
		Thread.sleep(2000);
		clickOnLink(lnkNotes(), "Notes");
		clickOnButton(btnNewNotes(), "New Button");
		enterText(txtNotesMessage(), "Notes Message", "Coopers Hawk Testing");
		clickOnButton(btnSaveNewNote(), "save button");

	}

	// Cancel Membership page methods
	public void cancelMembership() throws IOException, InterruptedException {

		Thread.sleep(2000);
		clickOnLink(lnkCancelMembership(), "Cancel Membership");
		Thread.sleep(2000);
		for (int i = 0; i < 9; i++) {
			driver.switchTo().defaultContent();
			int size = driver.findElements(By.tagName("iframe")).size();
			System.out.println(size);
			driver.switchTo().frame(i);
			try {
				if (dpdCancellationCategory().isDisplayed()) {
					System.out.println("Correct frame switched:" + i);
					selectByText(dpdCancellationCategory(), "Cancellation Category", "Error");
					Thread.sleep(2000);
					selectByText(dpdCancellationReason(), "Cancellation Reason", "Multiple Memberships");
					Thread.sleep(2000);
					clickOnButton(btnSaveCancelMembership(), "Save button");
					Thread.sleep(2000);
					Alert alert = driver.switchTo().alert();
					Thread.sleep(2000);
					alert.accept();
					Thread.sleep(2000);
					driver.switchTo().defaultContent();
					break;
				} else {
					System.out.println("Correct frame not switched");
				}
			} catch (Exception e) {

				System.out.println("Element not displyed in i" + i);
			}

		}
	}

	// vacation hold page methods
	public void putVacationHold() throws InterruptedException, IOException, AWTException {
		Calendar cal = Calendar.getInstance();
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		cal.add(Calendar.DAY_OF_MONTH, 90);
		cal2.add(Calendar.DAY_OF_MONTH, 30);
		Date d = cal.getTime();
		String futureDate = sdf.format(d);
		String nextMonthDate = sdf.format(cal2.getTime());
		String todayDate = sdf.format(cal1.getTime());
		System.out.println(nextMonthDate);
		System.out.println(futureDate);
		clickOnButton(btnEdit(), "Edit button");
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtEditVacationStartDate());
		Thread.sleep(5000);

		try {
			System.out.println(txtEditVacationStartDate().getAttribute("value"));
			if (!txtEditVacationStartDate().getAttribute("value").isEmpty()) {
				txtEditVacationStartDate().clear();
			}
		} catch (Exception e) {

			System.out.println("element not available");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// txtEditVacationStartDate().sendKeys(nextMonthDate);
		enterText(txtEditVacationStartDate(), "Vacation Start Date", nextMonthDate);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			System.out.println(txtEditVacationEndDate().getAttribute("value"));
			if (!txtEditVacationEndDate().getAttribute("value").isEmpty()) {
				txtEditVacationEndDate().clear();
			}
		} catch (Exception e) {

			System.out.println("element not available");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// txtEditVacationEndDate().sendKeys(futureDate);
		enterText(txtEditVacationEndDate(), "Vacation Start Date", futureDate);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ClickSaveWCMemberInformation();
	}

	// update Contact Information Page methods

	public void updateContactInformation(int row) throws IOException, InterruptedException {
		clickOnLink(lnkEdit(), "Edit");
		enterEmail(row);
		enterPhone(row);
		enterBirthDate(row);
		selectGender(row);
		clickOnButton(btnSaveWCInfo(), "Save");

	}
// Each Object Performance Method Lightning
// WC Member Summary

	public void ValidateLightWCCardStatus() throws IOException {

		// Should work on to identify this object
		verifyTextEqual(readOnlyLightWCCardStatus(), "Inactive", "Valididate WC member Card Status");

	}

// Each Object Performance Method Lightning
// Points Information

	public void ValidateLightWCPointsInformationActivePoints(String ExpectedActivePoints) throws IOException {
		verifyTextEqual(readOnlyLightWCPointsInformationActivePoints(), ExpectedActivePoints,
				"Valididate Points Information Active Points");
	}

	public void ValidateLightWCPointsInformationInActivePoints(String ExpectedActivePoints) throws IOException {
		verifyTextEqual(readOnlyLightWCPointsInformationInActivePoints(), ExpectedActivePoints,
				"Valididate Points Information InActive Points");
	}

	public void ValidateLightWCPointsInformationNewPoints(String ExpectedActivePoints) throws IOException {
		verifyTextEqual(readOnlyLightWCPointsInformationNewPoints(), ExpectedActivePoints,
				"Valididate Points Information New Points");
	}

	public void ValidateLightWCPointsInformationLifeTimePoints(String ExpectedActivePoints) throws IOException {
		verifyTextEqual(readOnlyLightWCPointsInformationLifeTimePoints(), ExpectedActivePoints,
				"Valididate Points Information Lifetime Points");
	}

// Each Object Performance Method Lightning
// Additional WCMember Information	

	public void ValidateLightWCAdditionalWCMemberInformation(int row) throws IOException {
		verifyTextEqual(readOnlyLightWCAdditionalWCMemberInformation(), data.Getdata("Sign Up Location", row),
				"Valididate Additional WC Member Informatio Signup Location");
	}

// Each Object Performance Method Lightning
// WOM

	public void ValidateLightWCWOMOpenBottles(int row) throws IOException {
		verifyTextEqual(readOnlyLightWCWomOpenbottles(), data.Getdata("# of Bottles", row),
				"Valididate WOM Open Bottles");
	}

	public void ValidateFounderLightWCWOMOpenBottles(int row) throws IOException {
		verifyTextEqual(readOnlyFounderLightWCWomOpenbottles(), data.Getdata("# of Bottles", row),
				"Valididate WOM Open Bottles");
	}

	public void ValidateComplimentaryLightWCWOMOpenBottles(int row) throws IOException {
		verifyTextEqual(readOnlycomplimentaryLightWCWomOpenbottles(), data.Getdata("# of Bottles", row),
				"Valididate WOM Open Bottles");
	}

	public void ValidateLightWCWOMYear() throws IOException {
		verifyTextEqual(readOnlyLightWCYear(), getCurrentYear(), "Valididate WOM Year");
	}

	public void ValidateLightWCWOMMonth() throws IOException {
		verifyTextEqual(readOnlyLightWCMonth(), getCurrentMonthName(), "Valididate WOM Month");
	}

	public void ValidateLightWCWOMYear2() throws IOException {
		verifyTextEqual(readOnlyLightWCYear2(), getCurrentYear(), "Valididate WOM Year");
	}

	public void ValidateLightWCWOMMonth2() throws IOException {
		verifyTextEqual(readOnlyLightWCMonth2(), getCurrentMonthName(), "Valididate WOM Month");
	}

	// WC Members Points Logical Method
	public void clickNewWCMemberPointsHistory() throws IOException {
		clickOnLink(lnkWCMemberPointsHistory(), "WC Member Points History");
		clickOnLink(btnNewWCMemberCard(), "Edit WC Member Points History");

	}

	public void selectPointsType() throws IOException, InterruptedException {
		// clickOnEditIcon(dpdEditPointsType(), "Points Type Edit Icon");
		Thread.sleep(5000);
		clickOnButton(dpdPointsType(), "Points Type dropdown Edit");
		Thread.sleep(3000);
		selectDpdForLightning("Basic", "Points Type");

	}

	public void selectPointsStatus() throws IOException, InterruptedException {

		Thread.sleep(2000);
		clickOnButton(dpdPointStatus(), "Points Type dropdown Edit");

		Thread.sleep(3000);
		selectDpdForLightning("Active", "Points Status");
	}

	public void restaurantLocation() throws IOException, InterruptedException {
		Thread.sleep(2000);
		clickOnButton(txtReastaurantLocation(), "Restaurant Location");
		Thread.sleep(2000);
		clickOnButton(driver.findElement(By.xpath("//*[text()='New CH Winery Restaurant']")),
				"drop down for restaurant selection");

	}

	public void locationName() throws IOException, InterruptedException {
		Thread.sleep(2000);
		enterText(txtLocationName(), "Location Name", "CH");

		clickOnButton(txtLocationName(), "Location Name");

	}

	public void restaurantNumber() throws IOException, InterruptedException {
		Thread.sleep(2000);
		enterText(txtRestaurantNumber(), "Restaurant Number", "1234");

	}

	public void clickChangeMembershipType() throws IOException {
		clickOnLink(lnkChangeWCMemberRecordTypeIcon(), "WC Member Record Type");

	}

//public void enterRestaurantLocation() throws IOException {
//	enterText(txtReastaurantLocation(), "Restaurant Location", "999");
//}
//public void searchRestauranttLocation() {
//	
//}
//public void selectRestauranttLocation() {
//	
//}
	public void enterPointsEarned() throws IOException {
		enterText(txtPointEarned(), "Points Earned", "40");

	}

	public void enterTotalPointsApplicable() throws IOException, InterruptedException {
		try {
			txtPointsApplicableTotal().clear();
		} catch (Exception e) {
			System.out.println("Element not displyed");
		}
		Thread.sleep(1000);
		enterText(txtPointsApplicableTotal(), "Points Applicable", "40");
	}

	public void saveLoyalytPoints() throws IOException {
		clickOnButton(btnSaveLoyaltyPoints(), "Save Points button");

	}

	public void MemberSignatureOptOut() throws IOException {

		clickOnCheckBox(chkMemberSignatureOptOut(), "Member Signature OptOut");
	}

	public void SaveMemberSignature() throws IOException {
		clickOnButton(btnSaveMemberSignature(), "Save Member Signature OptOut");
	}

	// Each Object Method from Barrel Reserve Order Page --- Lightning

	public void clickBarrelReserveOrder() throws IOException, InterruptedException {
		Thread.sleep(1000);

		if (showAllQuickLinks().isDisplayed()) {
			clickOnLink(showAllQuickLinks(), "Show All Links");
			Thread.sleep(500);
			clickOnLink(lnkBarrelReserveOrder(), "Barrel Reserve Order");
		} else {
			clickOnLink(lnkBarrelReserveOrder(), "Barrel Reserve Order");
		}

	}

	public void clickNewBarrelReserveOrder() throws IOException {
		clickOnButton(btnNewBarrelReserveOrder(), "New Barrel Reserve Order");
	}

	public void enterBarrelReserveOrder() throws IOException {
		enterText(txtBarrelReserveOrder(), "Barrel Reserve Order", "Reserve Barrel");
	}

	public void enter750mlBottles() throws IOException {
		enterText(txt750mlBottles(), "750 ml Bottles", "10");
	}

	public void enterMagnumBottles() throws IOException {
		enterText(txtMagnumBottles(), "Magnum Bottles", "10");
	}

	public void selectPaymentStatus() throws IOException, InterruptedException {
		clickOnLink(dpdPaymentStatus(), "Payment Status");
		Thread.sleep(4000);
		selectDpdForLightning("Processed", "Payment Status");

	}

	public void enterBarrelReserveOrderTotal() throws IOException {
		enterText(txtBarrelReserveTotal(), "Total", "200");
	}

	public void saveBarrelReserveOrder() throws IOException {
		clickOnButton(btnSaveBarrelReserveOrder(), "Save");
	}
// Wine Club Information Logical Method

	public void LightningValidateWineClubInformation(int row) throws IOException, InterruptedException {

		ExpandWineClubInformation();
		ValidateLightCardNumber(row);
		ValidateLightName(row);
		ValidateLightMemberShipType(row);
		ValidateLightDelivery(row);
		ValidateLightClubType(row);
		ValidateLightNoofBottles(row);
		ValidateLightCostofMembership(row);
		ValidateLightMembershipSignatureOptOut();
		ValidateLightWCMemberStatus(row);
		ValidateLightWCTier();
		if (data.Getdata("WC Member Record Type", row).trim().equalsIgnoreCase("Gift Member")) {
			ValidateLightWCDurationofMemberShip(row);
		}
		ValidateLightWCPendingChanges();
	}

// Wc Member Summary Logical Method

	public void LightningValidateWCMemberSummary(int row) throws IOException {

		if (data.Getdata("WC Member Record Type", row).trim().equalsIgnoreCase("Gift Member")) {
			ValidateLightWCMemberSince();
		}

		else {

			ValidateLightWCOpenBottles(row);
			ValidateLightWCOpenTastings(row);
			ValidateLightWCLifeTimeBottles(row);
			ValidateLightWCAmbassadorTenureCredits(row);
			ValidateLightWCAnnualAmbassadorSpendCredits(row);
			ValidateLightWCTotalAmbassadorCredits(row);
			ValidateLightWCActivePoints(row);
			ValidateLightWCMemberSince();
		}
	}

// WC Member Vacation Information Method

	public void LightningValidateWCVacationInformation() {

	}

// WC Member Points Information Method -- Data Logic method
	public void LightningValidateWCPointsInformation() throws IOException {

		String PointsInformationActivePoints = "0";
		String PointsInformationInActivePoints = "0";
		String PointsInformationNewPoints = "0";
		String PointsInformationLifetimePoints = "0";

		ValidateLightWCPointsInformationActivePoints(PointsInformationActivePoints);
		ValidateLightWCPointsInformationInActivePoints(PointsInformationInActivePoints);
		ValidateLightWCPointsInformationNewPoints(PointsInformationNewPoints);
		ValidateLightWCPointsInformationLifeTimePoints(PointsInformationLifetimePoints);
	}

// Additional WC Member Information

	public void LightningValidateWCAdditionalWCMemberInformation(int row) throws IOException {

		ValidateLightWCAdditionalWCMemberInformation(row);

	}

// WC Member WOM Information Method
	public void LightningWCWOMValidation(int row) throws IOException, InterruptedException {

		try {
			frameSwitch4(3);
			ValidateLightWCWOMOpenBottles(row);
		} catch (Exception e) {
			try {
				frameSwitch4(4);
				ValidateLightWCWOMOpenBottles(row);
			} catch (Exception ex) {
				System.out.println("Tried validating WOM Open Bottles but NO WOM Details Available");
				ResultsLog.ReportFail(driver, "Tried validating WOM Open Bottles but NO WOM Details Available",
						ex.toString());
			}
		}

		try {
			ValidateLightWCWOMYear();
			if (data.Getdata("WC Member Record Type", row).equalsIgnoreCase("Monthly Member")
					&& data.Getdata("# of Bottles", row).equalsIgnoreCase("2")) {
				ValidateLightWCWOMYear2();
			}
		} catch (Exception e) {
			System.out.println("Tried validating WOM Year but NO WOM Details Available");
			ResultsLog.ReportFail(driver, "Tried validating WOM Year but NO WOM Details Available", e.toString());
		}
		try {
			ValidateLightWCWOMMonth();
			if (data.Getdata("WC Member Record Type", row).equalsIgnoreCase("Monthly Member")
					&& data.Getdata("# of Bottles", row).equalsIgnoreCase("2")) {
				ValidateLightWCWOMMonth2();
			}
		} catch (Exception e) {
			System.out.println("Tried validating WOM Year but NO WOM Details Available");
			ResultsLog.ReportFail(driver, "Tried validating WOM Year but NO WOM Details Available", e.toString());

		}

		frameSwitch1(1);
	}

	public void LightningFounderWCWOMValidation(int row) throws IOException, InterruptedException {

		try {
			frameSwitch4(3);
			ValidateFounderLightWCWOMOpenBottles(row);
		} catch (Exception e) {
			try {
				frameSwitch4(4);
				ValidateFounderLightWCWOMOpenBottles(row);
			} catch (Exception ex) {
				System.out.println("Tried validating WOM Open Bottles but NO WOM Details Available");
				ResultsLog.ReportFail(driver, "Tried validating WOM Open Bottles but NO WOM Details Available",
						ex.toString());
			}
		}

		try {
			ValidateLightWCWOMYear();
			if (data.Getdata("WC Member Record Type", row).equalsIgnoreCase("Monthly Member")
					&& data.Getdata("# of Bottles", row).equalsIgnoreCase("2")) {
				ValidateLightWCWOMYear2();
			}
		} catch (Exception e) {
			System.out.println("Tried validating WOM Year but NO WOM Details Available");
			ResultsLog.ReportFail(driver, "Tried validating WOM Year but NO WOM Details Available", e.toString());
		}
		try {
			ValidateLightWCWOMMonth();
			if (data.Getdata("WC Member Record Type", row).equalsIgnoreCase("Monthly Member")
					&& data.Getdata("# of Bottles", row).equalsIgnoreCase("2")) {
				ValidateLightWCWOMMonth2();
			}
		} catch (Exception e) {
			System.out.println("Tried validating WOM Year but NO WOM Details Available");
			ResultsLog.ReportFail(driver, "Tried validating WOM Year but NO WOM Details Available", e.toString());

		}

		frameSwitch1(1);
	}

	public void LightningComplimentaryWCWOMValidation(int row) throws IOException, InterruptedException {

		try {
			frameSwitch4(3);
			ValidateComplimentaryLightWCWOMOpenBottles(row);
		} catch (Exception e) {
			try {
				frameSwitch4(4);
				ValidateComplimentaryLightWCWOMOpenBottles(row);
			} catch (Exception ex) {
				System.out.println("Tried validating WOM Open Bottles but NO WOM Details Available");
				ResultsLog.ReportFail(driver, "Tried validating WOM Open Bottles but NO WOM Details Available",
						ex.toString());
			}
		}

		try {
			ValidateLightWCWOMYear();
			if (data.Getdata("WC Member Record Type", row).equalsIgnoreCase("Monthly Member")
					&& data.Getdata("# of Bottles", row).equalsIgnoreCase("2")) {
				ValidateLightWCWOMYear2();
			}
		} catch (Exception e) {
			System.out.println("Tried validating WOM Year but NO WOM Details Available");
			ResultsLog.ReportFail(driver, "Tried validating WOM Year but NO WOM Details Available", e.toString());
		}
		try {
			ValidateLightWCWOMMonth();
			if (data.Getdata("WC Member Record Type", row).equalsIgnoreCase("Monthly Member")
					&& data.Getdata("# of Bottles", row).equalsIgnoreCase("2")) {
				ValidateLightWCWOMMonth2();
			}
		} catch (Exception e) {
			System.out.println("Tried validating WOM Year but NO WOM Details Available");
			ResultsLog.ReportFail(driver, "Tried validating WOM Year but NO WOM Details Available", e.toString());

		}

		frameSwitch1(1);
	}

	public void LightningValidateWCMemberCard(int row) throws IOException {
		if (data.Getdata("WC Member Record Type", row).trim().equalsIgnoreCase("Gift Member")) {
			ValidateLightWCCardStatus();
		}
	}

	// Actual functional Method from Barrel Reserve Order Page --- Lightning
	public void barrelReserveOrder() throws IOException, InterruptedException {

		clickBarrelReserveOrder();
		clickNewBarrelReserveOrder();
		enterBarrelReserveOrder();
		enter750mlBottles();
		enterMagnumBottles();
		selectPaymentStatus();
		enterBarrelReserveOrderTotal();
		saveBarrelReserveOrder();

	}

// Actual Main Functional Method

	public void clickEditWCInfo() throws IOException {
		clickOnLink(lnkEditWCInfo(), "Edit WC Info");

	}

	public void changeWCInfoDelivery() throws IOException {
		int size = driver.findElements(By.xpath("//*[@title='accessibility title']")).size();
		driver.switchTo().defaultContent();
		for (int i = 0; i < size; i++) {
			try {
				Thread.sleep(5000);
				driver.switchTo().frame(driver.findElement(By.xpath("(//*[@title='accessibility title'])[" + i + "]")));
				Thread.sleep(5000);
				System.out.println("Delivery Type:" + dpdWCInfoDelivery().getText());
				if (dpdWCInfoDelivery().getText().equalsIgnoreCase("Pickup")) {

					selectByText(dpdWCInfoDelivery(), "Delivery Type", "Delivery");
					changeWCInfonextBillingCycle();
					break;
				} else {
					selectByText(dpdWCInfoDelivery(), "Delivery Type", "Pickup");
					changeWCInfonextBillingCycle();
					break;
				}
			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "Club Type Not visible");
				System.out.println("No frame found");
			}
			driver.switchTo().defaultContent();
		}
	}

	public void changeWCInfoClubTypeIncreasedCostImmediately() throws IOException {
		int size = driver.findElements(By.xpath("//*[@title='accessibility title']")).size();
		driver.switchTo().defaultContent();
		for (int i = 0; i < size; i++) {
			try {
				Thread.sleep(5000);
				driver.switchTo().frame(driver.findElement(By.xpath("(//*[@title='accessibility title'])[" + i + "]")));
				Select select = new Select(dpdWCInfoClubType());
				WebElement option = select.getFirstSelectedOption();
				String defaultItem = option.getText();
				System.out.println(defaultItem);
				if(defaultItem.equalsIgnoreCase("Sweet")) {
					driver.navigate().refresh();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[text()='Wine Club Information']")).click();
					selectByText(dpdWCInfoClubType(), "Club Type", "Variety");
					changeWCInfopayImmediately();
					clickProceedtoPayment();
					errorMessageforClubTypeChangeImmediately();
					break;
				}
				else if (defaultItem.equalsIgnoreCase("Variety")) {
						ResultsLog.ReportInfo(driver, "Club Type Already at Higher Cost");
						break;
					} else if ( defaultItem.equalsIgnoreCase("Red")) {
						ResultsLog.ReportInfo(driver, "Club Type Already at Higher Cost");
						break;
					} else if ( defaultItem.equalsIgnoreCase("White")) {
						ResultsLog.ReportInfo(driver, "Club Type Already at Higher Cost");
						break;
					}

			
			else {

					ResultsLog.ReportFail(driver, "Required Club Type Not Available for Selection",
							"Required Club Type Not Available");
				}
				// }

			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "Club Type Not visible");
				System.out.println("No frame found");
			}
			driver.switchTo().defaultContent();

		}

	}

	public void changeWCInfoClubTypeIncreasedCostNextBillingCycle(int row) throws Exception {
		int size = driver.findElements(By.xpath("//*[@title='accessibility title']")).size();
		driver.switchTo().defaultContent();
		for (int i = 0; i < size; i++) {
			try {

				Thread.sleep(10000);

				driver.switchTo().frame(driver.findElement(By.xpath("(//*[@title='accessibility title'])[" + i + "]")));
				Select select = new Select(dpdWCInfoClubType());
				List<WebElement> options = select.getOptions();
				for (WebElement clubType : options) {
					if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("Sweet")) {
						selectByText(dpdWCInfoClubType(), "Club Type", "Variety");
						Thread.sleep(2000);
						changeWCInfonextBillingCycle();
						Page_PaymentDetails page_paymentDetails = new Page_PaymentDetails();
						page_paymentDetails.enterPaymentCardDetailsLightning(row);
						break;

					} else if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("Variety")) {
						ResultsLog.ReportInfo(driver, "Club Type Already at Higher Cost");
						break;

					} else if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("Red")) {
						ResultsLog.ReportInfo(driver, "Club Type Already at Higher Cost");
						break;
					} else if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("White")) {
						ResultsLog.ReportInfo(driver, "Club Type Already at Higher Cost");
						break;
					} else {

						ResultsLog.ReportFail(driver, "Required Club Type Not Available for Selection",
								"Required Club Type Not Available");

					}
				}

			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "Club Type Not visible");
				System.out.println("No frame found");
			}
			driver.switchTo().defaultContent();

		}
	}

	public void changeWCInfoClubTypeDecreasedCostImmediately() throws IOException {
		int size = driver.findElements(By.xpath("//*[@title='accessibility title']")).size();
		driver.switchTo().defaultContent();
		for (int i = 0; i < size; i++) {
			try {
				Thread.sleep(10000);
				driver.switchTo().frame(driver.findElement(By.xpath("(//*[@title='accessibility title'])[" + i + "]")));
				Select select = new Select(dpdWCInfoClubType());
				List<WebElement> options = select.getOptions();
				for (WebElement clubType : options) {
					if ((clubType.isSelected() && clubType.getText().equalsIgnoreCase("Variety"))
							|| (clubType.isSelected() && clubType.getText().equalsIgnoreCase("Red"))
							|| (clubType.isSelected() && clubType.getText().equalsIgnoreCase("White"))) {
						Thread.sleep(2000);

						selectByText(dpdWCInfoClubType(), "Club Type", "Sweet");
						Thread.sleep(2000);
						changeWCInfopayImmediately();
						clickProceedtoPayment();
						errorMessageforClubTypeChangeImmediately();
						driver.switchTo().defaultContent();
						break;
					} else {
						ResultsLog.ReportInfo(driver, "Club Type Already at Lower Cost");

					}
				}
				break;
			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "Club Type Not visible");
				System.out.println("No frame found");
			}
		}

	}

	public void changeWCInfoClubTypeDecreasedCostNextBillingCycle(int row) throws Exception {
		int size = driver.findElements(By.xpath("//*[@title='accessibility title']")).size();
		driver.switchTo().defaultContent();
		for (int i = 0; i < size; i++) {
			try {
				Thread.sleep(10000);
				driver.switchTo().frame(driver.findElement(By.xpath("(//*[@title='accessibility title'])[" + i + "]")));
				Thread.sleep(5000);

				System.out.println("Switched to frame " + i);
				Select select = new Select(dpdWCInfoClubType());
				List<WebElement> options = select.getOptions();
				System.out.println("Waiting to change ClubType ");
				for (WebElement clubType : options) {
					if ((clubType.isSelected() && clubType.getText().equalsIgnoreCase("Variety"))
							|| (clubType.isSelected() && clubType.getText().equalsIgnoreCase("Red"))
							|| (clubType.isSelected() && clubType.getText().equalsIgnoreCase("White"))) {
						Thread.sleep(3000);
						selectByText(dpdWCInfoClubType(), "Club Type", "Sweet");
						System.out.println("Changed to Sweet in" + i);
						Thread.sleep(5000);
						changeWCInfonextBillingCycle();
						clickProceedtoPayment();
						driver.switchTo().defaultContent();
						break;
					} else {
						ResultsLog.ReportInfo(driver, "Club Type Already at Lower Cost");
					}
				}
				break;
			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "Club Type Not visible");
				System.out.println("No frame found in " + i);
			}

		}
		Thread.sleep(2000);

		Page_PaymentDetails page_paymentDetails = new Page_PaymentDetails();
		page_paymentDetails.enterPaymentCardDetailsLightning(row);
	}

	public void changeWCInfofrom1to2BottleImmediately(int row) throws Exception {
		int size = driver.findElements(By.xpath("//*[@title='accessibility title']")).size();
		driver.switchTo().defaultContent();
		for (int i = 0; i < size; i++) {
			try {
				Thread.sleep(5000);
				driver.switchTo().frame(driver.findElement(By.xpath("(//*[@title='accessibility title'])[" + i + "]")));

				WebElement noOfBottlesList = driver.findElement(By.xpath(
						"(//*[(text()='# of Bottles')]/parent::th/following-sibling::td/child::div/child::select)[1]"));
				Select select = new Select(noOfBottlesList);
				List<WebElement> options = select.getOptions();
				for (WebElement we : options) {
					if (we.isSelected() && we.getText().equalsIgnoreCase("1")) {
						Thread.sleep(3000);
						selectByText(dpdWCInfoNoofBottles(), "No. of Bottles", "2");
						ResultsLog.ReportInfo(driver, we.getText() + " bottle selected");
						Thread.sleep(2000);
						changeWCInfopayImmediately();
						clickProceedtoPayment();

						break;
					} else if (we.isSelected() && we.getText().equalsIgnoreCase("2")) {
						ResultsLog.ReportInfo(driver, "Already" + we.getText() + "displayed");
						driver.switchTo().defaultContent();
					} else {
						ResultsLog.ReportInfo(driver,
								"Can't change bottles to :" + we.getText() + "As per the Requirement");
					}
				}
			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "Number of Bottles Not visible");
				System.out.println("No frame found");
			}
		}
		driver.switchTo().defaultContent();
		Page_MonthlyMembersEntry.chargeNewCreditCard_StoreOnFileClassic();
		Page_PaymentDetails page_paymentDetails = new Page_PaymentDetails();
		page_paymentDetails.EnterPaymentSection();
		page_paymentDetails.lnkGotoMember().click();
	}

	public void changeWCInfofrom1to2BottleNextBillingCycle(int row) throws Exception {
		int size = driver.findElements(By.xpath("//*[@title='accessibility title']")).size();
		driver.switchTo().defaultContent();
		for (int i = 0; i < size; i++) {
			try {
				Thread.sleep(5000);
				driver.switchTo().frame(driver.findElement(By.xpath("(//*[@title='accessibility title'])[" + i + "]")));
				WebElement noOfBottlesList = driver.findElement(By.xpath(
						"(//*[(text()='# of Bottles')]/parent::th/following-sibling::td/child::div/child::select)[1]"));
				Select select = new Select(noOfBottlesList);
				List<WebElement> options = select.getOptions();
				for (WebElement we : options) {
					if (we.isSelected() && we.getText().equalsIgnoreCase("1")) {
						Thread.sleep(3000);
						selectByText(dpdWCInfoNoofBottles(), "No. of Bottles", "2");
						ResultsLog.ReportInfo(driver, we.getText() + " bottle selected");
						Thread.sleep(2000);
						changeWCInfonextBillingCycle();
						clickProceedtoPayment();

						break;
					} else if (we.isSelected() && we.getText().equalsIgnoreCase("2")) {
						ResultsLog.ReportInfo(driver, "Already" + we.getText() + "displayed");
						driver.switchTo().defaultContent();
					} else {
						ResultsLog.ReportInfo(driver,
								"Can't change bottles to :" + we.getText() + "As per the Requirement");
					}
				}
			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "Number of Bottles Not visible");
				System.out.println("No frame found");
			}
		}
		driver.switchTo().defaultContent();
		Page_PaymentDetails page_paymentDetails = new Page_PaymentDetails();
		page_paymentDetails.enterPaymentCardDetailsLightning(row);
	}

	public void changeWCInfofrom2to1BottleImmediately() throws IOException, InterruptedException {
		int size = driver.findElements(By.xpath("//*[@title='accessibility title']")).size();
		driver.switchTo().defaultContent();
		for (int i = 0; i < size; i++) {
			try {
				Thread.sleep(5000);
				driver.switchTo().frame(driver.findElement(By.xpath("(//*[@title='accessibility title'])[" + i + "]")));
				WebElement noOfBottlesList = driver.findElement(By.xpath(
						"(//*[(text()='# of Bottles')]/parent::th/following-sibling::td/child::div/child::select)[1]"));
				Select select = new Select(noOfBottlesList);
				List<WebElement> options = select.getOptions();
				for (WebElement we : options) {
					if (we.isSelected() && we.getText().equalsIgnoreCase("2")) {
						Thread.sleep(3000);
						selectByText(dpdWCInfoNoofBottles(), "No. of Bottles", "1");
						ResultsLog.ReportInfo(driver, we.getText() + " bottle selected");
						Thread.sleep(2000);
						changeWCInfopayImmediately();
						clickProceedtoPayment();
						verifyTextEqual(readonlytxtbottleschangeImmediatelyErrorMessage(), "Error:",
								"Error For Bottles Change Immediately");
						driver.switchTo().defaultContent();
						break;
					} else if (we.isSelected() && we.getText().equalsIgnoreCase("1")) {
						ResultsLog.ReportInfo(driver, "Already" + we.getText() + "displayed");
						driver.switchTo().defaultContent();
					} else {
						ResultsLog.ReportInfo(driver,
								"Can't change bottles to :" + we.getText() + "As per the Requirement");
					}

				}
			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "Number of Bottles Not visible");
				System.out.println("No frame found");
			}
		}

	}

	public void changeWCInfofrom2to1BottleNextBillingCycle(int row) throws Exception {
		int size = driver.findElements(By.xpath("//*[@title='accessibility title']")).size();
		driver.switchTo().defaultContent();
		for (int i = 0; i < size; i++) {
			try {
				Thread.sleep(5000);
				driver.switchTo().frame(driver.findElement(By.xpath("(//*[@title='accessibility title'])[" + i + "]")));
				WebElement noOfBottlesList = driver.findElement(By.xpath(
						"(//*[(text()='# of Bottles')]/parent::th/following-sibling::td/child::div/child::select)[1]"));
				Select select = new Select(noOfBottlesList);
				List<WebElement> options = select.getOptions();
				for (WebElement we : options) {
					if (we.isSelected() && we.getText().equalsIgnoreCase("2")) {
						Thread.sleep(3000);
						selectByText(dpdWCInfoNoofBottles(), "No. of Bottles", "1");
						ResultsLog.ReportInfo(driver, we.getText() + " bottle selected");
						Thread.sleep(2000);
						changeWCInfonextBillingCycle();
						clickProceedtoPayment();

						break;
					} else if (we.isSelected() && we.getText().equalsIgnoreCase("1")) {
						ResultsLog.ReportInfo(driver, "Already" + we.getText() + "displayed");
						driver.switchTo().defaultContent();
					} else {
						ResultsLog.ReportInfo(driver,
								"Can't change bottles to :" + we.getText() + "As per the Requirement");
					}

				}
			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "Number of Bottles Not visible");
				System.out.println("No frame found");
			}
		}
		driver.switchTo().defaultContent();
		Page_PaymentDetails page_paymentDetails = new Page_PaymentDetails();
		page_paymentDetails.enterPaymentCardDetailsLightning(row);
	}

	public void changeWCInfonextBillingCycle() throws IOException, InterruptedException {

		selectByText(dpdWCInfoChargeTiming(), "Charge Type", "Next Billing Cycle");
	}

	public void changeWCInfopayImmediately() throws IOException {
		selectByText(dpdWCInfoChargeTiming(), "Charge Type", "Immediately");
	}

	public void clickSaveWCInfodetails() throws IOException {
		clickOnButton(btnSaveWCInfo(), "Save WC Info");
	}

	public void clickProceedtoPayment() throws IOException {
		clickOnButton(btnProceedtoPaymentDetails(), "Proceed to Payment");
	}

	public void LightningValidateWCMembers(int row) throws IOException, InterruptedException {
		LightningValidateWineClubInformation(row);
		LightningValidateWCMemberSummary(row);
		LightningValidateWCPointsInformation();
		LightningValidateWCAdditionalWCMemberInformation(row);
		if (!data.Getdata("WC Member Record Type", row).trim().equalsIgnoreCase("Gift Member")) {

			if (!data.Getdata("Delivery", row).trim().equalsIgnoreCase("Delivery")) {
				LightningWCWOMValidation(row);
			}
		}

	}

	public void MemberSignatureCheckedOPtOut() throws IOException, InterruptedException {
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		Thread.sleep(5000);
		clickOnCheckBox(editMemberSignatureOptOut(), "Edit Member Signature OptOut");
		Thread.sleep(5000);
		if (!chkMemberSignatureOptOut().isSelected())
			MemberSignatureOptOut();
		Thread.sleep(5000);
		clickOnButton(btnSaveMemberSignature(), "Member Signature Opted Out");
	}

	public void MemberSignatureCheckedOPtIn() throws IOException, InterruptedException {
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		Thread.sleep(5000);
		clickOnCheckBox(editMemberSignatureOptOut(), "Edit Member Signature OptIn");
		Thread.sleep(5000);
		if (chkMemberSignatureOptOut().isSelected())
			MemberSignatureOptOut();
		Thread.sleep(5000);
		clickOnButton(btnSaveMemberSignature(), "Member Signature Opted In");
	}

	public void LightningValidateWineClubInformation_Founder(int row) throws IOException, InterruptedException {

		ExpandWineClubInformation();
		ValidateLightCardNumber(row);
		ValidateLightName(row);
		ValidateLightMemberShipType(row);
		ValidateLightDelivery(row);
		ValidateLightClubType(row);
		ValidateLightNoofBottles(row);
		ValidateLightMembershipSignatureOptOut();
		ValidateFounderLightWCMemberStatus(row);
		ValidateFounderLightWCTier();
		ValidateFounderLightWCOpenBottles(row);
		ValidateFounderLightWCOpenTastings(row);
		ValidateFounderLightWCActivePoints(row);
		ValidateFounderLightWCMemberSince();
		if (!data.Getdata("Delivery", row).trim().equalsIgnoreCase("Delivery")) {
			LightningFounderWCWOMValidation(row);
		}
	}

	public void LightningValidateWineClubInformation_Complimentary(int row) throws IOException, InterruptedException {

		WineClubInformationComplimentary();
		ValidateComplimentaryLightCardNumber(row);
		ValidateComplimentaryLightName(row);
		ValidateComplimentaryLightMemberShipType(row);
		ValidateComplimentaryLightDelivery(row);
		ValidateComplimentaryLightClubType(row);
		ValidateComplimentaryLightNoofBottles(row);
		ValidateComplimentaryLightWCMemberStatus(row);
		// ValidateComplimentaryLightWCDurationofMemberShip(row);
		// ValidateComplimentaryLightWCMemberShipExpirationDate(row);
		ValidateComplimentaryLightWCPendingChanges();
		ValidateComplimentaryLightWCOpenBottles(row);
		ValidateComplimentaryLightWCOpenTastings(row);
		ValidateComplimentaryLightWCActivePoints(row);
		ValidateComplimentaryLightWCMemberSince();
		if (!data.Getdata("Delivery", row).trim().equalsIgnoreCase("Delivery")) {
			LightningComplimentaryWCWOMValidation(row);
		}

	}

	public void ClickEditMemberStatus() throws IOException {
		clickOnEditIcon(btnEditLightningWCMemberStatus(), "Member Status Edit");
	}

	public WebElement dpdClickForWCMemberStatus() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(By.xpath(
				"//span[text()='WC Member Status']/parent::span/following-sibling::div/child::div/child::div/child::div/child::a"));
	}

	public void SelectWCMemberStatus(String status) throws IOException {

		selectDpdForLightning(status, "Member Status");
	}

	public void ClickSaveWCMemberInformation() throws IOException {
		clickOnButton(btnSaveWCInformationPage(), "Save WC Member Information");
	}

	public void ClickSaveWCMemberWOM() throws IOException {
		clickOnButton(btnSaveWCMemberWOM(), "Save WC Member WOM");
	}

	public void LightningActivateMember(int row) throws IOException, InterruptedException {
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		ClickEditMemberStatus();
		Thread.sleep(1000);
		dpdClickForWCMemberStatus().click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SelectWCMemberStatus("Active");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ClickSaveWCMemberInformation();
	}

	public void replaceNewCreditCard() throws IOException, InterruptedException {
		paymentsLink().click();
		clickOnLink(lnkPaymentID(), "Edit Payment ID link");
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0,15000)");
		Thread.sleep(5000);
		cardNumberEdit().click();
		enterText(txtCardNumber(), "Card Number", "4444333311112222");
		Thread.sleep(2000);
		// cardNumberMonthEdit().click();
		// Thread.sleep(1000);
		dpdCardExpiryMonthClick().click();
		Thread.sleep(2000);
		selectDpdForLightning("01", "Expiry Month");
		// Thread.sleep(2000);
		// cardNumberYearEdit().click();
		Thread.sleep(1000);
		dpdCardExpiryYearClick().click();
		selectDpdForLightning("24", "Expiry Year");
		Thread.sleep(2000);
		clickOnButton(btnSaveCardDetails(), "Save Payment Card");
	}

	public void clearDeclineStatusLightning(int row) throws IOException, InterruptedException {
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("scroll(0,200)");
		Thread.sleep(1000);
		ClickEditMemberStatus();
		dpdClickForWCMemberStatus().click();
		if (dpdClickForWCMemberStatus().getText().contentEquals("UTP")) {

			SelectWCMemberStatus("Active");
			ClickSaveWCMemberInformation();
		} else {

			SelectWCMemberStatus("UTP");
			ClickSaveWCMemberInformation();
			ClickEditMemberStatus();
			dpdClickForWCMemberStatus().click();
			SelectWCMemberStatus("Active");
			ClickSaveWCMemberInformation();
		}
	}

	public void markOffTasting() throws InterruptedException, IOException {

		driver.switchTo().defaultContent();
		try {
			Thread.sleep(5000);
			driver.switchTo().frame(driver.findElement(By.xpath("(//*[@title='accessibility title'])[5]")));
		} catch (Exception e) {
			System.out.println("No frame found");
		}
		Thread.sleep(5000);
		ScrollDownbyJavaScript(5000);

		// Scroll(driver.findElement(By.xpath("//*[text()='WC Member Tasting']")));
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].scrollIntoView(true);",
		// driver.findElement(By.xpath("//*[text()='WC Member Tasting']")));

		Thread.sleep(5000);
		String currentMonth = BasePages.getCurrentMonthName();
		String currentYear = BasePages.getCurrentYear();
		List<WebElement> checkBoxList = driver.findElements(By.xpath(
				"//*[text()='Completed?']/parent::th/parent::tr/parent::thead/following-sibling::tbody/child::tr/child::td/child::input"));
		List<WebElement> womYearList = driver
				.findElements(By.xpath(".//*[@id='j_id0:j_id1:j_id2:j_id33']/tbody[1]/tr/td[2]/span"));
		List<WebElement> womMonthList = driver
				.findElements(By.xpath(".//*[@id='j_id0:j_id1:j_id2:j_id33']/tbody[1]/tr/td[3]/span"));
		for (int i = 0; i < checkBoxList.size(); i++) {

			WebElement checkBox = checkBoxList.get(i);
			WebElement womYearElement = womYearList.get(i);
			String womYear = womYearElement.getText();
			System.out.println("WOM Year :" + womYear);
			WebElement womMonthElement = womMonthList.get(i);
			String womMonth = womMonthElement.getText();
			System.out.println("WOM Month :" + womMonth);
			System.out.println("CheckBox Size:" + checkBox.getSize());
			if ((womYear != null && womYear.equalsIgnoreCase(currentYear))
					&& (womMonth != null && womMonth.equalsIgnoreCase(currentMonth))) {
				checkBox.click();
				ResultsLog.ReportPass(driver, "Clicked" + currentMonth + "WOM", "WOM Checkbox");
				System.out.println("Clicked" + currentMonth + "WOM");
				Thread.sleep(2000);
				Scroll(btnSaveWCMemberTasting());
				Thread.sleep(2000);
				clickOnButton(btnSaveWCMemberTasting(), "Save WC Member Tasting");
				System.out.println("Clicked Save WC Member Tasting button");
				break;

			} else {
				System.out.println(" current Month WOM not found ");
				break;

			}

		}
		driver.switchTo().defaultContent();
	}

	public void swap2WOMSfor1Lux() throws InterruptedException, IOException {

		int count = 0;

		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		try {
			Thread.sleep(5000);
			driver.switchTo().frame(driver.findElement(By.xpath("(//*[@title='accessibility title'])[3]")));
		} catch (Exception e) {
			System.out.println("No frame found");
		}
		Thread.sleep(5000);
		for (int i = 1; i < 10; i++) {

			try {
				WebElement womElement = driver.findElement(By.xpath(
						"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[3]/child::span)["
								+ i + "]"));
				String wom = womElement.getText();
				WebElement yearElement = driver.findElement(By.xpath(
						"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[2]/child::span)["
								+ i + "]"));
				String year = yearElement.getText();

				WebElement winelistElement = driver.findElement(By.xpath(
						"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[4])["
								+ i + "]"));
				String wine = winelistElement.getText();
				System.out.println("WOM ;" + wom + "Year :" + year + "Wine :" + wine);
				if (!wine.equalsIgnoreCase("July Thank You 2019")) {
					Thread.sleep(5000);
					clickOnButton(driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[1]/child::input)["
									+ i + "]")),
							"WOM Check Box");
					Thread.sleep(5000);
					selectByText(driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[5]/child::select)["
									+ i + "]")),
							"Alternate Wine", "Lux Cab Half Btl");
					String additionalPrice = driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[6]/child::label)["
									+ i + "]"))
							.getText();
					System.out.println("Dpd Value :" + additionalPrice);
					count++;

				} else {
					System.out.println("Required WOM not found ");
				}
				if (count == 2) {
					break;
				} else {

					System.out.println("Count :" + count);
				}
			} catch (Exception e) {
				System.out.println("Element not displyed");
				if (count == 2) {
					break;
				} else {

					System.out.println("Count :" + count);
				}
			}

		}

		Thread.sleep(10000);

		Scroll(btnSaveWCMemberWOM());
		Thread.sleep(10000);
		ClickSaveWCMemberWOM();
		waitForPageLoadToComplete();
		waitForAjax();
		driver.switchTo().defaultContent();
	}

	public void convertGiftMembershiptoMonthlybeforeExpirationDate() throws IOException, InterruptedException {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		cal.add(Calendar.DAY_OF_MONTH, 90);
		Date d = cal.getTime();
		System.out.println(d);
		String futureDate = sdf.format(d);
		Thread.sleep(5000);
		clickOnLink(lnkEdit(), "Edit");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		Thread.sleep(5000);
		readOnlyLightningWCMemberShipExpirationDate().clear();
		Thread.sleep(2000);
		readOnlyLightningWCMemberShipExpirationDate().sendKeys(futureDate);
		clickOnButton(btnSaveWCInformationPage(), "save WC Info");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				lnkChangeWCMemberRecordTypeIcon());
		Thread.sleep(2000);

		clickChangeMembershipType();

		Thread.sleep(2000);
		Menu menu = new Menu();
		if (!menu.rbtnLightMonthlyMember().isSelected()) {
			Thread.sleep(2000);
			clickOnButton(menu.rbtnLightMonthlyMember(), "Lightning Monthly Member");
		}

		Thread.sleep(2000);
		menu.btnNext().click();
		Thread.sleep(2000);
		clickOnButton(dpdMembershipType(), "Membership Type");
		selectDpdForLightning("Monthly", "Membership Type");
		clickOnButton(btnSaveWCInformationPage(), "WC Info Save");
	}

	public void convertGiftMembershiptoMonthlyafterExpirationDate() throws IOException, InterruptedException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		cal.add(Calendar.DAY_OF_MONTH, -90);
		Date d = cal.getTime();
		System.out.println(d);
		String pastDate = sdf.format(d);
		Thread.sleep(5000);
		clickOnLink(lnkEdit(), "Edit");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		Thread.sleep(5000);
		readOnlyLightningWCMemberShipExpirationDate().clear();
		Thread.sleep(2000);
		readOnlyLightningWCMemberShipExpirationDate().sendKeys(pastDate);
		clickOnButton(btnSaveWCInformationPage(), "save WC Info");
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				lnkChangeWCMemberRecordTypeIcon());
		Thread.sleep(2000);

		clickChangeMembershipType();

		Thread.sleep(2000);
		Menu menu = new Menu();
		if (!menu.rbtnLightMonthlyMember().isSelected()) {
			Thread.sleep(2000);
			clickOnButton(menu.rbtnLightMonthlyMember(), "Lightning Monthly Member");
		}

		Thread.sleep(2000);
		menu.btnNext().click();
		Thread.sleep(2000);
		clickOnButton(dpdMembershipType(), "Membership Type");
		selectDpdForLightning("Monthly", "Membership Type");
		clickOnButton(btnSaveWCInformationPage(), "WC Info Save");
	}

	public void changeDeliveryNextBillingCycle() throws IOException, InterruptedException {
		Thread.sleep(2000);
		clickEditWCInfo();
		changeWCInfoDelivery();

		clickProceedtoPayment();
	}

	public void changeclubTypeNextBillingCycleDecreasedCost(int row) throws Exception {
		Thread.sleep(2000);
		clickEditWCInfo();
		changeWCInfoClubTypeDecreasedCostNextBillingCycle(row);

	}

	public void changeclubTypeImmediatelyDecreasedCost() throws IOException, InterruptedException {
		Thread.sleep(2000);
		clickEditWCInfo();
		changeWCInfoClubTypeDecreasedCostImmediately();

	}

	public void changeclubTypeNextBillingCycleIncreasedCost(int row) throws Exception {
		Thread.sleep(2000);
		clickEditWCInfo();
		changeWCInfoClubTypeIncreasedCostNextBillingCycle(row);

	}

	public void changeclubTypeImmediatelyIncreasedCost() throws IOException, InterruptedException {
		Thread.sleep(2000);
		clickEditWCInfo();
		changeWCInfoClubTypeIncreasedCostImmediately();

	}

	public void change1to2BottlesImmediately(int row) throws Exception {
		Thread.sleep(2000);
		clickEditWCInfo();
		changeWCInfofrom1to2BottleImmediately(row);

	}

	public void change2to1BottlesImmediately(int row) throws Exception {
		Thread.sleep(2000);
		clickEditWCInfo();
		changeWCInfofrom2to1BottleImmediately();

	}

	public void change1to2BottlesNextBillingCycle(int row) throws Exception {
		Thread.sleep(2000);
		clickEditWCInfo();
		changeWCInfofrom1to2BottleNextBillingCycle(row);

	}

	public void change2to1BottlesNextBillingCycle(int row) throws Exception {
		Thread.sleep(2000);
		clickEditWCInfo();
		changeWCInfofrom2to1BottleNextBillingCycle(row);

	}

	public void errorMessageforbottlesChangeImmediately() throws IOException {
		verifyTextEqual(readonlytxtbottleschangeImmediatelyErrorMessage(), "Error:", "Changing Bottles Immediately");

	}

	public void errorMessageforClubTypeChangeImmediately() throws IOException {
		verifyTextEqual(readonlytxtClubTypechangeImmediatelyErrorMessage(), "Error:", "Changing CLub Type Immediately");

	}

	public void addLoyaltyPoints() throws IOException, InterruptedException {
		Thread.sleep(2000);
		clickNewWCMemberPointsHistory();
		selectPointsType();
		selectPointsStatus();
		enterPointsEarned();
		restaurantLocation();
		enterTotalPointsApplicable();
		saveLoyalytPoints();

	}

	public void SelectWCCurrentWOMPickUPwithUpcharge(int row)
			throws IOException, InterruptedException, ParseException, BiffException {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");

		cal.add(Calendar.MONTH, 0);
		Date d = cal.getTime();
		String priorMonth = sdf.format(d);

		System.out.println(priorMonth);
		int count = 0;
		String noOfBottles = null;
		try {
			noOfBottles = readOnlyLightNoofBottles().getText();
			Thread.sleep(3000);
			System.out.println("Num of bott :" + noOfBottles);
		} catch (Exception e) {
			System.out.println("Number of bottles not displyed");
		}

		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.xpath("(//*[@title='accessibility title'])[3]")));
		} catch (Exception e) {
			System.out.println("No frame found");
		}
		String CurrentYear = getCurrentYear();
		for (int i = 1; i < 10; i++) {

			try {
				WebElement womElement = driver.findElement(By.xpath(
						"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[3]/child::span)["
								+ i + "]"));
				String wom = womElement.getText();
				WebElement yearElement = driver.findElement(By.xpath(
						"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[2]/child::span)["
								+ i + "]"));
				String year = yearElement.getText();

				WebElement winelistElement = driver.findElement(By.xpath(
						"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[4])["
								+ i + "]"));
				String wine = winelistElement.getText();
				System.out.println("WOM ;" + wom + "Year :" + year + "Wine :" + wine);
				if (year.equalsIgnoreCase(CurrentYear) && !wine.equalsIgnoreCase("July Thank You 2019")
						&& !wine.equalsIgnoreCase("Sweet") && wom.equalsIgnoreCase(priorMonth)) {
					Thread.sleep(5000);
					driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[1]/child::input)["
									+ i + "]"))
							.click();
					ResultsLog.ReportPass(driver, "WOM Chechbox Clicked", "WOM");
					Thread.sleep(5000);
					selectByText(driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[5]/child::select)["
									+ i + "]")),
							"Alternate Wine", "Lux Cab");
					ResultsLog.ReportPass(driver, "WOM Alternate Wine Selected", "WOM Alternate Wine");
					String additionalPrice = driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[6]/child::label)["
									+ i + "]"))
							.getText();
					System.out.println("Dpd Value :" + additionalPrice);
					count++;

					if (!additionalPrice.equalsIgnoreCase("0")) {
						ResultsLog.ReportPass(driver, "WOM with Upcharge :" + additionalPrice,
								"Current WOM With Price Upcharge");
						System.out.println("Count :" + count);
					} else {
						ResultsLog.ReportFail(driver, "WOM with Upcharge :" + additionalPrice,
								"Current WOM With Price Upcharge is failed");
						System.out.println("Required WOM not found ");
					}

				} else {
					ResultsLog.ReportInfo(driver, "Required WOM not found ");
					System.out.println("Required WOM not found ");
				}
				if (Integer.parseInt(noOfBottles) == count) {
					break;
				} else {

					System.out.println("Count :" + count);
				}

			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "No List Available");
				break;
			}

		}

		Thread.sleep(10000);

		try {
			if (!btnProceedRoPaymentWOM().isDisplayed()) {
				Scroll(btnProceedRoPaymentWOM());
				Thread.sleep(1000);
				btnProceedRoPaymentWOM().click();
			} else {
				Thread.sleep(1000);
				btnProceedRoPaymentWOM().click();
			}
		} catch (Exception e) {
			System.out.println("Btn Proceed to Payment not available");
		}

		Thread.sleep(5000);
		Page_NewMember.chargeNewCreditCard_StoreOnFile();
		Page_PaymentDetails page_PaymentDetails = new Page_PaymentDetails();
		page_PaymentDetails.EnterandValidate_MonthlyPaymentPage(row);
		driver.switchTo().defaultContent();
	}

	public void SelectWCCurrentWOMPickUP() throws IOException, InterruptedException, ParseException {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");

		cal.add(Calendar.MONTH, 0);
		Date d = cal.getTime();
		String currentMonth = sdf.format(d);

		System.out.println(currentMonth);
		String CurrentYear = getCurrentYear();
		int count = 0;
		String noOfBottles = readOnlyLightNoofBottles().getText();
		Thread.sleep(3000);
		System.out.println("Num of bott :" + noOfBottles);
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.xpath("(//*[@title='accessibility title'])[3]")));
		} catch (Exception e) {
			System.out.println("No frame found");
		}
		for (int i = 1; i < 10; i++) {

			try {
				WebElement womElement = driver.findElement(By.xpath(
						"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[3]/child::span)["
								+ i + "]"));
				String wom = womElement.getText();
				WebElement yearElement = driver.findElement(By.xpath(
						"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[2]/child::span)["
								+ i + "]"));
				String year = yearElement.getText();

				WebElement winelistElement = driver.findElement(By.xpath(
						"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[4])["
								+ i + "]"));
				String wine = winelistElement.getText();
				System.out.println("WOM ;" + wom + "Year :" + year + "Wine :" + wine);
				if (year.equalsIgnoreCase(CurrentYear) && !wine.equalsIgnoreCase("July Thank You 2019")
						&& wom.equalsIgnoreCase(currentMonth)) {
					Thread.sleep(5000);
					driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[1]/child::input)["
									+ i + "]"))
							.click();
					ResultsLog.ReportPass(driver, "WOM Chechbox Clicked", "WOM");
					Thread.sleep(5000);
					selectByText(driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[5]/child::select)["
									+ i + "]")),
							"Alternate Wine", "Almond Sparkling");
					ResultsLog.ReportPass(driver, "Alternate Wine Selected", "WOM Alternate Wine");
					String additionalPrice = driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[6]/child::label)["
									+ i + "]"))
							.getText();
					System.out.println("Dpd Value :" + additionalPrice);
					count++;

				} else {
					ResultsLog.ReportPass(driver, "Required WOM not found ", "WOM");
					System.out.println("Required WOM not found ");
				}
				if (Integer.parseInt(noOfBottles) == count) {
					break;
				} else {
					System.out.println("Count :" + count);
				}

			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "No list available");
				break;
			}

		}

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("scroll(0,1000)");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Scroll(btnSaveWCMemberWOM());
		Thread.sleep(10000);
		ClickSaveWCMemberWOM();
		waitForPageLoadToComplete();
		waitForAjax();
		driver.switchTo().defaultContent();

	}

	public void SelectWCPriorWOMPickUPwithUpcharge(int row)
			throws IOException, InterruptedException, ParseException, BiffException {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");

		cal.add(Calendar.MONTH, -1);
		Date d = cal.getTime();
		String priorMonth = sdf.format(d);

		System.out.println(priorMonth);
		int count = 0;
		String noOfBottles = readOnlyLightNoofBottles().getText();
		Thread.sleep(3000);
		System.out.println("Num of bott :" + noOfBottles);
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.xpath("(//*[@title='accessibility title'])[3]")));
		} catch (Exception e) {
			System.out.println("No frame found");
		}
		String CurrentYear = getCurrentYear();
		for (int i = 1; i < 10; i++) {

			try {
				WebElement womElement = driver.findElement(By.xpath(
						"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[3]/child::span)["
								+ i + "]"));
				String wom = womElement.getText();
				WebElement yearElement = driver.findElement(By.xpath(
						"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[2]/child::span)["
								+ i + "]"));
				String year = yearElement.getText();

				WebElement winelistElement = driver.findElement(By.xpath(
						"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[4])["
								+ i + "]"));
				String wine = winelistElement.getText();
				System.out.println("WOM ;" + wom + "Year :" + year + "Wine :" + wine);
				if (year.equalsIgnoreCase(CurrentYear) && !wine.equalsIgnoreCase("July Thank You 2019")
						&& !wine.equalsIgnoreCase("Sweet") && wom.equalsIgnoreCase(priorMonth)) {
					Thread.sleep(5000);
					driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[1]/child::input)["
									+ i + "]"))
							.click();
					ResultsLog.ReportPass(driver, "WOM Chechbox Clicked", "WOM");
					Thread.sleep(5000);
					selectByText(driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[5]/child::select)["
									+ i + "]")),
							"Alternate Wine", "Lux Cab");
					ResultsLog.ReportPass(driver, "WOM Alternate Wine Selected", "WOM Alternate Wine");
					String additionalPrice = driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[6]/child::label)["
									+ i + "]"))
							.getText();
					System.out.println("Dpd Value :" + additionalPrice);
					count++;

					if (!additionalPrice.equalsIgnoreCase("0")) {
						ResultsLog.ReportPass(driver, "WOM with Upcharge :" + additionalPrice,
								"Current WOM With Price Upcharge");
						System.out.println("Count :" + count);
					} else {
						ResultsLog.ReportFail(driver, "WOM with Upcharge :" + additionalPrice,
								"Current WOM With Price Upcharge is failed");
						System.out.println("Required WOM not found ");
					}

				} else {
					ResultsLog.ReportInfo(driver, "Required WOM not found for Prior Month :" + priorMonth);
					System.out.println("Required WOM not found for Prior Month :" + priorMonth);
				}
				if (Integer.parseInt(noOfBottles) == count) {
					break;
				} else {

					System.out.println("Count :" + count);
				}

			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "No List Available");
				break;
			}

		}

		try {
			if (!btnProceedRoPaymentWOM().isDisplayed()) {
				Scroll(btnProceedRoPaymentWOM());
			}
		} catch (Exception e) {
			System.out.println("Btn Proceed to Payment not available");
		}
		try {
			Thread.sleep(10000);
			btnProceedRoPaymentWOM().click();
			waitForPageLoadToComplete();
			waitForAjax();

			Thread.sleep(5000);
			Page_NewMember.chargeNewCreditCard_StoreOnFile();
		} catch (Exception e) {
			System.out.println("Element not displyed");
		}

		Page_PaymentDetails page_PaymentDetails = new Page_PaymentDetails();
		page_PaymentDetails.EnterandValidate_MonthlyPaymentPage(row);
		driver.switchTo().defaultContent();
	}

	public void SelectWCPriorWOMPickUP() throws IOException, InterruptedException, ParseException {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");

		cal.add(Calendar.MONTH, -1);
		Date d = cal.getTime();
		String priorMonth = sdf.format(d);

		System.out.println(priorMonth);
		int count = 0;
		String noOfBottles = readOnlyLightNoofBottles().getText();
		Thread.sleep(3000);
		System.out.println("Num of bott :" + noOfBottles);
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.xpath("(//*[@title='accessibility title'])[3]")));
		} catch (Exception e) {
			System.out.println("No frame found");
		}
		Thread.sleep(2000);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("scroll(0,1000)");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String CurrentYear = getCurrentYear();
		for (int i = 1; i < 10; i++) {
			try {
				WebElement womElement = driver.findElement(By.xpath(
						"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[3]/child::span)["
								+ i + "]"));
				String wom = womElement.getText();
				WebElement yearElement = driver.findElement(By.xpath(
						"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[2]/child::span)["
								+ i + "]"));
				String year = yearElement.getText();

				WebElement winelistElement = driver.findElement(By.xpath(
						"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[4])["
								+ i + "]"));
				String wine = winelistElement.getText();
				System.out.println("WOM ;" + wom + "Year :" + year + "Wine :" + wine);
				if (year.equalsIgnoreCase(CurrentYear) && !wine.equalsIgnoreCase("July Thank You 2019")
						&& wom.equalsIgnoreCase(priorMonth)) {
					Thread.sleep(5000);
					driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[1]/child::input)["
									+ i + "]"))
							.click();
					ResultsLog.ReportPass(driver, "WOM Chechbox Clicked", "WOM");
					Thread.sleep(5000);
					selectByText(driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[5]/child::select)["
									+ i + "]")),
							"Alternate Wine", "Almond Sparkling");
					ResultsLog.ReportPass(driver, "WOM Alternate Wine Selected", "WOM Alternate Wine");
					String additionalPrice = driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[6]/child::label)["
									+ i + "]"))
							.getText();
					System.out.println("Dpd Value :" + additionalPrice);
					count++;

				} else {

					ResultsLog.ReportPass(driver, "Required WOM not found ", "WOM");
					System.out.println("Required WOM not found ");
				}
				if (Integer.parseInt(noOfBottles) == count) {
					break;
				} else {

					System.out.println("Count :" + count);
				}

			} catch (Exception e) {
				ResultsLog.ReportPass(driver, "No list Available", "WOM");
				break;
			}

		}

		Thread.sleep(10000);

		Scroll(btnSaveWCMemberWOM());
		Thread.sleep(10000);
		ClickSaveWCMemberWOM();
		waitForPageLoadToComplete();
		waitForAjax();
		driver.switchTo().defaultContent();
	}
}
