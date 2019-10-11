package com.Restaurant.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Restaurant.CommonPages.Resaurant_Menu;
import com.Restaurant.PageData.Restaurant_SignUpPagedata;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;

public class Page_Rewards extends BasePages {

	static Restaurant_SignUpPagedata data = new Restaurant_SignUpPagedata();
	Resaurant_Menu Menu = new Resaurant_Menu();

	public Page_Rewards() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

// Objects from Application	
// Services

	public static WebElement btnAddPoints() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btn_addPoints']"));
	}

	public static WebElement txtPoints() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Txt_AddPoints_CheckTotal']"));
	}

	public static WebElement dpdRevenueCenter() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddl_AddPoints_RevenueCenter']"));
	}

	public static WebElement txtCheck() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Txt_AddPoints_Transaction']"));
	}

	public static WebElement btnAddPointsSave() {
		return driver.findElement(By.xpath("//input[@value='Save']"));
	}

	public static WebElement btnAddPointsCancel() {
		return driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_Btn_AddPoints_Cancel']"));
	}

// Each Object Performance Method	

	public void ClickAddPoints() {
		btnAddPoints().click();
	}

	public void CannotClickAddPoints() {
		try {
			WebElement addPointBtn = driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btn_addPoints']"));
			
			if (!addPointBtn.isDisplayed()) {
				Assert.assertEquals("button not displayed", "button not displayed");
				ResultsLog.ReportDoneEvent("button not displayed");
				//Assert.assertEquals(!btnAddPoints().isDisplayed(), !btnAddPoints().isDisplayed(), "button not displayed");

			} else {
				Assert.fail("Button is displayed");
			}
		} catch (Exception e) {
			Assert.assertEquals("button not displayed", "button not displayed");
			ResultsLog.ReportDoneEvent("Button not displayed");
			//Assert.assertEquals(!btnAddPoints().isDisplayed(), !btnAddPoints().isDisplayed(), "button not displayed");
		}
		
	}

//here we need to add logic of entering the reward points from excel
	public void EnterAddPoints() throws IOException {
		enterText(txtPoints(), "Reward Points", "20");
	}

	public void SelectRevenueCenter() {
		Select RevenueCenter = new Select(driver.findElement(By.id("ContentPlaceHolder1_ddl_AddPoints_RevenueCenter")));
		RevenueCenter.selectByVisibleText("Banquet");
	}

	public void SavePoints() throws IOException {
		clickOnButton(btnAddPointsSave(), "Save Points");

	}

// Logical Method

// Actual Functional methods
	public void AddLoyaltyPoints() throws IOException {
		Menu.ClickRewards();
		ClickAddPoints();
		EnterAddPoints();
		SelectRevenueCenter();
		SavePoints();
	}

	public void CannotAddLoyaltyPoints() throws IOException {
		Menu.ClickRewards();
		CannotClickAddPoints();
	}

}
