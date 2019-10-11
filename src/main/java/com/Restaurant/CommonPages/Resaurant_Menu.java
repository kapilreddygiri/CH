package com.Restaurant.CommonPages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Utils.BasePages;

public class Resaurant_Menu extends BasePages {

	public Resaurant_Menu() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

// Objects from Application
// Menu
	public static WebElement btn_NewMember() {
		return driver.findElement(By.xpath("//*[text()='NEW MEMBER']"));
	}

	public static WebElement btn_Search() {
		return driver.findElement(By.xpath("//*[text()='SEARCH']"));
	}

	public static WebElement btn_NewGIFTMember() {
		return driver.findElement(By.xpath("//a[@href='GiftMember.aspx']"));
	}
	
	public static WebElement btn_Wine_PickUp() {
		return driver.findElement(By.xpath("//*[text()='WINE PICK-UP']"));
	}
	
	public static WebElement btn_AccountInfo() {
		return driver.findElement(By.xpath("//a[contains(text(),'ACCOUNT INFO')]"));
	}
	public static WebElement btn_Services() {
		return driver.findElement(By.xpath("//*[text()='SERVICES']"));
	}
	public static WebElement btn_Rewards() {
		return driver.findElement(By.xpath("//*[text()='REWARDS']"));
	}


// Each Object Performance Method
// Menu

	public void ClickNewMember() throws IOException {
		clickOnButton(btn_NewMember(), "New Member");
	}

	public void ClickNEWGIFTMEMBER() throws IOException {
		
		//Actions actions = new Actions(driver);
		//actions.moveToElement(btn_NewGIFTMember()).click().perform();
		clickOnButton(btn_NewGIFTMember(), "NEW GIFT MEMBER");
		
	}

	public void ClickSearch() throws IOException {
		clickOnButton(btn_Search(), "Search");
	}
	public void ClickWinePick_UP() throws IOException {
		clickOnButton(btn_Wine_PickUp(), "Wine PickUp");
	}
	public void ClickAccountsInfo() throws IOException {
		clickOnButton(btn_AccountInfo(), "Account Info");
	}
	public void ClickServices() throws IOException {
		clickOnButton(btn_Services(), "Services");
	}
	public void ClickRewards() throws IOException {
		clickOnButton(btn_Rewards(), "Rewards");
	}
	
	
}
