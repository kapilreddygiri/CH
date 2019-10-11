package com.Communities.Pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Communities.PagesData.CommunitiesMember_SignUpPagedata;
import com.MGS.PagesData.Member_SignUpPagedata;
import com.Utils.BasePages;
import com.Utils.LaunchBrowser;

public class CMUPage_Login extends BasePages {
	// LaunchBrowser launchBrowser = new LaunchBrowser();
	CommunitiesMember_SignUpPagedata data = new CommunitiesMember_SignUpPagedata();
	
	public CMUPage_Login(){
		
		driver.switchTo().defaultContent();
	}

// Objects from Application

	public WebElement txtUserName() {

		return driver.findElement(By.id("email"));
	}

	public WebElement txtPassword() {

		return driver.findElement(By.id("password"));
	}

	public WebElement btnLog_In() {

		return driver.findElement(By.xpath("//button[@onclick='sign_in()']"));
	}

	public WebElement lnkSign_up() {

		return driver.findElement(By.xpath("//a[@href='/members/CHW_Ext_NewMemberSignUp']"));
	}

	public WebElement btnMonthly() {

		return driver.findElement(By.xpath("//a[@href='/members/CHW_Ext_NewMonthlyMemberSignUp']"));
	}

	public WebElement btnGift() {

		return driver.findElement(By.xpath("//a[@href='/members/CHW_Ext_NewGiftMemberSignUp']"));
	}
	public WebElement txtSignInEmail() {

		return driver.findElement(By.xpath("//input[@id='email']"));
	}
	public WebElement txtSignInEmailPassword() {

		return driver.findElement(By.xpath("//input[@id='password']"));
	}
	public WebElement btnSignIntoAccount() {

		return driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
	}
	
	
	

// Each Object  Method	

	public void EnterUserName() throws IOException {

		enterText(txtUserName(), "User Name", LaunchBrowser.TestSettingsObjects.getProperty("UserName"));
	}

	public void EnterPassword() {

		txtPassword().sendKeys(LaunchBrowser.TestSettingsObjects.getProperty("Password"));
	}

	public void ClickSignButton() throws IOException {

		clickOnButton(btnLog_In(), "Log In");
	}

	public void ClickSignUpLink() throws IOException {

		clickOnLink(lnkSign_up(), "Sign UP");
	}

	public void ClickMonthlyButton() throws IOException {

		clickOnButton(btnMonthly(), "Monthly Button");
	}

	public void ClickGiftButton() throws IOException {

		clickOnButton(btnGift(), "Monthly Button");
	}

	public void LaunchURL() throws IOException {

		driver.get(LaunchBrowser.TestSettingsObjects.getProperty("CommunitiesURL"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void enterSignInEmail(int row) throws IOException {

		enterText(txtSignInEmail(), "Email", data.Getdata("Email", row));
	}
	public void enterSignInEmailPassword(int row) throws IOException {

		enterText(txtSignInEmailPassword(), "Email", data.Getdata("Password", row));
	}
	public void clickSignIn(int row) throws IOException {

		clickOnButton(btnSignIntoAccount(), "SignIn");
	}
	public void selectCurrentSignInMember(int row) throws IOException {
		System.out.println(data.Getdata("Card Number", row));
		List<WebElement> signInMemberList= driver.findElements(By.xpath("//form[@action='/members/CHW_Ext_SignInReturningPage']/child::div/following-sibling::div/following-sibling::div/child::a"));
	for(int i=0;i<signInMemberList.size();i++) {
		WebElement memberListElement=signInMemberList.get(i);
		String  memberList=memberListElement.getText();
		
		System.out.println(memberList);
		System.out.println(data.Getdata("Card Number", row));
		if(memberList.contains(data.Getdata("Card Number", row))) {
			
			clickOnLink(memberListElement, "Member options for Selection");
			break;
		}
	}
	}
		
		
		
	
// Selection Logic Methods

	public void SelectMembership(int row) throws IOException {

		if (data.Getdata("WC Member Record Type", row).equalsIgnoreCase("Monthly Member")) {
			clickOnButton(btnMonthly(), "Monthly Button");
		} else if (data.Getdata("WC Member Record Type", row).equalsIgnoreCase("Gift Member")) {
			clickOnButton(btnGift(), "Gift Button");
		}

	}

// Actual Functional Method 

	public void login() throws IOException, InterruptedException {
		LaunchURL();
		EnterUserName();
		EnterPassword();
		ClickSignButton();

	}

	public void SignUp(int row) throws IOException, InterruptedException {
		LaunchURL();
		ClickSignUpLink();
		SelectMembership(row);

	}
	public void SignIn(int row) throws IOException, InterruptedException {
		LaunchURL();
		enterSignInEmail(row);
		enterSignInEmailPassword(row);
		clickSignIn(row);
		selectCurrentSignInMember(row);

	}

	// Negative Login Test -- User Name
	public void NegativeloginUserName() throws IOException {
		LaunchURL();
		enterText(txtUserName(), "User Name", "Testing");
		txtPassword().sendKeys(LaunchBrowser.TestSettingsObjects.getProperty("Password"));
		clickOnButton(btnLog_In(), "Log In");

	}

	// Negative Login Test -- Password
	public void NegativeloginPassword() throws IOException {
		LaunchURL();
		enterText(txtUserName(), "User Name", LaunchBrowser.TestSettingsObjects.getProperty("UserName"));
		txtPassword().sendKeys("Password");
		clickOnButton(btnLog_In(), "Log In");

	}

}
