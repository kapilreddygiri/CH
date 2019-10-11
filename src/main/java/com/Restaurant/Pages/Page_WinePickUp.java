package com.Restaurant.Pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.naming.spi.DirStateFactory.Result;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Restaurant.CommonPages.Resaurant_Menu;
import com.Restaurant.PageData.Restaurant_SignUpPagedata;
import com.Utils.BasePages;

public class Page_WinePickUp extends BasePages {

	static Restaurant_SignUpPagedata data = new Restaurant_SignUpPagedata();
	Resaurant_Menu Menu = new Resaurant_Menu();

	public Page_WinePickUp() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

// Objects from Application	
// Member Search

	public static WebElement readonlyConfirmationMessage() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_SuccessMessage']"));
	}

	public static WebElement readonlyConfirmationORWarningMessage() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ErrorSection']"));
	}

	public static WebElement readonlyMemberName() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_MemberName']"));
	}

	public static WebElement readonlyPointsUntilNextReward() {
		return driver.findElement(By.xpath("//*[text()='Points Until Next Reward: ']/following::td[1]/b[1]"));

		// div[@id='ContentPlaceHolder1_HeaderSection']/child::table/child::tbody/child::tr/child::td[2]/child::b[1]
	}

	public static WebElement readonlyCurrentActivePoints() {
		return driver.findElement(By.xpath("//*[text()='Current Active Points:']/following::td[1]/b[2]"));
	}

	public static WebElement readonlyLifeTimePoints() {
		return driver.findElement(By.xpath("//*[text()='Lifetime Points:']/following::td[1]/b[3]"));
	}

	public static WebElement readonlyAmbassadorCredits() {
		return driver.findElement(By.xpath("//*[text()='Ambassador Credits:']/following::td[1]/b[4]"));
	}

	public static WebElement readonlyCardNumber() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_CardNumberText']"));
	}

	public static WebElement readonlyMemberType() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_MemberType']"));
	}

	public static WebElement readonlyStatus() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Status']"));
	}

	public static WebElement readonlyMemberSince() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_MemberSince']"));
	}

	public static WebElement readonlyPendingChanges() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_pendingChanges']"));
	}

	public static WebElement readonlySign_UpLocation() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_SignUpLocation']"));
	}

	public static WebElement readonlyNumberofBottlesAndClub() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_BottlesAndClub']"));
	}

	public static WebElement readonlyNumberofBottlesAndClubLabel() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_BottlesAndClubLabel']"));
	}

	public static WebElement readonlyBottlesAndClub() {
		return driver.findElement(By.xpath("//*[contains(text(), '# of Bottles & Club:')]"));
	}

	public static WebElement readonlyDelivery() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Delivery']"));
	}

	public static WebElement readonlyDeliveryLabel() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_DeliveryLabel']"));
	}

	public static WebElement readonlyMembershipCost() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_CostOfMembership']"));
	}

	public static WebElement readonlyTier() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Tier']"));
	}

	public static WebElement readonlyBottlesAvailable() {
		return driver.findElement(By.xpath("//div[@id='ContentPlaceHolder1_NoOfBottlesDiv']"));
	}

	public static WebElement readonlyWOMBottles1() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[2]/td[2]"));
	}

	public static WebElement readonlyWOMBottles2() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[3]/td[2]"));
	}

	public static WebElement readonlyTastingBottles1() {
		return driver
				.findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableTastings']/tbody/tr[2]/td[2]"));
	}

	public static WebElement readonlyTastingBottles2() {
		return driver
				.findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableTastings']/tbody/tr[3]/td[2]"));
	}

	public static WebElement chkboxTastingBottles1() {
		return driver.findElement(
				By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableTastings']/tbody/tr[2]/td[1]/input"));
	}

	public static WebElement chkboxTastingBottles2() {
		return driver.findElement(
				By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableTastings']/tbody/tr[3]/td[1]/input"));
	}

	public static WebElement readonlyTastingBottles1Expiration() {
		return driver
				.findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableTastings']/tbody/tr[2]/td[4]"));
	}

	public static WebElement readonlyTastingBottles2Expiration() {
		return driver
				.findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableTastings']/tbody/tr[3]/td[4]"));
	}

	public static WebElement noOfBottlesAVaialble() {
		return driver.findElement(By.linkText("javascript:__doPostBack('ctl00$ContentPlaceHolder1$NoOfBottles','')"));
	}

	// *[@id="ContentPlaceHolder1_GridViewAvailableWines_chkWOMRow_1"]

	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines_chkWOMRow_0']")
	public WebElement WCMEMBERWOMCheckBox1;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines_chkWOMRow_1']")
	public WebElement WCMEMBERWOMCheckBox2;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines_chkWOMRow_2']")
	public WebElement WCMEMBERWOMCheckBox3;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines_chkWOMRow_3']")
	public WebElement WCMEMBERWOMCheckBox4;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines_chkWOMRow_4']")
	public WebElement WCMEMBERWOMCheckBox5;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines_chkWOMRow_5']")
	public WebElement WCMEMBERWOMCheckBox6;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines_chkWOMRow_6']")
	public WebElement WCMEMBERWOMCheckBox7;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines_chkWOMRow_7']")
	public WebElement WCMEMBERWOMCheckBox8;

	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[2]/td[2]")
	public WebElement WCMEMBERWOMMonth1;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[3]/td[2]")
	public WebElement WCMEMBERWOMMonth2;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[4]/td[2]")
	public WebElement WCMEMBERWOMMonth3;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[5]/td[2]")
	public WebElement WCMEMBERWOMMonth4;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[6]/td[2]")
	public WebElement WCMEMBERWOMMonth5;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[7]/td[2]")
	public WebElement WCMEMBERWOMMonth6;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[8]/td[2]")
	public WebElement WCMEMBERWOMMonth7;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[9]/td[3]")
	public WebElement WCMEMBERWOMMonth8;

	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[2]/td[3]")
	public WebElement WOM1;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[3]/td[2]")
	public WebElement WOM2;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[4]/td[2]")
	public WebElement WOM3;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[5]/td[2]")
	public WebElement WOM4;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[6]/td[2]")
	public WebElement WOM5;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[7]/td[2]")
	public WebElement WOM6;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[8]/td[2]")
	public WebElement WOM7;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[9]/td[2]")
	public WebElement WOM8;

	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines_ddlAlternateWine_0']")
	public WebElement AlternateWine1;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines_ddlAlternateWine_1']")
	public WebElement AlternateWine2;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines_ddlAlternateWine_2']")
	public WebElement AlternateWine3;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines_ddlAlternateWine_3']")
	public WebElement AlternateWine4;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines_ddlAlternateWine_4']")
	public WebElement AlternateWine5;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines_ddlAlternateWine_5']")
	public WebElement AlternateWine6;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines_ddlAlternateWine_6']")
	public WebElement AlternateWine7;
	@FindBy(xpath = "//*[@id='ContentPlaceHolder1_GridViewAvailableWines_ddlAlternateWine_7']")
	public WebElement AlternateWine8;

	public static WebElement btnSaveSelections() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Btn_SaveSelections']"));
	}

	public static WebElement btnUseCardOnFile() {
		return driver.findElement(By.xpath("//*[@value='Use card on File']"));
	}

	public static WebElement btnCancelSelections() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Btn_Cancel']"));
	}

	public static WebElement txtBottlesAvailable() {
		return driver.findElement(By.xpath("//div[@class='bottles' and contains(text(), 'Bottles Available:')]"));
	}

	public static WebElement chkAvailableTastings() {
		return driver
				.findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableTastings_chkTastingsRow_0')]"));
	}

	public static WebElement txtJulyThankYouAvailable() {
		return driver.findElement(By.xpath("//div[@class='bottles' and contains(text(), 'July Thank You:')]"));
	}

	public static WebElement rbtnImmediatly() {
		return driver.findElement(By.xpath("//*[@value='Immediately']"));
	}

	public static WebElement rbtnNextBillingCycle() {
		return driver.findElement(By.xpath("//*[@value='Next Billing Cycle']"));
	}

	public static WebElement rbtn1Bottle() {
		return driver.findElement(By.xpath("//*[@value='1']"));
	}

	public static WebElement rbtn2Bottles() {
		return driver.findElement(By.xpath("//*[@value='2']"));
	}

	public static WebElement woM() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[3]/td[2]"));
	}

// Each Object Performance Method	
// Wine Pick_Up
	public void errorMessageWOMNotSelected() throws IOException {
		verifyTextEqual(readonlyConfirmationORWarningMessage(), "No WOM / Tasting is selected",
				"No Bottle is Selected for Selection");
		System.out.println("Nothing is slected");
	}

	public void VerifyMemberName(int row) throws IOException {

		String memberName = data.Getdata("First Name", row).trim() + " " + data.Getdata("Last Name", row).trim();
		verifyTextEqual(readonlyMemberName(), memberName, "Member Name");
	}

	public void VerifyPointsUntilNextReward(int row) throws IOException {
		verifyTextEqual(readonlyPointsUntilNextReward(), "350", "Points Until Next Reward");
	}

	public void VerifyCurrentActivePoints(int row) throws IOException {
		verifyTextEqual(readonlyCurrentActivePoints(), data.Getdata("ExpectedActivePoints", row),
				"Current Active Points");
	}

	public void VerifyLifetimePoints(int row) throws IOException {
		verifyTextEqual(readonlyLifeTimePoints(), data.Getdata("ExpectedActivePoints", row), "Lifetime Points");
	}

	public void VerifyAmbassadorCredits(int row) throws IOException {
		verifyTextEqual(readonlyAmbassadorCredits(), data.Getdata("ExpectedTotalAmbassadorCredits", row),
				"Ambassador Credits");
	}

	public void VerifyCardNumber(int row) throws IOException {
		verifyTextEqual(readonlyCardNumber(), EnteredCardNumber, "Card Number");
	}

	public void VerifyMemberType(int row) throws IOException {
		verifyTextEqual(readonlyMemberType(), data.Getdata("Membership Type", row), "Member Type");
	}

	public void VerifyStatus(int row) throws IOException {
		verifyTextEqual(readonlyStatus(), "Active", "Status");
	}

	public void VerifyMemberSince(int row) throws IOException {
		verifyTextEqual(readonlyMemberSince(), getCurrentDateStampWithMM(), "Member Since");
	}

	public void VerifyPendingChanges(int row) throws IOException {
		verifyTextEqual(readonlyPendingChanges(), "No", "Pending Changes");
	}

	public void VerifySignUpLocation(int row) throws IOException {
		verifyTextEqual(readonlySign_UpLocation(), data.Getdata("Sign Up Location", row), "Sign-Up Location");
	}

	public void VerifyNOofBottlesAndClub(int row) throws IOException {

		String ExpectedBottlesAndClubType = data.Getdata("# of Bottles", row) + " & " + data.Getdata("Club Type", row);
		verifyTextEqual(readonlyNumberofBottlesAndClub(), ExpectedBottlesAndClubType, "# of Bottles & Club");
	}

	public void VerifyNOofBottlesAndClubLabel(int row) throws IOException {

		String ExpectedBottlesAndClubType = data.Getdata("# of Bottles", row) + " & " + data.Getdata("Club Type", row);
		verifyTextEqual(readonlyNumberofBottlesAndClubLabel(), ExpectedBottlesAndClubType, "# of Bottles & Club");
	}

	public void VerifyDelivery(int row) throws IOException {
		verifyTextEqual(readonlyDelivery(), data.Getdata("Delivery", row), "Delivery");
	}

	public void VerifyDeliveryLabel(int row) throws IOException {
		verifyTextEqual(readonlyDeliveryLabel(), data.Getdata("Delivery", row), "Delivery");
	}

	public void VerifyMembershipCost(int row) throws IOException {
		verifyTextEqual(readonlyMembershipCost(), formatAmountText(data.Getdata("Cost of Membership", row)),
				"Membership Cost");
	}

	public void VerifyTier(int row) throws IOException {
		verifyTextEqual(readonlyTier(), "Standard", "Tier");
	}

	public void VerifyBottlesAvailable(int row) throws IOException {

		String ExpectedBottles = "Bottles Available: " + data.Getdata("# of Bottles", row).trim();
		verifyTextEqual(readonlyBottlesAvailable(), ExpectedBottles, "Bottles available");
	}

	public void VerifyWOMBottles1(int row) throws IOException {

		String ExpectedWOM_MonthAndYear = getCurrentmonth() + "/" + getCurrentYear();
		verifyTextEqual(readonlyWOMBottles1(), ExpectedWOM_MonthAndYear, "WOM Bottles available");

	}

	public void VerifyWOMBottles2(int row) throws IOException {

		String ExpectedWOM_MonthAndYear = getCurrentmonth() + "/" + getCurrentYear();
		verifyTextEqual(readonlyWOMBottles2(), ExpectedWOM_MonthAndYear, "WOM Bottles available");

	}

	public void VerifyTastingBottles1(int row) throws IOException {
		String ExpectedWOM_MonthAndYear = getCurrentmonth() + "/" + getCurrentYear();
		verifyTextEqual(readonlyTastingBottles1(), ExpectedWOM_MonthAndYear, "Tasting Bottle1 available");
	}

	public void VerifyTastingBottles2(int row) throws IOException {
		String ExpectedWOM_MonthAndYear = getCurrentmonth() + "/" + getCurrentYear();
		verifyTextEqual(readonlyTastingBottles2(), ExpectedWOM_MonthAndYear, "Tasting Bottles2 available");
	}

	public void VerifyTastingBottles1Expiration(int row) throws IOException {
		verifyTextEqual(readonlyTastingBottles1Expiration(), getCurrentDateStampPlusRequiredDate2(),
				"Tasting Bottle1 Expiration");
	}

	public void VerifyTastingBottles2Expiration(int row) throws IOException {
		verifyTextEqual(readonlyTastingBottles2Expiration(), getCurrentDateStampPlusRequiredDate2(),
				"Tasting Bottles2 Expiration");
	}

	public void clicknoOfBottlesAvailable() throws IOException {
		clickOnLink(noOfBottlesAVaialble(), "Bottles Available");
	}

// Logical Method

	public void ValidateWOMBottles(int row) throws IOException {

		if (data.Getdata("# of Bottles", row).trim().equalsIgnoreCase("1")) {
			VerifyWOMBottles1(row);
		}

		else if (data.Getdata("# of Bottles", row).trim().equalsIgnoreCase("2")) {
			VerifyWOMBottles1(row);
			VerifyWOMBottles2(row);

		}
	}

	public void ValidateTastingBottles(int row) throws IOException {

		if (data.Getdata("# of Bottles", row).trim().equalsIgnoreCase("1")) {
			VerifyTastingBottles1(row);
		}

		else if (data.Getdata("# of Bottles", row).trim().equalsIgnoreCase("2")) {
			VerifyTastingBottles1(row);
			VerifyTastingBottles2(row);

		}
	}

	public void ValidateTastingBottlesExpiration(int row) throws IOException {

		if (data.Getdata("# of Bottles", row).trim().equalsIgnoreCase("1")) {
			VerifyTastingBottles1Expiration(row);
		}

		else if (data.Getdata("# of Bottles", row).trim().equalsIgnoreCase("2")) {
			VerifyTastingBottles1Expiration(row);
			VerifyTastingBottles2Expiration(row);

		}
	}

	public void ClickSaveWCMemberWOMSelections() throws IOException {
		clickOnButton(btnSaveSelections(), "Save Selections");
	}

	public void markOffTasting() throws IOException, InterruptedException {

		if (chkboxTastingBottles1().isDisplayed()) {
			Thread.sleep(3000);
			clickOnCheckBox(chkboxTastingBottles1(), "1st Available Tasting");

			clickOnButton(btnSaveSelections(), "Save");
		} else {
			System.out.println("No Current Month Tastings Available for the Member");

		}

	}

	public void noMarkOffTasting() throws IOException {
		try {
			if (!(chkboxTastingBottles1()).isEnabled()) {
				ResultsLog.ReportPass(driver, "Check box disabled", "User Not authorized");
			} else {
				ResultsLog.ReportFail(driver, "Check box enabled", "User Not authorized");
			}
		} catch (Exception e) {
			ResultsLog.ReportInfo(driver, "Available Tastings not available");
		}
		clickOnButton(btnSaveSelections(), "Save Selections");

	}

	public void swap2Womsfor1Lux() throws IOException, InterruptedException {

		int count = 0;
		String noOfBottles = readonlyNumberofBottlesAndClub().getText().substring(0, 1);

		Thread.sleep(3000);
		System.out.println("Num of bott :" + noOfBottles);

		for (int i = 1; i < 20; i++) {

			try {
				WebElement womElement = driver.findElement(
						By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3])[" + i + "]"));
				if (!womElement.getText().equalsIgnoreCase("July Thank You 2019")
						&& !womElement.getText().equalsIgnoreCase("Sweet") && noOfBottles.equals("1")) {
					ResultsLog.ReportInfo(driver, "Cannot Swap second bottle due to unavailablitiy");
					break;
				} else if (!womElement.getText().equalsIgnoreCase("July Thank You 2019")
						&& !womElement.getText().equalsIgnoreCase("Sweet") && noOfBottles.equals("2")) {
					if (count == 2) {
						break;
					} else {
						Thread.sleep(5000);
						selectByText(driver.findElement(By
								.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[4]/select)["
										+ i + "]")),
								"AlternateWine with Upcharge", "Almond Sparkling");
						Thread.sleep(3000);
						count++;
					}
				} else {
					System.out.println("Required WOM not found");
				}

			} catch (StaleElementReferenceException e) {
				e.printStackTrace();
			}

		}

		Thread.sleep(1000);
		ClickSaveWCMemberWOMSelections();
	}

	public void SelectJulypromo(int row) throws IOException, InterruptedException, ParseException {
		if (data.Getdata("Test Case:", row).equalsIgnoreCase("July Promo Rest TC_0003")) {
			systemDateChange(data.Getdata("System Date Change", row));
		}
		int count = 0;
		String noOfBottles = readonlyNumberofBottlesAndClub().getText().substring(0, 1);

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

		ClickSaveWCMemberWOMSelections();

	}

	public void aSelectWCPriorWOMPickUP() throws IOException, InterruptedException, ParseException {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
		String todayDate = sdf.format(cal.getTime());
		// Date currentDate = sdf.parse(todayDate);
		List<WebElement> womCol = driver
				.findElements(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3]"));
		List<WebElement> monthCol = driver
				.findElements(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2]"));
		List<WebElement> checkboxList = driver.findElements(
				By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']//input[@type='checkbox']"));
		List<WebElement> alternateWineList = driver
				.findElements(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[4]/select"));

		for (int i = 0; i < womCol.size(); i++) {
			WebElement wom = womCol.get(i);
			WebElement month = monthCol.get(i);
			WebElement checkbox = checkboxList.get(i);
			WebElement alternateWine = alternateWineList.get(i);
			if ((!wom.getText().equals("July Thank You 2019"))
					&& Integer.parseInt(month.getText().split("/")[0]) < Integer.parseInt(todayDate.split("/")[0])) {
				Thread.sleep(2000);
				selectByText(alternateWine, "Alternate Wine", "Almond Sparkling");
				try {
					checkbox.click();
				} catch (StaleElementReferenceException e) {
				}
				Thread.sleep(5000);
				break;
			}
		}

	}

	public void SelectWCPriorWOMPickUP() throws IOException, InterruptedException, ParseException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("M/yyyy");

		cal.add(Calendar.MONTH, -1);
		Date d = cal.getTime();
		String Monthfromsys = sdf.format(d);

		String priorMonth = Monthfromsys.substring(0, 1);
		System.out.println(priorMonth);

		int count = 0;
		String noOfBottles = readonlyNumberofBottlesAndClub().getText().substring(0, 1);

		Thread.sleep(3000);
		System.out.println("Num of bott :" + noOfBottles);

		List<WebElement> womMonthList = driver
				.findElements(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2]"));
		for (int i = 1; i < womMonthList.size(); i++) {

			try {
				WebElement womElement = driver.findElement(
						By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3])[" + i + "]"));
				WebElement alternateWine = driver.findElement(
						By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[4]/select"));
				WebElement womMonth = driver
						.findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2]"));
				if (!womElement.getText().equalsIgnoreCase("July Thank You 2019")
						&& !womElement.getText().equalsIgnoreCase("Sweet")
						&& womMonth.getText().substring(0, 1).equalsIgnoreCase(priorMonth) && noOfBottles.equals("1")) {
					Thread.sleep(5000);
					selectByText(driver.findElement(
							By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[4]/select)["
									+ i + "]")),
							"AlternateWine with Upcharge", "Almond Sparkling");
					break;
				} else if (!womElement.getText().equalsIgnoreCase("July Thank You 2019")
						&& !womElement.getText().equalsIgnoreCase("Sweet")
						&& womMonth.getText().substring(0, 1).equalsIgnoreCase(priorMonth) && noOfBottles.equals("2")) {
					if (count == 2) {
						break;
					} else {
						Thread.sleep(5000);
						selectByText(driver.findElement(By
								.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[4]/select)["
										+ i + "]")),
								"AlternateWine with Upcharge", "Almond Sparkling");
						Thread.sleep(3000);
						count++;
					}
				} else {
					System.out.println("Required WOM not found");
				}

			} catch (StaleElementReferenceException e) {
				e.printStackTrace();
			}

		}

		Thread.sleep(1000);
		ClickSaveWCMemberWOMSelections();
	}

	public void SelectWCCurrentWOMPickUP() throws IOException, InterruptedException, ParseException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("M/yyyy");

		cal.add(Calendar.MONTH, 0);
		Date d = cal.getTime();
		String Monthfromsys = sdf.format(d);

		String currentMonth = Monthfromsys.substring(0, 1);
		System.out.println(currentMonth);

		int count = 0;
		String noOfBottles = readonlyNumberofBottlesAndClub().getText().substring(0, 1);

		Thread.sleep(3000);
		System.out.println("Num of bott :" + noOfBottles);

		List<WebElement> womMonthList = driver
				.findElements(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2]"));
		for (int i = 1; i < womMonthList.size(); i++) {

			try {
				WebElement womElement = driver.findElement(
						By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3])[" + i + "]"));
				WebElement alternateWine = driver.findElement(
						By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[4]/select"));
				WebElement womMonth = driver
						.findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2]"));
				if (!womElement.getText().equalsIgnoreCase("July Thank You 2019")
						&& !womElement.getText().equalsIgnoreCase("Sweet")
						&& womMonth.getText().substring(0, 1).equalsIgnoreCase(currentMonth)
						&& noOfBottles.equals("1")) {
					Thread.sleep(5000);
					selectByText(driver.findElement(
							By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[4]/select)["
									+ i + "]")),
							"AlternateWine with Upcharge", "Almond Sparkling");
					break;
				} else if (!womElement.getText().equalsIgnoreCase("July Thank You 2019")
						&& !womElement.getText().equalsIgnoreCase("Sweet")
						&& womMonth.getText().substring(0, 1).equalsIgnoreCase(currentMonth)
						&& noOfBottles.equals("2")) {
					if (count == 2) {
						break;
					} else {
						Thread.sleep(5000);
						selectByText(driver.findElement(By
								.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[4]/select)["
										+ i + "]")),
								"AlternateWine with Upcharge", "Almond Sparkling");
						Thread.sleep(3000);
						count++;
					}
				} else {
					System.out.println("Required WOM not found");
				}

			} catch (StaleElementReferenceException e) {
				e.printStackTrace();
			}

		}

		Thread.sleep(1000);
		ClickSaveWCMemberWOMSelections();
	}

	public void SelectWCPriorWOMPickUPwithCharge() throws IOException, InterruptedException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("M/yyyy");

		cal.add(Calendar.MONTH, -1);
		Date d = cal.getTime();
		String Monthfromsys = sdf.format(d);

		String priorMonth = Monthfromsys.substring(0, 1);
		System.out.println(priorMonth);

		int count = 0;
		String noOfBottles = readonlyNumberofBottlesAndClub().getText().substring(0, 1);

		Thread.sleep(3000);
		System.out.println("Num of bott :" + noOfBottles);

		for (int i = 1; i < 10; i++) {

			try {
				WebElement womElement = driver.findElement(
						By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3])[" + i + "]"));
				WebElement womMonth = driver
						.findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2]"));
				if (!womElement.getText().equalsIgnoreCase("July Thank You 2019")
						&& !womElement.getText().equalsIgnoreCase("Sweet")
						&& womMonth.getText().substring(0, 1).equalsIgnoreCase(priorMonth) && noOfBottles.equals("1")) {
					Thread.sleep(5000);
					selectByText(driver.findElement(
							By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[4]/select)["
									+ i + "]")),
							"AlternateWine with Upcharge", "Lux Cab");
					break;
				} else if (!womElement.getText().equalsIgnoreCase("July Thank You 2019")
						&& !womElement.getText().equalsIgnoreCase("Sweet")
						&& womMonth.getText().substring(0, 1).equalsIgnoreCase(priorMonth) && noOfBottles.equals("2")) {
					if (count == 2) {
						break;
					} else {
						Thread.sleep(5000);
						selectByText(driver.findElement(By
								.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[4]/select)["
										+ i + "]")),
								"AlternateWine with Upcharge", "Lux Cab");
						Thread.sleep(3000);
						count++;
					}
				} else {
					System.out.println("Required WOM not found");
				}

			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "List of Wine bottles not available");
				e.printStackTrace();
			}

		}
		try {
			Thread.sleep(1000);
			clickOnButton(btnUseCardOnFile(), "Use Card On File");
			verifyTextEqual(Page_WinePickUp.readonlyConfirmationMessage(), "Wine Pickup Data Updated Successfully.",
					"Upcharge for Wine pickup");
		} catch (Exception e) {
			ResultsLog.ReportInfo(driver, "Element Not Visible");

		}

	}

	public void SelectWCCurrentWOMPickUPwithUpCharge() throws IOException, InterruptedException, ParseException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("M/yyyy");

		cal.add(Calendar.MONTH, 0);
		Date d = cal.getTime();
		String Monthfromsys = sdf.format(d);

		String currentMonth = Monthfromsys.substring(0, 1);
		System.out.println(currentMonth);

		int count = 0;
		String noOfBottles = readonlyNumberofBottlesAndClub().getText().substring(0, 1);

		Thread.sleep(3000);
		System.out.println("Num of bott :" + noOfBottles);

		for (int i = 1; i < 20; i++) {

			try {
				WebElement womElement = driver.findElement(
						By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[3])[" + i + "]"));

				WebElement womMonth = driver
						.findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[2]"));
				if (!womElement.getText().equalsIgnoreCase("July Thank You 2019")
						&& !womElement.getText().equalsIgnoreCase("Sweet")
						&& womMonth.getText().substring(0, 1).equalsIgnoreCase(currentMonth)
						&& noOfBottles.equals("1")) {
					Thread.sleep(5000);
					selectByText(driver.findElement(
							By.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[4]/select)["
									+ i + "]")),
							"AlternateWine with Upcharge", "Lux Cab");
					break;
				} else if (!womElement.getText().equalsIgnoreCase("July Thank You 2019")
						&& !womElement.getText().equalsIgnoreCase("Sweet")
						&& womMonth.getText().substring(0, 1).equalsIgnoreCase(currentMonth)
						&& noOfBottles.equals("2")) {
					if (count == 2) {
						break;
					} else {
						Thread.sleep(5000);
						selectByText(driver.findElement(By
								.xpath("(//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr/td[4]/select)["
										+ i + "]")),
								"AlternateWine with Upcharge", "Lux Cab");
						Thread.sleep(3000);
						count++;
					}
				} else {
					System.out.println("Required WOM not found");
				}

			} catch (Exception e) {
				ResultsLog.ReportInfo(driver, "List of Wine bottles not available");
				e.printStackTrace();
			}

		}

		Thread.sleep(1000);
		clickOnButton(btnUseCardOnFile(), "Use Card On File");
		verifyTextEqual(Page_WinePickUp.readonlyConfirmationMessage(), "Wine Pickup Data Updated Successfully.",
				"Upcharge for Wine pickup");
	}

	public void CompareNoofBottles(int row) throws IOException, ParseException, InterruptedException {
		if (data.Getdata("Test Case:", row).equalsIgnoreCase("July Promo Rest TC_0004")) {
			systemDateChange(data.Getdata("System Date Change", row));
		}
		int count = 0;
		String noOfBottles = readonlyNumberofBottlesAndClub().getText().substring(0, 1);

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

	public void ambassadorPoints() {
		readonlyAmbassadorCredits().getText();
	}

	public void noIncreasedAmbassadorPointsforJulyPromo(int row)
			throws IOException, ParseException, InterruptedException {
		String AmbassadorPoints = readonlyAmbassadorCredits().getText();
		verifyTextEqual(readonlyAmbassadorCredits(), AmbassadorPoints, "Ambassador Points Comparision");
		CompareNoofBottles(row);
		verifyTextEqual(readonlyAmbassadorCredits(), AmbassadorPoints, "Ambassador Points Comparision");
		if (AmbassadorPoints.equals(readonlyAmbassadorCredits().getText())) {
			ClickSaveWCMemberWOMSelections();

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
				if (readonlyDelivery().getText().equalsIgnoreCase("Pickup")) {
					readonlyDelivery().click();
					if (rbtn1Bottle().isSelected()) {

						if (rbtnImmediatly().isSelected()) {
							Menu.ClickWinePick_UP();

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
						} else if (rbtnNextBillingCycle().isSelected()) {
							Menu.ClickWinePick_UP();

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
						} else if (rbtn2Bottles().isSelected()) {

							if (rbtnImmediatly().isSelected()) {
								Menu.ClickWinePick_UP();

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
							} else if (rbtnNextBillingCycle().isSelected()) {
								Menu.ClickWinePick_UP();

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
				if (readonlyDelivery().getText().equalsIgnoreCase("Pickup")) {
					readonlyDelivery().click();
					if (rbtn1Bottle().isSelected()) {

						if (rbtnImmediatly().isSelected()) {
							Menu.ClickWinePick_UP();

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
						} else if (rbtnNextBillingCycle().isSelected()) {
							Menu.ClickWinePick_UP();

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
					} else if (rbtn2Bottles().isSelected()) {

						if (rbtnImmediatly().isSelected()) {
							int count = 0;
							Menu.ClickWinePick_UP();

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
					} else if (rbtnNextBillingCycle().isSelected()) {
						Menu.ClickWinePick_UP();

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
			if (readonlyDelivery().getText().equalsIgnoreCase("Pickup")) {
				readonlyDelivery().click();
				if (rbtn1Bottle().isSelected()) {

					if (rbtnImmediatly().isSelected()) {
						Menu.ClickWinePick_UP();

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
					} else if (rbtnNextBillingCycle().isSelected()) {
						Menu.ClickWinePick_UP();

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
				} else if (rbtn2Bottles().isSelected()) {

					if (rbtnImmediatly().isSelected()) {
						Menu.ClickWinePick_UP();

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
					} else if (rbtnNextBillingCycle().isSelected()) {
						Menu.ClickWinePick_UP();

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
			if (readonlyDelivery().getText().equalsIgnoreCase("Pickup")) {
				readonlyDelivery().click();
				if (rbtn1Bottle().isSelected()) {

					if (rbtnImmediatly().isSelected()) {
						Menu.ClickWinePick_UP();

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
					} else if (rbtnNextBillingCycle().isSelected()) {
						Menu.ClickWinePick_UP();

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
				} else if (rbtn2Bottles().isSelected()) {

					if (rbtnImmediatly().isSelected()) {
						Menu.ClickWinePick_UP();

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
					} else if (rbtnNextBillingCycle().isSelected()) {
						Menu.ClickWinePick_UP();

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

	/*
	 * public void JulyPromoforCreditCardUpdateORWCRunonORafterJuly24(int row)
	 * throws IOException { Date today = null; Date date1 = null; Date date2 = null;
	 * 
	 * 
	 * try { SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); date1 =
	 * sdf.parse("24/07/2019"); date2 = sdf.parse("31/07/2019"); today = new
	 * SimpleDateFormat("dd/MM/yyyy").parse(getCurrentdate()); } catch
	 * (ParseException e) { System.out.println("WC Run or Credit Card Updater"); }
	 * 
	 * if ((today.equals(date1) || today.after(date1)&&(today.equals(date2) ||
	 * today.before(date2))))
	 * 
	 * 
	 * { card update aug wom } else { System.out.println("no aug wom"); }
	 * 
	 * } }
	 */

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
		String noOfBottles = readonlyNumberofBottlesAndClub().getText().substring(0, 1);

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

	/*
	 * public void RejoinMember() throws IOException { Date today = null; Date date1
	 * = null; Date date2 = null; Date date3 = null; Date date4 = null;
	 * 
	 * try { SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); date1 =
	 * sdf.parse("25/06/2019"); date2 = sdf.parse("22/07/2019"); date3 =
	 * sdf.parse("23/07/2019"); date4 = sdf.parse("31/07/2019");
	 * 
	 * Page_AccountInfo m=Page_AccountInfo(); m.clickRejoinMember(); if(
	 * today.after(date1)&&today.before(date2)) {
	 * 
	 * 
	 * }
	 * 
	 * else if ( today.after(date3)&&today.before(date4)) {
	 * 
	 * 
	 * }
	 * 
	 */

	/*
	 * public void julyPromoDisabled() throws IOException {
	 * 
	 * Assert.AreEqual(false, WCMEMBERWOMCheckBox1.Enabled); Validates whether the
	 * checkbox is Disabled
	 * 
	 * }
	 */

	/*
	 * public void julyPromoTextDisplay() throws IOException { String WOM1value =
	 * WOM1.getText(); String WOM2value = WOM2.getText(); if
	 * ((readonlyNumberofBottlesAndClub().getText().split(" ")[0].equals("1"))) {
	 * verifyTextEqual(WOM1, "July Thank You 2019",
	 * "1 July Promo bottle Eligibility based on membership");
	 * 
	 * } else if
	 * ((readonlyNumberofBottlesAndClub().getText().split(" ")[0].equals("2"))) {
	 * verifyTextEqual(WOM1, "July Thank You 2019",
	 * "1st July Promo bottle Eligibility based on membership");
	 * verifyTextEqual(WOM2, "July Thank You 2019",
	 * "2nd July Promo bottle Eligibility based on membership"); } }
	 */

// Actual Functional methods

	public void ValidateWinePickUP_PageMonthly(int row) throws IOException {
		VerifyMemberName(row);
		VerifyPointsUntilNextReward(row);
		VerifyCurrentActivePoints(row);
		VerifyLifetimePoints(row);
		VerifyAmbassadorCredits(row);
		VerifyCardNumber(row);
		VerifyMemberType(row);
		VerifyStatus(row);
		VerifyMemberSince(row);
		VerifyPendingChanges(row);
		// VerifySignUpLocation(row);
		VerifyNOofBottlesAndClub(row);
		VerifyDelivery(row);
		VerifyMembershipCost(row);
		VerifyTier(row);
		VerifyBottlesAvailable(row);
		ValidateWOMBottles(row);
		ValidateTastingBottles(row);
		ValidateTastingBottlesExpiration(row);
	}

	public void ValidateWinePickUP_PageGift(int row) throws IOException {
		VerifyMemberName(row);
		VerifyPointsUntilNextReward(row);
		VerifyCurrentActivePoints(row);
		VerifyLifetimePoints(row);
		VerifyAmbassadorCredits(row);
		VerifyCardNumber(row);
		VerifyMemberType(row);
		VerifyStatus(row);
		VerifyMemberSince(row);
		VerifyPendingChanges(row);
		VerifyNOofBottlesAndClubLabel(row);
		VerifyDeliveryLabel(row);
		VerifyTier(row);
		VerifyBottlesAvailable(row);
		ValidateWOMBottles(row);

	}

}
