package com.Communities.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Communities.PagesData.CommunitiesMember_SignUpPagedata;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;

public class CMUPage_Monthly extends BasePages {

	CommunitiesMember_SignUpPagedata data = new CommunitiesMember_SignUpPagedata();

	public CMUPage_Monthly() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
// Objects from Application
// Wine Club Information
	
	public static WebElement readonly_CostOfmembership() {
		return driver.findElement(By.xpath("//*[@class='col-5']"));

	}
	
	public static WebElement rdbn_1MonthlyBottle() {
		return driver.findElement(By.xpath("//*[@name='CHW_Level__c'][@value='1']"));

	}

	public static WebElement rdbn_2MonthlyBottle() {
		return driver.findElement(By.xpath("//*[@name='CHW_Level__c'][@value='2']"));

	}

	public static WebElement rdbn_VarietyClub() {
		return driver.findElement(By.xpath("//*[@name='CHW_Club_Type__c'][@value='Variety']"));

	}

	public static WebElement rdbn_RedClub() {
		return driver.findElement(By.xpath("//*[@name='CHW_Club_Type__c'][@value='Red']"));

	}

	public static WebElement rdbn_WhiteClub() {
		return driver.findElement(By.xpath("//*[@name='CHW_Club_Type__c'][@value='White']"));

	}

	public static WebElement rdbn_SweetClub() {
		return driver.findElement(By.xpath("//*[@name='CHW_Club_Type__c'][@value='Sweet']"));

	}

	public static WebElement rdbn_RestaurantPickup() {
		return driver.findElement(By.xpath("//*[@name='CHW_Delivery__c'][@value='Pickup']"));

	}

	public static WebElement rdbn_QuarterlyDelivery() {
		return driver.findElement(By.xpath("//*[@name='CHW_Delivery__c'][@value='Delivery']"));

	}

// Objects from Application	
// Member Information

	public static WebElement txt_FirstName() {
		return driver.findElement(By.id("FirstName"));
	}

	public static WebElement txt_LastName() {
		return driver.findElement(By.id("LastName"));
	}

	public static WebElement txt_Birthdate() {
		return driver.findElement(By.id("Birthdate"));
	}

// Objects from Application	
// Contact Information

	public static WebElement txt_Phone() {
		return driver.findElement(By.id("Phone"));
	}

	public static WebElement txt_Email() {
		return driver.findElement(By.id("Email"));
	}

// Objects from Application	
// Home Address

	public static WebElement txt_MailingStreet() {
		return driver.findElement(By.id("MailingStreet"));
	}

	public static WebElement txt_MailingCity() {
		return driver.findElement(By.id("MailingCity"));
	}

	public static WebElement dpd_MailingState() {
		return driver.findElement(By.id("MailingState"));
	}

	public static WebElement txt_MailingPostalCode() {
		return driver.findElement(By.id("MailingPostalCode"));
	}

// Objects from Application	
// Shipping Address

	public static WebElement txt_ShippingStreet() {
		return driver.findElement(By.id("OtherStreet"));
	}

	public static WebElement txt_ShippingCity() {
		return driver.findElement(By.id("OtherCity"));
	}

	public static WebElement dpd_ShippingState() {
		return driver.findElement(By.id("OtherState"));
	}

	public static WebElement txt_MShippingPostalCode() {
		return driver.findElement(By.id("OtherPostalCode"));
	}

// Objects from Application	
// Submit Section	

	public static WebElement btn_ProceedtoPayment() {
		return driver.findElement(By.id("proceed_to_payment"));
	}

// Each Object Performance Method	
// Wine Club Information
	
	
	public void Click1MonthlyBottle(int row) throws IOException, BiffException {
		clickOnButton(rdbn_1MonthlyBottle(), " 1 Monthly Bottle");
	}

	public void Click2MonthlyBottle(int row) throws IOException, BiffException {
		clickOnButton(rdbn_2MonthlyBottle(), " 2 Monthly Bottle");
	}

	public void ClickVarietyClub(int row) throws IOException, BiffException {
		clickOnButton(rdbn_VarietyClub(), " Variety Club");
	}

	public void ClickRedClub(int row) throws IOException, BiffException {
		clickOnButton(rdbn_RedClub(), " Red Club");
	}

	public void ClickWhiteClub(int row) throws IOException, BiffException {
		clickOnButton(rdbn_WhiteClub(), " White Club");
	}

	public void ClickSweetClub(int row) throws IOException, BiffException {
		clickOnButton(rdbn_SweetClub(), " Sweet Club");
	}

	public void ClickRestaurantPickup(int row) throws IOException, BiffException {
		clickOnButton(rdbn_RestaurantPickup(), " Restaurant Pickup");
	}

	public void ClickQuarterlyDelivery(int row) throws IOException, BiffException {
		clickOnButton(rdbn_QuarterlyDelivery(), " Quarterly Delivery");
	}
	public void ValidateCostOfMembership(int row) throws IOException, BiffException {
		verifyTextEqual(readonly_CostOfmembership(),  data.Getdata("Cost of Membership", row).trim(), " Cost of MemberShip");
		
	}
	

// Each Object Performance Method	
// Member Information	

	public void EnterFirstName(int row) throws IOException, BiffException {
		enterText(txt_FirstName(), "First Name", data.Getdata("First Name", row).trim());
	}

	public void EnterLastName(int row) throws IOException, BiffException {
		enterText(txt_LastName(), "Last Name", data.Getdata("Last Name", row).trim());
	}

	public void EnterBirthdate(int row) throws IOException, BiffException {
		enterTextWithoutClearing(txt_Birthdate(), "Birthdate", FormatDate1(data.Getdata("Birthdate", row).trim()));
	}

// Each Object Performance Method	
// Contact Information

	public void EnterPhone(int row) throws IOException, BiffException {
		enterText(txt_Phone(), "Phone Number", data.Getdata("Phone", row).trim());
	}

	public void EnterEmail(int row) throws IOException, BiffException {
		enterText(txt_Email(), "Email", data.Getdata("Email", row).trim());
	}

// Each Object Performance Method	
// Home Address

	public void EnterHomeStreet(int row) throws IOException, BiffException {
		enterText(txt_MailingStreet(), "Home Street", data.Getdata("Home Street", row).trim());
	}

	public void EnterHomeCity(int row) throws IOException, BiffException {
		enterText(txt_MailingCity(), "Home City", data.Getdata("Home City", row).trim());
	}

	public void SelectHomeState(int row) throws IOException, BiffException {

		selectByText(dpd_MailingState(), "Home State", data.Getdata("Home State/Province", row).trim());
	}

	public void EnterHomeZipCode(int row) throws IOException, BiffException {
		enterText(txt_MailingPostalCode(), "Home Zip Code", data.Getdata("Home Zip/Postal Code", row).trim());
	}

// Each Object Performance Method	
// Shipping Address

	public void EnterShippingStreet(int row) throws IOException, BiffException {
		enterText(txt_ShippingStreet(), "Shipping Street", data.Getdata("Shipping Street", row).trim());
	}

	public void EnterShippingCity(int row) throws IOException, BiffException {
		enterText(txt_ShippingCity(), "Shipping City", data.Getdata("Shipping City", row).trim());
	}

	public void SelectShippingState(int row) throws IOException, BiffException {
		selectByText(dpd_ShippingState(), "Shipping State", data.Getdata("Shipping State/Province", row).trim());
	}

	public void EnterShippingZipCode(int row) throws IOException, BiffException {
		enterText(txt_MShippingPostalCode(), "Shipping Zip Code", data.Getdata("Shipping Zip/Postal Code", row).trim());
	}

// Each Object Performance Method	
// Submit Section
	public void Click1ProceddtoPaymente() throws IOException, BiffException {
		clickOnButton(btn_ProceedtoPayment(), " Proceed to Payment");
	}
// Logic Methods

	public void SelectMonthlyBottles(int row) throws IOException, BiffException {
		if (data.Getdata("# of Bottles", row).trim().equalsIgnoreCase("1")) {
			Click1MonthlyBottle(row);
		} else if (data.Getdata("# of Bottles", row).trim().equalsIgnoreCase("2")) {
			Click2MonthlyBottle(row);
		}

	}

	public void SelectClubType(int row) throws IOException, BiffException {
		if (data.Getdata("Club Type", row).trim().equalsIgnoreCase("Variety")) {
			ClickVarietyClub(row);

		} else if (data.Getdata("Club Type", row).trim().equalsIgnoreCase("Red")) {
			ClickRedClub(row);

		} else if (data.Getdata("Club Type", row).trim().equalsIgnoreCase("White")) {
			ClickWhiteClub(row);
		}

		else if (data.Getdata("Club Type", row).trim().equalsIgnoreCase("Sweet")) {
			ClickSweetClub(row);
		}

	}

	public void SelectDeliveryType(int row) throws BiffException, IOException {
		if (data.Getdata("Delivery", row).trim().equalsIgnoreCase("Pickup")) {
			ClickRestaurantPickup(row);
		} else if (data.Getdata("Delivery", row).trim().equalsIgnoreCase("Delivery")) {
			ClickQuarterlyDelivery(row);
		}

	}

	public void EnterHome_ShipingAddress(int row) throws BiffException, IOException {

		EnterHomeStreet(row);
		EnterHomeCity(row);
		SelectHomeState(row);
		EnterHomeZipCode(row);
		if (data.Getdata("Delivery", row).trim().equalsIgnoreCase("Delivery")) {

			EnterShippingStreet(row);
			EnterShippingCity(row);
			SelectShippingState(row);
			EnterShippingZipCode(row);
		}

	}

// Actual functional Method	

	public void EnterWineClubInformation(int row) throws IOException, BiffException {
		SelectMonthlyBottles(row);
		SelectClubType(row);
		SelectDeliveryType(row);
		EnterFirstName(row);
		EnterLastName(row);
		EnterBirthdate(row);
		EnterPhone(row);
		EnterEmail(row);
		EnterHome_ShipingAddress(row);
	//	ValidateCostOfMembership(row);
		Click1ProceddtoPaymente();
	}

}
