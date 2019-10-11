package com.MGS.CommonPages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.MGS.Pages.Page_GiftMembersEntry;
import com.MGS.PagesData.Member_SignUpPagedata;
import com.Utils.BasePages;

public class SignUpValidationPage extends BasePages {

	Member_SignUpPagedata data = new Member_SignUpPagedata();
	String ExpectedPageHeading = "Payment � Details";

	public SignUpValidationPage() {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

// Objects from Payment-Details Page --- Classic

	public WebElement readOnlyTransactionResults() {

		return driver.findElement(By.xpath("//*[text()='Transaction Result']/following-sibling::td/div"));
	}

	public WebElement readOnlyTransactionMessage() {

		return driver.findElement(By.xpath("//*[text()='Transaction Message']/following-sibling::td/div"));
	}

	public WebElement readOnlyClassicPaymentType() {
		return driver.findElement(By.xpath("//*[text()='Payment Type']/parent::td/following-sibling::td/div"));
	}

	public WebElement readOnlyClassicLocation() {

		return driver.findElement(By.xpath("//*[text()='Location']/following-sibling::td/div"));
	}

	public WebElement readOnlyClassicCardNumber() {

		return driver.findElement(By.xpath("//*[text()='WC Member Card Number']/following-sibling::td/div"));
	}

	public WebElement readOnlyClassicPaymentOrgin() {

		return driver.findElement(By.xpath("//*[text()='Payment Origin']/following-sibling::td/div"));
	}

	public WebElement readOnlyClassicAccountName() {

		return driver.findElement(By.xpath("//*[text()='Account Name']/parent::td/following-sibling::td[1]/div"));
	}

	public static WebElement readOnlyClassicContactName() {

		return driver.findElement(By.xpath("//*[text()='Contact Name']/parent::td/following-sibling::td[1]/div"));
	}

	public WebElement readOnlyClassicCardHolderName() {

		return driver.findElement(By.xpath("//*[text()='Cardholder Name']/following-sibling::td/div"));
	}

	public WebElement readOnlyClassicAddress() {

		return driver.findElement(By.xpath("//*[text()='Address']/following-sibling::td/div"));
	}

	public WebElement readOnlyClassicCity() {

		return driver.findElement(By.xpath("//*[text()='City']/following-sibling::td/div"));
	}

	public WebElement readOnlyClassicState() {

		return driver.findElement(By.xpath("//*[text()='State']/following-sibling::td/div"));
	}

	public WebElement readOnlyClassicZipCode() {

		return driver.findElement(By.xpath("//*[text()='Zipcode']/following-sibling::td/div"));
	}

	public WebElement readOnlyClassicAmount() {

		return driver.findElement(By.xpath("//*[text()='Amount']/parent::td/following-sibling::td[1]"));
	}

	public WebElement readOnlyClassicTransactionType() {

		return driver.findElement(By.xpath("//*[text()='Transaction Type']/parent::td/following-sibling::td[1]"));
	}

	public WebElement readOnlyClassicCardType() {

		return driver.findElement(By.xpath("//*[text()='Card Type']/following-sibling::td[1]"));
	}

	public WebElement readOnlyClassicExpirationMonth() {

		return driver.findElement(By.xpath("//*[text()='Expiration Month']/parent::td/following-sibling::td[1]"));
	}

	public WebElement readOnlyClassicExpirationYear() {

		return driver.findElement(By.xpath("//*[text()='Expiration Year']/parent::td/following-sibling::td[1]"));
	}

	public static WebElement LnkClassicContactName() {

		return driver.findElement(By.xpath("//*[text()='Contact Name']/following::td[1]/div/a"));
	}

// Objects from Payment-Details Page --- Lightning	

	public WebElement readOnlyLightTransactionResults() {

		return driver.findElement(
				By.xpath("//*[text()='Transaction Result'][1]/parent::*/parent::*/child::div[2]/child::span"));

		// span[text()='Transaction Result']
	}

	public WebElement readOnlyLightTransactionMessage() {

		return driver
				.findElement(By.xpath("//*[text()='Transaction Message']/following::span[2][@class='uiOutputText']"));
	}

	public WebElement readOnlyLightPaymentType() {

		return driver
				.findElement(By.xpath("//*[text()='Payment Type'][@class='test-id__field-label']/following::span[2]"));
	}

	public WebElement readOnlyLightLocation() {

		return driver.findElement(By.xpath(
				"//*[text()='Location']/following::span[1][@class='test-id__field-value slds-form-element__static slds-grow ']"));
	}

	public WebElement readOnlyLightPaymentOrgin() {

		return driver.findElement(
				By.xpath("//*[text()='Payment Origin'][@class='test-id__field-label']/following::span[2]"));
	}

	public WebElement readOnlyLightCardNumber() {

		return driver.findElement(
				By.xpath("//*[text()='WC Member Card Number'][@class='test-id__field-label']/following::span[2]"));
	}

	public WebElement readOnlyLightAccountName() {

		return driver.findElement(By.xpath("//*[text()='Account Name']/parent::*/following-sibling::div/span"));
	}

	public static WebElement readOnlyLightContactName() {

		return driver.findElement(By.xpath("//*[text()='Contact Name']/parent::*/following-sibling::div/span"));
	}

	public static WebElement LnkLightContactName() {

		return driver.findElement(By.xpath("//*[text()='Contact Name']/parent::*/following-sibling::div/span/div/a"));
	}

	public WebElement readOnlyLightCardHolderName() {

		return driver.findElement(By.xpath(
				"//*[text()='Cardholder Name']/parent::div/following-sibling::div/child::span/child::span[@class='uiOutputText']"));
	}

	public WebElement readOnlyLightAddress() {

		return driver.findElement(By.xpath(
				"//*[text()='Address']/parent::div/following-sibling::div/child::span/child::span[@class='uiOutputTextArea']"));
	}

	public WebElement readOnlyLightCity() {

		return driver.findElement(By.xpath(
				"//*[text()='City']/parent::div/following-sibling::div/child::span/child::span[@class='uiOutputText']"));
	}

	public WebElement readOnlyLightState() {

		return driver.findElement(
				By.xpath("//*[text()='State']/parent::div/following-sibling::div/child::span/child::span"));
	}

	public WebElement readOnlyLightZipCode() {

		return driver.findElement(By.xpath(
				"//*[text()='Zipcode']/parent::div/following-sibling::div/child::span/child::span[@class='uiOutputText']"));
	}

	public WebElement readOnlyLightAmount() {

		return driver.findElement(By.xpath(
				"//*[text()='Amount']/parent::div/following-sibling::div/child::span/child::span[@class='forceOutputCurrency']"));
	}

	public WebElement readOnlyLightTransactionType() {

		return driver.findElement(
				By.xpath("//*[text()='Transaction Type']/parent::div/following-sibling::div/child::span/child::span"));
	}

	public WebElement readOnlyLightCardType() {

		return driver.findElement(
				By.xpath("//*[text()='Card Type']/parent::div/following-sibling::div/child::span/child::span"));
	}

	public WebElement readOnlyLightExpirationMonth() {

		return driver.findElement(
				By.xpath("//*[text()='Expiration Month']/parent::div/following-sibling::div/child::span/child::span"));
	}

	public WebElement readOnlyLightExpirationYear() {

		return driver.findElement(
				By.xpath("//*[text()='Expiration Year']/parent::div/following-sibling::div/child::span/child::span"));
	}

// Each Object Performance Method Classic

	public void ValidateTransactionResults(int row) throws IOException {

		verifyTextEqual(readOnlyTransactionResults(), data.Getdata("ValidateTransactionResults", row).trim(),
				"Valididate Transaction Result");
	}

	public void ValidateTransactionMessage(int row) throws IOException {

		verifyTextEqual(readOnlyTransactionMessage(), data.Getdata("ValidateTransactionMessage", row).trim(),
				"Valididate Transaction Message");
	}

	// Validation value Hard Coded "Credit Card", because we are following only
	// Hard Coded Credit Card Payment method.
	public void ValidateClassicPaymentType(int row) throws IOException {

		if (data.Getdata("Membership Type", row).trim().equalsIgnoreCase("Gift")) {
			verifyTextEqual(readOnlyClassicPaymentType(), "CREDIT", "Validate Payment Type");
		} else {
			verifyTextEqual(readOnlyClassicPaymentType(), "Credit Card", "Validate Payment Type");
		}
	}

	public void ValidateClassicLOcation() throws IOException {

		verifyTextEqual(readOnlyClassicLocation(), "999 Member Services", "Valididate Location");
	}

	public void ValidateClassicCardNumber(int row) throws IOException {

		verifyTextEqual(readOnlyClassicCardNumber(), EnteredCardNumber, "Valididate WC Member Card Number");

	}

	public void ValidateClassicPaymentOrgin(int row) throws IOException {
		if (data.Getdata("Membership Type", row).trim().equalsIgnoreCase("Gift")) {
			verifyTextEqual(readOnlyClassicPaymentOrgin(), "Gift Membership Fee", "Valididate Payment Origin");
		} else {
			verifyTextEqual(readOnlyClassicPaymentOrgin(), "New Membership Fee", "Valididate Payment Origin");
		}
	}

	public void ValidateClassicAccountName(int row) throws IOException {

		String ExpectedAccountText = null;

		if (data.Getdata("Membership Type", row).trim().equalsIgnoreCase("Gift")) {
			ExpectedAccountText = "null" + "-Account";

		} else {
			ExpectedAccountText = data.Getdata("Last Name", row).trim() + "-Account";
		}

		verifyTextEqual(readOnlyClassicAccountName(), ExpectedAccountText, "Validate Classic Account Name");
	}

	public void ValidateClassicContactName(int row) throws IOException {

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

		verifyTextEqual(readOnlyClassicContactName(), ExpectedContactText, "Validate Classic Contact Name");
	}

	public void ValidateClassicCardHolderName(int row) throws IOException {

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

		verifyTextEqual(readOnlyClassicCardHolderName(), ExpectedCardHolderName, "Validate Classic Card Holder Name");
	}

	public void ValidateClassicAddress(int row) throws IOException {

		String ExpectedAddressText = data.Getdata("Home Street", row).trim();
		verifyTextEqual(readOnlyClassicAddress(), ExpectedAddressText, "Validate Classic Address");
	}

	public void ValidateClassicCity(int row) throws IOException {

		String ExpectedAddressText = data.Getdata("Home City", row).trim();
		verifyTextEqual(readOnlyClassicCity(), ExpectedAddressText, "Validate Classic City");
	}

	public void ValidateClassicState(int row) throws IOException {

		String ExpectedAddressText = data.Getdata("Home State/Province", row).trim();
		verifyTextEqual(readOnlyClassicState(), ExpectedAddressText, "Validate Classic State");
	}

	public void ValidateClassicZipCode(int row) throws IOException {

		String ExpectedAddressText = data.Getdata("Home Zip/Postal Code", row).trim();
		verifyTextEqual(readOnlyClassicZipCode(), ExpectedAddressText, "Validate Classic ZipCode");
	}

	public void ValidateClassicAmount(int row) throws IOException {

		verifyTextEqual(readOnlyClassicAmount(), formatAmountText(data.Getdata("Cost of Membership", row)),
				"Validate Classic Amount");
	}

	public void ValidateClassicTransactionType() throws IOException {

		verifyTextEqual(readOnlyClassicTransactionType(), "Sale", "Validate Classic Transaction Type");
	}

	public void ValidateClassicCardType() throws IOException {

		verifyTextEqual(readOnlyClassicCardType(), "Visa", "Validate Classic Card Type");
	}

	public void ValidateClassicExpirationMonth() throws IOException {

		verifyTextEqual(readOnlyClassicExpirationMonth(), Page_PaymentDetails.CreditCardExpirationMonth,
				"Validate Classic Expiration Month");
	}

	public void ValidateClassicExpirationYear() throws IOException {

		verifyTextEqual(readOnlyClassicExpirationYear(), Page_PaymentDetails.CreditCardExpirationYear,
				"Validate Classic Expiration Year");
	}

	public void ClickClassicContacName() throws IOException {

		clickOnButton(LnkClassicContactName(), "Contact Name for WC Validation");
	}

// Each Object Performance Method Lightning

	// Validation value Hard Coded "Credit Card", because we are following only
	// Hard Coded Credit Card Payment method.
	public void ValidateLightPaymentType(int row) throws IOException {

		if (data.Getdata("Membership Type", row).trim().equalsIgnoreCase("Gift")) {
			verifyTextEqual(readOnlyLightPaymentType(), "CREDIT", "Validate Payment Type");
		} else {
			verifyTextEqual(readOnlyLightPaymentType(), "Credit Card", "Validate Payment Type");
		}
	}

	public void ValidateLightTransactionResults(int row) throws IOException {

		verifyTextEqual(readOnlyLightTransactionResults(), data.Getdata("ValidateTransactionResults", row).trim(),
				"Validate Transaction Result");

	}

	public void ValidateLightTransactionMessage(int row) throws IOException {

		verifyTextEqual(readOnlyLightTransactionMessage(), data.Getdata("ValidateTransactionMessage", row).trim(),
				"Validate Transaction Message");
	}

	public void ValidateLightLOcation() throws IOException {

		verifyTextEqual(readOnlyLightLocation(), "999 Member Services", "Valididate Location");
	}

	public void ValidateLightPaymentOrgin(int row) throws IOException {
		if (data.Getdata("Membership Type", row).trim().equalsIgnoreCase("Gift")) {
			verifyTextEqual(readOnlyLightPaymentOrgin(), "Gift Membership Fee", "Valididate Payment Origin");
		} else {
			verifyTextEqual(readOnlyLightPaymentOrgin(), "New Membership Fee", "Valididate Payment Origin");
		}
	}

	public void ValidateLightCardNumber(int row) throws IOException {

		verifyTextEqual(readOnlyLightCardNumber(), EnteredCardNumber, "Valididate Payment Origin");

	}

	public void ValidateLightAccountName(int row) throws IOException {

		String ExpectedAccountText = null;

		if (data.Getdata("Membership Type", row).trim().equalsIgnoreCase("Gift")) {
			ExpectedAccountText = "null" + "-Account";

		} else {
			ExpectedAccountText = data.Getdata("Last Name", row).trim() + "-Account";
		}
		verifyTextEqual(readOnlyLightAccountName(), ExpectedAccountText, "Validate Lightning Account Name");
	}

	public void ValidateLightContactName(int row) throws IOException {

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

		verifyTextEqual(readOnlyLightContactName(), ExpectedContactText, "Validate Lightning Contact Name");
	}

	public void ClickContacName() throws IOException {

		clickOnButton(LnkLightContactName(), "Contact Name for WC Validation");
	}

	public void ValidateLightCardHolderName(int row) throws IOException {

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

		verifyTextEqual(readOnlyLightCardHolderName(), ExpectedCardHolderName, "Validate Lightning Card Holder Name");
	}

	public void ValidateLightAddress(int row) throws IOException {

		String ExpectedAddressText = data.Getdata("Home Street", row).trim();
		verifyTextEqual(readOnlyLightAddress(), ExpectedAddressText, "Validate Lightning Address");
	}

	public void ValidateLightCity(int row) throws IOException {

		String ExpectedAddressText = data.Getdata("Home City", row).trim();
		verifyTextEqual(readOnlyLightCity(), ExpectedAddressText, "Validate Lightning City");
	}

	public void ValidateLightState(int row) throws IOException {

		String ExpectedAddressText = data.Getdata("Home State/Province", row).trim();
		verifyTextEqual(readOnlyLightState(), ExpectedAddressText, "Validate Lightning State");
	}

	public void ValidateLightZipCode(int row) throws IOException {

		String ExpectedAddressText = data.Getdata("Home Zip/Postal Code", row).trim();
		verifyTextEqual(readOnlyLightZipCode(), ExpectedAddressText, "Validate Lightning ZipCode");
	}

	public void ValidateLightAmount(int row) throws IOException {

		verifyTextEqual(readOnlyLightAmount(), formatAmountText(data.Getdata("Cost of Membership", row)),
				"Validate Lightning Amount");
	}

	public void ValidateLightTransactionType() throws IOException {

		verifyTextEqual(readOnlyLightTransactionType(), "Sale", "Validate Lightning Transaction Type");
	}

	public void ValidateLightCardType() throws IOException {

		verifyTextEqual(readOnlyLightCardType(), "Visa", "Validate Lightning Card Type");
	}

	public void ValidateLightExpirationMonth() throws IOException {

		verifyTextEqual(readOnlyLightExpirationMonth(), Page_PaymentDetails.CreditCardExpirationMonth,
				"Validate Lightning Expiration Month");
	}

	public void ValidateLightExpirationYear() throws IOException {

		verifyTextEqual(readOnlyLightExpirationYear(), Page_PaymentDetails.CreditCardExpirationYear,
				"Validate Lightning Expiration Year");
	}

// Actual Functional Method

	public void ClassicValidatePaymentDetails(int row) throws IOException {

		ValidateTransactionResults(row);
		ValidateTransactionMessage(row);
		ValidateClassicPaymentType(row);
		ValidateClassicLOcation();
		ValidateClassicCardNumber(row);
		ValidateClassicPaymentOrgin(row);
		ValidateClassicAccountName(row);
		ValidateClassicContactName(row);
		ValidateClassicCardHolderName(row);
		ValidateClassicAddress(row);
		ValidateClassicCity(row);
		ValidateClassicState(row);
		ValidateClassicZipCode(row);
		ValidateClassicAmount(row);
		ValidateClassicTransactionType();
		ValidateClassicCardType();
		ValidateClassicExpirationMonth();
		ValidateClassicExpirationYear();
		ClickClassicContacName();

	}

	public void ClassicValidatePaymentDetailsWithoutAddressFileds(int row) throws IOException {

		ValidateTransactionResults(row);
		ValidateTransactionMessage(row);
		ValidateClassicPaymentType(row);
		ValidateClassicLOcation();
		ValidateClassicCardNumber(row);
		ValidateClassicPaymentOrgin(row);
		ValidateClassicAccountName(row);
		ValidateClassicContactName(row);
		ValidateClassicCardHolderName(row);
		ValidateClassicAmount(row);
		ValidateClassicTransactionType();
		ValidateClassicCardType();
		ValidateClassicExpirationMonth();
		ValidateClassicExpirationYear();
		ClickClassicContacName();

	}

	public void LightningValidatePaymentDetails(int row) throws IOException {
		ValidateLightTransactionResults(row);
		ValidateLightTransactionMessage(row);
		ValidateLightPaymentType(row);
		ValidateLightLOcation();
		ValidateLightCardNumber(row);
		ValidateLightPaymentOrgin(row);
		ValidateLightAccountName(row);
		ValidateLightContactName(row);
		ValidateLightCardHolderName(row);
		ValidateLightAddress(row);
		ValidateLightCity(row);
		ValidateLightState(row);
		ValidateLightZipCode(row);
		ValidateLightAmount(row);
		ValidateLightTransactionType();
		ValidateLightCardType();
		ValidateLightExpirationMonth();
		ValidateLightExpirationYear();
		ClickContacName();

	}

	public void LightningValidatePaymentDetailsWithoutAddressFileds(int row) throws IOException {
		ValidateLightTransactionResults(row);
		ValidateLightTransactionMessage(row);
		ValidateLightPaymentType(row);
		ValidateLightLOcation();
		ValidateLightCardNumber(row);
		ValidateLightPaymentOrgin(row);
		ValidateLightAccountName(row);
		ValidateLightContactName(row);
		ValidateLightCardHolderName(row);
		ValidateLightAmount(row);
		ValidateLightTransactionType();
		ValidateLightCardType();
		ValidateLightExpirationMonth();
		ValidateLightExpirationYear();
		ClickContacName();

	}

}
