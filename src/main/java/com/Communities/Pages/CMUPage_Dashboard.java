package com.Communities.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Communities.CommonPages.CMUPage_Menu;
import com.Communities.PagesData.CommunitiesMember_SignUpPagedata;
import com.Utils.BasePages;

public class CMUPage_Dashboard extends BasePages {
	CommunitiesMember_SignUpPagedata data = new CommunitiesMember_SignUpPagedata();
	CMUPage_Menu MenuPage = new CMUPage_Menu();
	CMUPage_Profile profilepage = new CMUPage_Profile();

	public CMUPage_Dashboard() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

// Objects from Application
// Menu
	public static WebElement readonly_ncurrentpoints() {
		return driver.findElement(By.xpath("//*[@id='ring-current-points']/child::*[3]"));

	}

	public static WebElement readonly_AMBASSADORSCORE() {
		return driver.findElement(By.xpath("//*[@id='ring-ambasador-score']/child::*[3]"));

	}

	public static WebElement readonly_WelcomeName() {
		return driver.findElement(By.id("disp_welcome_user"));

	}

	public static WebElement readonly_BottlesAvailable() {
		return driver.findElement(By.xpath("//*[@id='disp_bottles']/strong"));

	}

	public static WebElement readonly_BottlesDeliveryType() {
		return driver.findElement(By.xpath("//*[@id='disp_bottles']/child::a[@href='#nav-bottles']"));

	}

	public static WebElement readonly_PointsUntilNextRewars() {
		return driver.findElement(By.xpath("//*[@id='disp_points']/strong"));

	}

	public static WebElement lnkRejoinPlease() {
		return driver.findElement(By.xpath("(//*[contains(text(),'Please Rejoin')])[2]"));

	}

	public static WebElement lnkUpdateCard() {
		return driver.findElement(By.xpath("(//a[contains(text(),'Update')])[2]"));

	}

	public static WebElement lnkUpdatePayment() {
		return driver.findElement(By.xpath("(//a[contains(text(),'update your payment')]"));

	}

	public static WebElement lnkUpdateProfile() {
		return driver.findElement(By.xpath("(//a[contains(text(),'Update')])[1]"));

	}

	// Each Object Performance Method
	// Payment CC Info

	public void ValidateActivePoints(int row) throws IOException {
		String ExpectedBottles = data.Getdata("ExpectedActivePoints", row).trim();
		verifyTextEqual(readonly_ncurrentpoints(), ExpectedBottles, "Valididate Current Points");

	}

	public void ValidateAMBASSADORSCORE(int row) throws IOException {
		String ExpectedTotalAmbassadorCredits = data.Getdata("ExpectedTotalAmbassadorCredits", row).trim();
		verifyTextEqual(readonly_AMBASSADORSCORE(), ExpectedTotalAmbassadorCredits, "Valididate AMBASSADOR SCORE");

	}

	public void ValidateWelcomeName(int row) throws IOException {

		String ValidateName = "Welcome, " + data.Getdata("First Name", row).trim();
		verifyTextEqual(readonly_WelcomeName(), ValidateName, "Valididate Welcome Name");

	}

	public void ValidateBottlesAvailable(int row) throws IOException {
		String ExpectedBottles = null;

		if (data.Getdata("Delivery", row).trim().equals("Pickup")) {

			if (data.Getdata("ExpectedBottles", row).trim().equals("1")) {
				ExpectedBottles = data.Getdata("ExpectedBottles", row).trim() + " Bottle";
			}

			else if (data.Getdata("ExpectedBottles", row).trim().equals("2")
					|| data.Getdata("ExpectedBottles", row).trim().equals("0")) {
				ExpectedBottles = data.Getdata("ExpectedBottles", row).trim() + " Bottles";
			}
			verifyTextEqual(readonly_BottlesAvailable(), ExpectedBottles, "Valididate Bottles Available");

		}
	}

	public void ValidateDeliveryType(int row) throws IOException {

		if (data.Getdata("Delivery", row).trim().equalsIgnoreCase("Pickup")) {
			verifyTextEqual(readonly_BottlesDeliveryType(), data.Getdata("Delivery", row).trim(),
					"Valididate Delivery Type");
		}

	}

	public void ValidatePointsUntilNextRewars(int row) throws IOException {
		String PointsUntilNextReward = "350";
		verifyTextEqual(readonly_PointsUntilNextRewars(), PointsUntilNextReward, "Points Until NextRewars");

	}

	// Actual Functional Method

	public void ValidateDashboard(int row) throws IOException, InterruptedException {

		MenuPage.ClickDashboard();
		ValidateActivePoints(row);
		ValidateAMBASSADORSCORE(row);
		ValidateWelcomeName(row);
		ValidateBottlesAvailable(row);
		ValidateDeliveryType(row);
	}

	public void rejoinMembership() throws IOException {

		clickOnLink(lnkRejoinPlease(), "Rejoin Please");
		profilepage.btnRejoinClub().click();
	}

	public void updateCard() throws IOException {
		waitForAjax();
		waitForElement(lnkUpdateCard());
		if (lnkUpdateCard().isDisplayed()) {
			verifyTextEqual(lnkUpdateCard(), "Update", "Update Card");
			clickOnLink(lnkUpdateCard(), "Update");
		}
	}
}
