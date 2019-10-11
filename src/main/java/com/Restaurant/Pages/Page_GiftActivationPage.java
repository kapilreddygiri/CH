package com.Restaurant.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Restaurant.CommonPages.Resaurant_Menu;
import com.Restaurant.PageData.Restaurant_SignUpPagedata;
import com.Utils.BasePages;

import jxl.read.biff.BiffException;

public class Page_GiftActivationPage extends BasePages {

	static Restaurant_SignUpPagedata data = new Restaurant_SignUpPagedata();
	Resaurant_Menu Menu = new Resaurant_Menu();

	public Page_GiftActivationPage() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

// Objects from Application	
// New Gift Member Page

	

	public static WebElement txtFirstName() {
		return driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_FirstName\"]"));
	}

	public static WebElement txtLastName() {
		return driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_LastName\"]"));
	}

	public static WebElement txtStreet() {
		return driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Txt_Street\"]"));
	}

	public static WebElement txtCity() {
		return driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Txt_City\"]"));
	}

	public static WebElement txtState() {
		return driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ShippingStateList\"]"));
	}
	public static WebElement txtZip() {
		return driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Txt_Zip\"]"));
	}
	
	public static WebElement btnActivate() {
		return driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Btn_SaveDetails\"]"));
	}

	
// Each Object Performance Method	
// New Member

	public void enterFirstName(int row) throws IOException {
		enterText(txtFirstName(), "first name", data.Getdata("First Name", row));
	}
	public void enterLastName(int row) throws IOException {
		enterText(txtLastName(), "last name", data.Getdata("Last Name", row));
	}
	public void enterStreet(int row) throws IOException {
		enterText(txtStreet(), "Shipping Street", data.Getdata("Shipping Street", row));
	}
	public void enterCity(int row) throws IOException {
		enterText(txtCity(), "City", data.Getdata("Home City", row));
	}
	public void selectSate(int row) throws IOException {
	selectByText(txtState(), "State", data.Getdata("Home State/Province", row).substring(0,2).toUpperCase());
	}
	public void enterZip(int row) throws IOException {
		enterText(txtZip(), "Zip", data.Getdata("Home Zip/Postal Code", row));
	}
	public void clickActivateButton(int row) throws IOException {
		clickOnButton(btnActivate(), "Activate");
	}
// Logic Methods
//Radio Buttons Selection
	
	
	


// Actual Functional Method

	public void activateMembership(int row) throws IOException, BiffException {
		enterFirstName(row);
		enterLastName(row);
		enterStreet(row);
		enterCity(row);
		selectSate(row);
		enterZip(row);
		clickActivateButton(row);
	}

}
