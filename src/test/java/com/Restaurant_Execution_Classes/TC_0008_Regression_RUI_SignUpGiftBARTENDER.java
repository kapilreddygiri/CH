package com.Restaurant_Execution_Classes;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.MGS.CommonPages.MGSPages;
import com.MGS.PagesData.Member_SignUpPagedata;
import com.Restaurant.CommonPages.Restaurant_Common_Pages;
import com.Restaurant.PageData.Restaurant_SignUpPagedata;
import com.Utils.BasePages;
import com.Utils.LaunchBrowser;
import com.aventstack.extentreports.Status;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class TC_0008_Regression_RUI_SignUpGiftBARTENDER {
	
	private static String HTMLReportPAth = null;
	private static String CurrentPageTestCaseName = null;
	private static String ExcelSheetPath = null;
	private static String Excel_SheetName = null;
	private static String WritePath = null;
	private static BasePages ReportingPages = null;
	private static Restaurant_SignUpPagedata RestaurantGiftMemberData = null;

	@BeforeTest
	public static void Beforetest() throws IOException, BiffException {
		HTMLReportPAth = System.getProperty("user.dir") + "\\Resources\\Reports\\TC_008_Regression_RUI_SignUpGiftBARTENDER.html";
		CurrentPageTestCaseName = "Restaurant SignUp Monthly BARTENDER";
		ExcelSheetPath = System.getProperty("user.dir") + "\\Resources\\TestData\\Restaurant_TestData.xls";
		Excel_SheetName = "Gift Member";
		ReportingPages = new BasePages(HTMLReportPAth, CurrentPageTestCaseName);
		WritePath = System.getProperty("user.dir") + "\\Resources\\TestOutData\\Restaurant_TestData.xls";
		RestaurantGiftMemberData = new Restaurant_SignUpPagedata(ExcelSheetPath, Excel_SheetName, ExcelSheetPath);

		BasePages.ResultsLog.ReportScriptStarted(CurrentPageTestCaseName);
		RestaurantGiftMemberData.ClearExistingStatus();
		LaunchBrowser.LaunchBrowserapp();

	}

	@Test
	public static void TC_008_Regression_RUI_SignUpGiftBARTENDER()
			throws IOException, InterruptedException, BiffException, WriteException {
		for (int row = 2; row < RestaurantGiftMemberData.GetRows(); row++) {
			if (RestaurantGiftMemberData.Getdata("WC Member Record Type", row).trim().length() > 2) {
				try {

				 

					Restaurant_Common_Pages.Page_LaunchURL_LaunchBartender();
					Restaurant_Common_Pages.Page_NewGiftMember_EnterNewMember(row);
					Restaurant_Common_Pages.Page_LaunchURL_LaunchAcitvationURL(row);
					Restaurant_Common_Pages.Page_MemberSearch_EnterMemberInformationforActivation(row);
					Restaurant_Common_Pages.Page_GiftActivationPage_activateMembership(row);
					Restaurant_Common_Pages.Page_WinePickUp_ValidateWinePickUP_PageGift(row);
				 
					break;
				} catch (Exception e) {
					System.out.println("In Catch Main");
					BasePages.ResultsLog.logger.log(Status.FAIL, e.toString() + " Row " + row);
					try {

						// CommunitiesPages.Menu_Errormessage(row);
					} catch (Exception e1) {
						BasePages.ResultsLog.logger.log(Status.FAIL, "Error message not displayed");
						BasePages.ExecutionPageExceptionErrorCapture(
								CurrentPageTestCaseName + " Data Row Number, " + row, e.toString());
						break;
					}

					RestaurantGiftMemberData.setData("Execution Status", row, "Row Execution Not Completed");

				}
			}
		}

	}

	@AfterTest
	public static void CloseBroswer() throws IOException {
		ReportingPages.CloseBrowser();

	}
	
	
}
