package com.Restaurant.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Restaurant.CommonPages.Resaurant_Menu;
import com.Restaurant.PageData.Restaurant_SignUpPagedata;
import com.Utils.BasePages;

public class Page_JulyPromoTransactions extends BasePages {

	static Restaurant_SignUpPagedata data = new Restaurant_SignUpPagedata();
	Resaurant_Menu Menu = new Resaurant_Menu();

	public Page_JulyPromoTransactions() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

// Objects from Application	
// Payment Information

	public static WebElement chkMemberSignatureOptOut() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_CardOnFileOptOut']"));
	}

	public static WebElement btnUpdateMemberSignature() {
		return driver.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$CardOnFileoptOutButton']"));
	}

	public static WebElement readonlyNameOnCard() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_NameOnCardView']"));
	}

	public static WebElement readonlyExpirationDate() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ExpiryDateView']"));
	}

	public static WebElement readonlyCredirCardLast4() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_CreditCard4DigitView']"));
	}

	public static WebElement readonlyCardType() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_CreditCardTypeView']"));
	}

	public static WebElement btnPaymentHistory() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_PaymentHistory']"));
	}

	public static WebElement readonlyAmount() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridViewPaymentHistory']/tbody/tr[2]/td[2]"));
	}

	public static WebElement readonlyResult() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridViewPaymentHistory']/tbody/tr[2]/td[3]"));
	}

	public static WebElement readonlyOrigin() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridViewPaymentHistory']/tbody/tr[2]/td[5]"));
	}

	public static WebElement btnGoBack() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btn_back_PaymentHistory']"));
	}

	public static WebElement btnEditContactInformation() {
		return driver.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$Btn_EditContactInformation']"));
	}

	public static WebElement txtBirthDate() {
		return driver.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$Txt_EditContact_Birthday']"));
	}

	public static WebElement txtEmail() {
		return driver.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$Txt_EditContact_EmailAddress']"));
	}

	public static WebElement txtPhone() {
		return driver.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$Txt_EditContact_PhoneNumber']"));
	}

	public static WebElement txtStreet() {
		return driver.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$Txt_EditContactInfo_HomeStreet']"));
	}

	public static WebElement txtCity() {
		return driver.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$Txt_EditContactInfo_HomeCity']"));
	}

	public static WebElement dpdState() {
		return driver.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$ddl_EditContactInfo_HomeState']"));
	}

	public static WebElement txtZipCode() {
		return driver.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$Txt_EditContactInfo_HomeZip']"));
	}

	public static WebElement btnSave() {
		return driver.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$Btn_SaveEditedContactInfo']"));
	}

	public static WebElement readOnlyPrimaryMember() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_PrimaryContactView']"));
	}

	public static WebElement readOnlyBirthdate() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_BirthDateView']"));
	}

	public static WebElement readOnlyEmail() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_EmailAddressView']"));
	}

	public static WebElement readOnlyPhone() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_PhoneNumberView']"));
	}

	public static WebElement readOnlyStreet() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_StreetView']"));
	}

	public static WebElement readOnlyCity() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_CityView']"));
	}

	public static WebElement readOnlyState() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_StateView']"));
	}

	public static WebElement readOnlyZipCode() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ZipView']"));
	}

	public static WebElement btnCancelMembership() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Btn_CancelMembership']"));
	}

	public static WebElement dpdCancellationReason() {
		return driver.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$ddlCancelation']"));
	}

	public static WebElement btnsaveCancelMembership() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btn_saveCancellation']"));
	}

	public static WebElement btnGoBackMembership() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btn_back_cancelation']"));
	}

	public static WebElement lnkEditVacation() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_VacationDetailsEdit']"));
	}

	public static WebElement txtVacationStartDate() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Txt_VacationStart']"));
	}

	public static WebElement txtVacationEndDate() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Txt_VacationEnd']"));
	}

	public static WebElement btnSaveVacationDates() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Btn_SaveEditedContactInfo']"));
	}

	public static WebElement btnGoBackVacationDates() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Btn_CancelEditedContactInfo']"));
	}

	public static WebElement btnEndVacationEarlyPayImmediate() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_EndVacationNow_PayNow']"));
	}

	public static WebElement btnEndVacationEarlyPayNextBill() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_EndVacationNow_PayLater']"));
	}
//Each Object performance Method
// Payment Information

	public void ValidateNameOnCard(int row) throws IOException {

		String memberName = data.Getdata("First Name", row).trim() + " " + data.Getdata("Last Name", row).trim();
		verifyTextEqual(readonlyNameOnCard(), memberName, "Name on Card");
	}

	public void ValidateExpirationDate() throws IOException {

		String Expirationdate = Page_ProcessPayment.ExpireMonth + "/" + Page_ProcessPayment.ExpireYear;
		verifyTextEqual(readonlyExpirationDate(), Expirationdate, "Expiration Date");
	}

	public void ValidateCardLast4Digit() throws IOException {

		// String CardLast4Digit =
		// PageProcessPayment.ExpireMonth.split(EnteredCardNumber, 1);
		verifyTextEqual(readonlyCredirCardLast4(), "1111", "Expiration Date");
	}

	public void ValidateCardType() throws IOException {

		verifyTextEqual(readonlyCardType(), "Visa", "Card Type");
	}

	public void ClickPaymentHistory(int row) throws IOException {

		clickOnButton(btnPaymentHistory(), "Payment History");
	}

	public void ValidateAmount(int row) throws IOException {

		verifyTextEqual(readonlyAmount(), formatAmountText(data.Getdata("Cost of Membership", row)), "Amount");
	}

	public void ValidateResult(int row) throws IOException {

		verifyTextEqual(readonlyResult(), "APPROVED", "Results");
	}

	public void ValidateOrigin(int row) throws IOException {

		verifyTextEqual(readonlyOrigin(), "New Membership Fee", "Origin");
	}

	public void ClickGoBack() throws IOException {

		clickOnButton(btnGoBack(), "Go Back");
	}

	public void ClickEditContactInformation() throws IOException {

		clickOnButton(btnEditContactInformation(), "Edit Contact Information");
	}

	public void EnterBirthDate(int row) throws IOException {
		enterText(txtBirthDate(), "Birth Date", data.Getdata("Birthdate", row));
	}

	public void EnterEmail(int row) throws IOException {
		enterText(txtEmail(), "Email", data.Getdata("Email", row));
	}

	public void EnterPhone(int row) throws IOException {
		enterText(txtPhone(), "Phone", data.Getdata("Phone", row));
	}

	public void EnterStreet(int row) throws IOException {
		enterText(txtStreet(), "Street", data.Getdata("Home Street", row));
	}

	public void EnterCity(int row) throws IOException {
		enterText(txtCity(), "City", data.Getdata("Home City", row));
	}

	public void SelectState(int row) throws IOException {

		String State = data.Getdata("Home State/Province", row);
		if (State.length() > 2) {
			State = data.Getdata("Home State/Province", row).substring(0, 2).toUpperCase();
		}
		selectByText(dpdState(), "State", State);

	}

	public void EnterZipCode(int row) throws IOException {
		enterText(txtZipCode(), "PhZip Codeone", data.Getdata("Home Zip/Postal Code", row));
	}

	public void ClickSave() throws IOException {

		clickOnButton(btnSave(), "Save");
	}

	public void ValidatePrimaryName(int row) throws IOException {

		String ExpectedPrimaryName = data.Getdata("First Name", row) + " " + data.Getdata("Last Name", row);
		verifyTextEqual(readOnlyPrimaryMember(), ExpectedPrimaryName, "Primary Name");
	}

	public void ValidateBirthdate(int row) throws IOException {

		String BirthDate = data.Getdata("Birthdate", row).trim().replace("/", "-");
		verifyTextEqual(readOnlyBirthdate(), BirthDate, "Birth Date");
	}

	public void ValidateEmail(int row) throws IOException {

		verifyTextEqual(readOnlyEmail(), data.Getdata("Email", row).trim(), "Email");
	}

	public void ValidatePhone(int row) throws IOException {

		verifyTextEqual(readOnlyPhone(), data.Getdata("Phone", row).trim(), "Email");
	}

	public void ValidateStreet(int row) throws IOException {

		verifyTextEqual(readOnlyStreet(), data.Getdata("Home Street", row).trim(), "Street");
	}

	public void ValidateCity(int row) throws IOException {

		verifyTextEqual(readOnlyCity(), data.Getdata("Home City", row).trim(), "City");
	}

	public void ValidateState(int row) throws IOException {
		String State = data.Getdata("Home State/Province", row);
		if (State.length() > 2) {
			State = data.Getdata("Home State/Province", row).substring(0, 2).toUpperCase();
		}

		verifyTextEqual(readOnlyState(), State, "State");
	}

	public void ValidateZip(int row) throws IOException {

		verifyTextEqual(readOnlyZipCode(), data.Getdata("Home Zip/Postal Code", row).trim(), "Zip");
	}

	public void CancelMembership() throws IOException {

		clickOnButton(btnCancelMembership(), "Cancel Membership");

	}

	public void SaveMemebrshipCancellation() throws IOException {

		clickOnButton(btnsaveCancelMembership(), "Cancel Membership");

	}

	public void GoBackMemebrshipCancellation() throws IOException {

		clickOnButton(btnGoBackMembership(), "Go Back Membership");

	}

	public void SelectCancellationReason(int row) throws IOException {

		String cancellationreason = data.Getdata("cancellationreason", row);
		selectByText(dpdCancellationReason(), "cancellation reason", cancellationreason);
	}

	public void GoBackMembershipCancellation() throws IOException {

		clickOnButton(btnGoBackMembership(), "Go Back Membership");

	}

	public void selectMemberSignatureOptOut() throws IOException {
		clickOnCheckBox(chkMemberSignatureOptOut(), "Member Signature Opt Out");
	}
	public void clickVacationEditIcon() throws IOException {
		clickOnLink(lnkEditVacation(), "Edit Vacation");
	}
	public void  vacationStartDate(int row) throws IOException {
		enterText(txtVacationStartDate(), "Vacation Start Date", data.Getdata("Vacation Start Date", row));
	}
	public void  vacationEndDate(int row) throws IOException {
		enterText(txtVacationEndDate(), "Vacation End Date", data.Getdata("Vacation End Date", row));
	}
	public void saveVacation() throws IOException {
		clickOnButton(btnSaveVacationDates(), "Save Vacation button");
	}
	public void cancelVacation() throws IOException {
		clickOnButton(btnGoBackVacationDates(), "Cancel Vacation button");
	}
	public void endVacationEarlyPayingImmediately() throws IOException {
		clickOnButton(btnEndVacationEarlyPayImmediate(), "End Vacation Early by Paying Immediately");
	}
	public void endVacationEarlyPayNextBillCycle() throws IOException {
		clickOnButton(btnGoBackVacationDates(), "End Vacation Early by Paying in Next Bill Cycle");
	}
	

// Section method
// Contact Information
	public void EnterContactInformation(int row) throws IOException {
		ClickEditContactInformation();
		EnterBirthDate(row);
		EnterEmail(row);
		EnterPhone(row);
	}

	public void EnterAddressInformation(int row) throws IOException {
		EnterStreet(row);
		EnterCity(row);
		SelectState(row);
		EnterZipCode(row);
	}

	public void ValidateContactAndAddressInformation(int row) throws IOException {
		ValidatePrimaryName(row);
		ValidateBirthdate(row);
		ValidateEmail(row);
		ValidatePhone(row);
		ValidateStreet(row);
		ValidateCity(row);
		ValidateState(row);
		ValidateZip(row);
	}

	public void EditContactAndAddressInformation(int row) throws IOException {
		ClickEditContactInformation();
		EnterBirthDate(row);
		EnterEmail(row);
		EnterPhone(row);
	}

	public void ClickCancelMembership(int row) throws IOException {
		ClickEditContactInformation();
		EnterBirthDate(row);
		EnterEmail(row);
		EnterPhone(row);
	}
	public void MemberSignatureOptOut() throws IOException {
		clickOnCheckBox(chkMemberSignatureOptOut(), "Member Signature Opt Out");
	}

// Actual Functional Method

	public void ValidateAccountInfo(int row) throws IOException {
		Menu.ClickAccountsInfo();
		ValidateNameOnCard(row);
		ValidateExpirationDate();
		ValidateCardLast4Digit();
		ValidateCardType();
		ClickPaymentHistory(row);
		ValidateAmount(row);
		ValidateResult(row);
		ValidateOrigin(row);
		ClickGoBack();
		EnterContactInformation(row);
		EnterAddressInformation(row);
		ClickSave();
		ValidateContactAndAddressInformation(row);
	}

	public void ChangeContactInformation(int row) throws IOException {
		Menu.ClickAccountsInfo();
		EditContactAndAddressInformation(row);
	}

	public void CancelMembership(int row) throws IOException {
		Menu.ClickAccountsInfo();
		CancelMembership();
		SelectCancellationReason(row);
		SaveMemebrshipCancellation();

	}

	public void MemberSignatureCheckedOPtOut() throws IOException {
		if (!chkMemberSignatureOptOut().isSelected())
			MemberSignatureOptOut();
		clickOnButton(btnUpdateMemberSignature(), "Member Signature Opted Out");
	}

	public void MemberSignatureCheckedOPtIn() throws IOException {
		if (chkMemberSignatureOptOut().isSelected())
			MemberSignatureOptOut();
		clickOnButton(btnUpdateMemberSignature(), "Member Signature Opted In");
	}
	
	
	
	public void VacationHold(int row) throws IOException {
		Menu.ClickAccountsInfo();
		clickVacationEditIcon();
		vacationStartDate(row);
		vacationEndDate(row);
		btnSaveVacationDates();

	}

}
