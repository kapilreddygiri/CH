package com.Restaurant.Pages;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.record.BottomMarginRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.Restaurant.CommonPages.Resaurant_Menu;
import com.Restaurant.PageData.Restaurant_SignUpPagedata;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;

public class Page_AccountInfo extends BasePages {

	static Restaurant_SignUpPagedata data = new Restaurant_SignUpPagedata();
	Resaurant_Menu Menu = new Resaurant_Menu();

	public Page_AccountInfo() {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

// Objects from Application	
// Payment Information
	public static WebElement btnExtendMembership() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Btn_ExtendGiftMembership']"));
	}

	public static WebElement btnConvertMembership() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Btn_ConvertGiftmembership']"));
	}

	public static WebElement readonlytxtMembershipExpiration() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_MembershipExpiration']"));
	}

	public static WebElement btnRejoinMember() {
		return driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_Btn_Rejoin']"));
	}

	public static WebElement chkMemberSignatureOptOut() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_CardOnFileOptOut']"));
	}

	public static WebElement btnUpdateMemberSignature() {
		return driver.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$CardOnFileoptOutButton']"));
	}

	// *[@name='ctl00$ContentPlaceHolder1$CardOnFileoptOutButton']

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

	public static WebElement btnEditPaymentInformation() {
		return driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_EditPaymentInfo']"));
	}

	public static WebElement errorMessageFutureConversionsNotPossible() {
		return driver.findElement(By.xpath("//div[contains(text(),'FUTURE COVNERSIONS ARE NO LONGER AVAILABLE')]"));
	}

	public static WebElement rbtnduratioOfMembership3() {
		return driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_Radio_ExtGftMem_Duration_0']"));
	}

	public static WebElement rbtnduratioOfMembership6() {
		return driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_Radio_ExtGftMem_Duration_1']"));
	}

	public static WebElement rbtnduratioOfMembership12() {
		return driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_Radio_ExtGftMem_Duration_2']"));
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

	public void clickEditPaymentInformation() throws IOException {

		clickOnButton(btnEditPaymentInformation(), "Edit Payment Information");
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

		String BirthDate = data.Getdata("Birthdate", row).trim();
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

	public void clickcancelMembership() throws IOException {

		clickOnButton(btnCancelMembership(), "Cancel Membership");

	}

	public void SaveMemebrshipCancellation() throws IOException {

		clickOnButton(btnsaveCancelMembership(), "Cancel Membership");

	}

	public void GoBackMemebrshipCancellation() throws IOException {

		clickOnButton(btnGoBackMembership(), "Go Back Membership");

	}

	public void SelectCancellationReason() throws IOException {

		// String cancellationreason = data.Getdata("cancellationreason", row);
		selectByText(dpdCancellationReason(), "cancellation reason", "Expenses");
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

	public void vacationStartDate(int row) throws IOException {
		enterText(txtVacationStartDate(), "Vacation Start Date", data.Getdata("Vacation Start Date", row));
	}

	public void vacationEndDate(int row) throws IOException {
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

	public void clickRejoinMember() throws IOException {
		clickOnButton(btnRejoinMember(), "Rejoin Member Button");
	}

	public void clickDuration3() throws IOException {
		clickOnButton(rbtnduratioOfMembership3(), "3");
	}

	public void clickDuration6() throws IOException {
		clickOnButton(rbtnduratioOfMembership6(), "6");
	}

	public void clickDuration12() throws IOException {
		clickOnButton(rbtnduratioOfMembership12(), "12");
	}

	public void extendMembershipbeforeExpiry(int row) throws IOException {
		Date displayeddate = null;
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date date = cal.getTime();
		String todayDate = sdf.format(date);
		System.out.println(todayDate);
		Menu.ClickAccountsInfo();
		try {
			displayeddate = sdf.parse(readonlytxtMembershipExpiration().getText());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if (date.before(displayeddate)) {
			clickOnButton(btnExtendMembership(), "Extend Membership");

			if (data.Getdata("Extend Membership", row).trim().equalsIgnoreCase("3")) {
				clickDuration3();
			}

			else if (data.Getdata("Extend Membership", row).trim().equalsIgnoreCase("6")) {
				clickDuration6();
			} else {
				clickDuration12();
			}

			clickOnButton(Page_WineClubInformation.btnMicrosPayment(), "Micros Payment");
		} else {
			ResultsLog.ReportFail(driver, "Member Already Expired", "Member Expired");

		}

	}

	public void extendMembershipafterExpiry(int row) throws IOException {
		Date displayeddate = null;
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date date = cal.getTime();
		String todayDate = sdf.format(date);

		System.out.println(todayDate);
		Menu.ClickAccountsInfo();
		try {
			displayeddate = sdf.parse(readonlytxtMembershipExpiration().getText());
		} catch (ParseException e) {
			System.out.println("No Date displayed for Expiration");
			e.printStackTrace();
		}
		if (date.after(displayeddate)) {
			clickOnButton(btnExtendMembership(), "Extend Membership");
			if (data.Getdata("Extend Membership", row).trim().equalsIgnoreCase("3")) {
				clickDuration3();
			}

			else if (data.Getdata("Extend Membership", row).trim().equalsIgnoreCase("6")) {
				clickDuration6();
			} else {
				clickDuration12();
			}
			clickOnButton(Page_WineClubInformation.btnMicrosPayment(), "Micros Payment");
		} else {
			ResultsLog.ReportFail(driver, "Member is still valid", "Member Valid");

		}

	}

	public void convertMembershipbeforeExpiry() throws IOException {
		Date displayeddate = null;
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date date = cal.getTime();
		String todayDate = sdf.format(date);

		System.out.println(todayDate);

		try {
			displayeddate = sdf.parse(readonlytxtMembershipExpiration().getText());
		} catch (ParseException e) {
			System.out.println("No Date displayed for Expiration");
			e.printStackTrace();
		}
		if (date.before(displayeddate)) {
			Menu.ClickAccountsInfo();
			clickOnButton(btnConvertMembership(), "Convert Membership");
			clickOnButton(Page_WineClubInformation.btnUseCardonFileConvertMembership(), "Use Card on File");
			verifyTextEqual(errorMessageFutureConversionsNotPossible(), "FUTURE COVNERSIONS ARE NO LONGER AVAILABLE",
					"Gift Conversion to Monthly");
		}

	}

	public void convertMembershipafterExpiry() throws IOException {

		Date displayeddate = null;
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date date = cal.getTime();
		String todayDate = sdf.format(date);

		System.out.println(todayDate);

		try {
			displayeddate = sdf.parse(readonlytxtMembershipExpiration().getText());
		} catch (ParseException e) {
			System.out.println("No Date displayed for Expiration");
			e.printStackTrace();
		}
		if (date.after(displayeddate)) {

			clickOnButton(btnConvertMembership(), "Convert Membership");

			clickOnButton(Page_WineClubInformation.btnUseCardonFile(), "Use Card on File");

		}

	}

	public void rejoinMember(int row) throws IOException, InterruptedException, BiffException, ParseException {
		Date startDate = null;
		Date endDate = null;
		Calendar cal = Calendar.getInstance();
		Date today = new SimpleDateFormat("MM/dd/yyyy").parse(new SimpleDateFormat("MM/dd/yyyy").format(cal.getTime()));
		String bottlesAndClub = Page_WinePickUp.readonlyBottlesAndClub().getText();
		clickOnButton(Resaurant_Menu.btn_AccountInfo(), "Account Info");
		if (Page_WinePickUp.readonlyStatus().getText().equalsIgnoreCase("Cancel")) {
			if (data.Getdata("Test Case:", row).equalsIgnoreCase("TC_0021")) {
				systemDateChange(data.Getdata("System Date Change", row));
				startDate = new SimpleDateFormat("MM/dd/yyyy").parse(data.Getdata("Start Date", row));
				endDate = new SimpleDateFormat("MM/dd/yyyy").parse(data.Getdata("End Date", row));
			}
			clickOnButton(btnRejoinMember(), "Rejoin Member Button");
			if (today.after(startDate) && today.before(endDate)) {
				if (Page_WineClubInformation.rbtnImmediately().isSelected()) {
					clickOnButton(Page_WineClubInformation.btnProceedToPayment(), "Proceed to Payment");
					Page_ProcessPayment page_ProcessPayment = new Page_ProcessPayment();
					page_ProcessPayment.PaymentProcess(row);
					Menu.ClickWinePick_UP();
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

				} else if (Page_WineClubInformation.rbtnNextBillingCycle().isSelected()) {
					clickOnButton(Page_WineClubInformation.btnProceedToPayment(), "Proceed to Payment");
					Page_ProcessPayment page_ProcessPayment = new Page_ProcessPayment();
					page_ProcessPayment.PaymentProcess(row);
					Menu.ClickWinePick_UP();
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
			} else if (!Page_WinePickUp.readonlyStatus().getText().equalsIgnoreCase("Cancel")) {
				Menu.ClickSearch();
				Page_MemberSearch.EnterMemberInformation(row);
				CancelMembership();
				clickOnButton(btnRejoinMember(), "Rejoin Member Button");
				if (Page_WineClubInformation.rbtnImmediately().isSelected()) {
					clickOnButton(Page_WineClubInformation.btnProceedToPayment(), "Proceed to Payment");
					Page_ProcessPayment page_ProcessPayment = new Page_ProcessPayment();
					page_ProcessPayment.PaymentProcess(row);
					Menu.ClickWinePick_UP();
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

				} else if (Page_WineClubInformation.rbtnNextBillingCycle().isSelected()) {
					clickOnButton(Page_WineClubInformation.btnProceedToPayment(), "Proceed to Payment");
					Page_ProcessPayment page_ProcessPayment = new Page_ProcessPayment();
					page_ProcessPayment.PaymentProcess(row);
					Menu.ClickWinePick_UP();
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

	public void bottlesUpgradefrom1to2(int row) throws ParseException, IOException {
		Date startDate = null;
		Date endDate = null;
		Calendar cal = Calendar.getInstance();
		Date today = new SimpleDateFormat("MM/dd/yyyy").parse(new SimpleDateFormat("MM/dd/yyyy").format(cal.getTime()));
		if (data.Getdata("Test Case:", row).equalsIgnoreCase("TC_0026")) {
			systemDateChange(data.Getdata("System Date Change", row));
			startDate = new SimpleDateFormat("MM/dd/yyyy").parse(data.Getdata("Start Date", row));
			endDate = new SimpleDateFormat("MM/dd/yyyy").parse(data.Getdata("End Date", row));
		}
		Menu.ClickWinePick_UP();
		Page_WinePickUp.readonlyBottlesAndClub().click();
		if (today.after(startDate) && today.before(endDate))  {
			if (Page_WineClubInformation.rbtn1Bottle().isSelected()) {
				Page_WineClubInformation.rbtn2Bottles().click();
			} else {
				ResultsLog.ReportInfo(driver, "Alredy 2 bottles selected");
			}
			if (Page_WinePickUp.rbtnImmediatly().isSelected()) {
				Page_WinePickUp.btnUseCardOnFile().click();
				Menu.ClickWinePick_UP();

				for (int i = 0; i < 20; i++) {
					try {
						WebElement womMonth = driver.findElement(By.xpath(
								"(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])[" + i + "]"));
						WebElement womName = driver.findElement(By
								.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3][" + i + "]"));
						if (womMonth.getText().contains("7") && womName.getText().equals("July Thank You 2019")) {
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
			} else if (Page_WinePickUp.rbtnNextBillingCycle().isSelected()) {
				Page_WineClubInformation.btnSaveWCInformation();
				Menu.ClickWinePick_UP();

				for (int i = 0; i < 20; i++) {
					try {
						WebElement womMonth = driver.findElement(By.xpath(
								"(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2])[" + i + "]"));
						if (womMonth.getText().contains("8")) {
							System.out.println("August WOMS credited :" + i);
							break;
						}
					} catch (Exception e) {
						ResultsLog.ReportInfo(driver, "Element not found in list");
					}

				}
			}
		}
		
		

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

	public void CancelMembership() throws IOException {
		Menu.ClickAccountsInfo();
		try {
			if(btnCancelMembership().isDisplayed()) {
				clickcancelMembership();
				SelectCancellationReason();
				SaveMemebrshipCancellation();
				verifyTextEqual(Page_WinePickUp.readonlyConfirmationMessage(), "Membership cancelled successfully.",
						"MemberShip Cancellation");
			} else {
				ResultsLog.ReportInfo(driver, "Membership already cancelled");
			}
		} catch (Exception e) {
			ResultsLog.ReportInfo(driver, "MemberShip Cancellation button not displyed");
		}
		
	}

	public void MemberSignatureCheckedOPtOut() throws IOException {
		Menu.ClickAccountsInfo();
		if (!chkMemberSignatureOptOut().isSelected())
			MemberSignatureOptOut();
		clickOnButton(btnUpdateMemberSignature(), "Member Signature Opted Out");
	}

	public void MemberSignatureCheckedOPtIn() throws IOException {
		Menu.ClickAccountsInfo();
		if (chkMemberSignatureOptOut().isSelected())
			MemberSignatureOptOut();
		clickOnButton(btnUpdateMemberSignature(), "Member Signature Opted In");
	}

	// public void VacationHold(int row) throws IOException {
	// Menu.ClickAccountsInfo();
	// clickVacationEditIcon();
	// vacationStartDate(row);
	// vacationEndDate(row);
	// btnSaveVacationDates();
	// vacation hold page methods
	// }
	public void putVacationHold() throws Exception {
		Calendar cal = Calendar.getInstance();
		Calendar cal1 = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		cal.add(Calendar.DAY_OF_MONTH, 90);
		Date d = cal.getTime();
		String futureDate = sdf.format(d);
		String todayDate = sdf.format(cal1.getTime());
		System.out.println(todayDate);
		System.out.println(futureDate);
		Menu.ClickAccountsInfo();
		Thread.sleep(5000);
		clickVacationEditIcon();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtVacationStartDate());
		Thread.sleep(5000);

		try {
			System.out.println(txtVacationStartDate().getAttribute("value"));
			if (!txtVacationStartDate().getAttribute("value").isEmpty()) {
				txtVacationStartDate().clear();
			}
		} catch (Exception e) {

			System.out.println("element not available");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		txtVacationStartDate().sendKeys(todayDate);
		enterText(txtVacationStartDate(), "Vacation Start Date", todayDate);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			System.out.println(txtVacationEndDate().getAttribute("value"));
			if (!txtVacationEndDate().getAttribute("value").isEmpty()) {
				txtVacationEndDate().clear();
			}
		} catch (Exception e) {

			System.out.println("element not available");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		txtVacationEndDate().sendKeys(futureDate);
		enterText(txtVacationEndDate(), "Vacation Start Date", futureDate);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btnSaveVacationDates();
	}

	public void updateCreditCard(int row) throws IOException {
		Menu.ClickAccountsInfo();
		clickEditPaymentInformation();
		Page_ProcessPayment Page_ProcessPayment = new Page_ProcessPayment();
		Page_ProcessPayment.PaymentProcess(row);

	}

}
