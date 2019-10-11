package com.MGS.CommonPages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.MGS.Pages.Page_GiftMembersEntry;
import com.MGS.PagesData.Member_SignUpPagedata;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;

public class Page_PaymentDetails extends BasePages {
	Member_SignUpPagedata data = new Member_SignUpPagedata();
	String ExpectedPageHeading = "Payment � Details";

	public static String CreditCardNumber;
	public static String CreditCardExpirationMonth;
	public static String CreditCardExpirationYear;

	/*
	 * public Page_PaymentDetails(int frameid) {
	 * 
	 * try { frameSwitch1(frameid); } catch (InterruptedException e) {
	 * 
	 * e.printStackTrace(); } }
	 */

	public Page_PaymentDetails() {

	}

	public static WebElement txt_CreditCardNumber() {
		return driver.findElement(By.xpath("//*[@name='CC_NUM']"));

	}

	public static WebElement dpd_ExpirationMonth() {
		return driver.findElement(By.id("CC_EXPIRES"));
	}

	public static WebElement dpd_ExpirationYear() {
		return driver.findElement(By.xpath("//select[@name='CC_EXPIRES_YEAR']"));

	}

	public WebElement PageTitleObject() {

		return driver.findElement(By.xpath("//*[@class='mainTitle']"));
	}

// Objects from Payment-Details Page

	public WebElement txtContact() throws InterruptedException {

		return driver.findElement(By.xpath("//*[contains(@id,'contactName')][@type='text']"));
	}

	public WebElement txtAccount() {

		return driver.findElement(By.xpath("//*[contains(@id,'accountName')][@type='text']"));
	}

	public WebElement txtBillingAddress() {

		return driver.findElement(By.xpath("//*[contains(@id,'address')]"));
	}

	public WebElement txtBillingCity() {

		return driver.findElement(By.xpath("//*[contains(@id,'city')]"));
	}

	public WebElement dpdBillingState() {

		return driver.findElement(By.xpath("//select[contains(@id,'state')]"));
	}

	public WebElement txtBillingZip_PostalCode() {

		return driver.findElement(By.xpath("//*[contains(@id,'zip')]"));
	}

	public WebElement txtPhone() {

		return driver.findElement(By.xpath("//*[contains(@id,'phone')]"));
	}

	public WebElement txtEmail() {

		return driver.findElement(By.xpath("//*[contains(@id,'email')]"));
	}

	public WebElement txtAmount() {

		return driver.findElement(By.xpath("//*[contains(@id,'amount')]"));
	}

	public WebElement dpdPaymentLocation() {

		return driver.findElement(By.xpath("//select[contains(@id,'paymentLocation')]"));
	}

	public WebElement dpdPaymentOrigin() {

		return driver.findElement(By.xpath("//select[@class='paymentOriginValue']"));
	}

	public WebElement txtCardHolderName() {

		return driver.findElement(By.xpath("//input[contains(@id,'cardholder')]"));
	}

	public WebElement txtCreditCard() {

		return driver.findElement(By.xpath("//input[contains(@id,'cardNumber')]"));
	}

	public WebElement dpdExpirationMonth() {

		return driver.findElement(By.xpath("//select[contains(@id,'expMonth')]"));
	}

	public WebElement dpdExpirationYear() {

		return driver.findElement(By.xpath("//select[contains(@id,'expYear')]"));
	}

	public static WebElement txt_FirstName() {
		return driver.findElement(By.xpath("//*[@name='NAME1']"));

	}

	public static WebElement txt_LastName() {
		return driver.findElement(By.xpath("//*[@name='NAME2']"));

	}

	public static WebElement txt_Email() {
		return driver.findElement(By.xpath("//*[@name='EMAIL']"));

	}

	public static WebElement txt_BillingAddress1() {
		return driver.findElement(By.xpath("//*[@name='ADDR1']"));

	}

	public static WebElement txt_BillingAddress2() {
		return driver.findElement(By.xpath("//*[@name='ADDR2']"));

	}

	public static WebElement txt_City() {
		return driver.findElement(By.xpath("//*[@name='CITY']"));

	}

	public static WebElement txt_ProvinceState() {
		return driver.findElement(By.xpath("//*[@name='STATE']"));

	}

	public static WebElement btn_ProcessPayment() {
		return driver.findElement(By.xpath("//*[@class='button--primary'][@value='Process Payment']"));

	}

	public static WebElement txt_PostalCode() {
		return driver.findElement(By.xpath("//*[@name='ZIPCODE']"));

	}

	public static WebElement txt_Phone() {
		return driver.findElement(By.xpath("//*[@name='PHONE']"));

	}

	public WebElement btnProcess() {

		return driver.findElement(By.xpath("//*[contains(@value,'Process')]"));
	}

	public WebElement btnSavePayment() {

		return driver.findElement(By.xpath("//*[contains(@value,'Save')]"));
	}

	public WebElement lnkGotoMember() {
		return driver.findElement(By.xpath("//a[text()='Go to Member']"));
	}

	public void ClickProcessPayment() throws IOException, BiffException {

		clickOnButton(btn_ProcessPayment(), "Process payment");
	}

	public void EnterCreditCardNumber() throws IOException {

		enterText(txt_CreditCardNumber(), "Credit Card", "4444333322221111");
	}

	public void ValidateFirstName(int row) throws IOException, BiffException {
		verifyTextEqualwithAttributeValue(txt_FirstName(), data.Getdata("First Name", row).trim(), " First Name");

	}

	public void ValidateLastName(int row) throws IOException, BiffException {
		verifyTextEqualwithAttributeValue(txt_LastName(), data.Getdata("Last Name", row).trim(), " Last Name");

	}

	public void ValidateEmail(int row) throws IOException, BiffException {
		verifyTextEqualwithAttributeValue(txt_Email(), data.Getdata("Email", row).trim(), " Email");

	}

	public void ValidateHomeStreet(int row) throws IOException, BiffException {
		verifyTextEqualwithAttributeValue(txt_BillingAddress1(), data.Getdata("Home Street", row).trim(),
				" Home Street");

	}

	public void ValidateHomeCity(int row) throws IOException, BiffException {
		verifyTextEqualwithAttributeValue(txt_City(), data.Getdata("Home City", row).trim(), " Home City");

	}

	public void ValidateHomeStateProvince(int row) throws IOException, BiffException {
		verifyTextEqualwithAttributeValue(txt_ProvinceState(), data.Getdata("Home State/Province", row).trim(),
				" Home State/Province");

	}

	public void ValidateHomeZipPostalCode(int row) throws IOException, BiffException {
		verifyTextEqualwithAttributeValue(txt_PostalCode(), data.Getdata("Home Zip/Postal Code", row).trim(),
				" Home Zip/Postal Code");

	}

	public void ValidatePhone(int row) throws IOException, BiffException {
		verifyTextEqualwithAttributeValue(txt_Phone(), data.Getdata("Phone", row).trim(), " Phone");

	}

	public void enterBillingContactInfoFirstName(int row) throws IOException, BiffException {
		enterText(txt_FirstName(), " First Name", data.Getdata("First Name", row));

	}

	public void enterBillingContactInfoLastName(int row) throws IOException, BiffException {
		enterText(txt_LastName(), " Last Name", data.Getdata("Last Name", row));

	}

	public void enterBillingContactInfoEmail(int row) throws IOException, BiffException {
		enterText(txt_Email(), " Email", data.Getdata("Email", row));

	}

	public void enterBillingContactInfoHomeStreet(int row) throws IOException, BiffException {
		enterText(txt_BillingAddress1(), " Home Street", data.Getdata("Home Street", row));

	}

	public void enterBillingContactInfoHomeCity(int row) throws IOException, BiffException {
		enterText(txt_City(), " Home City", data.Getdata("Home City", row));

	}

	public void enterBillingContactInfoHomeStateProvince(int row) throws IOException, BiffException {
		enterText(txt_ProvinceState(), " Home State/Province", data.Getdata("Home State/Province", row).trim());

	}

	public void enterBillingContactInfoHomeZipPostalCode(int row) throws IOException, BiffException {
		enterText(txt_PostalCode(), " Home Zip/Postal Code", data.Getdata("Home Zip/Postal Code", row));

	}

	public void enterBillingContactInfoPhone(int row) throws IOException, BiffException {
		enterText(txt_Phone(), " Phone", data.Getdata("Phone", row).trim());

	}

	public void ValidateBillingContactInfoSection(int row) throws IOException, BiffException {
		ValidateFirstName(row);
		ValidateLastName(row);
		ValidateEmail(row);
		ValidateHomeStreet(row);
		ValidateHomeCity(row);
		ValidateHomeStateProvince(row);
		ValidateHomeZipPostalCode(row);
		ValidatePhone(row);
	}

	public void enterBillingContactInfoSection(int row) throws IOException, BiffException {
		enterBillingContactInfoFirstName(row);
		enterBillingContactInfoLastName(row);
		enterBillingContactInfoEmail(row);
		enterBillingContactInfoHomeStreet(row);
		enterBillingContactInfoHomeCity(row);
		enterBillingContactInfoHomeStateProvince(row);
		enterBillingContactInfoHomeZipPostalCode(row);
		enterBillingContactInfoPhone(row);
	}

	public void EnterPaymentSection() throws IOException, InterruptedException {
		EnterCreditCardNumber();
		Select test = new Select(driver.findElement(By.id("CC_EXPIRES")));
		test.selectByValue("01");
		Select test1 = new Select(driver.findElement(By.name("CC_EXPIRES_YEAR")));
		test1.selectByValue("24");

	}

	public void EnterPaymentSectionforEditWC() throws IOException, InterruptedException {
		CreditCardNumber = "4444333322221111";
		CreditCardExpirationMonth = "01";
		CreditCardExpirationYear = "24";
		enterText(txtCreditCard(), "Credit Card", CreditCardNumber);
		selectByText(dpdExpirationMonth(), "Payment-Details Expiration Month", CreditCardExpirationMonth);
		selectByText(dpdExpirationYear(), "Payment-Details Expiration Year", CreditCardExpirationYear);
		clickOnButton(btnSavePayment(), "save");

	}
// Each Object Performance Method

	public void ClickProceedToPaymentDetails() throws IOException {

		clickOnButton(btnProcess(), "Payment Details Process");
	}

	public void ClickProcesstoPayment() throws IOException {

		clickOnButton(btnProcess(), "Payment Details Process");
	}

// Each Section Functional Method

	// Contact Section
	public void ValidateContactInformation(int row) throws IOException, InterruptedException {
		String ExpectedContactText = null;
		if (!data.Getdata("Middle Name", row).isEmpty() && !data.Getdata("Middle Name", row).equalsIgnoreCase(" ")) {

			ExpectedContactText = data.Getdata("First Name", row).trim() + " " + data.Getdata("Middle Name", row).trim()
					+ " " + data.Getdata("Last Name", row).trim();

		} else {

			ExpectedContactText = data.Getdata("First Name", row).trim() + " " + data.Getdata("Last Name", row).trim();

		}

		verifyTextEqualwithAttributeValue(txtContact(), ExpectedContactText, "Payment-Details Contact");
		String ExpectedAccountText = data.Getdata("Last Name", row).trim() + "-Account";
		verifyTextEqualwithAttributeValue(txtAccount(), ExpectedAccountText, "Payment-Details Account");

	}

	// Account Information Section
	public void ValidateAccountInformation(int row) throws IOException {

		verifyTextEqualwithAttributeValue(txtBillingAddress(), data.Getdata("Home Street", row).trim(),
				"Payment-Details Billing Home Street");
		verifyTextEqualwithAttributeValue(txtBillingCity(), data.Getdata("Home City", row).trim(),
				"Payment-Details Billing Home City");
		verifyTextEqualwithAttributeValue(dpdBillingState(), data.Getdata("Home State/Province", row).trim(),
				"Payment-Details Billing Home State/Province");
		verifyTextEqualwithAttributeValue(txtBillingZip_PostalCode(), data.Getdata("Home Zip/Postal Code", row).trim(),
				"Payment-Details Billing Home Zip/Postal Code");
		verifyTextEqualwithAttributeValue(txtPhone(), data.Getdata("Phone", row).trim(), "Payment-Details Phone");
		verifyTextEqualwithAttributeValue(txtEmail(), data.Getdata("Email", row).trim(), "Payment-Details Email");

	}

	// Payment Information Section
	public void ValidateAndSelectPaymentInformation(int row) throws IOException {

		verifyTextEqualwithAttributeValue(txtAmount(), data.Getdata("Cost of Membership", row).trim(),
				"Payment-Details Amount");
		// Hard coded selection of text to 999 Member Services -- for current situation
		// -- Pradeep
		selectByText(dpdPaymentLocation(), "Payment-Details Payment Location", "999 Member Services");

		selectByValue(dpdPaymentOrigin(), "Payment-Details Payment Origin", "New Membership Fee");

	}

	// Credit Card Sectiom
	public void ValidateAndEnterCreditCard(int row) throws IOException {

		CreditCardNumber = "4444333322221111";
		CreditCardExpirationMonth = "01";
		CreditCardExpirationYear = "24";

		String ExpectedCardHolderName = null;
		if (!data.Getdata("Middle Name", row).isEmpty() && !data.Getdata("Middle Name", row).equalsIgnoreCase(" ")) {

			ExpectedCardHolderName = data.Getdata("First Name", row).trim() + " "
					+ data.Getdata("Middle Name", row).trim() + " " + data.Getdata("Last Name", row).trim();

		}

		if (data.Getdata("Middle Name", row).isEmpty()) {

			ExpectedCardHolderName = data.Getdata("First Name", row).trim() + " "
					+ data.Getdata("Last Name", row).trim();

		}

		if (data.Getdata("Membership Type", row).equalsIgnoreCase("Gift")) {

			ExpectedCardHolderName = EnteredCardNumber + " " + EnteredCardNumber;
		}

		verifyTextEqualwithAttributeValue(txtCardHolderName(), ExpectedCardHolderName,
				"Payment-Details Cardholder Name");
		// Hard Coded Credit Number and Details
		enterText(txtCreditCard(), "Credit Card", CreditCardNumber);
		selectByText(dpdExpirationMonth(), "Payment-Details Expiration Month", CreditCardExpirationMonth);
		selectByText(dpdExpirationYear(), "Payment-Details Expiration Year", CreditCardExpirationYear);
	}

	public void EnterandValidate_MonthlyPaymentPage(int row) throws IOException, BiffException, InterruptedException {
		Thread.sleep(5000);
		try {
			for (int i = 0; i < 5; i++) {
				driver.switchTo().defaultContent();
				driver.switchTo().frame(i);
				if (txt_CreditCardNumber().isDisplayed()) {
					System.out.println("Frame switched at : " + i);
					Thread.sleep(3000);
					EnterPaymentSection();
					ValidateBillingContactInfoSection(row);
					ClickProcessPayment();

					break;
				} else {
					System.out.println("Required frame not found");
				}

			}

		} catch (Exception e) {

			System.out.println("no such frame");
		}
		Thread.sleep(5000);
		clickOnLink(lnkGotoMember(), "Go to Member");
	}

	public void EnterandValidate_GiftPaymentPage(int row) throws IOException, BiffException, InterruptedException {
		Thread.sleep(5000);
		try {
			for (int i = 0; i < 5; i++) {
				driver.switchTo().defaultContent();
				driver.switchTo().frame(i);
				if (txt_CreditCardNumber().isDisplayed()) {
					System.out.println("Frame switched at : " + i);
					Thread.sleep(3000);
					EnterPaymentSection();
					enterBillingContactInfoSection(row);
					ClickProcessPayment();
					driver.switchTo().defaultContent();
				} else {
					System.out.println("Required frame not found");
				}

			}

		} catch (Exception e) {

			System.out.println("no such frame");
		}
		Thread.sleep(5000);
		clickOnLink(lnkGotoMember(), "Go to Member");
	}
// Actual Functional Method

	public void EnterAndValidateWholePayment_DetailsPage(int row)
			throws IOException, InterruptedException, BiffException {

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
				driver.switchTo()
						.frame(driver.findElement(By.xpath("(//iframe[@title='accessibility title'])[" + i + "]")));
				WebElement element = driver.findElement(By.xpath("//iframe[@id='BluePayFrame']"));
				String url = element.getAttribute("src");
				String parentWindow = driver.getWindowHandle();
				Thread.sleep(1000);
				driver.navigate().to(url);
				Thread.sleep(2000);
				for (String childWindow : driver.getWindowHandles()) {
					driver.switchTo().window(childWindow);
				}
				Thread.sleep(2000);
				if (txt_CreditCardNumber().isDisplayed()) {
					Thread.sleep(2000);
					// System.out.println("Frame switched at : " + i);
					Thread.sleep(3000);
					EnterPaymentSection();
					enterBillingContactInfoSection(row);
					// ValidateBillingContactInfoSection(row);
					ClickProcessPayment();
					driver.switchTo().defaultContent();
					driver.switchTo().window(parentWindow);
					break;
				} else {
					System.out.println("Required frame not found");
					ResultsLog.ReportInfo(driver, "Payment Page Frame not Switched to Enter Payment Details");
				}

			} catch (Exception e) {
				System.out.println("no such frame");
				ResultsLog.ReportInfo(driver, "no such frame");
			}
		}

		Thread.sleep(5000);
		clickOnLink(lnkGotoMember(), "Go to Member");

	}

	public void EnterAndValidatePayment_CredidCardInformation(int row) throws IOException {
		// verifyCorrectPageHeading(PageTitleObject(), ExpectedPageHeading);
		ValidateAndSelectPaymentInformation(row);
		ValidateAndEnterCreditCard(row);
		ClickProceedToPaymentDetails();
	}

	public void enterPaymentCardDetails(int row) throws Exception {
		int size = driver.findElements(By.tagName("iframe")).size();
		for (int i = 1; i <= size; i++) {
			driver.switchTo().defaultContent();
			try {

				driver.switchTo()
						.frame(driver.findElement(By.xpath("(//iframe[@title='accessibility title'][1])[" + i + "]")));

				Thread.sleep(10000);
				if (txtCreditCard().isDisplayed()) {
					System.out.println("Correct frame switched");
					Thread.sleep(2000);
					EnterPaymentSection();
					// enterBillingContactInfoSection(row);
					// ValidateBillingContactInfoSection(row);
					// ClickProcessPayment();
					driver.switchTo().defaultContent();
					
					break;
				} else {
					System.out.println("Required frame not found");
					ResultsLog.ReportInfo(driver, "Payment Page Frame not Switched to Enter Payment Details");
				}

			} catch (Exception e) {
				System.out.println("Element not found");
				ResultsLog.ReportInfo(driver, "Element not found");
			}
		}

	}
	public void enterPaymentCardDetailsLightning(int row) throws Exception {
		int size = driver.findElements(By.tagName("iframe")).size();
		for (int i = 1; i <= size; i++) {
			driver.switchTo().defaultContent();
			try {

				driver.switchTo()
						.frame(driver.findElement(By.xpath("(//iframe[@title='accessibility title'][1])[" + i + "]")));

				Thread.sleep(10000);
				if (txtCreditCard().isDisplayed()) {
					System.out.println("Correct frame switched");
					Thread.sleep(2000);
					EnterPaymentSectionforEditWC();
					driver.switchTo().defaultContent();
					
					break;
				} else {
					System.out.println("Required frame not found");
					ResultsLog.ReportInfo(driver, "Payment Page Frame not Switched to Enter Payment Details");
				}

			} catch (Exception e) {
				System.out.println("Element not found");
				ResultsLog.ReportInfo(driver, "Element not found");
			}
		}

	}

	public void enterPaymentCardDetailsClassic(int row) throws Exception {

		try {
			Thread.sleep(2000);
			EnterPaymentSectionforEditWC();

		} catch (Exception e) {
			System.out.println("Element not found");
			ResultsLog.ReportInfo(driver, "Element not found");
		}
	}

}
