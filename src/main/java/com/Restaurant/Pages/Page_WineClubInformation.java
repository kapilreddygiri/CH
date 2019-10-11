package com.Restaurant.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Restaurant.CommonPages.Resaurant_Menu;
import com.Restaurant.PageData.Restaurant_SignUpPagedata;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;

public class Page_WineClubInformation extends BasePages {

	static Restaurant_SignUpPagedata data = new Restaurant_SignUpPagedata();
	Resaurant_Menu Menu = new Resaurant_Menu();

	public Page_WineClubInformation() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

// Objects from Application	
// Member Search

	public static WebElement rbtnVariety() {
		return driver.findElement(By.xpath("//*[@value='Variety']"));
	}

	public static WebElement rbtnWhite() {
		return driver.findElement(By.xpath("//*[@value='White']"));
	}

	public static WebElement rbtnRed() {
		return driver.findElement(By.xpath("//*[@value='Red']"));
	}

	public static WebElement rbtnSweet() {
		return driver.findElement(By.xpath("//*[@value='Sweet']"));
	}

	public static WebElement rbtnImmediatly() {
		return driver.findElement(By.xpath("//*[@value='Immediately']"));
	}

	public static WebElement rbtnNextBillingCycle() {
		return driver.findElement(By.xpath("//*[@value='Next Billing Cycle']"));
	}

	public static WebElement woM() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_GridViewAvailableWines']/tbody/tr[3]/td[2]"));
	}

	public static WebElement rbtn1Bottle() {
		return driver.findElement(By.xpath("//*[@value='1']"));
	}

	public static WebElement rbtn2Bottles() {
		return driver.findElement(By.xpath("//*[@value='2']"));
	}

	public static WebElement readonlyNewMembershipCost() {
		return driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_newMemCost\"]"));
	}

	public static WebElement readonlyAmountobeCharged() {
		return driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lbl_amtToBeChrgd\"]"));
	}

	public static WebElement rbtnNextbillingCycle() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Radio_EditAccInfo_ChargeType_0']"));
	}

	public static WebElement rbtnImmediately() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Radio_EditAccInfo_ChargeType_1']"));
	}

	public static WebElement rbtnDeliveryTypePickUp() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Radio_EditAccInfo_Delivery_0']"));
	}

	public static WebElement rbtnDeliveryTypeDelivery() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Radio_EditAccInfo_Delivery_1']"));
	}

	public static WebElement txtShippingStreet() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Txt_EditAccountInfo_ShippingStreet']"));
	}

	public static WebElement dpdShippingState() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddl_EditAccountInfo_ShippingState']"));
	}

	public static WebElement txtShippingCity() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Txt_EditAccountInfo_ShippingCity']"));
	}

	public static WebElement txtShippingZip() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Txt_EditAccountInfo_ShippingZip']"));
	}
	public static WebElement btnSaveWCInformation() {
		return driver.findElement(By.xpath("//input[@value='Save']"));
	}

	public static WebElement btnUseCardonFile() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Btn_EditAccountInfo_UseCardONFile']"));
	}
	public static WebElement btnUseCardonFileConvertMembership() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Btn_GftMemConv_UseCardOnFile']"));
	}
	
	public static WebElement btnMicrosPayment() {
		return driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_Btn_ExtGiftMem_AlternatePayment']"));
	}

	public static WebElement btnProceedToPayment() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Btn_EditAccountInfo_Payment']"));
	}

	public static WebElement btnCancel() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Btn_EditAccountInfo_Cancel']"));
	}

	public static WebElement lnkDeliveryType() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Delivery']"));
	}

	public static WebElement lnkBottlesandVariety() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_BottlesAndClub']"));
	}
	public static WebElement readonlytxtErrorforImmediateChanges() {
		return driver.findElement(By.xpath("//*[text()='These membership changes are not allowed. Please contact M&GS for this change.']"));
	}
	


// Each Object Performance Method	
// New Member

	public void ClickPickUP() throws IOException {
		clickOnButton(rbtnDeliveryTypePickUp(), "Pick Up");
	}

	public void ClickDelivery() throws IOException {
		clickOnButton(rbtnDeliveryTypeDelivery(), "Delivery");
	}

	public void ClickVariety() throws IOException {
		clickOnButton(rbtnVariety(), "Variety");
	}

	public void ClickWhite() throws IOException {
		clickOnButton(rbtnWhite(), "White");
	}

	public void ClickRed() throws IOException {
		clickOnButton(rbtnRed(), "Red");
	}

	public void ClickSweet() throws IOException {
		clickOnButton(rbtnSweet(), "Sweet");
	}

	public void ClickImmediately() throws IOException {
		clickOnButton(rbtnImmediatly(), "Immediatly");
	}

	public void ClickNextBillingCycle() throws IOException {
		clickOnButton(rbtnNextBillingCycle(), "Next Billing Cycle");
	}

	public void ClickBottle1() throws IOException {
		clickOnButton(rbtn1Bottle(), "1 Bottle");
	}

	public void ClickBottle2() throws IOException {
		clickOnButton(rbtn2Bottles(), "2 Bottle");
	}

	public void ClickonUseCardonFile() throws IOException {
		clickOnButton(btnUseCardonFile(), "Use Card on file");
	}

	public void ClickonCancel(int row) throws IOException {
		clickOnButton(btnCancel(), "Back");
	}

	public void ClickDeliveryTypehyperlink() throws IOException {
		clickOnLink(lnkDeliveryType(), "Pick Up");
	}

	public void ClickBottlesandVarietylink() throws IOException {
		clickOnLink(lnkBottlesandVariety(), "No. of Bottles and Club Variety");
	}

// Logic Methods
//Radio Buttons Selection

//Select Delivery Type

	public void SelectDeliveryType(int row) throws IOException {

		if (data.Getdata("Delivery", row).equalsIgnoreCase("Pickup")) {
			ClickPickUP();
		}

		else if (data.Getdata("Delivery", row).equalsIgnoreCase("Delivery")) {
			ClickDelivery();
		}
	}

	// Select Club Type

	public void SelectClubType(int row) throws IOException {

		if (data.Getdata("Club Type", row).equalsIgnoreCase("Variety")) {
			ClickVariety();
		}

		else if (data.Getdata("Club Type", row).equalsIgnoreCase("White")) {
			ClickWhite();
		}

		else if (data.Getdata("Club Type", row).equalsIgnoreCase("Sweet")) {
			ClickSweet();
		}

		else if (data.Getdata("Club Type", row).equalsIgnoreCase("Red")) {
			ClickRed();
		}
	}

	// Select Charge Date

	public void SelectChargeDate(int row) throws IOException {

		if (data.Getdata("Charge Date", row).trim().equalsIgnoreCase("Immediately")) {
			ClickImmediately();
		}

		else if (data.Getdata("Charge Date", row).trim().equalsIgnoreCase("Next Billing Cycle")) {
			ClickNextBillingCycle();
		}
	}

	// Select Bottles

	public void SelectNoOfBottle(int row) throws IOException {

		if (data.Getdata("# of Bottles", row).trim().equalsIgnoreCase("1")) {
			ClickBottle1();
		}

		else if (data.Getdata("# of Bottles", row).trim().equalsIgnoreCase("2")) {
			ClickBottle2();
		}
	}

	// Enter Shipping Information

	public void SelectState(int row) throws IOException {

		String State = data.Getdata("Home State/Province", row);
		if (State.length() > 2) {
			State = data.Getdata("Home State/Province", row).substring(0, 2).toUpperCase();
		}
		selectByText(dpdShippingState(), "State", State);

	}

	public void Entercity(int row) throws IOException {
		enterText(txtShippingCity(), "City", data.Getdata("Home City", row));
	}

	public void EnterStreet(int row) throws IOException {
		enterText(txtShippingStreet(), "Street", data.Getdata("Home Street", row));
	}

	public void EnterZip(int row) throws IOException {
		enterText(txtShippingZip(), "Zip", data.Getdata("Home Zip/Postal Code", row));
	}

	public void verifyErrorMessageforImmediateChanges( ) throws IOException {
		verifyTextEqual(readonlytxtErrorforImmediateChanges(), "These membership changes are not allowed. Please contact M&GS for this change.", "Changes in Membership Immediately");
	}
	
// Actual Functional Method

	public void ChangeDeliveryNextBillingCycle(int row) throws IOException, BiffException {
		Menu.ClickAccountsInfo();
try {
	if (lnkDeliveryType().getText().equals("Pickup")) {
		ClickDeliveryTypehyperlink();
		rbtnDeliveryTypeDelivery().click();
		Entercity(row);
		SelectState(row);
		EnterStreet(row);
		EnterZip(row);
		ClickNextBillingCycle();
		clickOnButton(btnSaveWCInformation(), "Save");
		verifyTextEqual(Page_WinePickUp.readonlyConfirmationMessage(), "Wine Club Information Updated Successfully.", "Next Bill changes in WineClub Info");

		//ClickonUseCardonFile();

	}
	else {
		ClickDeliveryTypehyperlink();
		rbtnDeliveryTypePickUp().click();
		clickOnButton(btnSaveWCInformation(), "Save");
		verifyTextEqual(Page_WinePickUp.readonlyConfirmationMessage(), "Wine Club Information Updated Successfully.", "Next Bill changes in WineClub Info");

	}
} catch (Exception e) {
	System.out.println("Element not displyed");
}
		
	}

	public void Changeclubtypenextbillingcycle(int row) throws IOException, BiffException {
		Menu.ClickAccountsInfo();
		ClickBottlesandVarietylink();
		SelectClubType(row);
		ClickNextBillingCycle();
		
		clickOnButton(btnSaveWCInformation(), "Save");
		verifyTextEqual(Page_WinePickUp.readonlyConfirmationMessage(), "Wine Club Information Updated Successfully.", "Next Bill changes in WineClub Info");
	
		
	}

	public void decreasedClubTypeMemberCostNextBillingCycle() throws IOException {
		Menu.ClickAccountsInfo();
		ClickBottlesandVarietylink();
		if (rbtnVariety().isSelected() || rbtnRed().isSelected() || rbtnWhite().isSelected()) {
			ClickSweet();
		} else {
			ResultsLog.ReportFail(driver, "Make Sure You have correct Test Data",
					"Cannot Perform the Decreased Cost for Variety Club as it is already having Lowest Cost");
			System.out.println("Cannot Perform the Decreased Cost for Variety Club as it is already having Lowest Cost");
			
		}
		ClickNextBillingCycle();
		clickOnButton(btnSaveWCInformation(), "Save");
		verifyTextEqual(Page_WinePickUp.readonlyConfirmationMessage(), "Wine Club Information Updated Successfully.", "Next Bill changes in WineClub Info");

	}

	public void increasedClubTypeMemberCostNextBillingCycle() throws IOException {
		Menu.ClickAccountsInfo();
		ClickBottlesandVarietylink();
		if (rbtnSweet().isSelected()) {
			ClickVariety();
		} else {
			ResultsLog.ReportFail(driver, "Make Sure You have correct Test Data",
					"Cannot Perform the Increased Cost for Variety Club as it is already having Higher Cost");
			System.out.println("Cannot Perform the Increased Cost for Variety Club as it is already having higher Cost");
		}
		ClickNextBillingCycle();
		clickOnButton(btnSaveWCInformation(), "Save");
		verifyTextEqual(Page_WinePickUp.readonlyConfirmationMessage(), "Wine Club Information Updated Successfully.", "Next Bill changes in WineClub Info");

	}

	public void Changebottle1to2immediately() throws IOException, BiffException {
		Menu.ClickAccountsInfo();
		ClickBottlesandVarietylink();
		if (rbtn1Bottle().isSelected()) {
			ClickBottle2();
			ClickImmediately();
			ClickonUseCardonFile();
	 		verifyTextEqual(Page_WinePickUp.readonlyConfirmationORWarningMessage(), "These membership changes are not allowed. Please contact M&GS for this change.", "Immediate changes in WineClub Info");
		} else {
			ResultsLog.ReportInfo(driver,  
					"Cannot change from 1 to 2  as it is already bottle 2");
			System.out.println("Cannot Perform the Decreased Cost for Variety as it is already bottle 2 membership");
		}
		

	}

	public void Changebottle2to1immediately() throws IOException, BiffException {
		Menu.ClickAccountsInfo();
		ClickBottlesandVarietylink();
		if (rbtn2Bottles().isSelected()) {
			ClickBottle1();
			ClickImmediately();
			ClickonUseCardonFile();
	 		verifyTextEqual(Page_WinePickUp.readonlyConfirmationORWarningMessage(), "These membership changes are not allowed. Please contact M&GS for this change.", "Immediate changes in WineClub Info");
		} else {
			ResultsLog.ReportInfo(driver,  
					"Cannot change from 2 to 1  as it is already bottle 1");
			System.out.println("Cannot Perform the Decreased Cost for Variety as it is already bottle 1 membership");
		}
		
	}

	public void Changebottle1to2nextBillingCycle() throws IOException, BiffException {
		Menu.ClickAccountsInfo();
		ClickBottlesandVarietylink();
		if (rbtn1Bottle().isSelected()) {
			ClickBottle2();
		} else {
			ResultsLog.ReportInfo(driver,   
					"Cannot change from 1 to 2  as it is already bottle 2");
			System.out.println("Cannot Perform the Decreased Cost for Variety as it is already bottle 2 membership");
		}
		ClickNextBillingCycle();
		clickOnButton(btnSaveWCInformation(), "Save");
		verifyTextEqual(Page_WinePickUp.readonlyConfirmationMessage(), "Wine Club Information Updated Successfully.", "Immediate changes in WineClub Info");

		 
		
	}

	public void Changebottle2to1nextBillingCycle() throws IOException, BiffException {
		Menu.ClickAccountsInfo();
		ClickBottlesandVarietylink();
		if (rbtn2Bottles().isSelected()) {
			ClickBottle1();
		} else {
			ResultsLog.ReportInfo(driver,  
					"Cannot change from 2 to 1  as it is already bottle 1");
			System.out.println("Cannot Perform the Decreased Cost for Variety as it is already bottle 1 membership");
		}
		ClickNextBillingCycle();
		clickOnButton(btnSaveWCInformation(), "Save");
		ClickonUseCardonFile();
	 
	}

	
	

}
