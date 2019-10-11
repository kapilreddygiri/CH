package com.Communities.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utils.BasePages;

public class CMUPage_Menu extends BasePages {

	public CMUPage_Menu() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

// Objects from Application
// Menu
	public static WebElement btn_NewsLetter() {
		return driver.findElement(By.xpath("//*[@href='https://chwinery.com/wine-club/wine-club-newsletter']"));

	}

	public static WebElement btn_Reservations() {
		return driver.findElement(By.xpath("//*[@href='https://chwinery.com/locations']"));

	}

	public static WebElement btn_Contact() {
		return driver.findElement(By.xpath("//*[@href='https://chwinery.com/contact/contact-us']"));

	}

	public static WebElement btn_Logout() {
		return driver.findElement(By.xpath("//*[@href='/members/secur/logout.jsp']"));

	}

// Objects from Application
// Sub Menu

	public static WebElement menu_Dashboard() {
		return driver.findElement(By.xpath("//a[@aria-controls='nav-home']"));

	}

	public static WebElement menu_PointsandRewards() {
		return driver.findElement(By.xpath("//a[@aria-controls='nav-rp']"));

	}

	public static WebElement menu_Bottles() {
		return driver.findElement(By.xpath("//a[@aria-controls='nav-bottles']"));

	}

	public static WebElement menu_Events() {
		return driver.findElement(By.xpath("//a[@aria-controls='nav-events']"));

	}

	public static WebElement menu_Profile() {
		return driver.findElement(By.xpath("//a[@aria-controls='nav-profile']"));

	}

// Each Object Performance Method
// Menu

	public void ClickLogout() throws IOException {
		clickOnButton(btn_Logout(), "Log Out");

	}

// Each Object Performance Method
// Sub Menu

	public void ClickDashboard() throws IOException {
		clickOnButton(menu_Dashboard(), "Dashboard");

	}

	public void ClickPointsandRewards() throws IOException {
		clickOnButton(menu_PointsandRewards(), "Points and Rewards");

	}

	public void ClickBottles() throws IOException {
		clickOnButton(menu_Bottles(), "Bottles");

	}

	public void ClickEvents() throws IOException {
		clickOnButton(menu_Events(), "Events");

	}

	public void ClickProfile() throws IOException {
		clickOnButton(menu_Profile(), "Profile");

	}
}
