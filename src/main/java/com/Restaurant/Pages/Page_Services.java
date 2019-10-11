package com.Restaurant.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Restaurant.CommonPages.Resaurant_Menu;
import com.Restaurant.PageData.Restaurant_SignUpPagedata;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;

public class Page_Services extends BasePages {

	static Restaurant_SignUpPagedata data = new Restaurant_SignUpPagedata();
	Resaurant_Menu Menu = new Resaurant_Menu();

	public Page_Services() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

// Objects from Application	
// Services

	public static WebElement rbtnPrimaryMember() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Radio_Help_Note_0']"));
	}

	public static WebElement rbtnSecondaryMember() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Radio_Help_Note_1']"));
	}

	public static WebElement btnReplacePersonalizedWCCard() {
		return driver.findElement(By.xpath(
				"//*[@name='ctl00$ContentPlaceHolder1$Btn_Submit'][@value='Replace Personalized WC Card (Mailed)']"));
	}

	public static WebElement txtCardNumber() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Txt_CardNumber']"));
	}

	public static WebElement btnUpdateWCCardNumber() {
		return driver.findElement(By.xpath(
				"//*[@name='ctl00$ContentPlaceHolder1$Btn_UpdateWCCardNumber'][@value='Update WC Card Number (In Restaurant)']"));
	}

	public static WebElement txtNotes() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Txt_OtherNotes']"));
	}

	public static WebElement btnAddNotetoWCMemberAcccount() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Button2']"));
	}

// Each Object Performance Method	

	public void PrimaryNumber() {
		rbtnPrimaryMember().click();
	}

	public void SecondaryMember() {
		rbtnSecondaryMember().click();
	}

	public void AddtextNotes(int row) throws IOException {
		enterText(txtNotes(), "Notes", data.Getdata("Notes", row));
		//txtNotes().sendKeys("CoopersHawk");
	}

	public void ClickAddNotestoWCMemebrAccount() throws IOException {
		clickOnButton(btnAddNotetoWCMemberAcccount(), "Add Note to WC Member Acccount");

	}

	public void ReplacePersonalizedWCCard() {
		btnReplacePersonalizedWCCard().click();
	}

	public void UpdateWCCardNumber(int row) throws IOException {
//here we need to apply the logic of entering the card number from excel
		enterText(txtCardNumber(), "Card Number", data.Getdata("Card Number", row));
		btnUpdateWCCardNumber().click();
	}

// Logical Method

// Actual Functional methods
	public void AddNotes(int row) throws IOException {
		Menu.ClickServices();
		AddtextNotes(row);
		ClickAddNotestoWCMemebrAccount();

	}
	//(//*[contains(text(),'Card Number')])[2]/following-sibling::td/child::input

	public void ReplacePersonalizedWCCardMAILED(int row) throws IOException, InterruptedException {
		Menu.ClickServices();
		enterText(txtCardNumber(), "Card Number", data.Getdata("Replace Personalized WC Card", row));
		Thread.sleep(2000);
		ReplacePersonalizedWCCard();
	}

	public void UpdateWCCardNumberINRESTAURANT(int row) throws IOException, InterruptedException {
		Menu.ClickServices();
		enterText(txtCardNumber(), "Card Number", data.Getdata("Update WC Card Number", row));
		Thread.sleep(2000);
		UpdateWCCardNumber(row);
	}
	

}
