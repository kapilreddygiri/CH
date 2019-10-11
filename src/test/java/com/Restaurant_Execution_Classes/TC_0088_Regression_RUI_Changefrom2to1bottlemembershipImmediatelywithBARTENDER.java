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

public class TC_0088_Regression_RUI_Changefrom2to1bottlemembershipImmediatelywithBARTENDER  {
	
	private static String HTMLReportPAth = null;
	private static String CurrentPageTestCaseName = null;
	private static String ExcelSheetPath = null;
	private static String Excel_SheetName = null;
	private static String WritePath = null;
	private static BasePages ReportingPages = null;
	private static Restaurant_SignUpPagedata RestaurantMonthlyMemberData = null;

	@BeforeTest
	public static void BeforeTest() throws IOException, BiffException {
		HTMLReportPAth = System.getProperty("user.dir") + "\\Resources\\Reports\\TC_0088_Regression_RUI_Changefrom2to1bottlemembershipImmediatelywithBARTENDER.html";
		CurrentPageTestCaseName = "Change from 2 to 1 bottle membership Immediately with BARTENDER";
		ExcelSheetPath = System.getProperty("user.dir") + "\\Resources\\TestData\\Restaurant_TestData.xls";
		Excel_SheetName = "Monthly Member";
		ReportingPages = new BasePages(HTMLReportPAth, CurrentPageTestCaseName);
		WritePath = System.getProperty("user.dir") + "\\Resources\\TestOutData\\Restaurant_TestData.xls";
		RestaurantMonthlyMemberData = new Restaurant_SignUpPagedata(ExcelSheetPath, Excel_SheetName, ExcelSheetPath);

		BasePages.ResultsLog.ReportScriptStarted(CurrentPageTestCaseName);
		RestaurantMonthlyMemberData.ClearExistingStatus();
		LaunchBrowser.LaunchBrowserapp();

	}

	@Test
	public static void TC_0088_Regression_RUI_Changefrom2to1bottlemembershipImmediatelywithBARTENDER ()
			throws IOException, InterruptedException, BiffException, WriteException {
		for (int row = 1; row < RestaurantMonthlyMemberData.GetRows(); row++) {
			if (RestaurantMonthlyMemberData.Getdata("WC Member Record Type", row).trim().length() > 2) {
				try {

 
					Restaurant_Common_Pages.Page_LaunchURL_LaunchBartender();
					Restaurant_Common_Pages.Page_MemberSearch_EnterMemberInformation(row);
					Restaurant_Common_Pages.Page_WineClubInformation_Changebottle2to1immediately(row);
					
					
 
 					break;
				} catch (Exception e) {
					System.out.println("In Catch Main");
					BasePages.ResultsLog.logger.log(Status.FAIL, e.toString() + " Row " + row);
					try {

 					} catch (Exception e1) {
						BasePages.ResultsLog.logger.log(Status.FAIL, "Error message not displayed");
						BasePages.ExecutionPageExceptionErrorCapture(
								CurrentPageTestCaseName + " Data Row Number, " + row, e.toString());
						break;
					}

					RestaurantMonthlyMemberData.setData("Execution Status", row, "Row Execution Not Completed");
					break;
				}
			}
		}

	}

	@AfterTest
	public static void CloseBroswer() throws IOException {
		ReportingPages.CloseBrowser();

	}
	
	
}
