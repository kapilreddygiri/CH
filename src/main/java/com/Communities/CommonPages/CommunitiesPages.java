package com.Communities.CommonPages;

import java.io.IOException;

import com.Communities.Pages.CMUPage_Dashboard;
import com.Communities.Pages.CMUPage_Gift;
import com.Communities.Pages.CMUPage_Login;
import com.Communities.Pages.CMUPage_Monthly;
import com.Communities.Pages.CMUPage_PaymentApproved;
import com.Communities.Pages.CMUPage_PaymentPage;
import com.Communities.Pages.CMUPage_Profile;

import jxl.read.biff.BiffException;

public class CommunitiesPages {

	// Login
	
	public static void CMUPage_Login_LaunchURL() throws IOException, InterruptedException {
		CMUPage_Login getPage_PageLogin = new CMUPage_Login();
		getPage_PageLogin.LaunchURL( );
	}
	public static void CMUPage_Login_SignUp(int row) throws IOException, InterruptedException {
		CMUPage_Login getPage_PageLogin = new CMUPage_Login();
		getPage_PageLogin.SignUp(row);
	}
	public static void CMUPage_Login_SignIn(int row) throws IOException, InterruptedException {
		CMUPage_Login getPage_PageLogin = new CMUPage_Login();
		getPage_PageLogin.SignIn(row);
	}
	
	
	public static void CMUMonthly_EnterWineClubInformation(int row)
			throws IOException, InterruptedException, BiffException {
		CMUPage_Monthly getPage_PageLogin = new CMUPage_Monthly();
		getPage_PageLogin.EnterWineClubInformation(row);
	}
	
	public static void CMUPage_Gift_EnterWineClubInformation_Gift(int row)
			throws IOException, InterruptedException, BiffException {
		CMUPage_Gift getPage_CMUPage_Gift = new CMUPage_Gift();
		getPage_CMUPage_Gift.EnterWineClubInformation_Gift(row);
	}

	public static void CMUPage_PaymentPage_EnterandValidate_PaymentPage(int row)
			throws IOException, InterruptedException, BiffException {
		CMUPage_PaymentPage getPage_PaymentPage = new CMUPage_PaymentPage(0);
		getPage_PaymentPage.EnterandValidate_PaymentPage(row);
	}
	public static void CMUPage_PaymentPage_EnterPaymentSection(   )
			throws IOException, InterruptedException, BiffException {
		CMUPage_PaymentPage getPage_PaymentPage = new CMUPage_PaymentPage(0);
		getPage_PaymentPage.EnterPaymentSection( );
	}
	public static void CMUPage_PaymentPage_ClickProcessPayment(   )
			throws IOException, InterruptedException, BiffException {
		CMUPage_PaymentPage getPage_PaymentPage = new CMUPage_PaymentPage(0);
		getPage_PaymentPage.ClickProcessPayment( );
	}
	public static void CMUPage_PaymentPage_clickStoreCreditCard(   )
			throws IOException, InterruptedException, BiffException {
		CMUPage_PaymentPage getPage_PaymentPage = new CMUPage_PaymentPage(0);
		getPage_PaymentPage.clickStoreCreditCard( );
	}
	
	
	
	public static void CMUPage_PaymentApproved_CreatePasswordandCopyCardNumber(int row)
			throws IOException, InterruptedException, BiffException {
		CMUPage_PaymentApproved getPage_PaymentApproved = new CMUPage_PaymentApproved();
		getPage_PaymentApproved.CreatePasswordandCopyCardNumber(row);
	}
	public static void CMUPage_PaymentApproved_CopyCardNumber(int row)
			throws Exception {
		CMUPage_PaymentApproved getPage_PaymentApproved = new CMUPage_PaymentApproved();
		getPage_PaymentApproved.copyCardNumber(row);
	}
	public static void CMUPage_PaymentApproved_validatePaymentConfirmationMessage( )
			throws IOException, InterruptedException, BiffException {
		CMUPage_PaymentApproved getPage_PaymentApproved = new CMUPage_PaymentApproved();
		getPage_PaymentApproved.validatePaymentConfirmationMessage( );
	}
	

	public static void CMUPage_Dashboard_ValidateDashboard(int row) throws IOException, InterruptedException {
		CMUPage_Dashboard getPage_CMUPage_Dashboard = new CMUPage_Dashboard();
		getPage_CMUPage_Dashboard.ValidateDashboard(row);
	}

	public static void CMUPage_Profile_memberSignatureOptOut( ) throws IOException, InterruptedException {
		CMUPage_Profile getPage_CMUPage_Profile = new CMUPage_Profile();
		getPage_CMUPage_Profile.memberSignatureOptOut( );
	}
	public static void CMUPage_Profile_memberSignatureOptIn( ) throws IOException, InterruptedException {
		CMUPage_Profile getPage_CMUPage_Profile = new CMUPage_Profile();
		getPage_CMUPage_Profile.memberSignatureOptIn( );
	}
	public static void CMUPage_Profile_change1to2Bottlesimmediately( ) throws IOException, InterruptedException {
		CMUPage_Profile getPage_CMUPage_Profile = new CMUPage_Profile();
		getPage_CMUPage_Profile.change1to2Bottlesimmediately( );
		
	}
	public static void CMUPage_Profile_change2to1Bottleimmediately( ) throws IOException, InterruptedException {
		CMUPage_Profile getPage_CMUPage_Profile = new CMUPage_Profile();
		getPage_CMUPage_Profile.change2to1Bottleimmediately( );
	}
	public static void CMUPage_Profile_ValidateProfile(int row) throws IOException, InterruptedException {
		CMUPage_Profile getPage_CMUPage_Profile = new CMUPage_Profile();
		getPage_CMUPage_Profile.ValidateProfile(row);
	}
	public static void CMUPage_Dashboard_rejoinMembership( ) throws IOException, InterruptedException {
		CMUPage_Dashboard getPage_CMUPage_Dashboard = new CMUPage_Dashboard();
		getPage_CMUPage_Dashboard.rejoinMembership( );
	}
	public static void CMUPage_Dashboard_updateCard( ) throws IOException, InterruptedException {
		CMUPage_Dashboard getPage_CMUPage_Dashboard = new CMUPage_Dashboard();
		getPage_CMUPage_Dashboard.updateCard( );
	}
	

	public static void CMUPage_Menu_ClickLogout(int row) throws IOException, InterruptedException {
		CMUPage_Menu getPage_PageLogout = new CMUPage_Menu();
		getPage_PageLogout.ClickLogout();
	}

}
