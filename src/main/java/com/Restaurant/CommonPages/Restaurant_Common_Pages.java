package com.Restaurant.CommonPages;

import java.io.IOException;
import java.text.ParseException;

import com.Restaurant.Pages.Page_AccountInfo;
import com.Restaurant.Pages.Page_GiftActivationPage;
import com.Restaurant.Pages.Page_LaunchURL;
import com.Restaurant.Pages.Page_MemberSearch;
import com.Restaurant.Pages.Page_NewGiftMember;
import com.Restaurant.Pages.Page_NewMember;
import com.Restaurant.Pages.Page_ProcessPayment;
import com.Restaurant.Pages.Page_Rewards;
import com.Restaurant.Pages.Page_Services;
import com.Restaurant.Pages.Page_WineClubInformation;
import com.Restaurant.Pages.Page_WinePickUp;

import jxl.read.biff.BiffException;

public class Restaurant_Common_Pages {

	// Login

	public static void Page_LaunchURL_LaunchURL() throws IOException, InterruptedException {
		Page_LaunchURL getPage_Page_LaunchURL = new Page_LaunchURL();
		getPage_Page_LaunchURL.LaunchURL();
	}

	public static void Page_LaunchURL_LaunchAcitvationURL(int row) throws IOException, InterruptedException {
		Page_LaunchURL getPage_Page_LaunchURL = new Page_LaunchURL();
		getPage_Page_LaunchURL.LaunchAcitvationURL(row);
	}

	public static void Page_LaunchURL_LaunchManager() throws IOException, InterruptedException {
		Page_LaunchURL getPage_Page_LaunchURL = new Page_LaunchURL();
		getPage_Page_LaunchURL.LaunchURLManager();
	}

	public static void Page_LaunchURL_LaunchServer() throws IOException, InterruptedException {
		Page_LaunchURL getPage_Page_LaunchURL = new Page_LaunchURL();
		getPage_Page_LaunchURL.LaunchURLServer();
	}

	public static void Page_LaunchURL_LaunchBartender() throws IOException, InterruptedException {
		Page_LaunchURL getPage_Page_LaunchURL = new Page_LaunchURL();
		getPage_Page_LaunchURL.LaunchURLBarTender();
	}

	public static void Page_LaunchURL_LaunchTRA() throws IOException, InterruptedException {
		Page_LaunchURL getPage_Page_LaunchURL = new Page_LaunchURL();
		getPage_Page_LaunchURL.LaunchURLTRA();
	}

	public static void Page_MemberSearch_EnterMemberInformation(int row)
			throws IOException, InterruptedException, BiffException {
		Page_MemberSearch getPage_Page_MemberSearch = new Page_MemberSearch();
		getPage_Page_MemberSearch.EnterMemberInformation(row);
		
	}
	public static void Page_MemberSearch_EnterMemberInformationforActivation(int row)
			throws IOException, InterruptedException, BiffException {
		Page_MemberSearch getPage_Page_MemberSearch = new Page_MemberSearch();
		getPage_Page_MemberSearch.searchCardforActivation(row);
		
	}

	public static void Page_NewMember_EnterNewMember(int row) throws IOException, InterruptedException, BiffException {
		Page_NewMember getPage_Page_NewMember = new Page_NewMember();
		getPage_Page_NewMember.EnterNewMember(row);
	}
	public static void Page_NewGiftMember_EnterNewMember(int row) throws IOException, InterruptedException, BiffException {
		Page_NewGiftMember getPage_Page_NewGiftMember = new Page_NewGiftMember();
		getPage_Page_NewGiftMember.EnterNewGiftMember(row);
	}

	public static void Page_ProcessPayment_PaymentProcess(int row)
			throws IOException, InterruptedException, BiffException {
		Page_ProcessPayment getPage_Page_ProcessPayment = new Page_ProcessPayment();
		getPage_Page_ProcessPayment.PaymentProcess(row);
	}

	public static void Page_WinePickUp_ValidateWinePickUP_PageMonthly(int row)
			throws IOException, InterruptedException, BiffException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.ValidateWinePickUP_PageMonthly(row);
	}
	public static void Page_WinePickUp_ValidateWinePickUP_PageGift(int row)
			throws IOException, InterruptedException, BiffException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.ValidateWinePickUP_PageGift(row);
	}


	public static void Page_WinePickUp_SelectWCPriorWOMPickUP()
			throws IOException, InterruptedException, BiffException, ParseException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.SelectWCPriorWOMPickUP();
	}

	public static void Page_WinePickUp_SelectWCPriorWOMPickUPwithCharge()
			throws IOException, InterruptedException, BiffException, ParseException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.SelectWCPriorWOMPickUPwithCharge();
	}

	public static void Page_WinePickUp_SelectWCCurrentWOMPickUP()
			throws IOException, InterruptedException, BiffException, ParseException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.SelectWCCurrentWOMPickUP();
	}

	public static void Page_WinePickUp_SelectWCCurrentWOMPickUPwithCharge()
			throws IOException, InterruptedException, BiffException, ParseException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.SelectWCCurrentWOMPickUPwithUpCharge();
	}

	public static void Page_WinePickUp_ClickSaveWCMemberWOMSelections()
			throws IOException, InterruptedException, BiffException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.ClickSaveWCMemberWOMSelections();
	}

	public static void Page_WinePickUp_markOffTasting() throws IOException, InterruptedException, BiffException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.markOffTasting();
	}

	public static void Page_WinePickUp_noMarkOffTasting() throws IOException, InterruptedException, BiffException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.noMarkOffTasting();
	}

	public static void Page_WinePickUp_swap2Womsfor1Lux() throws IOException, InterruptedException, BiffException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.swap2Womsfor1Lux();
	}

	public static void Page_WinePickUp_SelectJulypromo(int row) throws IOException, InterruptedException, BiffException, ParseException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.SelectJulypromo(row);
	}

	public static void Page_WinePickUp_CompareNoofBottles(int row) throws Exception {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.CompareNoofBottles(row);
	}
	public static void Page_WinePickUp_JulyPromoNotEnabled() throws Exception {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.JulyPromoNotEnabled();
	}

	public static void Page_WinePickUp_noAmbassadorPointsforJulyPromo( int row  )
			throws IOException, InterruptedException, BiffException, ParseException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.noIncreasedAmbassadorPointsforJulyPromo(row );
	}

	public static void Page_WinePickUp_JulyPromoEligibilityforNewPickUpTypeSignUpJune25toJuly22(int row)
			throws IOException, InterruptedException, BiffException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.JulyPromoEligibilityforNewPickUpTypeSignUpJune25toJuly22(row);
	}
	public static void Page_WinePickUp_JulyPromoEligibilityforNewPickUpTypeSignUpJuly23toJuly31(int row)
			throws IOException, InterruptedException, BiffException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.JulyPromoEligibilityforNewPickUpTypeSignUpJuly23toJuly31(row);
	}
	public static void Page_WinePickUp_JulyPromoEligibilityforNewNonPayeeMemberSignUpJune25toJuly22(int row)
			throws IOException, InterruptedException, BiffException, ParseException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.JulyPromoEligibilityforNewNonPayeeMemberSignUpJune25toJuly22(row);
	}
	public static void Page_WinePickUp_JulyPromoEligibilityforNewComplimentaryPickUpTypeSignUpJune25toJuly22(int row)
			throws IOException, InterruptedException, BiffException, ParseException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.JulyPromoEligibilityforNewNonPayeeMemberSignUpJuly23toJuly31(row);
	}

	public static void Page_WinePickUp_julyPromoDisplayedatTop()
			throws IOException, InterruptedException, BiffException, ParseException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.julyPromoDisplayedatTop();
	}
	public static void Page_WinePickUp_julyPromoDisplayedwithYear()
			throws IOException, InterruptedException, BiffException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.julyPromoDisplayedwithYear();
	}
	
	public static void Page_WinePickUp_julyPromoBottleExculdedfromTotalBottles()
			throws IOException, InterruptedException, BiffException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.julyPromoBottleExculdedfromTotalBottles();
	}
	public static void Page_WinePickUp_bottlesAvailableIncludedinTotalBottles()
			throws IOException, InterruptedException, BiffException {
		Page_WinePickUp getPage_Page_Page_WinePickUp = new Page_WinePickUp();
		getPage_Page_Page_WinePickUp.bottlesAvailableIncludedinTotalBottles();
	}

	public static void Page_AccountInfo_ValidateAccountInfo(int row)
			throws IOException, InterruptedException, BiffException {
		Page_AccountInfo getPage_Page_AccountInfo = new Page_AccountInfo();
		getPage_Page_AccountInfo.ValidateAccountInfo(row);
	}
	public static void Page_AccountInfo_updateCreditCard(int row)
			throws IOException, InterruptedException, BiffException {
		Page_AccountInfo getPage_Page_AccountInfo = new Page_AccountInfo();
		getPage_Page_AccountInfo.updateCreditCard(row);
	}
	

	public static void Page_AccountInfo_ChangeContactInformation(int row)
			throws IOException, InterruptedException, BiffException {
		Page_AccountInfo getPage_Page_AccountInfo = new Page_AccountInfo();
		getPage_Page_AccountInfo.ChangeContactInformation(row);
	}

	public static void Page_AccountInfo_CancelMembership( )
			throws IOException, InterruptedException, BiffException {
		Page_AccountInfo getPage_Page_AccountInfo = new Page_AccountInfo();
		getPage_Page_AccountInfo.CancelMembership( );
	}
	public static void Page_AccountInfo_RejoinMember(int row )
			throws IOException, InterruptedException, BiffException, ParseException {
		Page_AccountInfo getPage_Page_AccountInfo = new Page_AccountInfo();
		getPage_Page_AccountInfo.rejoinMember(row );
	}
	public static void Page_AccountInfo_bottlesUpgradefrom1to2(int row )
			throws IOException, InterruptedException, BiffException, ParseException {
		Page_AccountInfo getPage_Page_AccountInfo = new Page_AccountInfo();
		getPage_Page_AccountInfo.bottlesUpgradefrom1to2(row);
	}
	public static void Page_AccountInfo_MemberSignatureCheckedOPtOut(int row)
			throws IOException, InterruptedException, BiffException {
		Page_AccountInfo getPage_Page_AccountInfo = new Page_AccountInfo();
		getPage_Page_AccountInfo.MemberSignatureCheckedOPtOut();
	}

	public static void Page_AccountInfo_MemberSignatureCheckedOPtIn()
			throws IOException, InterruptedException, BiffException {
		Page_AccountInfo getPage_Page_AccountInfo = new Page_AccountInfo();
		getPage_Page_AccountInfo.MemberSignatureCheckedOPtIn();
	}

	public static void Page_AccountInfo_extendMembershipbeforeExpiry(int row)
			throws IOException, InterruptedException, BiffException {
		Page_AccountInfo getPage_Page_AccountInfo = new Page_AccountInfo();
		getPage_Page_AccountInfo.extendMembershipbeforeExpiry(row);
	}

	public static void Page_AccountInfo_extendMembershipafterExpiry(int row)
			throws IOException, InterruptedException, BiffException {
		Page_AccountInfo getPage_Page_AccountInfo = new Page_AccountInfo();
		getPage_Page_AccountInfo.extendMembershipafterExpiry(row);
	}

	public static void Page_AccountInfo_convertMembershipbeforeExpiry()
			throws IOException, InterruptedException, BiffException {
		Page_AccountInfo getPage_Page_AccountInfo = new Page_AccountInfo();
		getPage_Page_AccountInfo.convertMembershipbeforeExpiry();
	}

	public static void Page_AccountInfo_convertMembershipafterExpiry()
			throws IOException, InterruptedException, BiffException {
		Page_AccountInfo getPage_Page_AccountInfo = new Page_AccountInfo();
		getPage_Page_AccountInfo.convertMembershipafterExpiry();
	}

	public static void Page_AccountInfo_VacationHold( ) throws Exception {
		Page_AccountInfo getPage_Page_AccountInfo = new Page_AccountInfo();
		getPage_Page_AccountInfo.putVacationHold( );
	}
	public static void Page_GiftActivationPage_activateMembership(int row)
			throws IOException, InterruptedException, BiffException {
		Page_GiftActivationPage getPage_Page_GiftActivationPage = new Page_GiftActivationPage();
		getPage_Page_GiftActivationPage.activateMembership(row);
	}
	public static void Page_Rewards_AddLoyaltyPoints(int row) throws IOException, InterruptedException, BiffException {
		Page_Rewards getPage_Page_Rewards = new Page_Rewards();
		getPage_Page_Rewards.AddLoyaltyPoints();
	}

	public static void Page_Rewards_CannotAddLoyaltyPoints(int row)
			throws IOException, InterruptedException, BiffException {
		Page_Rewards getPage_Page_Rewards = new Page_Rewards();
		getPage_Page_Rewards.CannotAddLoyaltyPoints();
	}

	public static void Page_Services_AddNotes(int row) throws IOException, InterruptedException, BiffException {
		Page_Services getPage_Page_Services = new Page_Services();
		getPage_Page_Services.AddNotes(row);
	}

	public static void Page_Services_ReplacePersonalizedWCCardMAILED(int row)
			throws IOException, InterruptedException, BiffException {
		Page_Services getPage_Page_Services = new Page_Services();
		getPage_Page_Services.ReplacePersonalizedWCCardMAILED(row);
	}

	public static void Page_Services_UpdateWCCardNumberINRESTAURANT(int row)
			throws IOException, InterruptedException, BiffException {
		Page_Services getPage_Page_Services = new Page_Services();
		getPage_Page_Services.UpdateWCCardNumberINRESTAURANT(row);
	}

	public static void Page_WineClubInformation_ChangeDeliveryNextBillingCycle(int row)
			throws IOException, InterruptedException, BiffException {
		Page_WineClubInformation getPage_Page_WineClubInformation = new Page_WineClubInformation();
		getPage_Page_WineClubInformation.ChangeDeliveryNextBillingCycle(row);
	}

	public static void Page_WineClubInformation_Changeclubtypenextbillingcycle(int row)
			throws IOException, InterruptedException, BiffException {
		Page_WineClubInformation getPage_Page_WineClubInformation = new Page_WineClubInformation();
		getPage_Page_WineClubInformation.Changeclubtypenextbillingcycle(row);
	}

	public static void Page_WineClubInformation_DecreasedClubTypeMemberCostNextBillingCycle(int row)
			throws IOException, InterruptedException, BiffException {
		Page_WineClubInformation getPage_Page_WineClubInformation = new Page_WineClubInformation();
		getPage_Page_WineClubInformation.decreasedClubTypeMemberCostNextBillingCycle();
	}

	public static void Page_WineClubInformation_IncreasedClubTypeMemberCostNextBillingCycle(int row)
			throws IOException, InterruptedException, BiffException {
		Page_WineClubInformation getPage_Page_WineClubInformation = new Page_WineClubInformation();
		getPage_Page_WineClubInformation.increasedClubTypeMemberCostNextBillingCycle();
	}

	public static void Page_WineClubInformation_Changebottle1to2immediately(int row)
			throws IOException, InterruptedException, BiffException {
		Page_WineClubInformation getPage_Page_WineClubInformation = new Page_WineClubInformation();
		getPage_Page_WineClubInformation.Changebottle1to2immediately();
	}

	public static void Page_WineClubInformation_Changebottle2to1immediately(int row)
			throws IOException, InterruptedException, BiffException {
		Page_WineClubInformation getPage_Page_WineClubInformation = new Page_WineClubInformation();
		getPage_Page_WineClubInformation.Changebottle2to1immediately();
	}

	public static void Page_WineClubInformation_Changebottle1to2nextBillingCycle(int row)
			throws IOException, InterruptedException, BiffException {
		Page_WineClubInformation getPage_Page_WineClubInformation = new Page_WineClubInformation();
		getPage_Page_WineClubInformation.Changebottle1to2nextBillingCycle();
	}

	public static void Page_WineClubInformation_Changebottle2to1nextBillingCycle(int row)
			throws IOException, InterruptedException, BiffException {
		Page_WineClubInformation getPage_Page_WineClubInformation = new Page_WineClubInformation();
		getPage_Page_WineClubInformation.Changebottle2to1nextBillingCycle();
	}

}
