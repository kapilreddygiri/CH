package com.MGS.CommonPages;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.MGS.Pages.Page_MonthlyMembersEntry;
import com.MGS.PagesData.Member_SignUpPagedata;
import com.Restaurant.CommonPages.Resaurant_Menu;
import com.Restaurant.Pages.Page_MemberSearch;
import com.Restaurant.Pages.Page_ProcessPayment;
import com.Restaurant.Pages.Page_WineClubInformation;
import com.Restaurant.Pages.Page_WinePickUp;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;

public class ClassicWCMemberValidationPage extends BasePages {

	Member_SignUpPagedata data = new Member_SignUpPagedata();

	/*
	 * public ClassicWCMemberValidationPage() { System.out.println("Constructor");
	 * 
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); }
	 */

	// Wind Club Information Error object
	public WebElement readonlytxtClubTypechangeImmediatelyErrorMessage() {
		return driver.findElement(By.xpath(
				"//div[@class='message errorM3']/child::table/child::tbody/child::tr/child::td/following-sibling::td/child::div/child::span"));
	}

	public WebElement readonlytxtbottleschangeImmediatelyErrorMessage() {
		return driver.findElement(By.xpath("Charge should be 'Next billing cycle' if changing the level from 2 to 1"));
	}

// Objects from WC Member-Details Page --- Lightning
// Wine Club Information
	public WebElement btnOverrideMGS() {

		return driver.findElement(By.xpath("//input[@value='M&GS Override']"));
	}

	public WebElement btnEditWCInfo() {

		return driver.findElement(By.xpath("(//*[@value='Edit WC Info'])[1]"));
	}

	public WebElement btncancelMembership() {

		return driver.findElement(By.xpath("(//*[@value='Cancel Membership'])[1]"));
	}

	public WebElement btnbarrelReserveOrder() {

		return driver.findElement(By.xpath("(//*[@value='Barrel Reserve Order'])[1]"));
	}

	public WebElement btnEdit() {

		return driver.findElement(By.xpath("(//*[@value=' Edit '])[1]"));
	}

	public WebElement dpdwnEditWCMemberStatus() {
		return driver.findElement(By.xpath(
				"//*[text()='WC Member Status']/parent::td/parent::tr/child::td/following-sibling::td/following-sibling::td/following-sibling::td/child::div/child::span/child::select"));
	}

//Edit WC Info Objects

	public WebElement txtEditVacationStartDate() {

		return driver.findElement(By.xpath(
				"(//label[text()='Vacation Start Date']/parent::td/following-sibling::td/child::span/child::input)[1]"));
	}

	public WebElement txtEditVacationEndDate() {

		return driver.findElement(By.xpath(
				"//label[text()='Vacation End Date']/parent::td/following-sibling::td/child::span/child::input"));
	}

	public WebElement dpdwineClubInfoDelivery() {

		return driver.findElement(By.xpath("(//div[@class='requiredInput']/select)[1]"));
	}

	public WebElement dpdclubType() {

		return driver.findElement(By.xpath("(//div[@class='requiredInput']/select)[2]"));
	}

	public WebElement dpdnumOfBottles() {

		return driver.findElement(By.xpath("(//div[@class='requiredInput']/select)[3]"));
	}

	public WebElement dpddurationOfMembership() {

		return driver.findElement(By.xpath("//select[@tabindex='40']"));
	}

	public WebElement btnRejoinMember() {

		return driver.findElement(By.xpath("//*[@value='Member Rejoin']"));
	}
	// *[@value='Member Rejoin']
	// same xpath is captured based on the position of the field displayed
	// as per monthly and gift membership selection for conversion(Above and Below)

	public WebElement dpdChargeTiming() {

		return driver.findElement(By.xpath("//select[@tabindex='40']"));
	}

	public WebElement txtmembershipExpirationDate() {

		return driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	}

	public WebElement WineClubInformationSection() {

		return driver.findElement(By.xpath("//*[text()='Wine Club Information']/parent::*/img"));
	}

	public WebElement readonlyWCCardNumber() {

		return driver.findElement(By.xpath(
				"//*[text()='Wine Club Information']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='Card Number']/following-sibling::td[1]/div"));
	}

	public WebElement readonlyWCName() {

		return driver.findElement(By.xpath(
				"//*[text()='Wine Club Information']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='Name']/following-sibling::td[1]/div"));
	}

	public WebElement readonlyWCMembershipType() {

		return driver.findElement(By.xpath(
				"//*[text()='Wine Club Information']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='Membership Type']/following-sibling::td[1]/div"));
	}

	public WebElement readonlyWCDelivery() {

		return driver.findElement(By.xpath(
				"//*[text()='Wine Club Information']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='Delivery']/following-sibling::td[1]/div"));
	}

	public WebElement readonlyWCClubType() {

		return driver.findElement(By.xpath(
				"//*[text()='Wine Club Information']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='Club Type']/following-sibling::td[1]/div"));
	}

	public WebElement readonlyWCNoOfBottles() {

		return driver.findElement(By.xpath(
				"//*[text()='Wine Club Information']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='# of Bottles']/following-sibling::td[1]/div"));
	}

	public WebElement readOnlyClassicCostofMembership() {

		return driver.findElement(By.xpath(
				"//*[text()='Wine Club Information']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='Cost of Membership']/following-sibling::td[1]/div"));
	}

	public WebElement readOnlyClassicWCMemberStatus() {

		return driver.findElement(By.xpath(
				"//*[text()='Wine Club Information']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='WC Member Status']/following-sibling::td[1]/div[1]"));
	}

	public WebElement btnProceedtoPaymentDetails() {

		return driver.findElement(By.xpath("//*[contains(@value,'Proceed to Payment Details')]"));
	}

	public WebElement readOnlyErrorMessageClubTypeChangeImmediately() {

		return driver.findElement(By.xpath(
				"//*[contains(text(),'Club Type change from Red/White/Variety to Sweet and Sweet to Red/White/Variety will be effective in the Next billing cycle.')]"));
	}

	public WebElement readOnlyErrorMessageBottlesChangeImmediately() {

		return driver.findElement(By.xpath("Charge should be 'Next billing cycle' if changing the level from 2 to 1"));
	}

	public WebElement dpdEditWCmemberStatus() {
		// *[text()='Wine Club
		// Information']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='WC
		// Member Status']/following-sibling::td[1]/div[2]/span/select
		return driver.findElement(By.xpath("//div[@class='inlineEditRequiredDiv']/span/select"));
	}

	public WebElement txtEditMembershipExpirationDate() {
		return driver.findElement(By.xpath(
				"//label[text()='Membership Expiration Date']/parent::span/parent::td/following-sibling::td/child::span/child::input"));
	}

	public WebElement readOnlyClassicTier() {

		return driver.findElement(By.xpath(
				"//*[text()='Wine Club Information']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='Tier']/following-sibling::td[1]/div"));
	}

	public WebElement readOnlyDurationofMembership() {

		return driver.findElement(By.xpath(
				"//*[text()='Wine Club Information']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='Duration of Membership']/following-sibling::td[1]/div"));
	}

	public WebElement readOnlyPendingChanges() {

		return driver.findElement(By.xpath(
				"//*[text()='Wine Club Information']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='Pending Changes']/following-sibling::td[1]/div"));
	}

	public WebElement readOnlyClassicWCMemberShipExpirationDate() {

		return driver.findElement(By.xpath("//td[@class='dataCol inlineEditWrite']/div/input"));

	}

	public WebElement changeMembershipLink() {

		return driver.findElement(By.xpath("//a[contains(text(),'[Change]')]"));
	}

	public WebElement chkMemberSignatureOptOut() {

		return driver.findElement(
				By.xpath("//label[text()='Member Signature Opt-Out']/parent::td/following-sibling::td/child::input"));
	}

	public WebElement btnSaveMemberSignature() {

		return driver.findElement(By.name("inlineEditSave"));
	}

	@FindBy(xpath = "//label[contains(text(),'Number of Open Tastings:')]/following-sibling::table/child::tbody/child::tr[1]/child::td[1]/child::input")
	public WebElement chkTastings1;

	@FindBy(xpath = "//label[contains(text(),'Number of Open Tastings:')]/following-sibling::table/child::tbody/child::tr[2]/child::td[1]/child::input")
	public WebElement chkTastings2;

	@FindBy(xpath = "//input[@value='Save WC Member Tasting']")
	public WebElement btnSaveWCMemberTasting;

	@FindBy(xpath = "(//*[text()='WC Member Tasting History'])[2]/parent::td/following::div[1]/table/tbody/tr[2]/td[5]")
	public WebElement rdnWCMemberHistoryTastingDate;

	@FindBy(xpath = "(//*[text()='WC Member Tasting History'])[2]/parent::td/following::div[1]/table/tbody/tr[3]/td[5]")
	public WebElement rdnWCMemberHistoryTastingDate2;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[1]/td[1]/input")
	public WebElement WCMEMBERWOMCheckBox1;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[2]/td[1]/input")
	public WebElement WCMEMBERWOMCheckBox2;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[3]/td[1]/input")
	public WebElement WCMEMBERWOMCheckBox3;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[4]/td[1]/input")
	public WebElement WCMEMBERWOMCheckBox4;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[5]/td[1]/input")
	public WebElement WCMEMBERWOMCheckBox5;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[1]/td[2]/span")
	public WebElement WCMEMBERWOMYear1;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[2]/td[2]/span")
	public WebElement WCMEMBERWOMYear2;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[3]/td[2]/span")
	public WebElement WCMEMBERWOMYear3;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[4]/td[2]/span")
	public WebElement WCMEMBERWOMYear4;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[5]/td[2]/span")
	public WebElement WCMEMBERWOMYear5;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[1]/td[3]/span")
	public WebElement WCMEMBERWOMMonth1;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[2]/td[3]/span")
	public WebElement WCMEMBERWOMMonth2;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[3]/td[3]/span")
	public WebElement WCMEMBERWOMMonth3;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[4]/td[3]/span")
	public WebElement WCMEMBERWOMMonth4;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[5]/td[3]/span")
	public WebElement WCMEMBERWOMMonth5;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[1]/td[5]/select")
	public WebElement AlternateWine1;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[2]/td[5]/select")
	public WebElement AlternateWine2;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[3]/td[5]/select")
	public WebElement AlternateWine3;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[4]/td[5]/select")
	public WebElement AlternateWine4;

	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[5]/td[5]/select")
	public WebElement AlternateWine5;
	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[1]/td[4]")
	public WebElement WOM1;
	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[2]/td[4]")
	public WebElement WOM2;
	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[3]/td[4]")
	public WebElement WOM3;
	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[4]/td[4]")
	public WebElement WOM4;
	@FindBy(xpath = "//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr[5]/td[4]")
	public WebElement WOM5;

	@FindBy(xpath = "//*[@value='Save WC Member WOM']")
	public WebElement btnSaveWCMemberWOM;
	@FindBy(xpath = "//*[@type='button'][@value='Proceed to Payment']")
	public WebElement btnProceedToPaymentWOM;

	public WebElement readOnlyTextAdditionalPrice() {
		return driver.findElement(By.xpath(
				"//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[6]/label"));

	}

	public WebElement readOnlyClassicWCOpenBottles() {

		return driver.findElement(By.xpath(
				"//*[text()='WC Member Summary']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='Open Bottles']/following-sibling::td[1]/div"));
	}

	public WebElement btnNewPayment() {

		return driver.findElement(By.xpath("//input[@title='New Payment']"));
	}

	public WebElement readOnlyClassicWCOpenTastings() {

		return driver.findElement(By.xpath(
				"//*[text()='WC Member Summary']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='Open Tastings']/following-sibling::td[1]/div"));
	}

	public WebElement readOnlyClassicWCLifeTimeBottles() {

		return driver.findElement(By.xpath(
				"//*[text()='WC Member Summary']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='Lifetime Bottles']/following-sibling::td[1]/div"));
	}

	public WebElement readOnlyClassicWCAmbassadorTenureCredits() {

		return driver.findElement(By.xpath(
				"//*[text()='WC Member Summary']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='Ambassador Tenure Credits']/following-sibling::td[1]/div"));
	}

	public WebElement readOnlyClassicWCAnnualAmbassadorSpendCredits() {

		return driver.findElement(By.xpath(
				"//*[text()='WC Member Summary']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='Annual Ambassador Spend Credits']/following-sibling::td[1]/div"));
	}

	public WebElement readOnlyClassicWCTotalAmbassadorCredits() {

		return driver.findElement(By.xpath(
				"//*[text()='WC Member Summary']/parent::*/following-sibling::div/child::table/child::tbody/child::tr/child::td[text()='Total Ambassador Credits']/following-sibling::td[1]/div"));
	}

	public WebElement readOnlyClassicWCActivePoints() {

		return driver.findElement(By.xpath(
				"//*[text()='WC Member Summary']/parent::*/following-sibling::div[1]/child::table/child::tbody/child::tr/child::td[text()='Active Points']/following-sibling::td[1]/div"));
	}

	public WebElement readOnlyClassicWCMemberSince() {

		return driver.findElement(By.xpath(
				"//*[text()='WC Member Summary']/parent::*/following-sibling::div[1]/child::table/child::tbody/child::tr/child::td[text()='Member Since']/following-sibling::td[1]/div"));
	}

	public WebElement readOnlyClassicWCPointsInformationActivePoints() {

		return driver.findElement(By.xpath(
				"//*[text()='Points Information']/parent::*/following-sibling::div[1]/child::table/child::tbody/child::tr/child::td[text()='Active Points']/following-sibling::td[1]/div"));
	}

	public WebElement readOnlyClassicWCPointsInformationInActivePoints() {

		return driver.findElement(By.xpath(
				"//*[text()='Points Information']/parent::*/following-sibling::div[1]/child::table/child::tbody/child::tr/child::td[text()='Inactive Points']/following-sibling::td[1]/div"));
	}

	public WebElement readOnlyClassicWCPointsInformationNewPoints() {

		return driver.findElement(By.xpath(
				"//*[text()='Points Information']/parent::*/following-sibling::div[1]/child::table/child::tbody/child::tr/child::td[text()='New Points']/following-sibling::td[1]/div"));
	}

	public WebElement readOnlyClassicWCPointsInformationLifeTimePoints() {

		return driver.findElement(By.xpath(
				"//*[text()='Points Information']/parent::*/following-sibling::div[1]/child::table/child::tbody/child::tr/child::td[text()='Lifetime Points']/following-sibling::td[1]/div"));
	}

	public WebElement readOnlyClassicWCAdditionalWCMemberInformation() {

		return driver.findElement(By.xpath(
				"//*[text()='Additional WC Member Information']/parent::*/following-sibling::div[1]/child::table/child::tbody/child::tr/child::td[text()='Sign Up Location']/following-sibling::td[1]/div/a"));
	}

	public static WebElement readOnlyClassicWCWomOpenbottles() {

		return driver.findElement(By.xpath("//*[contains(text(),'Open Bottles:')]/span"));
	}

	public WebElement readOnlyClassicWCYear() {

		return driver.findElement(
				By.xpath("//*[text()='WOM Year']/parent::*/parent::*/following::tbody/child::tr[1]/td[2]/span"));
	}

	public WebElement readOnlyClassicWCMonth() {

		return driver.findElement(
				By.xpath("//*[text()='WOM Year']/parent::*/parent::*/following::tbody/child::tr[1]/td[3]/span"));
	}

	public WebElement readOnlyClassicWCYear2() {

		return driver.findElement(
				By.xpath("//*[text()='WOM Year']/parent::*/parent::*/following::tbody/child::tr[2]/td[2]/span"));
	}

	public WebElement readOnlyClassicWCMonth2() {

		return driver.findElement(
				By.xpath("//*[text()='WOM Year']/parent::*/parent::*/following::tbody/child::tr[2]/td[3]/span"));
	}

	// Objects from New WC Member Cards Page --- Classic
	public WebElement btnNewWCMemberCard() {

		return driver.findElement(By.xpath("//*[@title='New WC Member Card']"));
	}

	public WebElement txtMemberCardCardNumber() {

		return driver
				.findElement(By.xpath("//label[text()='Card Number']/parent::td/following-sibling::td/child::input"));
	}

	public WebElement txtActivatedDate() {

		return driver.findElement(By.xpath(
				"//*[text()='Activated Date']/parent::td/following-sibling::td/child::div/child::span/child::input"));
	}

	public WebElement btnSaveNewWCMemberCard() {

		return driver.findElement(By.xpath("(//*[@title='Save'])[2]"));
	}

	// WOM Error object
	public WebElement readonlytxtWOMErrorMessage() {
		return driver.findElement(By.xpath(
				"//div[@class='message errorM3']/child::table/child::tbody/child::tr/child::td/following-sibling::td/child::div/child::span"));
	}

	// Objects from WC Member-Details Page --- Classic
	// WC member edit page
	public WebElement dpdMembershipType() {

		return driver.findElement(
				By.xpath("//*[text()='Membership Type']/parent::td/following-sibling::td/child::span/child::select"));
	}

	// WC Member Point History
	public static WebElement btnNewWCMemberPointsHistory() {

		return driver.findElement(By.xpath("//input[@value='New WC Member Points History']"));

	}

	public static WebElement dpdPointsType() {

		return driver.findElement(By.xpath("(//table[@class='detailList']/tbody/tr/td[2]/div/span/select)[1]"));
	}

	public static WebElement dpdPointsStatus() {

		return driver.findElement(By.xpath("(//table[@class='detailList']/tbody/tr/td[2]/div/span/select)[2]"));
	}

	public static WebElement txtPointsEarned() {

		return driver.findElement(By.xpath("(//*[contains(text(),'Points Earned')]/following::input)[1]"));
	}

	public static WebElement txtRestaurantLocation() {

		return driver.findElement(By.xpath("(//span[@class='lookupInput']/input)[2]"));
	}

	public static WebElement btnRestaurantLocation() {

		return driver.findElement(By.xpath("//img[@alt='Restaurant Location Lookup (New Window)']"));
	}

	public static WebElement txtlocationName() {

		return driver.findElement(By.xpath(
				"//th[text()='Location Name']/parent::tr/parent::tbody/child::tr/following-sibling::tr/child::th/child::a"));
	}

	public static WebElement txtPointsApplicableTotal() {

		return driver.findElement(By.xpath(
				"//*[text()='Points Applicable Total']/parent::td/following-sibling::td/child::div/child::input"));
	}

	public static WebElement txtRestuarentEmployeeName() {

		return driver.findElement(By.xpath("(//*[contains(text(),'Restaurant Employee Name')]/following::input)[1]"));
	}

	public static WebElement txtCheckTotal() {

		return driver.findElement(By.xpath("(//*[contains(text(),'Restaurant Employee Name')]/following::input)[2]"));
	}

	public static WebElement txtRevenuezCenter() {

		return driver.findElement(By.xpath("(//*[contains(text(),'Restaurant Employee Name')]/following::input)[3]"));
	}

	public static WebElement btnSaveloyaltyPoints() {

		return driver.findElement(By.xpath("(//*[@name='save'])[2]"));
	}

	public static WebElement btnBarrelOrderReserve() {
		return driver.findElement(By.xpath("//*[@name='chw_barrel_reserve_order']"));
	}

	public static WebElement txtCountofRegularBottles() {
		return driver.findElement(By.xpath("//*[@name='j_id0:barrelForm:page:orderDetails:j_id37:regBottles']"));
	}

	public static WebElement txtCountofMagnumBottles() {
		return driver.findElement(By.xpath("//*[@name='j_id0:barrelForm:page:orderDetails:j_id45:magBottles']"));
	}

	public static WebElement rdnHomeAddress() {
		return driver.findElement(By.xpath("//*[@name='j_id0:barrelForm:page:shippingOptions:j_id50:0:j_id52:0']"));
	}

	public static WebElement btnProceedtoPayment() {
		return driver.findElement(By.xpath("//*[@type='submit'][@value='Proceed to Payment']"));
	}

	public static WebElement tblWCMemberWOM() {
		return driver.findElement(By.xpath("//*[@type='submit'][@value='Proceed to Payment']"));
	}

	public static WebElement lnkEditPayment() {
		return driver.findElement(By.xpath(
				"(//*[text()='Payment ID']/parent::tr/parent::tbody/child::tr/following-sibling::tr/child::td/child::a)[1]"));
	}

	public static WebElement txtCardNumber() {
		return driver.findElement(By.xpath(
				"//*[text()='Card Number']/parent::span/parent::td/parent::tr/parent::tbody/parent::table/child::tbody/child::tr/following-sibling::tr/following-sibling::tr/following-sibling::tr/following-sibling::tr/following-sibling::tr/child::td/following-sibling::td/child::input"));
	}

	public static WebElement dpdCardExpiryMonth() {
		return driver.findElement(By.xpath(
				"//*[text()='Card Number']/parent::span/parent::td/parent::tr/parent::tbody/parent::table/child::tbody/child::tr/following-sibling::tr/following-sibling::tr/following-sibling::tr/following-sibling::tr/following-sibling::tr/following-sibling::tr/child::td/following-sibling::td/child::span/child::select"));
	}

	public static WebElement dpdCardExpiryYear() {
		return driver.findElement(By.xpath(
				"//*[text()='Card Number']/parent::span/parent::td/parent::tr/parent::tbody/parent::table/child::tbody/child::tr/following-sibling::tr/following-sibling::tr/following-sibling::tr/following-sibling::tr/following-sibling::tr/following-sibling::tr/following-sibling::tr/child::td/following-sibling::td/child::span/child::select"));
	}

	public static WebElement btnSaveCardDetails() {
		return driver.findElement(By.xpath("//*[@id='bottomButtonRow']/input[1]"));
	}

	public static WebElement btnSaveWCInformationPage() {
		return driver.findElement(By.xpath("(//input[@value=' Save '])[1]"));
	}

	public static WebElement btnAddNote() {
		return driver.findElement(By.xpath("//input[@value='New Note']"));
	}

	public static WebElement txtNotesMessage() {
		return driver.findElement(By.xpath("//textarea[@type='text']"));
	}

	public static WebElement dpdCancellationCategory() {
		return driver.findElement(By.xpath("//td[@class='dataCol  first  last ']/div/select"));
	}

	public static WebElement dpdCancellationReason() {
		return driver.findElement(By.xpath("//td[@class='dataCol  first  last ']/div/span/select"));
	}

	public static WebElement btnSaveMembershipCancellation() {
		return driver.findElement(By.xpath("//input[@value='Save']"));
	}

	public static WebElement txtVacationStartDate() {
		return driver.findElement(By.xpath("(//div[@class='inlineEditDiv']/input)[1]"));
	}

	public static WebElement txtVacationEndDate() {
		return driver.findElement(By.xpath("(//div[@class='inlineEditDiv']/input)[1]"));
	}

	// Edit Page objects

	// Alternate fields from edit
	/*
	 * public static WebElement txtVacationStartDate() { return
	 * driver.findElement(By.
	 * xpath("(//*[contains(text(),'Vacation Information')])[1]/following::input[1]"
	 * )); } public static WebElement txtVacationEndDate() { return
	 * driver.findElement(By.
	 * xpath("(//*[contains(text(),'Vacation Information')])[1]/following::input[2]"
	 * )); }
	 */
	public static WebElement txtEmail() {
		return driver.findElement(By.xpath("(//*[contains(text(),'Contact Information')])[1]/following::input[1]"));
	}

	public static WebElement txtPhone() {
		return driver.findElement(By.xpath("(//*[contains(text(),'Contact Information')])[1]/following::input[2]"));
	}

	public static WebElement txtBirthDate() {
		return driver.findElement(By.xpath("(//*[contains(text(),'Contact Information')])[1]/following::input[3]"));
	}

	public static WebElement dpdGender() {
		return driver.findElement(By.xpath("(//*[contains(text(),'Contact Information')])[1]/following::select[1]"));
	}

//Barrel Reserve Order
	public static WebElement txtNumofRegularBottles() {
		return driver.findElement(By.xpath("//td[@class='dataCol  first ']/input"));
	}

	public static WebElement txtNumofMagnumBottles() {
		return driver.findElement(By.xpath("//td[@class='dataCol  last ']/input"));
	}

	public static WebElement btnProceedtoPaymentBarrelReserveOrder() {
		return driver.findElement(By.xpath("//input[@type='submit'][@value='Proceed to Payment']"));
	}

	public static WebElement readOnlytxtLabelMessageMemershipType() {
		return driver.findElement(By.xpath("//*[@id='RecordType_ileinner']"));
	}

// Each Object Performance Method Lightning
	// mgs override page
	public void extendMembership() throws ParseException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String todayDate = sdf.format(cal.getTime());
		Date currentDate = sdf.parse(todayDate);

		String ExpirationDate = txtmembershipExpirationDate().getAttribute("value");
		Date currentExpirationDate = sdf.parse(ExpirationDate);

		cal.add(Calendar.DAY_OF_MONTH, 90);
		Date d = cal.getTime();
		System.out.println(d);
		String futureDate = sdf.format(d);
		btnOverrideMGS();
		txtmembershipExpirationDate().sendKeys(futureDate);
	}

	public void convertGiftMembershiptoMonthlybeforeExpirationDate(int row) throws IOException, InterruptedException {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		cal.add(Calendar.DAY_OF_MONTH, 90);
		Date d = cal.getTime();
		String futureDate = sdf.format(d);
		System.out.println(futureDate);
		System.out.println(readOnlytxtLabelMessageMemershipType().getText());
		if (readOnlytxtLabelMessageMemershipType().getText().equalsIgnoreCase("Monthly Member [Change]")) {
			clickChangeMembershipType();
			Menu menu = new Menu();
			selectByText(menu.dpd_RecordTypeofnewrecord(), "Record Type of new record", "Gift Member");
			menu.ClickContinueBtn();
			selectByText(dpdMembershipType(), "MembershipType", "Gift");
			clickOnButton(btnSaveWCInformationPage(), "WC Info Save");
			Thread.sleep(2000);
			clickOnLink(btnEdit(), "Edit");
			Thread.sleep(3000);
			txtEditMembershipExpirationDate().clear();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			txtEditMembershipExpirationDate().sendKeys(futureDate);
			clickOnButton(btnSaveWCInformationPage(), "save WC Info");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", changeMembershipLink());
			Thread.sleep(2000);
			clickChangeMembershipType();
			selectByText(menu.dpd_RecordTypeofnewrecord(), "Record Type of new record", "Monthly Member");
			menu.ClickContinueBtn();
			selectByText(dpdMembershipType(), "MembershipType", "Monthly");
			clickOnButton(btnSaveWCInformationPage(), "WC Info Save");

		} else {
			clickOnLink(btnEdit(), "Edit");
			Thread.sleep(3000);
			txtEditMembershipExpirationDate().clear();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			txtEditMembershipExpirationDate().sendKeys(futureDate);
			clickOnButton(btnSaveWCInformationPage(), "save WC Info");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", changeMembershipLink());
			Thread.sleep(2000);
			clickChangeMembershipType();
			Menu menu = new Menu();
			selectByText(menu.dpd_RecordTypeofnewrecord(), "Record Type of new record", "Monthly Member");
			menu.ClickContinueBtn();
			selectByText(dpdMembershipType(), "MembershipType", "Monthly");
			clickOnButton(btnSaveWCInformationPage(), "WC Info Save");
		}

	}

	public void convertGiftMembershiptoMonthlyafterExpirationDate(int row) throws IOException, InterruptedException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		cal.add(Calendar.DAY_OF_MONTH, -90);
		Date d = cal.getTime();
		String pastDate = sdf.format(d);
		System.out.println(pastDate);
		if (readOnlytxtLabelMessageMemershipType().getText().equalsIgnoreCase("Monthly Member [Change]")) {
			clickChangeMembershipType();
			Menu menu = new Menu();
			selectByText(menu.dpd_RecordTypeofnewrecord(), "Record Type of new record", "Gift Member");
			menu.ClickContinueBtn();
			selectByText(dpdMembershipType(), "MembershipType", "Gift");
			clickOnButton(btnSaveWCInformationPage(), "WC Info Save");
			Thread.sleep(2000);
			clickOnLink(btnEdit(), "Edit");
			Thread.sleep(3000);
			txtEditMembershipExpirationDate().clear();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			txtEditMembershipExpirationDate().sendKeys(pastDate);
			clickOnButton(btnSaveWCInformationPage(), "save WC Info");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", changeMembershipLink());
			Thread.sleep(2000);
			clickChangeMembershipType();
			selectByText(menu.dpd_RecordTypeofnewrecord(), "Record Type of new record", "Monthly Member");
			menu.ClickContinueBtn();
			selectByText(dpdMembershipType(), "MembershipType", "Monthly");
			clickOnButton(btnSaveWCInformationPage(), "WC Info Save");

		} else {
			clickOnLink(btnEdit(), "Edit");
			Thread.sleep(3000);
			txtEditMembershipExpirationDate().clear();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			txtEditMembershipExpirationDate().sendKeys(pastDate);
			clickOnButton(btnSaveWCInformationPage(), "save WC Info");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", changeMembershipLink());
			Thread.sleep(2000);
			clickChangeMembershipType();
			Menu menu = new Menu();
			selectByText(menu.dpd_RecordTypeofnewrecord(), "Record Type of new record", "Monthly Member");
			menu.ClickContinueBtn();
			selectByText(dpdMembershipType(), "MembershipType", "Monthly");
			clickOnButton(btnSaveWCInformationPage(), "WC Info Save");
		}
	}

	public void clickEditWCInfo() throws IOException {

		clickOnButton(btnEditWCInfo(), "Edit WC Info");
	}

	public void changeDelivery() throws IOException {

		if (dpdwineClubInfoDelivery().getText().equalsIgnoreCase("Pickup")) {

			selectByText(dpdwineClubInfoDelivery(), "Delivery Type", "Delivery");

		} else {
			selectByText(dpdwineClubInfoDelivery(), "Delivery Type", "Pickup");
		}

	}
	// Each Object Performance Method
	// WE Member Cards Page

	public void replacePersonalizedWCCard(int row) throws IOException, InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnNewWCMemberCard());
		Thread.sleep(2000);
		clickOnButton(btnNewWCMemberCard(), "New WC Member Card");
		enterText(txtMemberCardCardNumber(), "Card Number", data.Getdata("card Number", row));
		enterText(txtActivatedDate(), "Activated Date", BasePages.getCurrentdate());
		clickOnButton(btnSaveNewWCMemberCard(), "save WC Member Card");
	}

	public void addNotes() throws IOException, InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnAddNote());
		Thread.sleep(2000);
		clickOnButton(btnAddNote(), "Add Note");
		enterText(txtNotesMessage(), "Notes Message", "Coopers Hawk Testing");
		clickOnButton(btnSaveWCInformationPage(), "save button");

	}
	// Edit Page methods:

	public void enterUpdatedEmail(int row) throws IOException {
		String updatedEmail = data.Getdata("Email", row);
		System.out.println(updatedEmail);
		enterText(txtEmail(), "Email", updatedEmail);
	}

	public void enterUpdatedPhone(int row) throws IOException {
		String updatedPhone = data.Getdata("Phone", row);
		System.out.println(updatedPhone);
		enterText(txtPhone(), "Phone", updatedPhone);
	}

	public void enterUpdatedBirthDate(int row) throws IOException {
		String updatedDOB = data.Getdata("Birthdate", row);
		System.out.println(updatedDOB);
		enterText(txtBirthDate(), "BirthDate", updatedDOB);
	}

	public void selectUpdatedGender(int row) throws IOException {
		String updatedGender = data.Getdata("Gender", row);
		System.out.println(updatedGender);
		enterText(dpdGender(), "Email", updatedGender);
	}

	public void updateContactInformation(int row) throws IOException {
		clickOnButton(btnEdit(), "Edit");
		enterUpdatedEmail(row);
		enterUpdatedPhone(row);
		enterUpdatedBirthDate(row);
		selectUpdatedGender(row);
		clickOnButton(btnSaveWCInformationPage(), "Save");

	}

	public void putVacationHold() throws IOException {
		Calendar cal = Calendar.getInstance();
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		cal.add(Calendar.DAY_OF_MONTH, 90);
		cal2.add(Calendar.DAY_OF_MONTH, 30);
		Date d = cal.getTime();
		String futureDate = sdf.format(d);
		String todayDate = sdf.format(cal1.getTime());
		String nextMonthDate = sdf.format(cal2.getTime());
		System.out.println(todayDate);
		System.out.println(futureDate);
		clickOnButton(btnEdit(), "Edit button");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		txtEditVacationStartDate().clear();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		txtEditVacationStartDate().sendKeys(nextMonthDate);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		txtEditVacationEndDate().clear();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		txtEditVacationEndDate().sendKeys(futureDate);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ClickSaveWCMemberInformation();
	}

	public void cancelMembership() throws IOException {

		String parentWindow = driver.getWindowHandle();
		clickOnButton(btncancelMembership(), "Cancel Membership");
		for (String child : driver.getWindowHandles()) {
			driver.switchTo().window(child);
		}
		selectByText(dpdCancellationCategory(), "Cancellation Category", "Error");
		selectByText(dpdCancellationReason(), "Cancellation Reason", "Multiple Memberships");
		clickOnButton(btnSaveMembershipCancellation(), "Save button");
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().window(parentWindow);

	}

	public void orderBarrelReserve(int row) throws IOException {

		String parentWindow = driver.getWindowHandle();
		clickOnButton(btnBarrelOrderReserve(), "Order Barrel Reserve");
		for (String child : driver.getWindowHandles()) {
			driver.switchTo().window(child);
		}
		enterText(txtNumofRegularBottles(), "# of Regular Bottles", "5");
		enterText(txtNumofMagnumBottles(), "# of Magnum Bottles", "5");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		clickOnButton(btnProceedtoPaymentBarrelReserveOrder(), "Proceed to Payment");
		Page_PaymentDetails paymentpage = new Page_PaymentDetails();
		paymentpage.ValidateAndEnterCreditCard(row);
		paymentpage.ClickProcesstoPayment();
		driver.switchTo().window(parentWindow);

	}

	// EDIT WC INFO PAGE _ EACH OBJECT METHODS

	public void changefrom1to2BottleImmediately(int row) throws Exception {

		if (dpdnumOfBottles().getText().equalsIgnoreCase("1")) {

			selectByText(dpdnumOfBottles(), "No. of Bottles", "2");
			payImmediately();
			Thread.sleep(3000);
			clickProceedtoPaymentDetails();
			Page_MonthlyMembersEntry.chargeNewCreditCard_StoreOnFileClassic();
			Page_PaymentDetails page_paymentDetails = new Page_PaymentDetails();
			page_paymentDetails.EnterPaymentSection();
			page_paymentDetails.lnkGotoMember().click();
		} else {
			ResultsLog.ReportInfo(driver, "Already 2 Bottles Selected");
		}

	}

	public void changefrom1to2BottleNextBillingCycle(int row) throws Exception {

		if (dpdnumOfBottles().getText().equalsIgnoreCase("1")) {

			selectByText(dpdnumOfBottles(), "No. of Bottles", "2");
			nextBillingCycle();
			Thread.sleep(3000);
			clickProceedtoPaymentDetails();
			Page_PaymentDetails page_paymentDetails = new Page_PaymentDetails();
			page_paymentDetails.EnterPaymentSectionforEditWC();
		} else {
			ResultsLog.ReportInfo(driver, "Already 2 Bottles Selected");
		}

	}

	public void changefrom2to1BottleImmediately(int row) throws Exception {

		if (dpdnumOfBottles().getText().equalsIgnoreCase("2")) {
			Thread.sleep(3000);
			selectByText(dpdnumOfBottles(), "No. of Bottles", "1");
			payImmediately();
			clickProceedtoPaymentDetails();
			verifyTextEqual(readOnlyErrorMessageBottlesChangeImmediately(), "Error:", "Bottle change Immediately");

		} else {
			System.out.println("Already 1 Bottle Selected");
			ResultsLog.ReportInfo(driver, "Already 1 Bottle Selected");
		}

	}

	public void changefrom2to1BottleNextBillingCycle(int row) throws Exception {

		if (dpdnumOfBottles().getText().equalsIgnoreCase("2")) {

			selectByText(dpdnumOfBottles(), "No. of Bottles", "1");
			nextBillingCycle();
			Thread.sleep(3000);
			clickProceedtoPaymentDetails();
			MGSPages.ClassicEnterCardPaymentDetails(row);
			Page_PaymentDetails page_paymentDetails = new Page_PaymentDetails();
			page_paymentDetails.EnterPaymentSectionforEditWC();

		} else {
			ResultsLog.ReportInfo(driver, "Already 1 Bottle Selected");
		}
	}

	public void changeClubTypeIncreasedCostImmediately() throws IOException {

		Select select = new Select(dpdclubType());
		List<WebElement> options = select.getOptions();
		for (WebElement clubType : options) {
			if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("Sweet")) {
				selectByText(dpdclubType(), "Club Type", "Variety");
				payImmediately();
				clickProceedtoPaymentDetails();
				verifyErrorMessageTextforClubTypeChangeImmediately();

			} else if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("Variety")) {
				ResultsLog.ReportInfo(driver, "Club Type Already at Higher Cost");

			} else if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("Red")) {
				ResultsLog.ReportInfo(driver, "Club Type Already at Higher Cost");

			}

			else if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("White")) {
				ResultsLog.ReportInfo(driver, "Club Type Already at Higher Cost");

			} else {

				ResultsLog.ReportFail(driver, "Required Club Type Not Available for Selection",
						"Required Club Type Not Available");
			}

		}

	}

	public void changeClubTypeIncreasedCostNextbillingCycle(int row) throws Exception {

		Select select = new Select(dpdclubType());
		List<WebElement> options = select.getOptions();
		for (WebElement clubType : options) {
			if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("Sweet")) {
				selectByText(dpdclubType(), "Club Type", "Variety");
				nextBillingCycle();
				clickProceedtoPaymentDetails();
				Page_PaymentDetails page_paymentDetails = new Page_PaymentDetails();
				page_paymentDetails.EnterPaymentSectionforEditWC();

			} else if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("Variety")) {
				ResultsLog.ReportInfo(driver, "Club Type Already at Higher Cost");

			} else if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("Red")) {
				ResultsLog.ReportInfo(driver, "Club Type Already at Higher Cost");

			}

			else if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("White")) {
				ResultsLog.ReportInfo(driver, "Club Type Already at Higher Cost");

			} else {

				ResultsLog.ReportFail(driver, "Required Club Type Not Available for Selection",
						"Required Club Type Not Available");
			}

		}

	}

	public void changeClubTypeDecreasedCostImmediately() throws IOException {

		Select select = new Select(dpdclubType());
		List<WebElement> options = select.getOptions();
		for (WebElement clubType : options) {
			if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("Variety")) {
				selectByText(dpdclubType(), "Club Type", "Sweet");
				payImmediately();
				clickProceedtoPaymentDetails();
				verifyErrorMessageTextforClubTypeChangeImmediately();

			} else if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("White")) {
				selectByText(dpdclubType(), "Club Type", "Sweet");
				payImmediately();
				clickProceedtoPaymentDetails();
				verifyErrorMessageTextforClubTypeChangeImmediately();

			} else if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("Red")) {
				selectByText(dpdclubType(), "Club Type", "Sweet");
				payImmediately();
				clickProceedtoPaymentDetails();
				verifyErrorMessageTextforClubTypeChangeImmediately();
			}

			else if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("Sweet")) {
				selectByText(dpdclubType(), "Club Type", "Sweet");
				payImmediately();
				clickProceedtoPaymentDetails();
				verifyErrorMessageTextforClubTypeChangeImmediately();

			} else {

				ResultsLog.ReportFail(driver, "Required Club Type Not Available for Selection",
						"Required Club Type Not Available");
			}

		}

	}

	public void changeClubTypeDecreasedCostNextbillingCycle(int row) throws Exception {

		Select select = new Select(dpdclubType());
		List<WebElement> options = select.getOptions();
		for (WebElement clubType : options) {
			if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("Variety")) {
				selectByText(dpdclubType(), "Club Type", "Sweet");
				Thread.sleep(3000);
				nextBillingCycle();
				clickProceedtoPaymentDetails();
				Page_PaymentDetails page_paymentDetails = new Page_PaymentDetails();
				page_paymentDetails.EnterPaymentSectionforEditWC();

			} else if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("Red")) {
				selectByText(dpdclubType(), "Club Type", "Sweet");
				nextBillingCycle();
				clickProceedtoPaymentDetails();
				Page_PaymentDetails page_paymentDetails = new Page_PaymentDetails();
				page_paymentDetails.EnterPaymentSectionforEditWC();

			} else if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("White")) {
				selectByText(dpdclubType(), "Club Type", "Sweet");
				nextBillingCycle();
				clickProceedtoPaymentDetails();
				Page_PaymentDetails page_paymentDetails = new Page_PaymentDetails();
				page_paymentDetails.EnterPaymentSectionforEditWC();

			}

			else if (clubType.isSelected() && clubType.getText().equalsIgnoreCase("White")) {
				ResultsLog.ReportInfo(driver, "Club Type Already at Lower Cost");

			} else {

				ResultsLog.ReportInfo(driver, "Required Club Type Not Available for Selection");
			}

		}

	}

	public void changeClubTypeDecreasedCost() throws IOException {
		Select select = new Select(dpdclubType());
		List<WebElement> options = select.getOptions();
		for (WebElement we : options) {
			if ((we.isSelected() && we.getText().equalsIgnoreCase("Variety"))
					|| (we.isSelected() && we.getText().equalsIgnoreCase("Red"))
					|| (we.isSelected() && we.getText().equalsIgnoreCase("White"))) {

				selectByText(dpdclubType(), "Club Type", "Sweet");
				break;
			} else {
				ResultsLog.ReportInfo(driver, "Already Club Type with Lower Cost");
			}
		}
	}

	public void nextBillingCycle() throws IOException {
		selectByText(dpdChargeTiming(), "Charge Type", "Next Billing Cycle");
	}

	public void payImmediately() throws IOException {
		selectByText(dpdChargeTiming(), "Charge Type", "Immediately");
	}

	public void clickProceedtoPaymentDetails() throws IOException {
		clickOnButton(btnProceedtoPaymentDetails(), "Proceed to Payment Details");
	}

	public void verifyErrorMessageTextforClubTypeChangeImmediately() throws IOException {
		verifyTextEqual(readOnlyErrorMessageClubTypeChangeImmediately(), "Error:", "Club Type change Immediately");

	}

	public void verifyErrorMessageTextforBottlesChangeImmediately() throws IOException {
		verifyTextEqual(readOnlyErrorMessageBottlesChangeImmediately(), "Error:", "bottles change immediately");

	}

//WOM--- EACH OBJECT METHODS

	public void swap2WOMSfor1Lux() throws InterruptedException, IOException {
		int count = 0;
		driver.switchTo().frame("06641000007zQ8Q");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", readOnlyClassicWCMonth());
		Thread.sleep(1000);

		for (int i = 1; i < 10; i++) {
			try {
				WebElement wine = driver.findElement(By.xpath(
						"//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr/td[" + i + "]"));

				if (!wine.getText().equals("July Thank You 2019")) {
					Thread.sleep(5000);
					selectByText(driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr/td[5]/select)["
									+ i + "]")),
							"Alternate Wine", "Lux Cab Half Btl");
					Thread.sleep(5000);
					clickOnButton(driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles:')]/following-sibling::table/tbody/tr/td[1]/input)[" + i
									+ "]")),
							"Checkbox WOM");

					count++;
				} else {
					ResultsLog.ReportInfo(driver, "Required WOM not available");
				}
				if (count == 2) {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
				ResultsLog.ReportInfo(driver, "No list available");
			}

		}
		ClickSaveWCMemberWOM();
	}

// Wine Club Information

	public void ExpandWineClubInformation() throws IOException {
		waitForPageLoadToComplete();
		waitForElement(WineClubInformationSection());
		try {
			if (WineClubInformationSection().getAttribute("title").contains("Show Section")) {
				clickOnButton(WineClubInformationSection(), "Wine Club Information button Expansation");
			} else {
				System.out.println("WineClubInformation attribute does not contain Show");
			}
		} catch (Exception e) {

			System.out.println("in catch WC member Expand to Validate");
			if (WineClubInformationSection().getAttribute("title").contains("Show Section")) {
				clickOnButton(WineClubInformationSection(), "Wine Club Information button Expansation");
			}
		}

	}

	public void ValidateClassicCardNumber(int row) throws IOException {

		String ExpectedCardNumber = EnteredCardNumber;
		verifyTextEqual(readonlyWCCardNumber(), ExpectedCardNumber, "Valididate WC Card Number");

	}

	public void ValidateClassicName(int row) throws IOException {

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

		verifyTextEqual(readonlyWCName(), ExpectedContactText, "Validate Lightning WC Name");
	}

	public void ValidateClassicMemberShipType(int row) throws IOException {

		String ExpectedMembershipType = data.Getdata("Membership Type", row).trim();
		verifyTextEqual(readonlyWCMembershipType(), ExpectedMembershipType, "Valididate WC Membership Type");

	}

	public void ValidateClassicDelivery(int row) throws IOException {

		String ExpectedDelivery = data.Getdata("Delivery", row).trim();
		verifyTextEqual(readonlyWCDelivery(), ExpectedDelivery, "Valididate WC Delivery");

	}

	public void ValidateClassicClubType(int row) throws IOException {

		String ExpectedClubType = data.Getdata("Club Type", row).trim();
		verifyTextEqual(readonlyWCClubType(), ExpectedClubType, "Valididate WC Club Type");

	}

	public void ValidateClassicNoofBottles(int row) throws IOException {

		String ExpectedNoofBottlles = data.Getdata("# of Bottles", row).trim();
		verifyTextEqual(readonlyWCNoOfBottles(), ExpectedNoofBottlles, "Valididate WC # of Bottles");

	}

	public void ValidateClassicCostofMembership(int row) throws IOException {

		String ExpectedCostofMembership = formatAmountText(data.Getdata("Cost of Membership", row).trim());
		verifyTextEqual(readOnlyClassicCostofMembership(), ExpectedCostofMembership,
				"Valididate WC Cost of Membership");

	}

	public void ValidateClassicWCMemberStatus(int row) throws IOException {

		if (data.Getdata("Membership Type", row).trim().equalsIgnoreCase("Gift")) {
			verifyTextEqual(readOnlyClassicWCMemberStatus(), "To be Activated", "Valididate WC Member Status");
		}

		else {
			verifyTextEqual(readOnlyClassicWCMemberStatus(), "Active", "Valididate WC Member Status");
		}

	}

	public void ValidateClassicWCTier() throws IOException {

		verifyTextEqual(readOnlyClassicTier(), "Standard", "Valididate WC Tier");

	}

	public void clickChangeMembershipType() throws IOException {
		clickOnLink(changeMembershipLink(), "Change");
	}

	public void SelectWCMemberStatus(String status) throws IOException {

		selectByText(dpdEditWCmemberStatus(), "Dropdown Select WC Member Status", status);
	}

	public void ValidateClassicWCDurationofMemberShip(int row) throws IOException {

		verifyTextEqual(readOnlyDurationofMembership(), data.Getdata("Duration of Membership", row).trim(),
				"Valididate Duration of MemberShip");

	}

	public void ValidateClassicWCPendingChanges() throws IOException {

		verifyTextEqual(readOnlyPendingChanges(), "No", "Valididate WC Pending Changes");

	}

	public void DoubleClickonMemberStatus() throws IOException {
		readOnlyClassicWCMemberStatus().click();
		readOnlyClassicWCMemberStatus().click();
		// clickOnEditIcon(readOnlyClassicWCMemberStatus(), "Member Status Edit");
	}

	public void ClickTastingCheckBox1() throws IOException {
		clickOnCheckBox(chkTastings1, "Tastings-1");
	}

	public void ClickTastingCheckBox2() throws IOException {
		clickOnCheckBox(chkTastings2, "Tastings-2");
	}

	public void ClickSaveWCMemberTasting() throws IOException {
		clickOnButton(btnSaveWCMemberTasting, "Save WC Member Tasting");
	}

	public void VerifyWCTastingDate1() throws IOException {
		verifyTextWithContains(rdnWCMemberHistoryTastingDate, getCurrentDateStamp(),
				"WC Member HIstory Tasting Date-1");
	}

	public void VerifyWCTastingDate2() throws IOException {
		verifyTextWithContains(rdnWCMemberHistoryTastingDate2, getCurrentDateStamp(),
				"WC Member HIstory Tasting Date-2");
	}

	public void ValidateClassicWCOpenBottles(int row) throws IOException {
		verifyTextEqual(readOnlyClassicWCOpenBottles(), data.Getdata("ExpectedBottles", row).trim(),
				"Valididate WC Open Bottles");
	}

	public void ValidateClassicWCOpenTastings(int row) throws IOException {
		verifyTextEqual(readOnlyClassicWCOpenTastings(), data.Getdata("ExpectedTastings", row).trim(),
				"Valididate WC Open Tastings");
	}

	public void ValidateClassicWCLifeTimeBottles(int row) throws IOException {
		verifyTextEqual(readOnlyClassicWCLifeTimeBottles(), data.Getdata("ExpectedLifeBottles", row).trim(),
				"Valididate WC LifetimeBottles");
	}

	public void ValidateClassicWCAmbassadorTenureCredits(int row) throws IOException {
		verifyTextEqual(readOnlyClassicWCAmbassadorTenureCredits(), data.Getdata("ExpectedTenureCredits", row).trim(),
				"Valididate WC Ambassador Tenure Credits");
	}

	public void ValidateClassicWCAnnualAmbassadorSpendCredits(int row) throws IOException {
		verifyTextEqual(readOnlyClassicWCAnnualAmbassadorSpendCredits(),
				formatAmountTextwithDecimal(data.Getdata("ExpectedAmbassadorSpendCredits", row).trim()),
				"Valididate WC Annual Ambassador Spend Credits");
	}

	public void ValidateClassicWCTotalAmbassadorCredits(int row) throws IOException {
		verifyTextEqual(readOnlyClassicWCTotalAmbassadorCredits(),
				data.Getdata("ExpectedTotalAmbassadorCredits", row).trim(), "Valididate WC Total Ambassador Credits");
	}

	public void ValidateClassicWCActivePoints(int row) throws IOException {
		verifyTextEqual(readOnlyClassicWCActivePoints(), data.Getdata("ExpectedActivePoints", row).trim(),
				"Valididate WC Active Points");
	}

	public void ValidateClassicWCMemberSince() throws IOException {
		verifyTextEqual(readOnlyClassicWCMemberSince(), getCurrentDateStamp(), "Valididate Member Since");
	}

	public void ValidateClassicWCMemberShipExpirationDate(int row) throws IOException {

		String duration = data.Getdata("Duration of Membership", row).trim();
		int du = Integer.parseInt(duration);
		verifyTextEqual(readOnlyClassicWCMemberShipExpirationDate(), getCurrentDateStampPlusRequiredDate(du),
				"Valididate Member Ship Expiration Date");
	}

	public void ValidateClassicWCPointsInformationActivePoints(String ExpectedActivePoints) throws IOException {
		verifyTextEqual(readOnlyClassicWCPointsInformationActivePoints(), ExpectedActivePoints,
				"Valididate Points Information Active Points");
	}

	public void ValidateClassicWCPointsInformationInActivePoints(String ExpectedActivePoints) throws IOException {
		verifyTextEqual(readOnlyClassicWCPointsInformationInActivePoints(), ExpectedActivePoints,
				"Valididate Points Information InActive Points");
	}

	public void ValidateClassicWCPointsInformationNewPoints(String ExpectedActivePoints) throws IOException {
		verifyTextEqual(readOnlyClassicWCPointsInformationNewPoints(), ExpectedActivePoints,
				"Valididate Points Information New Points");
	}

	public void ValidateClassicWCPointsInformationLifeTimePoints(String ExpectedActivePoints) throws IOException {
		verifyTextEqual(readOnlyClassicWCPointsInformationLifeTimePoints(), ExpectedActivePoints,
				"Valididate Points Information Lifetime Points");
	}

	public void ValidateClassicWCAdditionalWCMemberInformation(int row) throws IOException {
		verifyTextEqual(readOnlyClassicWCAdditionalWCMemberInformation(), data.Getdata("Sign Up Location", row),
				"Valididate Additional WC Member Informatio Signup Location");
	}

	public void ValidateClassicWCWOMOpenBottles(int row) throws IOException {
		verifyTextEqual(readOnlyClassicWCWomOpenbottles(), data.Getdata("# of Bottles", row),
				"Valididate WOM Open Bottles");
	}

	public void ValidateClassicWCWOMYear() throws IOException {
		verifyTextEqual(readOnlyClassicWCYear(), getCurrentYear(), "Valididate WOM Year");
	}

	public void ValidateClassicWCWOMMonth() throws IOException {
		verifyTextEqual(readOnlyClassicWCMonth(), getCurrentMonthName(), "Valididate WOM Month");
	}

	public void ValidateClassicWCWOMYear2() throws IOException {
		verifyTextEqual(readOnlyClassicWCYear2(), getCurrentYear(), "Valididate WOM Year");
	}

	public void ValidateClassicWCWOMMonth2() throws IOException {
		verifyTextEqual(readOnlyClassicWCMonth2(), getCurrentMonthName(), "Valididate WOM Month");
	}

	public void ClickSaveWCMemberWOM() throws IOException {
		clickOnButton(btnSaveWCMemberWOM, "Save WC Member WOM");
	}

	public void ClickSaveWCMemberInformation() throws IOException {
		clickOnButton(btnSaveWCInformationPage(), "Save WC Member WOM");
	}

	public void ClickNewWCMemberPointsHistory() throws IOException {
		clickOnButton(btnNewWCMemberPointsHistory(), "New WCMember Points History button");

	}

	public void SelectPointsType() throws IOException {

		selectByText(dpdPointsType(), "Points Type", "Basic");
	}

	public void SelectPointsStatus() throws IOException {

		selectByText(dpdPointsStatus(), "Points Status", "New");
	}

	public static void EnterPointsEarned() throws IOException {
//Line commented below is to connect data from input table :MGS Test Data, currently gave static values 
		// enterText(txtPointsEarned(), "Loyalty Points Earned"), data.Getdata("Loyalty
		// Points Earned", row));
		enterText(txtPointsEarned(), "Loyalty Points Earned", "50");
	}

	public void EnterRestaurantLocation() throws IOException {
		enterText(txtRestaurantLocation(), "Restaurant Location", "999 Member Services");

	}

	public void SearchRestauranttLocation() throws Exception {

		clickOnButton(btnRestaurantLocation(), "Click Search Restaurant Button");
	}

	public void SelectRestauranttLocation() throws Exception {

		EnterRestaurantLocation();
		// SearchRestauranttLocation();
	}

	public void EnterTotalPointsApplicable() throws IOException {
		enterText(txtPointsApplicableTotal(), "Total Points Applicable", "50");
	}

	public void SaveLoyalytPoints() throws IOException {
		clickOnButton(btnSaveloyaltyPoints(), "save loyalty points");
	}

	public void MemberSignatureOptOut() throws IOException {
		clickOnCheckBox(chkMemberSignatureOptOut(), "Member Signature OptOut");
	}

	public void SaveMemberSignature() throws IOException {
		clickOnButton(btnSaveMemberSignature(), "Save Member Signature OptOut");
	}

	public void OrderBarrelReserve() throws IOException {
		clickOnButton(btnBarrelOrderReserve(), "Barrel Reserve Order");
	}

	public void EnterRegularBottlesCount() throws IOException {
		// Line commented below is to connect data from input table :MGS Test Data,
		// currently gave static values
		enterText(txtCountofRegularBottles(), "no. of regular bottles", "10");
	}

	public void EnterMagnumBottlesCount() throws IOException {
		// Line commented below is to connect data from input table :MGS Test Data,
		// currently gave static values
		enterText(txtCountofMagnumBottles(), "no. of magnum bottles", "10");
	}

	public void SelectShippingOption() throws IOException {
		clickOnCheckBox(rdnHomeAddress(), "Home Address Selected");

	}

	public void ProceedtoPayment() throws IOException {
		clickOnButton(btnProceedtoPayment(), "Proceed to Payment");
	}

	public void replaceNewCreditCard(int row) throws IOException, InterruptedException, BiffException {

		((JavascriptExecutor) driver).executeScript("scroll(0,4000)");
		Thread.sleep(5000);
		clickOnLink(btnNewPayment(), "Payments");
		Thread.sleep(3000);
		Page_NewMember.chargeNewCreditCard_StoreOnFile();
		Page_PaymentDetails page_PaymentDetails = new Page_PaymentDetails();
		page_PaymentDetails.EnterandValidate_MonthlyPaymentPage(row);

	}

	public void addJulyPromoBottle() {

	}

	public void deleteJulyPromoBottle() {

	}

	public void expireJulyPromoBottle() {

	}

// Wine Club Information Logical Method

	public void ClassicValidateWineClubInformation(int row) throws IOException {

		ExpandWineClubInformation();
		ValidateClassicCardNumber(row);
		ValidateClassicName(row);
		ValidateClassicMemberShipType(row);
		ValidateClassicDelivery(row);
		ValidateClassicClubType(row);
		ValidateClassicNoofBottles(row);
		ValidateClassicCostofMembership(row);
		ValidateClassicWCMemberStatus(row);
		ValidateClassicWCTier();
		if (data.Getdata("WC Member Record Type", row).trim().equalsIgnoreCase("Gift Member")) {
			ValidateClassicWCDurationofMemberShip(row);
		}
		ValidateClassicWCPendingChanges();
	}

// Wc Member Summary Logical Method

	public void ClassicValidateWCMemberSummary(int row) throws IOException {

		if (data.Getdata("WC Member Record Type", row).trim().equalsIgnoreCase("Gift Member")) {
			ValidateClassicWCMemberSince();
		}

		else {

			ValidateClassicWCOpenBottles(row);
			ValidateClassicWCOpenTastings(row);
			ValidateClassicWCLifeTimeBottles(row);
			ValidateClassicWCAmbassadorTenureCredits(row);
			ValidateClassicWCAnnualAmbassadorSpendCredits(row);
			ValidateClassicWCTotalAmbassadorCredits(row);
			ValidateClassicWCActivePoints(row);
			ValidateClassicWCMemberSince();
		}
	}

// WC Member Points Information Method -- Data Logic method
	public void ClassicValidateWCPointsInformation() throws IOException {

		String PointsInformationActivePoints = "0";
		String PointsInformationInActivePoints = "0";
		String PointsInformationNewPoints = "0";
		String PointsInformationLifetimePoints = "0";

		ValidateClassicWCPointsInformationActivePoints(PointsInformationActivePoints);
		ValidateClassicWCPointsInformationInActivePoints(PointsInformationInActivePoints);
		ValidateClassicWCPointsInformationNewPoints(PointsInformationNewPoints);
		ValidateClassicWCPointsInformationLifeTimePoints(PointsInformationLifetimePoints);
	}

// Additional WC Member Information

	public void ClassicValidateWCAdditionalWCMemberInformation(int row) throws IOException {

		ValidateClassicWCAdditionalWCMemberInformation(row);

	}

// WC Member WOM Information Method
	public void ClassicWCWOMValidation(int row) throws IOException, InterruptedException {

		try {
			if (data.Getdata("WC Member Record Type", row).trim().equalsIgnoreCase("Monthly Member")
					|| data.Getdata("WC Member Record Type", row).trim().equalsIgnoreCase("Founder")) {
				int size = driver.findElements(By.tagName("iframe")).size();
				System.out.println(size);

				frameSwitch4(5);
				ValidateClassicWCWOMOpenBottles(row);

			}

			else if (data.Getdata("WC Member Record Type", row).trim().equalsIgnoreCase("Complimentary")) {
				frameSwitch4(4);
				ValidateClassicWCWOMOpenBottles(row);
			}

		} catch (Exception e) {
			try {
				driver.switchTo().defaultContent();
				int size = driver.findElements(By.tagName("iframe")).size();
				System.out.println(size);
				frameSwitchLoopForWOM(9);
				ValidateClassicWCWOMOpenBottles(row);
			} catch (Exception ex) {
				System.out.println("Tried validating WOM Open Bottles but NO WOM Details Available");
				ResultsLog.ReportFail(driver, "Tried validating WOM Open Bottles but NO WOM Details Available",
						ex.toString());
			}

		}

		try

		{
			ValidateClassicWCWOMYear();
			if (data.Getdata("WC Member Record Type", row).equalsIgnoreCase("Monthly Member")
					&& data.Getdata("# of Bottles", row).equalsIgnoreCase("2")) {
				ValidateClassicWCWOMYear2();
			}
		} catch (Exception e) {
			System.out.println("Tried validating WOM Year but NO WOM Details Available");
			ResultsLog.ReportFail(driver, "Tried validating WOM Year but NO WOM Details Available", e.toString());
		}
		try {
			ValidateClassicWCWOMMonth();
			if (data.Getdata("WC Member Record Type", row).equalsIgnoreCase("Monthly Member")
					&& data.Getdata("# of Bottles", row).equalsIgnoreCase("2")) {
				ValidateClassicWCWOMMonth2();
			}
		} catch (Exception e) {
			System.out.println("Tried validating WOM Year but NO WOM Details Available");
			ResultsLog.ReportFail(driver, "Tried validating WOM Year but NO WOM Details Available", e.toString());

		}

		driver.switchTo().defaultContent();
	}

// Actual Functional Methods

	public void ClassicValidateWCMembers(int row) throws IOException, InterruptedException {
		ClassicValidateWineClubInformation(row);
		ClassicValidateWCMemberSummary(row);
		ClassicValidateWCPointsInformation();
		ClassicValidateWCAdditionalWCMemberInformation(row);
		if (!data.Getdata("WC Member Record Type", row).trim().equalsIgnoreCase("Gift Member")) {
			if (!data.Getdata("Delivery", row).trim().equalsIgnoreCase("Delivery")) {
				ClassicWCWOMValidation(row);
			}
		}

	}

	public void ClassicValidateWineClubInformation_Complimentary(int row) throws IOException, InterruptedException {

		ExpandWineClubInformation();
		ValidateClassicCardNumber(row);
		ValidateClassicName(row);
		ValidateClassicMemberShipType(row);
		ValidateClassicDelivery(row);
		ValidateClassicClubType(row);
		ValidateClassicNoofBottles(row);
		ValidateClassicWCMemberStatus(row);
		ValidateClassicWCDurationofMemberShip(row);
		ValidateClassicWCMemberShipExpirationDate(row);
		ValidateClassicWCPendingChanges();
		ValidateClassicWCOpenBottles(row);
		ValidateClassicWCOpenTastings(row);
		ValidateClassicWCActivePoints(row);
		ValidateClassicWCMemberSince();
		ClassicValidateWCPointsInformation();
		if (!data.Getdata("Delivery", row).trim().equalsIgnoreCase("Delivery")) {
			ClassicWCWOMValidation(row); // Should work on this frame id
		}

	}

	public void ClassicValidateWineClubInformation_Founder(int row) throws IOException, InterruptedException {
		ExpandWineClubInformation();
		ValidateClassicCardNumber(row);
		ValidateClassicName(row);
		ValidateClassicMemberShipType(row);
		ValidateClassicDelivery(row);
		ValidateClassicClubType(row);
		ValidateClassicNoofBottles(row);
		ValidateClassicWCMemberStatus(row);
		ValidateClassicWCTier();
		ValidateClassicWCOpenBottles(row);
		ValidateClassicWCOpenTastings(row);
		ValidateClassicWCActivePoints(row);
		ValidateClassicWCMemberSince();
		if (!data.Getdata("Delivery", row).trim().equalsIgnoreCase("Delivery")) {
			ClassicWCWOMValidation(row);
		}

	}

	public void classicActivateMember(int row) throws IOException, InterruptedException {

		waitForPageLoadToComplete();
		clickOnLink(btnEdit(), "Edit");

		selectByText(dpdwnEditWCMemberStatus(), "Edit WC Member Status", "Active");
		// DoubleClickonMemberStatus();
		// SelectWCMemberStatus("Active");
		ClickSaveWCMemberInformation();
	}

	public void SelectWCMemberTasting() throws IOException, InterruptedException {
		driver.switchTo().defaultContent();
		WebElement element = driver.findElement(By.xpath("//iframe[@title='CHW_MemberTastingRelatedListPage']"));
		driver.switchTo().frame(element);
		ClickTastingCheckBox1();
		ClickTastingCheckBox2();
		ClickSaveWCMemberTasting();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		VerifyWCTastingDate1();
		VerifyWCTastingDate2();
	}

	public void CompareNoofBottles() throws IOException {
		// String WOM1value = WOM1.getText();
		// String WOM2value = WOM2.getText();
		if ((readonlyWCNoOfBottles().getText().equals("1"))) {
			verifyTextEqual(WOM1, "July Thank You 2019", "1 July Promo bottle Eligibility based on membership");
			clickOnCheckBox(WCMEMBERWOMCheckBox1, "Checkbox1 clicked");

		} else if ((readonlyWCNoOfBottles().getText().equals("2"))) {
			verifyTextEqual(WOM1, "July Thank You 2019", "1st July Promo bottle Eligibility based on membership");
			verifyTextEqual(WOM2, "July Thank You 2019", "2nd July Promo bottle Eligibility based on membership");
			clickOnCheckBox(WCMEMBERWOMCheckBox1, "Checkbox1 clicked");
			clickOnCheckBox(WCMEMBERWOMCheckBox2, "Checkbox2 clicked");
		}
	}

	public void SelectWCPriorWOMPickUP() throws IOException, InterruptedException, ParseException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");

		cal.add(Calendar.MONTH, -1);
		Date d = cal.getTime();
		String priorMonth = sdf.format(d);

		System.out.println(priorMonth);
		int count = 0;
		String noOfBottles = readonlyWCNoOfBottles().getText();
		Thread.sleep(3000);
		System.out.println("Num of bott :" + noOfBottles);
		((JavascriptExecutor) driver).executeScript("scroll(0,2100)");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		waitForPageLoadToComplete();
		waitForAjax();

		driver.switchTo().frame("06641000007zQ8Q");
		Thread.sleep(5000);

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
					ResultsLog.ReportPass(driver, "Click on WOM checkbox", "WOM checkbox");
					Thread.sleep(5000);
					selectByText(driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[5]/child::select)["
									+ i + "]")),
							"Alternate Wine", "Almond Sparkling");
					String additionalPrice = driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[6]/child::label)["
									+ i + "]"))
							.getText();
					System.out.println("Dpd Value :" + additionalPrice);
					count++;
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
				ResultsLog.ReportInfo(driver, "No WOM list available");
				break;
			}

		}

		Thread.sleep(10000);
		try {
			if (!btnSaveWCMemberWOM.isDisplayed()) {
				Scroll(btnSaveWCMemberWOM);
			}
		} catch (Exception e) {
			System.out.println("Btn Save WC Member WOM not available");
		}

		Thread.sleep(10000);
		ClickSaveWCMemberWOM();
		waitForPageLoadToComplete();
		waitForAjax();
		driver.switchTo().defaultContent();
	}

	public void SelectWCCurrentWOMPickUP() throws IOException, InterruptedException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
		cal.add(Calendar.MONTH, 0);
		Date d = cal.getTime();
		String currentMonth = sdf.format(d);
		System.out.println(currentMonth);
		int count = 0;
		String noOfBottles = readonlyWCNoOfBottles().getText();
		Thread.sleep(3000);
		System.out.println("Num of bott :" + noOfBottles);

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
						&& wom.equalsIgnoreCase(currentMonth)) {
					Thread.sleep(5000);
					driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[1]/child::input)["
									+ i + "]"))
							.click();
					ResultsLog.ReportPass(driver, "Clicked on checkbox", "WOM checkbox");
					Thread.sleep(5000);
					selectByText(driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[5]/child::select)["
									+ i + "]")),
							"Alternate Wine", "Almond Sparkling");
					String additionalPrice = driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[6]/child::label)["
									+ i + "]"))
							.getText();
					System.out.println("Dpd Value :" + additionalPrice);
					count++;
				} else {
					ResultsLog.ReportInfo(driver, "Required WOM not found for current month :" + currentMonth);
					System.out.println("Required WOM not found ");
				}
				if (Integer.parseInt(noOfBottles) == count) {
					break;
				} else {

					System.out.println("Count :" + count);
				}

			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "No WOM available");
				break;
			}

			Thread.sleep(10000);
			try {
				if (!btnSaveWCMemberWOM.isDisplayed()) {
					Scroll(btnSaveWCMemberWOM);
				}
			} catch (Exception e) {
				System.out.println("Btn Save WC Member WOM not available");
			}

			Thread.sleep(10000);
			ClickSaveWCMemberWOM();
			waitForPageLoadToComplete();
			waitForAjax();
			driver.switchTo().defaultContent();
		}

	}

	public void SelectWCPriorWOMPickUPwithCharge(int row) throws IOException, InterruptedException, BiffException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
		cal.add(Calendar.MONTH, -1);
		Date d = cal.getTime();
		String priorMonth = sdf.format(d);
		System.out.println(priorMonth);
		int count = 0;
		String noOfBottles = readonlyWCNoOfBottles().getText();
		Thread.sleep(3000);
		System.out.println("Num of bott :" + noOfBottles);
		driver.switchTo().frame("06641000007zQ8Q");
		Thread.sleep(5000);
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
					ResultsLog.ReportPass(driver, "Sucessfuly clicked on checkbox", "Checkbox");
					Thread.sleep(5000);
					selectByText(driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[5]/child::select)["
									+ i + "]")),
							"Alternate Wine", "Camille Brave");
					Thread.sleep(3000);
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
				ResultsLog.ReportInfo(driver, "No WOM list available");
			}

		}

		Thread.sleep(10000);
		try {
			if (!btnProceedToPaymentWOM.isDisplayed()) {
				Scroll(btnProceedToPaymentWOM);
			}
		} catch (Exception e) {
			System.out.println("Btn Proceed to Payment not available");
		}
		try {
			Thread.sleep(10000);
			btnProceedToPaymentWOM.click();
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

	public void SelectWCCurrentWOMPickUPwithCharge(int row) throws IOException, InterruptedException, BiffException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
		cal.add(Calendar.MONTH, 0);
		Date d = cal.getTime();
		String currentMonth = sdf.format(d);
		System.out.println(currentMonth);
		int count = 0;
		String noOfBottles = readonlyWCNoOfBottles().getText();
		Thread.sleep(3000);
		System.out.println("Num of bott :" + noOfBottles);
		driver.switchTo().frame("06641000007zQ8Q");
		Thread.sleep(5000);

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
						&& !wine.equalsIgnoreCase("Sweet") && wom.equalsIgnoreCase(currentMonth)) {
					Thread.sleep(5000);
					driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[1]/child::input)["
									+ i + "]"))
							.click();
					ResultsLog.ReportPass(driver, "Successfully clicked on checkbox", "WOM Checkbox");
					Thread.sleep(5000);
					selectByText(driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[5]/child::select)["
									+ i + "]")),
							"Alternate Wine", "Camille Brave");
					Thread.sleep(2000);
					String additionalPrice = driver.findElement(By.xpath(
							"(//*[contains(text(),'Open Bottles')]/parent::div/child::table/child::thead/following-sibling::tbody/child::tr/td[6]/child::label)["
									+ i + "]"))
							.getText();
					System.out.println("Dpd Value :" + additionalPrice);
					count++;

					if (!additionalPrice.equalsIgnoreCase("0")) {
						ResultsLog.ReportPass(driver, "WOM with Upcharge :" + additionalPrice,
								"Current WOM With Price Upcharge");

					} else {
						ResultsLog.ReportFail(driver, "WOM with Upcharge :" + additionalPrice,
								"Current WOM With Price Upcharge is failed");

					}

				} else {
					ResultsLog.ReportInfo(driver, "Required WOM not found for current month :" + currentMonth);
					System.out.println("Required WOM not found for current month :" + currentMonth);
				}
				if (Integer.parseInt(noOfBottles) == count) {
					break;
				} else {

					System.out.println("Count :" + count);
				}
			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "No WOM list available");
			}

		}

		Thread.sleep(10000);
		try {
			if (!btnProceedToPaymentWOM.isDisplayed()) {
				Scroll(btnProceedToPaymentWOM);
				Thread.sleep(1000);
				btnProceedToPaymentWOM.click();
			} else {
				Thread.sleep(1000);
				btnProceedToPaymentWOM.click();
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

	public void addLoyaltyPoints() throws Exception {

		ClickNewWCMemberPointsHistory();
		SelectPointsType();
		SelectPointsStatus();
		EnterPointsEarned();
		SelectRestauranttLocation();
		EnterTotalPointsApplicable();
		SaveLoyalytPoints();

	}

	public void MemberSignatureCheckedOPtOut() throws IOException {

		waitForPageLoadToComplete();
		clickOnLink(btnEdit(), "Edit");
		if (!chkMemberSignatureOptOut().isSelected())
			MemberSignatureOptOut();
		ClickSaveWCMemberInformation();

	}

	public void MemberSignatureCheckedOPtIn() throws IOException {
		waitForPageLoadToComplete();
		clickOnLink(btnEdit(), "Edit");
		if (chkMemberSignatureOptOut().isSelected())
			MemberSignatureOptOut();
		ClickSaveWCMemberInformation();
	}

	public void noIncreasedAmbassadorPointsforJulyPromo() throws IOException {
		String AmbassadorPoints = readOnlyClassicWCAmbassadorTenureCredits().getText();
		verifyTextEqual(readOnlyClassicWCAmbassadorTenureCredits(), AmbassadorPoints, "Ambassador Points Comparision");
		CompareNoofBottles();
		verifyTextEqual(readOnlyClassicWCAmbassadorTenureCredits(), AmbassadorPoints, "Ambassador Points Comparision");
		if (AmbassadorPoints.equals(readOnlyClassicWCAmbassadorTenureCredits().getText())) {
			ClickSaveWCMemberWOM();
		} else {
			System.out.println("");
		}
	}

	public void clearDeclineStatus() throws IOException {

		waitForPageLoadToComplete();
		clickOnLink(btnEdit(), "Edit");
		// System.out.println(dpdwnEditWCMemberStatus().getText());
		if (dpdwnEditWCMemberStatus().getText().equals("UTP")) {
			selectByText(dpdwnEditWCMemberStatus(), "WC Member Status", "Active");
			clickOnButton(btnSaveWCInformationPage(), "Save WC Member Status");
		} else {
			// selectByText(dpdwnEditWCMemberStatus(), "Edit WC Member Status", "Active");
			// DoubleClickonMemberStatus();
			// SelectWCMemberStatus("Active");
			// ClickSaveWCMemberInformation();
			selectByText(dpdwnEditWCMemberStatus(), "WC Member Status", "UTP");
			clickOnButton(btnSaveWCInformationPage(), "Save WC Member Status");
			clickOnLink(btnEdit(), "Edit");
			selectByText(dpdwnEditWCMemberStatus(), "WC Member Status", "Active");
			clickOnButton(btnSaveWCInformationPage(), "Save WC Member Status");
		}

	}

	public void markOffTasting() throws Exception {
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0,2700)");
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Frames :" + size);
		driver.switchTo().frame("06641000007zQ8P");
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
				ResultsLog.ReportPass(driver, "Tasting done", "Mark off Tasting");
				System.out.println("Clicked: " + currentMonth + " WOM");
				clickOnButton(btnSaveWCMemberTasting, "Save WC Member Tasting");
				System.out.println("Clicked Save WC Member Tasting button");
				break;

			} else {
				System.out.println(" current Month WOM not found ");
				break;

			}

		}

		/*
		 * int tasting_rows = driver.findElements(By.xpath(
		 * "//*[text()='Completed?']/parent::th/parent::tr/parent::thead/following-sibling::tbody/child::tr/child::td/child::input"
		 * )).size();
		 * 
		 * System.out.println("WOM Available for Tasting = " + tasting_rows); String
		 * currentMonth = BasePages.getCurrentMonthName(); String currentYear =
		 * BasePages.getCurrentYear(); // Used for loop for number of rows. for (int i =
		 * 0; i <= tasting_rows; i++) {
		 * 
		 * String womYear = driver
		 * .findElement(By.xpath(".//*[@id='j_id0:j_id1:j_id2:j_id33']/tbody[1]/tr[" + i
		 * + "]/td[2]/span")) .getText(); System.out.println("WOM Year :"+womYear);
		 * String womMonth = driver
		 * .findElement(By.xpath(".//*[@id='j_id0:j_id1:j_id2:j_id33']/tbody[1]/tr[" + i
		 * + "]/td[3]/span")) .getText(); System.out.println("WOM Month :"+womMonth); if
		 * ((womYear != null && womYear.equalsIgnoreCase(currentYear)) && (womMonth !=
		 * null && womMonth.equalsIgnoreCase(currentMonth))) { //
		 * driver.findElement(By.xpath(".//*[@id='DataTables_Table_1']/tbody/tr[" + i +
		 * // "]/td[1]/strong/a")).click(); // clickOnCheckBox(element, chkName);
		 * driver.findElement(By.xpath(
		 * ".//*[@id='j_id0:j_id1:j_id2:j_id33']/tbody[1]/tr[" + i + "]/td[1]/input"))
		 * .click(); System.out.println("Clicked" + currentMonth + "WOM");
		 * 
		 * } else { System.out.println(" current Month WOM not found "); //
		 * driver.findElement(By.xpath("//*[@class='dataRow even //
		 * first']/td/input")).click(); }
		 */

	}

//COMMENTED FOR MOMENT TO USE SCRIPTS//

	/*
	 * public void JulyPromoEligibilityforNewPickUpTypeSignUpJune25toJuly22() throws
	 * IOException {
	 * 
	 * Date date1 = null; Date date2 = null; try { Calendar cal =
	 * Calendar.getInstance(); SimpleDateFormat sdf = new
	 * SimpleDateFormat("MM/dd/yyyy");
	 * 
	 * date1 = sdf.parse("06/25/2019"); date2 = sdf.parse("07/22/2019");
	 * 
	 * 
	 * String todayDate = sdf.format(cal.getTime());
	 * 
	 * Date currentDate = sdf.parse(todayDate); if (currentDate.after(date1) &&
	 * currentDate.before(date2) || currentDate.equals(date1) ||
	 * currentDate.equals(date2)) { if
	 * (readonlyWCDelivery().getText().equalsIgnoreCase("Pickup")) {
	 * 
	 * if (readonlyWCNoOfBottles().getText().equalsIgnoreCase("1")) {
	 * 
	 * WebElement womYear = driver.findElement(By.
	 * xpath("//body[contains(@class,'ext-webkit ext-chrome sfdcBody brandQuaternaryBgr')]"
	 * )); ((JavascriptExecutor)
	 * driver).executeScript("arguments[0].scrollIntoView(true);", womYear);
	 * 
	 * List<WebElement> womMonths = driver.findElements( By.xpath(
	 * "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2]"));
	 * List<WebElement> womNameList = driver.findElements( By.xpath(
	 * "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3]"));
	 * 
	 * for (int i = 0; i < womMonths.size(); i++) { WebElement womMonth =
	 * womMonths.get(i); WebElement womName = womNameList.get(i); if
	 * (womMonth.getText().contains("7") &&
	 * womName.getText().equals("July Thank You 2019")) {
	 * System.out.println("July Promo bottle credited :" + i); break; } else if
	 * (!womName.getText().equals("July Thank You 2019")) {
	 * System.out.println("WOM bottle credited :" + i); break; } } }
	 * 
	 * else if (rbtnNextBillingCycle().isSelected()) { Menu.ClickWinePick_UP();
	 * List<WebElement> womMonths = driver.findElements( By.xpath(
	 * "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2]")); for
	 * (int i = 0; i < womMonths.size(); i++) { WebElement womMonth =
	 * womMonths.get(i); if (womMonth.getText().contains("8")) {
	 * System.out.println("August WOMS credited :" + i); break; } } } } else if
	 * (rbtn2Bottles().isSelected()) {
	 * 
	 * if (rbtnImmediatly().isSelected()) { Menu.ClickWinePick_UP();
	 * List<WebElement> womMonths = driver.findElements( By.xpath(
	 * "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2]"));
	 * List<WebElement> womNameList = driver.findElements( By.xpath(
	 * "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3]"));
	 * 
	 * for (int i = 0; i < womMonths.size(); i++) { WebElement womMonth =
	 * womMonths.get(i); WebElement womName = womNameList.get(i); if
	 * (womMonth.getText().contains("7") &&
	 * womName.getText().equals("July Thank You 2019")) {
	 * System.out.println("July WOM bottle credited for July :" + i); break; } else
	 * if (!womName.getText().equals("July Thank You 2019")) {
	 * System.out.println("July WOM bottle credited :" + i); break; } } } else if
	 * (rbtnNextBillingCycle().isSelected()) { Menu.ClickWinePick_UP();
	 * List<WebElement> womMonths = driver.findElements( By.xpath(
	 * "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2]")); for
	 * (int i = 0; i < womMonths.size(); i++) { WebElement womMonth =
	 * womMonths.get(i); if (womMonth.getText().contains("8")) {
	 * System.out.println("August WOM credited :" + i); break; } } } }
	 * 
	 * } }
	 * 
	 * }catch(
	 * 
	 * ParseException e) {
	 * System.out.println("July Promo date eligibility pick up type date"); }
	 * 
	 * }
	 */

	public void SelectJulypromo(int row) throws IOException, InterruptedException, ParseException {
		if (data.Getdata("Test Case:", row).equalsIgnoreCase("July Promo Rest TC_0003")) {
			systemDateChange(data.Getdata("System Date Change", row));
		}
		int count = 0;
		String noOfBottles = readonlyWCNoOfBottles().getText().substring(0, 1);

		Thread.sleep(3000);
		System.out.println("Num of bott :" + noOfBottles);

		systemDateChange("06/26/2019");
		Calendar cal = Calendar.getInstance();
		Date todayDate = new SimpleDateFormat("MM/dd/yyyy")
				.parse(new SimpleDateFormat("MM/dd/yyyy").format(cal.getTime()));
		Date startDate = null;
		Date endDate = null;
		if (data.Getdata("Test Case:", row).equalsIgnoreCase("July Promo Rest TC_0003")) {

			startDate = new SimpleDateFormat("MM/dd/yyyy").parse(data.Getdata("July Promo Rest start Date", row));
			endDate = new SimpleDateFormat("MM/dd/yyyy").parse(data.Getdata("July Promo Rest End Date", row));
		}

		for (int i = 0; i < 20; i++) {
			try {
				WebElement wom = driver.findElement(
						By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3])[" + i + "]"));
				if (wom.getText().equals("July Thank You 2019") && noOfBottles.equals("1") && todayDate.after(startDate)
						&& todayDate.before(endDate)) {
					Thread.sleep(2000);
					selectByText(driver.findElement(
							By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[4]/select)["
									+ i + "]")),
							"Alternate Wine", "Almond Sparkling");
					break;
				} else if (wom.getText().equals("July Thank You 2019") && noOfBottles.equals("2")
						&& todayDate.after(startDate) && todayDate.before(endDate)) {
					if (count == 2) {
						break;
					} else {
						Thread.sleep(2000);
						selectByText(driver.findElement(By
								.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[4]/select)["
										+ i + "]")),
								"Alternate Wine", "Almond Sparkling");
						count++;
					}

				}
			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "List not found");
			}

		}

		ClickSaveWCMemberWOM();

	}

	public void CompareNoofBottles(int row) throws IOException, ParseException, InterruptedException {
		if (data.Getdata("Test Case:", row).equalsIgnoreCase("July Promo Rest TC_0004")) {
			systemDateChange(data.Getdata("System Date Change", row));
		}
		int count = 0;
		String noOfBottles = readonlyWCNoOfBottles().getText().substring(0, 1);

		Thread.sleep(3000);
		System.out.println("Num of bott :" + noOfBottles);

		systemDateChange("06/26/2019");
		Calendar cal = Calendar.getInstance();
		Date startDate = null;
		Date endDate = null;
		if (data.Getdata("Test Case:", row).equalsIgnoreCase("July Promo Rest TC_0004")) {

			startDate = new SimpleDateFormat("MM/dd/yyyy").parse(data.Getdata("July Promo Rest Start Date", row));
			endDate = new SimpleDateFormat("MM/dd/yyyy").parse(data.Getdata("July Promo Rest End Date", row));
		}

		String currentMonth = new SimpleDateFormat("MM/yyyy").format(cal.getTime());
		for (int i = 0; i < 20; i++) {
			try {
				WebElement month = driver.findElement(
						By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])[" + i + "]"));
				WebElement wom = driver.findElement(
						By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3])[" + i + "]"));
				if (wom.getText().equals("July Thank You 2019") && noOfBottles.equals("1")
						&& month.getText().equals(currentMonth)) {
					Thread.sleep(2000);
					ResultsLog.ReportInfo(driver, "One July Promo Bottle Available");
					break;
				} else if (wom.getText().equals("July Thank You 2019") && noOfBottles.equals("2")
						&& month.getText().equals(currentMonth)) {
					if (count == 2) {
						break;
					} else {
						Thread.sleep(2000);
						ResultsLog.ReportInfo(driver, "July Promo Bottle Available:" + count);
						count++;
					}

				}
			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "List not found");
			}

		}

	}

	public void noIncreasedAmbassadorPointsforJulyPromo(int row)
			throws IOException, ParseException, InterruptedException {
		String AmbassadorPoints = readOnlyClassicWCAmbassadorTenureCredits().getText();
		verifyTextEqual(readOnlyClassicWCAmbassadorTenureCredits(), AmbassadorPoints, "Ambassador Points Comparision");
		CompareNoofBottles(row);
		verifyTextEqual(readOnlyClassicWCAmbassadorTenureCredits(), AmbassadorPoints, "Ambassador Points Comparision");
		if (AmbassadorPoints.equals(readOnlyClassicWCAmbassadorTenureCredits().getText())) {
			ClickSaveWCMemberWOM();

		} else {
			System.out.println("");
		}
	}

	public void JulyPromoNotEnabled() throws IOException {

		for (int i = 0; i < 20; i++) {
			try {
				WebElement wom = driver.findElement(
						By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3])[" + i + "]"));
				if (wom.getText().equals("July Thank You 2019") && !(wom.isEnabled())) {
					Thread.sleep(2000);
					ResultsLog.ReportPass(driver, "July Promo Disabled for selection", "July Promo Not Pickable");
					break;
				} else {
					ResultsLog.ReportFail(driver, "July Promo Enabled for selection",
							"Requirement says it should be disabled");

				}
			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "List not found");
			}

		}

	}

	public void JulyPromoEligibilityforNewPickUpTypeSignUpJune25toJuly22(int row) throws IOException {
		if (data.Getdata("Test Case:", row).equalsIgnoreCase("July Promo Rest TC_0017")) {
			systemDateChange(data.Getdata("System Date Change", row));
		}
		Date date1 = null;
		Date date2 = null;
		try {
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			if (data.Getdata("Test Case:", row).equalsIgnoreCase("July Promo Rest TC_0017")) {

				date1 = sdf.parse(data.Getdata("July Promo Rest start Date", row));
				date2 = sdf.parse(data.Getdata("July Promo Rest End Date", row));
			}

			String todayDate = sdf.format(cal.getTime());

			Date currentDate = sdf.parse(todayDate);
			if (currentDate.after(date1) && currentDate.before(date2) || currentDate.equals(date1)
					|| currentDate.equals(date2)) {
				if (readonlyWCDelivery().getText().equalsIgnoreCase("Pickup")) {

					if (readonlyWCNoOfBottles().getText().equalsIgnoreCase("1")) {
						clickEditWCInfo();
						if (dpdChargeTiming().getText().equalsIgnoreCase("Next Billing Cycle")) {
							ClickSaveWCMemberInformation();

							for (int i = 0; i < 20; i++) {
								try {
									WebElement womMonth = driver.findElement(By.xpath(
											"(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])["
													+ i + "]"));
									WebElement womName = driver.findElement(By.xpath(
											"(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3])["
													+ i + "]"));
									if (womMonth.getText().contains("7")
											&& womName.getText().equals("July Thank You 2019")) {
										System.out.println("July Promo bottle credited :" + i);
										break;
									} else if (!womName.getText().equals("July Thank You 2019")) {
										System.out.println("WOM bottle credited :" + i);
										break;
									}
								} catch (Exception e) {
									ResultsLog.ReportInfo(driver, "Element not found in list");
								}

							}
						} else if (dpdChargeTiming().getText().equalsIgnoreCase("Immediately")) {

							ClickSaveWCMemberInformation();
							for (int i = 0; i < 20; i++) {
								try {
									WebElement womMonth = driver.findElement(By.xpath(
											"(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])["
													+ i + "]"));
									if (womMonth.getText().contains("8")) {
										System.out.println("August WOMS credited :" + i);
										break;
									}
								} catch (Exception e) {
									ResultsLog.ReportInfo(driver, "Element not found in list");
								}

							}
						} else if (readonlyWCNoOfBottles().getText().equalsIgnoreCase("1")) {
							clickEditWCInfo();
							if (dpdChargeTiming().getText().equalsIgnoreCase("Immediately")) {
								ClickSaveWCMemberInformation();

								for (int i = 0; i < 20; i++) {
									try {
										WebElement womMonth = driver.findElement(By.xpath(
												"//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2]"));
										WebElement womName = driver.findElement(By.xpath(
												"//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3]"));
										if (womMonth.getText().contains("7")
												&& womName.getText().equals("July Thank You 2019")) {
											System.out.println("July WOM bottle credited for July :" + i);
											break;
										} else if (!womName.getText().equals("July Thank You 2019")) {
											System.out.println("July WOM bottle credited :" + i);
											break;
										}
									} catch (Exception e) {
										ResultsLog.ReportInfo(driver, "Element not found in list");
									}

								}
							} else if (dpdChargeTiming().getText().equalsIgnoreCase("Next Billing Cycle")) {
								ClickSaveWCMemberInformation();

								for (int i = 0; i < 20; i++) {
									try {
										WebElement womMonth = driver.findElement(By.xpath(
												"//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2]"));
										if (womMonth.getText().contains("8")) {
											System.out.println("August WOM credited :" + i);
											break;
										}
									} catch (Exception e) {
										ResultsLog.ReportInfo(driver, "Element not found in list");
									}

								}
							}
						}

					}

				}
			}
		} catch (ParseException e) {
			System.out.println("July Promo date eligibility pick up type date");
		}

	}

	public void JulyPromoEligibilityforNewPickUpTypeSignUpJuly23toJuly31(int row) throws IOException {
		if (data.Getdata("Test Case:", row).equalsIgnoreCase("July Promo Rest TC_0018")) {
			systemDateChange(data.Getdata("System Date Change", row));
		}
		Date date1 = null;
		Date date2 = null;
		try {
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

			if (data.Getdata("Test Case:", row).equalsIgnoreCase("July Promo Rest TC_0018")) {

				date1 = sdf.parse(data.Getdata("July Promo Rest start Date", row));
				date2 = sdf.parse(data.Getdata("July Promo Rest End Date", row));
			}

			String todayDate = sdf.format(cal.getTime());

			Date currentDate = sdf.parse(todayDate);
			if (currentDate.after(date1) && currentDate.before(date2) || currentDate.equals(date1)
					|| currentDate.equals(date2)) {
				if (readonlyWCDelivery().getText().equalsIgnoreCase("Pickup")) {

					if (readonlyWCNoOfBottles().getText().equalsIgnoreCase("1")) {
						clickEditWCInfo();
						if (dpdChargeTiming().getText().equalsIgnoreCase("Immediately")) {
							ClickSaveWCMemberInformation();
							for (int i = 0; i < 20; i++) {
								try {
									WebElement womMonth = driver.findElement(By.xpath(
											"(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])["
													+ i + "]"));
									WebElement womName = driver.findElement(By.xpath(
											"(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3])["
													+ i + "]"));
									if (womMonth.getText().contains("8")
											&& womName.getText().equals("July Thank You 2019")) {
										System.out.println("July Promo bottle credited for August :" + i);

									} else if (!womName.getText().equals("July Thank You 2019")) {
										System.out.println("August WOM bottle credited :" + i + 1);

									}
								} catch (Exception e) {
									ResultsLog.ReportInfo(driver, "Element not found in list");
								}

							}
						} else if (dpdChargeTiming().getText().equalsIgnoreCase("Next Billing Cycle")) {
							ClickSaveWCMemberInformation();

							for (int i = 0; i < 20; i++) {
								try {
									WebElement womMonth = driver.findElement(By.xpath(
											"(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])["
													+ i + "]"));
									WebElement womName = driver.findElement(By.xpath(
											"(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3])["
													+ i + "]"));
									if (womMonth.getText().contains("8")
											&& !womName.getText().equals("July Thank You 2019")) {
										System.out.println(
												"August WOM credited :" + i + "July promo bottle not credited");

									}
								} catch (Exception e) {
									ResultsLog.ReportInfo(driver, "Element not found in list");
								}

							}
						}
					} else if (readonlyWCNoOfBottles().getText().equalsIgnoreCase("1")) {
						if (dpdChargeTiming().getText().equalsIgnoreCase("Immediately")) {
							int count = 0;
							ClickSaveWCMemberInformation();
							for (int i = 0; i < 20; i++) {
								try {
									WebElement womMonth = driver.findElement(By.xpath(
											"(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])["
													+ i + "]"));
									WebElement womName = driver.findElement(By.xpath(
											"(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3])["
													+ i + "]"));
									if (womMonth.getText().contains("7")
											&& womName.getText().equals("July Thank You 2019")) {
										System.out.println("July WOM bottle credited :" + i);

									} else if (!womName.getText().equals("July Thank You 2019")) {

										System.out.println("WOM bottle credited :" + i + 1);

									}
								} catch (Exception e) {
									ResultsLog.ReportInfo(driver, "Element not found in list");
								}

							}

						}
					} else if (dpdChargeTiming().getText().equalsIgnoreCase("Next Billing Cycle")) {
						ClickSaveWCMemberInformation();

						for (int i = 0; i < 20; i++) {
							try {
								WebElement womMonth = driver.findElement(By
										.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])["
												+ i + "]"));
								WebElement womName = driver.findElement(By
										.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3])["
												+ i + "]"));
								if (womMonth.getText().contains("8")
										&& !womName.getText().equals("July Thank You 2019")) {
									System.out.println("August WOM credited :" + i + "July promo bottle not credited");

								}
							} catch (Exception e) {
								ResultsLog.ReportInfo(driver, "Element not found in list");
							}

						}
					}
				}
			}
		}

		catch (ParseException e) {
			System.out.println("July Promo date eligibility pick up type date");
		}
	}

	public void JulyPromoEligibilityforNewNonPayeeMemberSignUpJune25toJuly22(int row)
			throws IOException, ParseException {

		if (data.Getdata("Test Case:", row).equalsIgnoreCase("July Promo Rest TC_0019")) {
			systemDateChange(data.Getdata("System Date Change", row));
		}
		Date date1 = null;
		Date date2 = null;

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

		if (data.Getdata("Test Case:", row).equalsIgnoreCase("July Promo Rest TC_0019")) {

			date1 = sdf.parse(data.Getdata("July Promo Rest start Date", row));
			date2 = sdf.parse(data.Getdata("July Promo Rest End Date", row));
		}
		String todayDate = sdf.format(cal.getTime());

		Date currentDate = sdf.parse(todayDate);
		if (currentDate.after(date1) && currentDate.before(date2) || currentDate.equals(date1)
				|| currentDate.equals(date2)) {
			if (readonlyWCDelivery().getText().equalsIgnoreCase("Pickup")) {
				if (readonlyWCNoOfBottles().getText().equalsIgnoreCase("1")) {
					clickEditWCInfo();

					if (dpdChargeTiming().getText().equalsIgnoreCase("Immediately")) {
						ClickSaveWCMemberInformation();

						for (int i = 0; i < 20; i++) {
							try {
								WebElement womMonth = driver.findElement(By
										.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])["
												+ i + "]"));
								WebElement womName = driver.findElement(By
										.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3]["
												+ i + "]"));
								if (womMonth.getText().contains("7")
										&& womName.getText().equals("July Thank You 2019")) {
									System.out.println("July Promo bottle credited :" + i);
									break;
								} else if (!womName.getText().equals("July Thank You 2019")) {
									System.out.println("WOM bottle credited :" + i);
									break;
								}
							} catch (Exception e) {
								ResultsLog.ReportInfo(driver, "Element not found in list");
							}

						}
					} else if (dpdChargeTiming().getText().equalsIgnoreCase("Next Billing Cycle")) {
						ClickSaveWCMemberInformation();

						for (int i = 0; i < 20; i++) {
							try {
								WebElement womMonth = driver.findElement(By
										.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])["
												+ i + "]"));
								if (womMonth.getText().contains("8")) {
									System.out.println("August WOMS credited :" + i);
									break;
								}
							} catch (Exception e) {
								ResultsLog.ReportInfo(driver, "Element not found in list");
							}

						}
					}
				} else if (readonlyWCNoOfBottles().getText().equalsIgnoreCase("2")) {

					if (dpdChargeTiming().getText().equalsIgnoreCase("Immediately")) {
						ClickSaveWCMemberInformation();

						for (int i = 0; i < 20; i++) {
							try {
								WebElement womMonth = driver.findElement(By
										.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])["
												+ i + "]"));
								WebElement womName = driver.findElement(By
										.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3])["
												+ i + "]"));
								if (womMonth.getText().contains("7")
										&& womName.getText().equals("July Thank You 2019")) {
									System.out.println("July WOM bottle credited for July :" + i);
									break;
								} else if (!womName.getText().equals("July Thank You 2019")) {
									System.out.println("July WOM bottle credited :" + i);
									break;
								}
							} catch (Exception e) {
								ResultsLog.ReportInfo(driver, "Element not found in list");
							}

						}
					} else if (dpdChargeTiming().getText().equalsIgnoreCase("Next Billing Cycle")) {
						ClickSaveWCMemberInformation();

						for (int i = 0; i < 20; i++) {
							WebElement womMonth = driver.findElement(
									By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])["
											+ i + "]"));
							if (womMonth.getText().contains("8")) {
								System.out.println("August WOM credited :" + i);
								break;
							}
						}
					}
				}

			}
		}
	}

	public void JulyPromoEligibilityforNewNonPayeeMemberSignUpJuly23toJuly31(int row)
			throws IOException, ParseException {

		if (data.Getdata("Test Case:", row).equalsIgnoreCase("July Promo Rest TC_0019")) {
			systemDateChange(data.Getdata("System Date Change", row));
		}
		Date date1 = null;
		Date date2 = null;

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

		if (data.Getdata("Test Case:", row).equalsIgnoreCase("July Promo Rest TC_0019")) {

			date1 = sdf.parse(data.Getdata("July Promo Rest start Date", row));
			date2 = sdf.parse(data.Getdata("July Promo Rest End Date", row));
		}
		String todayDate = sdf.format(cal.getTime());

		Date currentDate = sdf.parse(todayDate);
		if (currentDate.after(date1) && currentDate.before(date2) || currentDate.equals(date1)
				|| currentDate.equals(date2)) {
			if (readonlyWCDelivery().getText().equalsIgnoreCase("Pickup")) {

				if (readonlyWCNoOfBottles().getText().equalsIgnoreCase("1")) {
					clickEditWCInfo();
					if (dpdChargeTiming().getText().equalsIgnoreCase("Immediately")) {
						ClickSaveWCMemberInformation();

						for (int i = 0; i < 20; i++) {
							try {
								WebElement womMonth = driver.findElement(By
										.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])["
												+ i + "]"));
								WebElement womName = driver.findElement(By
										.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3]["
												+ i + "]"));
								if (womMonth.getText().contains("7")
										&& womName.getText().equals("July Thank You 2019")) {
									System.out.println("July Promo bottle credited :" + i);
									break;
								} else if (!womName.getText().equals("July Thank You 2019")) {
									System.out.println("WOM bottle credited :" + i);
									break;
								}
							} catch (Exception e) {
								ResultsLog.ReportInfo(driver, "Element not found in list");
							}

						}
					} else if (dpdChargeTiming().getText().equalsIgnoreCase("Next Billing Cycle")) {
						ClickSaveWCMemberInformation();

						for (int i = 0; i < 20; i++) {
							try {
								WebElement womMonth = driver.findElement(By
										.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])["
												+ i + "]"));
								if (womMonth.getText().contains("8")) {
									System.out.println("August WOMS credited :" + i);
									break;
								}
							} catch (Exception e) {
								ResultsLog.ReportInfo(driver, "Element not found in list");
							}

						}
					}
				} else if (readonlyWCNoOfBottles().getText().equalsIgnoreCase("2")) {

					if (dpdChargeTiming().getText().equalsIgnoreCase("Immediately")) {
						ClickSaveWCMemberInformation();

						for (int i = 0; i < 20; i++) {
							try {
								WebElement womMonth = driver.findElement(By
										.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])["
												+ i + "]"));
								WebElement womName = driver.findElement(By
										.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3])["
												+ i + "]"));
								if (womMonth.getText().contains("7")
										&& womName.getText().equals("July Thank You 2019")) {
									System.out.println("July WOM bottle credited for July :" + i);
									break;
								} else if (!womName.getText().equals("July Thank You 2019")) {
									System.out.println("July WOM bottle credited :" + i);
									break;
								}
							} catch (Exception e) {
								ResultsLog.ReportInfo(driver, "Element not found in list");
							}

						}
					} else if (dpdChargeTiming().getText().equalsIgnoreCase("Next Billing Cycle")) {
						ClickSaveWCMemberInformation();

						for (int i = 0; i < 20; i++) {
							WebElement womMonth = driver.findElement(
									By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])["
											+ i + "]"));
							if (womMonth.getText().contains("8")) {
								System.out.println("August WOM credited :" + i);
								break;
							}
						}
					}
				}

			}
		}
	}

	public void julyPromoBottleExculdedfromTotalBottles() {
		int count = 0;
		try {
			WebElement wom = driver
					.findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3]"));
			WebElement bottlesAvailable = driver.findElement(By.xpath("//*[contains(text(),'July Thank You')]"));

			for (int i = 0; i < 20; i++) {

				if (wom.getText().equalsIgnoreCase("July Thank you 2019")) {
					count++;

				} else {
					ResultsLog.ReportInfo(driver, "Bottles Available:" + i);

				}

			}
			ResultsLog.ReportInfo(driver, "Available July Thank You 2019:" + count);
		} catch (Exception e) {
			System.out.println("July Thank You 2019 not available");
		}

	}

	public void bottlesAvailableIncludedinTotalBottles() {
		int count = 0;
		List<WebElement> rows = driver
				.findElements(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3]"));
		try {
			Thread.sleep(1000);
			WebElement bottlesAvailable = driver.findElement(By.xpath("//*[contains(text(),'Bottles Available')]"));
			if (bottlesAvailable.isDisplayed()) {
				System.out.println("No of rows are : " + rows.size());
				for (int row = 0; row <= rows.size(); row++) {
					WebElement WOMelement = rows.get(row);

					String WOMvalue = WOMelement.getText();
					if (!WOMvalue.equals("July Thank You 2019")) {
						count++;
						if (bottlesAvailable.getText().contains(Integer.toString(count))) {
							System.out.println(bottlesAvailable.getText());
							break;
						}
					}

				}
			} else {
				System.out.println("Open bottles not displyed");
			}

		} catch (Exception e) {
			System.out.println("Open bottles not available");
		}
	}
	// *[contains(text(),'Bottles Available:')]

	public void NoofAvailableRowsinAvailableWinesSectionTable() {

		// WebElement TogetRows =
		// driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_GridViewAvailableWines\"]/tbody/tr"));
		List<WebElement> rows = driver
				.findElements(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3]"));
		System.out.println("No of rows are : " + rows.size());
		List<WebElement> TotalRowsList = ((WebElement) rows).findElements(By.tagName("td"));
		System.out.println("Total number of Rows in the table are : " + TotalRowsList.size());
//				
//				String innerText = driver.findElement(
//						By.xpath("//*[@id=\"ContentPlaceHolder1_GridViewAvailableWines\"]/tbody/tr[2]/td[3]")).getText(); 
//				String GetData = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_GridViewAvailableWines\"]/tbody/tr[2]/td[3]")).getText();
//				
//				System.out.println(innerText);
//				System.out.println(GetData);
		WebElement table = driver.findElement(By.id("ContentPlaceHolder1_availableWinesTable"));
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		for (WebElement row : allRows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));

			// Print the contents of each cell
			for (WebElement cell : cells) {
				System.out.println(cell.getText());
			}
		}
	}

	public void rejoinMember(int row) throws IOException, InterruptedException, BiffException, ParseException {
		Date startDate = null;
		Date endDate = null;
		Calendar cal = Calendar.getInstance();
		Date today = new SimpleDateFormat("MM/dd/yyyy").parse(new SimpleDateFormat("MM/dd/yyyy").format(cal.getTime()));
		String bottlesAndClub = readonlyWCNoOfBottles().getText();
		clickOnButton(Resaurant_Menu.btn_AccountInfo(), "Account Info");
		if (readOnlyClassicWCMemberStatus().getText().equalsIgnoreCase("Cancel")) {
			if (data.Getdata("Test Case:", row).equalsIgnoreCase("TC_0021")) {
				systemDateChange(data.Getdata("System Date Change", row));
				startDate = new SimpleDateFormat("MM/dd/yyyy").parse(data.Getdata("Start Date", row));
				endDate = new SimpleDateFormat("MM/dd/yyyy").parse(data.Getdata("End Date", row));
			}
			clickEditWCInfo();
			clickOnButton(btnRejoinMember(), "Rejoin Member Button");
			if (today.after(startDate) && today.before(endDate)) {
				if (dpdChargeTiming().getText().equalsIgnoreCase("Immediately")) {
					clickOnButton(btnProceedtoPaymentDetails(), "Proceed to Payment");
					Page_MonthlyMembersEntry.chargeNewCreditCard_StoreOnFileClassic();
					for (int i = 0; i < 20; i++) {
						try {
							WebElement womMonth = driver.findElement(
									By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])["
											+ i + "]"));
							WebElement womName = driver.findElement(
									By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3]["
											+ i + "]"));

							if (womMonth.isDisplayed() && womMonth.getText().contains("7")
									&& womName.getText().equals("July Thank You 2019") && bottlesAndClub.equals("1")) {

								ResultsLog.ReportPass(driver, "July Promo bottle credited :" + womName.getText(),
										"July Thank you");
								break;
							} else if (womMonth.isDisplayed() && womMonth.getText().contains("7")
									&& womName.getText().equals("July Thank You 2019") && bottlesAndClub.equals("1")) {
								ResultsLog.ReportPass(driver, "July Promo bottle credited :" + womName.getText(),
										"July Thank you");
								break;
							} else {
								ResultsLog.ReportInfo(driver, "july Thank you found");
								break;
							}

						} catch (Exception e) {
							ResultsLog.ReportInfo(driver, "List not found");
						}
					}

				} else if (dpdChargeTiming().getText().equalsIgnoreCase("Next Billing Cycle")) {
					clickOnButton(btnProceedtoPaymentDetails(), "Proceed to Payment");
					Page_MonthlyMembersEntry.chargeNewCreditCard_StoreOnFileClassic();

					for (int i = 0; i < 20; i++) {
						try {
							WebElement womMonth = driver.findElement(
									By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])["
											+ i + "]"));
							WebElement womName = driver.findElement(
									By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3]["
											+ i + "]"));

							if (!womMonth.isDisplayed()) {
								ResultsLog.ReportPass(driver, "July Promo bottle credited :" + womName.getText(),
										"July Thank you");
								break;
							} else {
								ResultsLog.ReportInfo(driver,
										"July Promo displayed for next billing cycle is wrong as per requirement");
								break;
							}

						} catch (Exception e) {
							ResultsLog.ReportInfo(driver, "List not found");
						}
					}

				}
			} else if (!readOnlyClassicWCMemberStatus().getText().equalsIgnoreCase("Cancel")) {
				Page_MemberSearch.EnterMemberInformation(row);
				clickOnButton(btncancelMembership(), "Cance Membership");
				clickEditWCInfo();
				clickOnButton(btnRejoinMember(), "Rejoin Member Button");
				if (dpdChargeTiming().getText().equalsIgnoreCase("Immediately")) {
					clickOnButton(btnProceedtoPaymentDetails(), "Proceed to Payment");
					Page_MonthlyMembersEntry.chargeNewCreditCard_StoreOnFileClassic();
					for (int i = 0; i < 20; i++) {
						try {
							WebElement womMonth = driver.findElement(
									By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])["
											+ i + "]"));
							WebElement womName = driver.findElement(
									By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3]["
											+ i + "]"));

							if (womMonth.isDisplayed() && womMonth.getText().contains("7")
									&& womName.getText().equals("July Thank You 2019") && bottlesAndClub.equals("1")) {

								ResultsLog.ReportPass(driver, "July Promo bottle credited :" + womName.getText(),
										"July Thank you");
								break;
							} else if (womMonth.isDisplayed() && womMonth.getText().contains("7")
									&& womName.getText().equals("July Thank You 2019") && bottlesAndClub.equals("1")) {
								ResultsLog.ReportPass(driver, "July Promo bottle credited :" + womName.getText(),
										"July Thank you");
								break;
							} else {
								ResultsLog.ReportInfo(driver, "july Thank you found");
								break;
							}

						} catch (Exception e) {
							ResultsLog.ReportInfo(driver, "List not found");
						}
					}

				} else if (dpdChargeTiming().getText().equalsIgnoreCase("Next Billing Cycle")) {
					clickOnButton(btnProceedtoPaymentDetails(), "Proceed to Payment");
					Page_MonthlyMembersEntry.chargeNewCreditCard_StoreOnFileClassic();
					for (int i = 0; i < 20; i++) {
						try {
							WebElement womMonth = driver.findElement(
									By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])["
											+ i + "]"));
							WebElement womName = driver.findElement(
									By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3]["
											+ i + "]"));

							if (!womMonth.isDisplayed()) {
								ResultsLog.ReportPass(driver, "July Promo bottle credited :" + womName.getText(),
										"July Thank you");
								break;
							} else {
								ResultsLog.ReportInfo(driver,
										"July Promo displayed for next billing cycle is wrong as per requirement");
								break;
							}

						} catch (Exception e) {
							ResultsLog.ReportInfo(driver, "List not found");
						}
					}

				}
			}
		}
	}

	public void julyPromoDisplayedwithYear() throws IOException {
		for (int i = 0; i < 20; i++) {
			try {
				WebElement womMonth = driver
						.findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2]"));
				WebElement wom = driver.findElement(
						By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3])[" + i + "]"));
				if (wom.getText().equals("July Thank You 2019")) {
					Thread.sleep(2000);
					ResultsLog.ReportPass(driver, "July Thank you printed with month and year:" + womMonth.getText(),
							womMonth.getText());
					break;
				} else {
					ResultsLog.ReportFail(driver, "July Thank you not printed with month and year",
							"Requirement says it should be printed with month and year");

				}
			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "List not found");
			}

		}

	}

	public void julyPromoDisplayedatTop() throws IOException, InterruptedException, ParseException {

		int count = 0;
		String noOfBottles = readonlyWCNoOfBottles().getText().substring(0, 1);

		Thread.sleep(3000);
		System.out.println("Num of bott :" + noOfBottles);

		systemDateChange("06/26/2019");
		Calendar cal = Calendar.getInstance();

		Date endDate = new SimpleDateFormat("MM/dd/yyyy").parse("09/02/2019");
		String currentMonth = new SimpleDateFormat("MM/yyyy").format(cal.getTime());
		for (int i = 0; i < 2; i++) {
			try {
				WebElement month = driver.findElement(
						By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])[" + i + "]"));
				WebElement wom = driver.findElement(
						By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3])[" + i + "]"));
				if (wom.getText().equals("July Thank You 2019") && noOfBottles.equals("1")
						&& month.getText().equals(currentMonth)) {
					Thread.sleep(2000);
					ResultsLog.ReportInfo(driver, "July Promo Bottle Displayed at Top Row");
					break;
				} else if (wom.getText().equals("July Thank You 2019") && noOfBottles.equals("2")
						&& month.getText().equals(currentMonth)) {
					if (count == 2) {
						break;
					} else {
						Thread.sleep(2000);
						ResultsLog.ReportInfo(driver, "July Promo Bottle Displayed at Top Row" + count);
						count++;
					}

				}
			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "List not found");
			}

		}
	}

}
