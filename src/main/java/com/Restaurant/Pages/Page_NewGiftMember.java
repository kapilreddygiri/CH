package com.Restaurant.Pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Restaurant.CommonPages.Resaurant_Menu;
import com.Restaurant.PageData.Restaurant_SignUpPagedata;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class Page_NewGiftMember extends BasePages {
	static String newCardNumber = null;

	static Restaurant_SignUpPagedata data = new Restaurant_SignUpPagedata();
	Resaurant_Menu Menu = new Resaurant_Menu();

	public Page_NewGiftMember() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

// Objects from Application	
// New Gift Member Page

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

	public static WebElement rbtn1Bottle() {
		return driver.findElement(By.xpath("//*[@value='1']"));
	}

	public static WebElement rbtn2Bottles() {
		return driver.findElement(By.xpath("//*[@value='2']"));
	}

	public static WebElement rbtnDurationofGift3() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_DurationRadioList_0'][@value='3']"));
	}

	public static WebElement rbtnDurationofGift6() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_DurationRadioList_1'][@value='6']"));
	}

	public static WebElement rbtnDurationofGift12() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_DurationRadioList_2'][@value='12']"));
	}

	public static WebElement readonlyMembershipCost() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_CostLable']"));
	}

	public static WebElement btnDeliveryTypePickUp() {
		return driver.findElement(By.xpath("//*[@value='Pickup']"));
	}

	public static WebElement btnDeliveryTypeDelivery() {
		return driver.findElement(By.xpath("//*[@value='Delivery']"));
	}

	public static WebElement btnMicrosPayment() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Btn_AlternatePayment']"));
	}

	public static WebElement btnCancel() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Btn_CancelGiftMemberCreation']"));
	}

// Each Object Performance Method	
// New Member

	public void ClickPickUP() throws IOException {
		clickOnButton(btnDeliveryTypePickUp(), "Pick-Up");
	}

	public void ClickDelivery() throws IOException {
		clickOnButton(btnDeliveryTypeDelivery(), "Delivery");
	}

	public void EnterCardNumber(int row) throws IOException, BiffException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		// cal.add(Calendar.MONTH, 0);
		Date d = cal.getTime();
		String todayDate = sdf.format(d);

		System.out.println(todayDate);
		enterText(txtCardNumber(), "Card Number", cardnumber());
		data.setData("Card Number", row, EnteredCardNumber);
		newCardNumber = EnteredCardNumber;
		data.setData("Card Generated Date", row, todayDate);
		//data.flushExcel();
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

	public void ClickDuration3() throws IOException {
		clickOnButton(rbtnDurationofGift3(), "3");
	}

	public void ClickDuration6() throws IOException {
		clickOnButton(rbtnDurationofGift6(), "6");
	}

	public void ClickDuration12() throws IOException {
		clickOnButton(rbtnDurationofGift12(), "12");
	}

	public void ClickonMicrosPayment(int row) throws IOException {
		clickOnButton(btnMicrosPayment(), "Micros Payment");
	}

	public void ClickonBack(int row) throws IOException {
		clickOnButton(btnCancel(), "Cancel");
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

	public void SelectDurationofMembership(int row) throws IOException {

		if (data.Getdata("Duration of Membership", row).trim().equalsIgnoreCase("3")) {
			ClickDuration3();
		}

		else if (data.Getdata("Duration of Membership", row).trim().equalsIgnoreCase("6")) {
			ClickDuration6();
		} else {
			ClickDuration12();
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

// Actual Functional Method

	public void EnterNewGiftMember(int row) throws IOException, BiffException, InterruptedException {
 		Thread.sleep(10000);
 		 
		Menu.ClickNEWGIFTMEMBER();
		SelectDeliveryType(row);
		EnterCardNumber(row);
		SelectClubType(row);
		SelectNoOfBottle(row);
		VerifyMembershipCost(row);
		SelectDurationofMembership(row);
		ClickonMicrosPayment(row);
		Thread.sleep(3000);
	

	}

}
