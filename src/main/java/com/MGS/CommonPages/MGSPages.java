package com.MGS.CommonPages;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;

import com.MGS.Pages.Page_ComplimentaryEntry;
import com.MGS.Pages.Page_CoopersHawkCaresEntry;
import com.MGS.Pages.Page_FounderEntry;
import com.MGS.Pages.Page_GiftMembersEntry;
import com.MGS.Pages.Page_Login;
import com.MGS.Pages.Page_MonthlyMembersEntry;
import com.MGS.Pages.Page_PromotionEntry;
import com.Utils.HTMLReporter;
import com.Utils.LaunchBrowser;
import com.MGS.CommonPages.ClassicWCMemberValidationPage;

import jxl.read.biff.BiffException;

public class MGSPages {

	// Login

	public static void Page_Login() throws IOException, InterruptedException {
		Page_Login getPage_PageLogin = new Page_Login();
		getPage_PageLogin.login();
	}

	// <- Menu Page Methods->

	public static Menu getPagemenu() {
		Menu getPage_Menu = new Menu();
		return getPage_Menu;
	}

	public static void Menu_LightningLoginFlow(int row) throws IOException, InterruptedException {

		try {
			Menu getPage_Menu = new Menu();
			getPage_Menu.LightningLoginFlow(row);
		} catch (Exception e) {
			Menu getPage_Menu = new Menu();
			getPage_Menu.LightningLoginFlow(row);
		}

	}

	public static void ClassicLoginFlow(int row) throws IOException, InterruptedException {
		Menu getPage_Menu = new Menu();
		try {
			getPage_Menu.ClassicLoginFlow(row);
		} catch (Exception e) {
			getPage_Menu.ClassicLoginFlow(row);
		}
	}
	
	public static void lightningAddNewMember(int row) throws IOException, InterruptedException {
		Menu getPage_Menu = new Menu();
		getPage_Menu.addNewMemberforLightning(row);
		
	}
	
	
	public static void classicAddNewMember(int row) throws IOException, InterruptedException {
		Menu getPage_Menu = new Menu();
		getPage_Menu.addNewMemberForClassic(row);
		
	}
	public static void Menu_LightningApplicationLogout() throws IOException, InterruptedException {

		Menu getPage_Menu = new Menu();
		try {
			getPage_Menu.LightningApplicationLogout();
		} catch (Exception e) {
			getPage_Menu.LightningApplicationLogout();
		}

	}

	public static void Menu_ClassicApplicationLogout() throws IOException, InterruptedException {
		try {
			
			Menu getPage_Menu = new Menu();
			getPage_Menu.ClassicApplicationLogout();
		} catch (Exception e) {
			System.out.println("Logout button not found");
			//Menu getPage_Menu = new Menu();
			//getPage_Menu.ClassicApplicationLogout();
		}

	}

	public static void Menu_LightningErrormessage(int row) throws IOException, InterruptedException, BiffException {
		Menu getPage_Menu = new Menu();
		getPage_Menu.LightningErrormessage(row);
	}

	public static void Menu_Errormessage(int row) throws IOException, InterruptedException, BiffException {
		Menu getPage_Menu = new Menu();
		getPage_Menu.Errormessage(row);
	}

	public static void Menu_SearchMember(int row)
			throws IOException, InterruptedException, BiffException, AWTException {
		Menu getPage_Menu = new Menu();
		getPage_Menu.SearchMember(row);
	}
	public static void Menu_SearchMemberLightning(int row)
			throws Exception {
		Menu getPage_Menu = new Menu();
		getPage_Menu.SearchMemberLightning(row);
	}
	

	// <- Monthly Member Page Methods->

	public static void LightningEnterMonthlyMemberInformation(int row)
			throws IOException, InterruptedException, BiffException {
		Page_MonthlyMembersEntry getPage_Page_MonthlyMember = new Page_MonthlyMembersEntry();
		getPage_Page_MonthlyMember.EnterMonthlyMemberInformationForLightning(row);
	}

	public static void ClassicEnterMonthlyMemberInformation(int row)
			throws IOException, InterruptedException, BiffException {
		Page_MonthlyMembersEntry getPage_Page_MonthlyMember = new Page_MonthlyMembersEntry();
		getPage_Page_MonthlyMember.EnterMonthlyMemberInformation(row);
	}

	// <- Complimentary Member Page Methods->;

	public static void ClassicEnterComplimentaryInformation(int row)
			throws IOException, InterruptedException, BiffException {
		Page_ComplimentaryEntry getPage_Page_NewMember = new Page_ComplimentaryEntry();
		getPage_Page_NewMember.EnterClassicComplimentaryInformation(row);
	}

	public static void LightningEnterComplimentaryInformation(int row)
			throws IOException, InterruptedException, BiffException {
		Page_ComplimentaryEntry getPage_Complimentary = new Page_ComplimentaryEntry();
		getPage_Complimentary.EnterLightningComplimentaryInformation(row);
	}

	// <- Coopers Hawk Care Member Page Methods->

	public static void ClassicEnterCoopersHawkCareInformation(int row)
			throws IOException, InterruptedException, BiffException {
		Page_CoopersHawkCaresEntry getPage_Page_CoopersHawkCaresEntry = new Page_CoopersHawkCaresEntry();
		getPage_Page_CoopersHawkCaresEntry.EnterClassicCoopersHawkCareInformation(row);
	}

	public static void LightningEnterCoopersHawkCareInformation(int row)
			throws IOException, InterruptedException, BiffException {
		Page_CoopersHawkCaresEntry getPage_Page_CoopersHawkCaresEntry = new Page_CoopersHawkCaresEntry();
		getPage_Page_CoopersHawkCaresEntry.EnterLightningCoopersHawkCareInformation(row);
	}

	// <- Founder Member Page Methods->

	public static void ClassicEnterFounderInformation(int row) throws IOException, InterruptedException, BiffException {
		Page_FounderEntry getPage_Page_Founderr = new Page_FounderEntry();
		getPage_Page_Founderr.EnterClassicFounderInformation(row);
	}

	public static void LightningEnterFounderInformation(int row)
			throws IOException, InterruptedException, BiffException {
		Page_FounderEntry getPage_Page_Founderr = new Page_FounderEntry();
		getPage_Page_Founderr.EnterLightningFounderInformation(row);
	}

	// <- Gift Member Page Methods->

	public static void ClassicEnterGiftMemberInformation(int row)
			throws IOException, InterruptedException, BiffException {
		Page_GiftMembersEntry getPage_Page_GiftMember = new Page_GiftMembersEntry();
		getPage_Page_GiftMember.EnterClassicGiftMemberInformation(row);
	}

	public static void LightningEnterGiftMemberInformation(int row)
			throws IOException, InterruptedException, BiffException {
		Page_GiftMembersEntry getPage_Page_GiftMember = new Page_GiftMembersEntry();
		getPage_Page_GiftMember.EnterLightningGiftMemberInformation(row);
	}

	// <- Promotion Member Page Methods->

	public static void ClassicEnterPromotionInformation(int row)
			throws IOException, InterruptedException, BiffException {
		Page_PromotionEntry getPage_Page_Promotion = new Page_PromotionEntry();
		getPage_Page_Promotion.EnterClassicPromotionInformation(row);
	}

	public static void LightningEnterPromotionInformation(int row)
			throws IOException, InterruptedException, BiffException {
		Page_PromotionEntry getPage_Page_Promotion = new Page_PromotionEntry();
		getPage_Page_Promotion.EnterLightningPromotionInformation(row);
	}

	// <- Payment Validation Page Methods->

	public static void LightningSignUpValidationPage(int row) throws IOException, InterruptedException {
		SignUpValidationPage getPage_PaymentValidation = new SignUpValidationPage();
		getPage_PaymentValidation.LightningValidatePaymentDetails(row);
	}

	public static void LightningSignUpValidationPageWithOutAdressFileds(int row)
			throws IOException, InterruptedException {
		SignUpValidationPage getPage_PaymentValidation = new SignUpValidationPage();
		getPage_PaymentValidation.LightningValidatePaymentDetailsWithoutAddressFileds(row);
	}

	public static void ClassicValidatePaymentDetails(int row) throws IOException, InterruptedException {
		SignUpValidationPage getPage_MonthlyMembersEntry = new SignUpValidationPage();
		getPage_MonthlyMembersEntry.ClassicValidatePaymentDetails(row);
	}

	public static void ClassicValidatePaymentDetailsWithOutAdressFileds(int row)
			throws IOException, InterruptedException {
		SignUpValidationPage getPage_MonthlyMembersEntry = new SignUpValidationPage();
		getPage_MonthlyMembersEntry.ClassicValidatePaymentDetailsWithoutAddressFileds(row);
	}

	// <- Payment Details Page Methods->

	public static void LightningEnterAndValidateWholePayment_DetailsPage(int row)
			throws Exception {

		Page_PaymentDetails getPage_PaymentDetails = new Page_PaymentDetails();
		getPage_PaymentDetails.EnterAndValidateWholePayment_DetailsPage(row);

	}
	

	public static void ClassicEnterAndValidateMonthlyPayment_DetailsPage(int row)
			throws IOException, InterruptedException, BiffException {
		Page_PaymentDetails getPage_PaymentDetails = new Page_PaymentDetails();
		getPage_PaymentDetails.EnterandValidate_MonthlyPaymentPage(row);
	}
	public static void ClassicEnterAndValidateGiftPayment_DetailsPage(int row)
			throws IOException, InterruptedException, BiffException {
		Page_PaymentDetails getPage_PaymentDetails = new Page_PaymentDetails();
		getPage_PaymentDetails.EnterandValidate_GiftPaymentPage(row);
	}
	public static void LightningEnterAndValidatePayment_CredidCardInformation(int row)
			throws IOException, InterruptedException {
		
		Page_PaymentDetails getPage_PaymentDetails = new Page_PaymentDetails();
		getPage_PaymentDetails.EnterAndValidatePayment_CredidCardInformation(row);

	}

	public static void ClassicEnterAndValidatePayment_CredidCardInformation(int row)
			throws IOException, InterruptedException {
		Page_PaymentDetails getPage_PaymentDetails = new Page_PaymentDetails();
		getPage_PaymentDetails.EnterAndValidatePayment_CredidCardInformation(row);
	}

	public static void ClassicEnterCardPaymentDetails(int row) throws Exception {
		Page_PaymentDetails getPage_PaymentDetails = new Page_PaymentDetails();
		getPage_PaymentDetails.enterPaymentCardDetailsClassic(row);
	}
	public static void ClassicEnterCardPaymentDetails_EnterPaymentSectionforEditWC( ) throws Exception {
		Page_PaymentDetails getPage_PaymentDetails = new Page_PaymentDetails();
		getPage_PaymentDetails.EnterPaymentSectionforEditWC( );
	}

	public static void LightningEnterCardPaymentDetails(int row) throws Exception {
		Page_PaymentDetails getPage_PaymentDetails = new Page_PaymentDetails();
		getPage_PaymentDetails.enterPaymentCardDetailsLightning(row);
	}
	public static void LightningEnterCardPaymentDetails_EnterPaymentSectionforEditWC( ) throws Exception {
		Page_PaymentDetails getPage_PaymentDetails = new Page_PaymentDetails();
		getPage_PaymentDetails.EnterPaymentSection( );
	}
	// <- WC Member Details Validation Page->

	public static void LightningValidateWCMemberDetails(int row) throws IOException, InterruptedException {
		LightningWCMemberValidationPage getPage_LightningWCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_LightningWCMemberValidationPage.LightningValidateWCMembers(row);
	}

	public static void ClassicValidateWCMemberDetails(int row) throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_ClassicWCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_ClassicWCMemberValidationPage.ClassicValidateWCMembers(row);
	}

	public static void LightningValidateWCMemberDetails_Founder(int row) throws IOException, InterruptedException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.LightningValidateWineClubInformation_Founder(row);
	}

	public static void ClassicValidateWCMemberDetails_Founder(int row) throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.ClassicValidateWineClubInformation_Founder(row);
	}

	public static void LightningValidateWCMemberDetails_Complimentary(int row)
			throws IOException, InterruptedException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.LightningValidateWineClubInformation_Complimentary(row);
	}

	public static void ClassicValidateWCMemberDetails_Complimentary(int row) throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.ClassicValidateWineClubInformation_Complimentary(row);
	}

	public static void ClassicWCMemberValidationPage_ClassicActivateMember(int row) throws Exception {

		ClassicWCMemberValidationPage classicWCMemberValidationPage = new ClassicWCMemberValidationPage();
		classicWCMemberValidationPage.classicActivateMember(row);

	}

	public static void ClassicWCMemberValidationPage_replaceNewCreditCard(int row) throws Exception {
		ClassicWCMemberValidationPage classicWCMemberValidationPage = new ClassicWCMemberValidationPage();
		classicWCMemberValidationPage.replaceNewCreditCard(row);

	}

	public static void LightningValidateWCMemberDetails_LightningActivateMember(int row)
			throws IOException, InterruptedException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.LightningActivateMember(row);
	}

	public static void LightningValidateWCMemberDetails_replaceNewCreditCard()
			throws IOException, InterruptedException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.replaceNewCreditCard();
	}

	public static void ClassicWCMemberValidationPage_markOffTasting() throws Exception {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.markOffTasting();

	}

	public static void LightningWCMemberValidationPage_markOffTasting() throws InterruptedException, IOException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.markOffTasting();

	}

	public static void LightningWCMemberValidationPage_clearDeclineStatusLightning(int row)
			throws IOException, InterruptedException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.clearDeclineStatusLightning(row);

	}

	public static void ClassicWCMemberValidationPage_clearDeclineStatus() throws Exception {
		ClassicWCMemberValidationPage classicWCMemberValidationPage = new ClassicWCMemberValidationPage();
		classicWCMemberValidationPage.clearDeclineStatus();

	}

	// COMMENTED TEMPORARILY
	
	 public static void ClassicWCMemberValidationPage_swap2WOMSfor1Lux() throws InterruptedException, IOException {
	 ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new
	 ClassicWCMemberValidationPage();
	 getPage_WCMemberValidationPage.swap2WOMSfor1Lux();
	 
	  }
	 public static void LightningWCMemberValidationPage_swap2WOMSfor1Lux() throws InterruptedException, IOException {
		 LightningWCMemberValidationPage getPage_WCMemberValidationPage = new
				 LightningWCMemberValidationPage();
		 getPage_WCMemberValidationPage.swap2WOMSfor1Lux();
		 
		  }
	  public static void ClassicWCMemberValidationPage_SelectWCPriorWOMPickUP()	  throws IOException, InterruptedException, ParseException {
		  ClassicWCMemberValidationPage
	  getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
	 getPage_WCMemberValidationPage.SelectWCPriorWOMPickUP();
	 
	  }
	  public static void LightningWCMemberValidationPage_SelectWCPriorWOMPickUP()	  throws IOException, InterruptedException, ParseException {
		  LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
	 getPage_WCMemberValidationPage.SelectWCPriorWOMPickUP();
	 
	  }
	  
	  public static void ClassicWCMemberValidationPage_SelectWCCurrentWOMPickUP()	  throws IOException, InterruptedException, ParseException {
		  ClassicWCMemberValidationPage
	  getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
	 getPage_WCMemberValidationPage.SelectWCCurrentWOMPickUP();
	 
	  }
	  public static void LightningWCMemberValidationPage_SelectWCCurrentWOMPickUP()	  throws IOException, InterruptedException, ParseException {
		  LightningWCMemberValidationPage  getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
	 getPage_WCMemberValidationPage.SelectWCCurrentWOMPickUP();
	 
	  }
	  public static void ClassicWCMemberValidationPage_SelectWCPriorWOMPickUPwithCharge(int row)	  throws IOException, InterruptedException, ParseException, BiffException {
		  ClassicWCMemberValidationPage
	  getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
	 getPage_WCMemberValidationPage.SelectWCPriorWOMPickUPwithCharge(row);
	 
	  }
	  public static void LightningWCMemberValidationPage_SelectWCPriorWOMPickUPwithCharge(int row)	  throws IOException, InterruptedException, ParseException, BiffException {
		  LightningWCMemberValidationPage
	  getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
	 getPage_WCMemberValidationPage.SelectWCPriorWOMPickUPwithUpcharge(row);
	 
	  }
	  
	  public static void ClassicWCMemberValidationPage_SelectWCCurrentWOMPickUPwithCharge(int row)	  throws IOException, InterruptedException, ParseException, BiffException {
		  ClassicWCMemberValidationPage
	  getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
	 getPage_WCMemberValidationPage.SelectWCCurrentWOMPickUPwithCharge(row);
	 
	  }
	  public static void LightningWCMemberValidationPage_SelectWCCurrentWOMPickUPwithCharge(int row)	  throws IOException, InterruptedException, ParseException, BiffException {
		  LightningWCMemberValidationPage
	  getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
	 getPage_WCMemberValidationPage.SelectWCCurrentWOMPickUPwithUpcharge(row);
	 
	  }
	public static void ClassicWCMemberValidationPage_addLoyaltyPoints() throws Exception {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.addLoyaltyPoints();

	}

	public static void ClassicWCMemberValidationPage_MemberSignatureCheckedOPtOut()
			throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.MemberSignatureCheckedOPtOut();

	}

	public static void ClassicWCMemberValidationPage_MemberSignatureCheckedOPtIn()
			throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.MemberSignatureCheckedOPtIn();

	}

	public static void LightningWCMemberValidationPage_MemberSignatureCheckedOPtOut()
			throws IOException, InterruptedException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.MemberSignatureCheckedOPtOut();

	}

	public static void LightningWCMemberValidationPage_MemberSignatureCheckedOPtIn()
			throws IOException, InterruptedException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.MemberSignatureCheckedOPtIn();

	}

	public static void LightningWCMemberValidationPage_addLoyaltyPoints() throws IOException, InterruptedException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.addLoyaltyPoints();

	}

	public static void ClassicWCMemberValidationPage_convertGiftMembershiptoMonthlybeforeExpirationDate(int row)
			throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.convertGiftMembershiptoMonthlybeforeExpirationDate(row);

	}

	public static void ClassicWCMemberValidationPage_convertGiftMembershiptoMonthlyafterExpirationDate(int row)
			throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.convertGiftMembershiptoMonthlyafterExpirationDate(row);

	}

	public static void LightningWCMemberValidationPage_convertGiftMembershiptoMonthlybeforeExpirationDate()
			throws IOException, InterruptedException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.convertGiftMembershiptoMonthlybeforeExpirationDate();

	}

	public static void LightningWCMemberValidationPage_convertGiftMembershiptoMonthlyafterExpirationDate()
			throws IOException, InterruptedException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.convertGiftMembershiptoMonthlyafterExpirationDate();

	}

	public static void ClassicWCMemberValidationPage_changeDelivery() throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.changeDelivery();

	}

	public static void LightningWCMemberValidationPage_changeDeliveryNextBillingCycle()
			throws IOException, InterruptedException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.changeDeliveryNextBillingCycle();

	}

	public static void LightningWCMemberValidationPage_changeclubTypeNextBillingCycleDecreasedCost(int row)
			throws Exception {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.changeclubTypeNextBillingCycleDecreasedCost(row);

	}

	public static void LightningWCMemberValidationPage_changeclubTypeImmediatelyDecreasedCost()
			throws IOException, InterruptedException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.changeclubTypeImmediatelyDecreasedCost();

	}

	public static void LightningWCMemberValidationPage_changeclubTypeNextBillingCycleIncreasedCost(int row)
			throws Exception {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.changeclubTypeNextBillingCycleIncreasedCost(row);

	}

	public static void LightningWCMemberValidationPage_changeclubTypeImmediatelyIncreasedCost()
			throws IOException, InterruptedException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.changeclubTypeImmediatelyIncreasedCost();

	}

	public static void LightningWCMemberValidationPage_change1to2BottlesImmediately(int row) throws Exception {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.change1to2BottlesImmediately(row);

	}

	public static void LightningWCMemberValidationPage_change2to1BottlesImmediately(int row) throws Exception {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.change2to1BottlesImmediately(row);

	}

	public static void LightningWCMemberValidationPage_change1to2BottlesNextBillingCycle(int row) throws Exception {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.change1to2BottlesNextBillingCycle(row);

	}

	public static void LightningWCMemberValidationPage_change2to1BottlesNextBillingCycle(int row) throws Exception {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.change2to1BottlesNextBillingCycle(row);

	}

	public static void ClassicWCMemberValidationPage_changeClubTypeIncreasedCostImmediately()
			throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.changeClubTypeIncreasedCostImmediately();

	}
	public static void ClassicWCMemberValidationPage_changeClubTypeIncreasedCostNextBillingCycle(int row)
			throws Exception {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.changeClubTypeIncreasedCostNextbillingCycle(row);

	}
	public static void ClassicWCMemberValidationPage_changeClubTypeDecreasedCostImmediately()
			throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.changeClubTypeDecreasedCostImmediately();

	}
	public static void ClassicWCMemberValidationPage_changeClubTypeDecreasedCostNextBillingCycle(int row)
			throws Exception {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.changeClubTypeDecreasedCostNextbillingCycle(row);

	}

	public static void ClassicWCMemberValidationPage_changeClubTypeDecreasedCost()
			throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.changeClubTypeDecreasedCost();

	}

	public static void ClassicWCMemberValidationPage_changefrom2to1BottleImmediately(int row) throws Exception {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.changefrom2to1BottleImmediately(row);

	}
	public static void ClassicWCMemberValidationPage_changefrom2to1BottleNextBillingCycle(int row) throws Exception {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.changefrom2to1BottleNextBillingCycle(row);

	}

	public static void ClassicWCMemberValidationPage_changefrom1to2BottleImmediately(int row) throws Exception {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.changefrom1to2BottleImmediately(row);

	}
	public static void ClassicWCMemberValidationPage_changefrom1to2BottleNextBillingCycle(int row) throws Exception {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.changefrom1to2BottleNextBillingCycle(row);

	}

	public static void ClassicWCMemberValidationPage_nextBillingCycle() throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.nextBillingCycle();

	}

	public static void ClassicWCMemberValidationPage_clickProceedtoPaymentDetails()
			throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.clickProceedtoPaymentDetails();

	}

	public static void ClassicWCMemberValidationPage_clickEditWCInfo() throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.clickEditWCInfo();

	}

	public static void ClassicWCMemberValidationPage_replacePersonalizedWCCard(int row)
			throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.replacePersonalizedWCCard(row);

	}

	public static void LightningWCMemberValidationPage_replacePersonalizedWCCard(int row)
			throws IOException, InterruptedException, AWTException, BiffException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.replacePersonalizedWCCard(row);

	}

	public static void ClassicWCMemberValidationPage_payimmediately() throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.payImmediately();

	}
	public static void ClassicWCMemberValidationPage_verifyErrorMessageTextforClubTypeChangeImmediately()
			throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.verifyErrorMessageTextforClubTypeChangeImmediately();

	}
	
	public static void ClassicWCMemberValidationPage_verifyErrorMessageTextforBottlesChangeImmediately()
			throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.verifyErrorMessageTextforBottlesChangeImmediately();

	}

	public static void ClassicWCMemberValidationPage_addNotes() throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.addNotes();

	}

	public static void LightningWCMemberValidationPage_addNotes() throws IOException, InterruptedException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.addNotes();

	}

	public static void ClassicWCMemberValidationPage_cancelMembership() throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.cancelMembership();

	}

	public static void LightningWCMemberValidationPage_cancelMembership() throws IOException, InterruptedException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.cancelMembership();

	}

	public static void ClassicWCMemberValidationPage_putVacationHold() throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.putVacationHold();

	}

	public static void LightningWCMemberValidationPage_putVacationHold() throws IOException, InterruptedException, AWTException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.putVacationHold();

	}

	public static void ClassicWCMemberValidationPage_orderBarrelReserve(int row)
			throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.orderBarrelReserve(row);

	}

	public static void LightningWCMemberValidationPage_orderBarrelReserve() throws IOException, InterruptedException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.barrelReserveOrder();

	}

	public static void ClassicWCMemberValidationPage_updateContactInformation(int row)
			throws IOException, InterruptedException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.updateContactInformation(row);

	}

	public static void LightningWCMemberValidationPage_updateContactInformation(int row)
			throws IOException, InterruptedException {
		LightningWCMemberValidationPage getPage_WCMemberValidationPage = new LightningWCMemberValidationPage();
		getPage_WCMemberValidationPage.updateContactInformation(row);

	}

	public static void ClassicWCMemberValidationPage_CompareNoofBottles() throws IOException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.CompareNoofBottles();

	}
	
	public static void ClassicWCMemberValidationPage_JulyPromoEligibilityforNewPickUpTypeSignUpJune25toJuly22(int row) throws IOException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.JulyPromoEligibilityforNewPickUpTypeSignUpJune25toJuly22(row);

	}
	public static void ClassicWCMemberValidationPage_JulyPromoEligibilityforNewPickUpTypeSignUpJuly23toJuly31(int row) throws IOException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.JulyPromoEligibilityforNewPickUpTypeSignUpJuly23toJuly31(row);

	}
	public static void ClassicWCMemberValidationPage_JulyPromoEligibilityforNewNonPayeeMemberSignUpJune25toJuly22(int row) throws IOException, ParseException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.JulyPromoEligibilityforNewNonPayeeMemberSignUpJune25toJuly22(row);

	}
	public static void ClassicWCMemberValidationPage_JulyPromoEligibilityforNewNonPayeeMemberSignUpJuneJuly23toJuly31(int row) throws IOException, ParseException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.JulyPromoEligibilityforNewNonPayeeMemberSignUpJuly23toJuly31(row);

	}
	
	public static void ClassicWCMemberValidationPage_noIncreasedAmbassadorPointsforJulyPromo() throws IOException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.noIncreasedAmbassadorPointsforJulyPromo();

	}
	public static void ClassicWCMemberValidationPage_julyPromoDisplayedwithYear() throws IOException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.julyPromoDisplayedwithYear();

	}
	public static void ClassicWCMemberValidationPage_SelectJulypromo(int row) throws IOException, InterruptedException, ParseException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.SelectJulypromo(row);

	}
	public static void ClassicWCMemberValidationPage_rejoinMember(int row) throws IOException, InterruptedException, ParseException, BiffException {
		ClassicWCMemberValidationPage getPage_WCMemberValidationPage = new ClassicWCMemberValidationPage();
		getPage_WCMemberValidationPage.rejoinMember(row);

	}
	
	}
