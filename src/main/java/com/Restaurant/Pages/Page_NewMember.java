package com.Restaurant.Pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Restaurant.CommonPages.Resaurant_Menu;
import com.Restaurant.PageData.Restaurant_SignUpPagedata;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;

public class Page_NewMember extends BasePages {

	static Restaurant_SignUpPagedata data = new Restaurant_SignUpPagedata();
	Resaurant_Menu Menu = new Resaurant_Menu();

	public  Page_NewMember() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

// Objects from Application	
// Member Search

	public static WebElement btnPickUp() {
		return driver.findElement(By.xpath("//*[@value='Pick-Up']"));
	}
	public static WebElement rbtnPickUp() {
		return driver.findElement(By.xpath("//*[@value='Pickup']"));
	}

	public static WebElement btnDelivery() {
		return driver.findElement(By.xpath("//*[@value='Delivery']"));
	}
	public static WebElement rbtnDelivery() {
		return driver.findElement(By.xpath("//*[@value='Delivery']"));
	}
	public static WebElement rbtnDurationofGift3() {
		return driver.findElement(By.xpath("//input[@value='3']"));
	}
	public static WebElement rbtnDurationofGift6() {
		return driver.findElement(By.xpath("//input[@value='6']"));
	}
	public static WebElement rbtnDurationofGift12() {
		return driver.findElement(By.xpath("//input[@value='12']"));
	}

	public static WebElement txtCardNumber() {
		return driver.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$MemberNumber']"));
	}

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

	public static WebElement rbtn1Bottle() {
		return driver.findElement(By.xpath("//*[@value='1']"));
	}

	public static WebElement rbtn2Bottles() {
		return driver.findElement(By.xpath("//*[@value='2']"));
	}

	public static WebElement readonlyMembershipCost() {
		return driver.findElement(By.xpath("//span[@id='ContentPlaceHolder1_CostLable']"));
	}

	public static WebElement readonlyDeliveryType() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_DeliveryType']"));
	}

	public static WebElement btnProceedToPayment() {
		return driver.findElement(By.xpath("//*[@value='Proceed To Payment']"));
	}
	public static WebElement btnMicrosPayment() {
		return driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_Btn_AlternatePayment']"));
	}
	
	public static WebElement btnBack() {
		return driver.findElement(By.xpath("//*[@value='Back']"));
	}

// Each Object Performance Method	
// New Member

	public void ClickPickUP() throws IOException {
		clickOnButton(btnPickUp(), "Pick Up");
		
	}

	public void ClickDelivery() throws IOException {
		clickOnButton(btnDelivery(), "Delivery");
	}
	public void ClickrbtnPickUP() throws IOException {
		clickOnButton(rbtnPickUp(), "Pick Up");
		
	}

	public void ClickrbtnDelivery() throws IOException {
		clickOnButton(rbtnDelivery(), "Delivery");
	}

	public void EnterCardNumber(int row) throws IOException, BiffException {
		enterText(txtCardNumber(), "Card Number", cardnumber());
		data.setData("Card Number", row, EnteredCardNumber);
		
	}
	
	public void ClickDuration3() throws IOException {
		clickOnButton(rbtnDurationofGift3(), "3");
	}
	public void ClickDuration6() throws IOException {
		clickOnButton(rbtnDurationofGift6(), "6");
	}
	public void ClickDuration12() throws IOException {
		clickOnButton(rbtnDurationofGift12(), "12");
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

	public void ClickImmediatly() throws IOException {
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

	public void VerifyMembershipCost(int row) throws IOException {
		verifyTextEqual(readonlyMembershipCost(), formatAmountText(data.Getdata("Cost of Membership", row)),
				"Verify Membership Cost");
	}

	public void VerifyDeliveryType(int row) throws IOException {

		verifyTextEqualwithContains(readonlyDeliveryType(), data.Getdata("Delivery", row), "Verify Delivery Type");
	
	}

	public void ClickonProceedtoPayment(int row) throws IOException {
		clickOnButton(btnProceedToPayment(), "Proceed to Payment");
	}
	public void ClickonMicrosPayment(int row) throws IOException {
		clickOnButton(btnMicrosPayment(), "Micros Payment");
	}

	public void ClickonBack(int row) throws IOException {
		clickOnButton(btnBack(), "Back");
	}

// Logic Methods
//Radio Buttons Selection

//Select Deleviry Type

	public void SelectDeliveryType(int row) throws IOException {

		if (data.Getdata("Delivery", row).equalsIgnoreCase("Pickup")) {
			ClickPickUP();
		}

		else if (data.Getdata("Delivery", row).equalsIgnoreCase("Delivery")) {
			ClickDelivery();
		}
	}
	public void SelectradioDeliveryType(int row) throws IOException {

		if (data.Getdata("Delivery", row).equalsIgnoreCase("Pickup")) {
			ClickrbtnPickUP();
		}

		else if (data.Getdata("Delivery", row).equalsIgnoreCase("Delivery")) {
			ClickrbtnDelivery();
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
			ClickImmediatly();
		}

		else if (data.Getdata("Charge Date", row).trim().equalsIgnoreCase("Next Billing Cycle")) {
			ClickNextBillingCycle();
		}
	}
	
	
	//Select Duration of Membership
	

	// Select Bottles

	public void SelectNoOfBottle(int row) throws IOException {

		if (data.Getdata("# of Bottles", row).trim().equalsIgnoreCase("1")) {
			ClickBottle1();
		}

		else if (data.Getdata("# of Bottles", row).trim().equalsIgnoreCase("2")) {
			ClickBottle2();
		}
	}

	

// Actual Functional Method

	public void EnterNewMember(int row) throws IOException, BiffException {
		Menu.ClickNewMember();
		SelectDeliveryType(row);
		EnterCardNumber(row);
		SelectClubType(row);
		SelectChargeDate(row);
		SelectNoOfBottle(row);
		VerifyMembershipCost(row);
		VerifyDeliveryType(row);
		ClickonProceedtoPayment(row);

	}
	

}
