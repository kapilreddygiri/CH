package com.MGS.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.MGS.CommonPages.Page_NewMember;
import com.MGS.PagesData.Member_SignUpPagedata;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;

public class Page_PromotionEntry extends BasePages {

	Member_SignUpPagedata data = new Member_SignUpPagedata();
	String ExpectedPageHeading = "New Member";

	public Page_PromotionEntry() {

	}

	/*
	 * public Page_PromotionEntry(int frameid) {
	 * 
	 * try { driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * frameSwitch(frameid); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */

	// Heading of the Page
	public WebElement PageTitleObject() {

		return driver.findElement(By.xpath("//*[@class='pageType noSecondHeader']"));
	}

// Objects from Application
	// Wine Club Information
		public static WebElement txt_CardNumber() throws InterruptedException {
			return driver.findElement(By.xpath(
					"//*[text()='Card Number']/parent::th//following-sibling::td/child::div/child::input[@type='text']"));
		}

		public static WebElement txt_SignUpLocation() {
			return driver.findElement(By.xpath(
					"//*[text()='Sign Up Location']/parent::th//following-sibling::td/child::div/child::span/child::input"));
		}

		public static WebElement txt_FirstName() {
			return driver.findElement(By.xpath(
					"//*[text()='First Name']/parent::th//following-sibling::td/child::div/child::input[@type='text']"));
		}

		public static WebElement readTXT_MembershipType() {
			return driver.findElement(By.xpath("//*[text()='Membership Type']/following-sibling::td/child::span"));
		}

		public static WebElement readTXT_CostofMemberShip() {
			return driver.findElement(By.xpath("//*[text()='Cost of Membership']/following-sibling::td/child::span"));
		}
		public static WebElement readTXT_Delivery() {
			return driver.findElement(By.xpath("//*[text()='Delivery']/following-sibling::td/child::span"));
		}

		public static WebElement txt_MiddleName() {
			return driver.findElement(
					By.xpath("//*[text()='Middle Name']/parent::th//following-sibling::td/child::input[@type='text']"));
		}

		public static WebElement txt_LastName() {
			return driver.findElement(By.xpath(
					"//*[text()='Last Name']/parent::th//following-sibling::td/child::div/child::input[@type='text']"));
		}

		public static WebElement dpd_Delivery() {
			return driver.findElement(
					By.xpath("//*[text()='Delivery']/parent::th//following-sibling::td[1]/child::div/child::select"));

		}

		public static WebElement dpd_ChargeTiming() {
			return driver.findElement(
					By.xpath("//*[text()='Charge Timing']/parent::th//following-sibling::td[1]/child::div/child::select"));
		}

		public static WebElement dpd_clubType() {
			return driver.findElement(By.xpath(
					"//*[@id='page:form:pb_member:pbs_cost:clubType'][@name='page:form:pb_member:pbs_cost:clubType']"));
		}

		public static WebElement dpd_NOofBottles() {
			return driver.findElement(
					By.xpath("//*[text()='# of Bottles']/parent::th//following-sibling::td[1]/child::div/child::select"));
		}
		public WebElement dpd_DurationofMembership() {

			return driver.findElement(
					By.xpath("//*[text()='# of Bottles']/parent::th/following-sibling::td/child::div/child::select"));
		}

	public WebElement dpd_Promotion() {

		return driver.findElement(By.xpath(
				"(//*[text()='Promotion'])[2]/parent::th/following-sibling::td/child::div/child::select"));
	}

	// Each Object Performance Method

	public void EnterCardNumber(int row) throws IOException, BiffException, InterruptedException {
		String Cardnumber = cardnumber();
		enterText(txt_CardNumber(), "Card Number", Cardnumber); // Should Store this Card Number in SpreadSheet --
		data.setData("Card Number", row, Cardnumber);													// Pradeep
	}

	public void EnterSignUpLocation(int row) throws IOException {

		enterText(txt_SignUpLocation(), "Sign Up Location", data.Getdata("Sign Up Location", row));
	}

	public void ReadOnlyMembershipType(int row) throws IOException {
		verifyTextEqual(readTXT_MembershipType(), data.Getdata("Membership Type", row), "MemberShip Type");
	}

	public void ReadOnlyDelivery(int row) throws IOException {
		verifyTextEqual(readTXT_Delivery(), data.Getdata("Delivery", row), "Delivery");
	}

	public void SelectClubType(int row) throws IOException {

		selectByText(dpd_clubType(), "Club Type", data.Getdata("Club Type", row));
	}

	public void SelectNoOfBottles(int row) throws IOException, InterruptedException {

		Thread.sleep(1000);
		try {
			selectByTextwithoutReport(dpd_NOofBottles(), "# of Bottles", data.Getdata("# of Bottles", row));
		} catch (Exception e) {
			selectByText(dpd_NOofBottles(), "# of Bottles", data.Getdata("# of Bottles", row));
		}
	}

	public void SelectDurationofMembership(int row) throws IOException {

		selectByText(dpd_DurationofMembership(), "Duration of Membership", data.Getdata("Duration of Membership", row));
	}

	public void SelectPromotion(int row) throws IOException {

		selectByText(dpd_Promotion(), "Promotion", data.Getdata("Promotion", row));
	}

	// Actual functional Method

	public void EnterLightningPromotionInformation(int row) throws IOException, InterruptedException, BiffException {

		
		
		for(int i=0;i<10;i++) {
			try {
				
				driver.switchTo().defaultContent();
				driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@title='accessibility title'])[" + i + "]")));
				if(txt_CardNumber().isDisplayed()) {
					EnterCardNumber(row);
					EnterSignUpLocation(row);
					ReadOnlyMembershipType(row);
					ReadOnlyDelivery(row);
					SelectClubType(row);
					SelectNoOfBottles(row);
					SelectDurationofMembership(row);
					SelectPromotion(row);
					Page_NewMember.EnterStreet(row);
					Page_NewMember.EnterCity(row);
					Page_NewMember.SelectState(row);
					Page_NewMember.EnterZipcode(row);
					Page_NewMember.ClickSave();
					driver.switchTo().defaultContent();
					break;
				} else {
					System.out.println("Required frame not found");
				}
				
			} catch (Exception e) {
				System.out.println("No frame found");
			}
		}
		
	}
public void EnterClassicPromotionInformation(int row) throws IOException, InterruptedException, BiffException {
	 
			try {
				 
					EnterCardNumber(row);
					EnterSignUpLocation(row);
					ReadOnlyMembershipType(row);
					ReadOnlyDelivery(row);
					SelectClubType(row);
					SelectNoOfBottles(row);
					SelectDurationofMembership(row);
					SelectPromotion(row);
					Page_NewMember.EnterStreet(row);
					Page_NewMember.EnterCity(row);
					Page_NewMember.SelectState(row);
					Page_NewMember.EnterZipcode(row);
					Page_NewMember.ClickSave();
					
			} catch (Exception e) {
				System.out.println("Promotion Page is not Displayed");
				ResultsLog.ReportInfo(driver, "Promotion Page is not Displayed");
			}
		}
		
		}

 
