package com.Communities.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Communities.CommonPages.CMUPage_Menu;
import com.Communities.PagesData.CommunitiesMember_SignUpPagedata;
import com.Utils.BasePages;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class CMUPage_Profile extends BasePages {

	CommunitiesMember_SignUpPagedata data = new CommunitiesMember_SignUpPagedata();
	CMUPage_Menu MenuPage = new CMUPage_Menu();

	public CMUPage_Profile() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

// Objects from Application
// Profile
	public static WebElement readonly_CostofMemberShip() {
		return driver.findElement(By.xpath("//*[@id='CHW_Cost_of_Membership__c']"));

	}

	public static WebElement readonly_Phone() {
		return driver.findElement(By.xpath("//*[@id='Phone']"));

	}

	public static WebElement readonly_Email() {
		return driver.findElement(By.xpath("//*[@id='Email']"));

	}

	public static WebElement readonly_Street() {
		return driver.findElement(By.xpath("//*[@id='MailingStreet']"));

	}

	public static WebElement readonly_City() {
		return driver.findElement(By.xpath("//*[@id='MailingCity']"));

	}

	public static WebElement readonly_State() {
		return driver.findElement(By.xpath("//*[@id='MailingState']"));

	}

	public static WebElement readonly_ZipCode() {
		return driver.findElement(By.xpath("//*[@id='MailingPostalCode']"));

	}

	public static WebElement readonly_FirstName() {
		return driver.findElement(By.xpath("//*[@id='FirstName']"));

	}

	public static WebElement readonly_LastNAme() {
		return driver.findElement(By.xpath("//*[@id='LastName']"));

	}

	public static WebElement readonly_Birthdate() {
		return driver.findElement(By.xpath("//*[@id='Birthdate']"));

	}

	public static WebElement readonly_ShipStreet() {
		return driver.findElement(By.xpath("//*[@id='OtherStreet']"));

	}

	public static WebElement readonly_ShipCity() {
		return driver.findElement(By.xpath("//*[@id='OtherCity']"));

	}

	public static WebElement readonly_ShipState() {
		return driver.findElement(By.xpath("//*[@id='OtherState']"));

	}

	public static WebElement readonly_ShipZipCode() {
		return driver.findElement(By.xpath("//*[@id='OtherPostalCode']"));

	}
	public WebElement btnRejoinClub() {
		return driver.findElement(By.xpath("(//*[contains(text(),'Rejoin Club')])[2]"));

	}
	public WebElement chkboxMemberSignatureOptOut() {
		return driver.findElement(By.xpath("//*[text()=' Member Signature Opt Out']/child::input"));

	}
	public WebElement rbtn1MonthlyBottle() {
		return driver.findElement(By.xpath("//*[@name='CHW_Level__c'][@value='1']"));

	}
	public WebElement rbtn2MonthlyBottles() {
		return driver.findElement(By.xpath("//*[@name='CHW_Level__c'][@value='2']"));

	}
	
	public WebElement btnUpdateProfile() {
		return driver.findElement(By.xpath("//*[text()='Update Profile']"));

	}
	

	// Each Object Performance Method
	// Payment CC Info

	public void ValidateCostofMembership(int row) throws IOException {
		String ExpectedCost = "$ " + data.Getdata("Cost of Membership", row).trim();
		verifyTextEqualwithAttributeValue(readonly_CostofMemberShip(), ExpectedCost, "Valididate Cost of Membership");

	}

	public void ValidatePhone(int row) throws IOException {
		verifyTextEqualwithAttributeValue(readonly_Phone(), data.Getdata("Phone", row).trim(), "Valididate Phone");

	}

	public void ValidateEmail(int row) throws IOException {
		verifyTextEqualwithAttributeValue(readonly_Email(), data.Getdata("Email", row).trim(), "Valididate Email");

	}

	public void ValidateStreet(int row) throws IOException {
		verifyTextEqualwithAttributeValue(readonly_Street(), data.Getdata("Home Street", row).trim(),
				"Valididate Street");

	}

	public void ValidateCity(int row) throws IOException {
		verifyTextEqualwithAttributeValue(readonly_City(), data.Getdata("Home City", row).trim(), "Valididate City");

	}

	public void ValidateState(int row) throws IOException {
		verifyTextEqualwithAttributeValue(readonly_State(), data.Getdata("Home State/Province", row).trim(),
				"Valididate State");

	}

	public void ValidateZipCode(int row) throws IOException {
		verifyTextEqualwithAttributeValue(readonly_ZipCode(), data.Getdata("Home Zip/Postal Code", row).trim(),
				"Valididate Postal Code");

	}

	public void ValidateFirstName(int row) throws IOException {
		verifyTextEqualwithAttributeValue(readonly_FirstName(), data.Getdata("First Name", row).trim(),
				"Valididate First Name");

	}

	public void ValidateLastName(int row) throws IOException {
		verifyTextEqualwithAttributeValue(readonly_LastNAme(), data.Getdata("Last Name", row).trim(),
				"Valididate Last Name");

	}

	public void ValidateBirthDate(int row) throws IOException {
		verifyTextEqualwithAttributeValue(readonly_Birthdate(), data.Getdata("Birthdate", row).trim(),
				"Valididate Birthdate");

	}

	public void ValidateShipStreet(int row) throws IOException {
		verifyTextEqualwithAttributeValue(readonly_ShipStreet(), data.Getdata("Home Street", row).trim(),
				"Valididate Ship Street");

	}

	public void ValidateShipCity(int row) throws IOException {
		verifyTextEqualwithAttributeValue(readonly_ShipCity(), data.Getdata("Home City", row).trim(),
				"Valididate Ship City");

	}

	public void ValidateShipState(int row) throws IOException {
		verifyTextEqualwithAttributeValue(readonly_ShipState(), data.Getdata("Home State/Province", row).trim(),
				"Valididate Ship State");

	}

	public void ValidateShipZipCode(int row) throws IOException {
		verifyTextEqualwithAttributeValue(readonly_ShipZipCode(), data.Getdata("Home Zip/Postal Code", row).trim(),
				"Valididate Ship Postal Code");

	}

	public void ValidateShippingAddress(int row) throws IOException {
		if (data.Getdata("Home Zip/Postal Code", row).trim().equalsIgnoreCase("Delivery")) {
			ValidateShipStreet(row);
			ValidateShipCity(row);
			ValidateShipState(row);
			ValidateShipZipCode(row);
		}
	}
	public void memberSignatureOptOut() throws IOException, InterruptedException {
		MenuPage.ClickProfile();
		Thread.sleep(2000);
		if(chkboxMemberSignatureOptOut().isDisplayed()&&!chkboxMemberSignatureOptOut().isSelected()) {
			clickOnCheckBox(chkboxMemberSignatureOptOut(), "Member Signature Opt Out");
			clickOnButton(btnUpdateProfile(), "Update Profile");
		}
			}
	public void memberSignatureOptIn() throws IOException, InterruptedException {
		MenuPage.ClickProfile();
		Thread.sleep(2000);
		if(chkboxMemberSignatureOptOut().isDisplayed()&&chkboxMemberSignatureOptOut().isSelected()) {
			clickOnCheckBox(chkboxMemberSignatureOptOut(), "Member Signature Opt Out");
			clickOnButton(btnUpdateProfile(), "Update Profile");
		}
			}
	public void change1to2Bottlesimmediately() throws IOException, InterruptedException {
		MenuPage.ClickProfile();
		Thread.sleep(2000);
		if(rbtn2MonthlyBottles().isDisplayed()&&!rbtn2MonthlyBottles().isSelected()) {
			clickOnButton(rbtn2MonthlyBottles(), "1 to 2 Bottles");
			clickOnButton(btnUpdateProfile(), "Update Profile");
			driver.switchTo().alert().accept();
		}
			}
	public void change2to1Bottleimmediately() throws IOException, InterruptedException {
		MenuPage.ClickProfile();
		Thread.sleep(2000);
		if(rbtn1MonthlyBottle().isDisplayed()&&!rbtn1MonthlyBottle().isSelected()) {
			clickOnButton(rbtn1MonthlyBottle(), "2 to 1 Bottle");
			clickOnButton(btnUpdateProfile(), "Update Profile");
			 
		}
			}
// Should work on Radio Button Checked  Status 

	// Actual Functional Method

	public void ValidateProfile(int row) throws IOException, InterruptedException {

		MenuPage.ClickProfile();
		ValidateCostofMembership(row);
		ValidatePhone(row);
		ValidateEmail(row);
		ValidateStreet(row);
		ValidateCity(row);
		ValidateState(row);
		ValidateZipCode(row);
		ValidateFirstName(row);
		ValidateLastName(row);
		//ValidateBirthDate(row);
		ValidateShippingAddress(row);

	}

}
