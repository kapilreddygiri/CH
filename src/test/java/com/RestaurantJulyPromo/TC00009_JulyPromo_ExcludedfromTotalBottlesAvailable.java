package com.RestaurantJulyPromo;

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

public class TC00009_JulyPromo_ExcludedfromTotalBottlesAvailable {

	private static String HTMLReportPAth = null;
	private static String CurrentPageTestCaseName = null;
	private static String ExcelSheetPath = null;
	private static String Excel_SheetName = null;
	private static String WritePath = null;
	private static BasePages ReportingPages = null;
	private static Restaurant_SignUpPagedata RestaurantMonthlyMemberData = null;

	@BeforeTest
	public static void Beforetest() throws IOException, BiffException {
		HTMLReportPAth = System.getProperty("user.dir")
				+ "\\Resources\\Reports\\TC00009_JulyPromo_ExcludedfromTotalBottlesAvailable.html";
		CurrentPageTestCaseName = "TC00009_JulyPromo_ExcludedfromTotalBottlesAvailable";
		ExcelSheetPath = System.getProperty("user.dir") + "\\Resources\\TestData\\Restaurant_TestData.xls";
		Excel_SheetName = "Gift Member";
		ReportingPages = new BasePages(HTMLReportPAth, CurrentPageTestCaseName);
		WritePath = System.getProperty("user.dir") + "\\Resources\\TestOutData\\Restaurant_TestData.xls";
		RestaurantMonthlyMemberData = new Restaurant_SignUpPagedata(ExcelSheetPath, Excel_SheetName, ExcelSheetPath);

		BasePages.ResultsLog.ReportScriptStarted(CurrentPageTestCaseName);
		RestaurantMonthlyMemberData.ClearExistingStatus();
		LaunchBrowser.LaunchBrowserapp();

	}

	@Test
	public static void TC00009_JulyPromo_ExcludedfromTotalBottlesAvailable()
			throws IOException, InterruptedException, BiffException, WriteException {
		for (int row = 2; row < RestaurantMonthlyMemberData.GetRows(); row++) {
			if (RestaurantMonthlyMemberData.Getdata("WC Member Record Type", row).trim().length() > 2) {
				try {

					RestaurantMonthlyMemberData.setData("Execution Status", row, "Started");

					Restaurant_Common_Pages.Page_LaunchURL_LaunchManager();
					Restaurant_Common_Pages.Page_MemberSearch_EnterMemberInformation(row);
					Restaurant_Common_Pages.Page_WinePickUp_julyPromoBottleExculdedfromTotalBottles();
					RestaurantMonthlyMemberData.setData("Execution Status", row, "Executed");
					break;
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("In Catch Main");
					BasePages.ResultsLog.logger.log(Status.FAIL, e.toString() + " Row " + row);
					try {

						// CommunitiesPages.Menu_Errormessage(row);
					} catch (Exception e1) {
						BasePages.ResultsLog.logger.log(Status.FAIL, "Error message not displayed");
						BasePages.ExecutionPageExceptionErrorCapture(
								CurrentPageTestCaseName + " Data Row Number, " + row, e.toString());

					}

					RestaurantMonthlyMemberData.setData("Execution Status", row, "Row Execution Not Completed");

				}
			}
		}

	}

	@AfterTest
	public static void CloseBroswer() throws IOException {
		ReportingPages.CloseBrowser();

	}

}