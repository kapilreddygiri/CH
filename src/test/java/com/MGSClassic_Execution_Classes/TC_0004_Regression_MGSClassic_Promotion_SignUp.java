package com.MGSClassic_Execution_Classes;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.MGS.CommonPages.Menu;
import com.MGS.CommonPages.Page_PaymentDetails;
import com.MGS.CommonPages.MGSPages;
import com.MGS.Pages.Page_Login;
import com.MGS.Pages.Page_PromotionEntry;
import com.MGS.PagesData.Member_SignUpPagedata;
import com.Utils.BasePages;
import com.Utils.LaunchBrowser;
import com.aventstack.extentreports.Status;

import jxl.read.biff.BiffException;

public class TC_0004_Regression_MGSClassic_Promotion_SignUp {

//	private static String HTMLReportPAth = System.getProperty("user.dir")
//			+ "\\Resources\\Reports\\ClassicPromotion.html";
//	private static String CurrentPageTestCaseName = "Promotion SignUP";
//	private static String ExcelSheetPath = System.getProperty("user.dir") + "\\Resources\\TestData\\MGS_TestData.xls";
//	private static String Excel_SheetName = "Promotion";
//	static BasePages ReportingPages = new BasePages(HTMLReportPAth, CurrentPageTestCaseName);
//	static Member_SignUpPagedata PromotionData = new Member_SignUpPagedata(ExcelSheetPath, Excel_SheetName);

	private static String HTMLReportPAth = null;
	private static String CurrentPageTestCaseName = null;
	private static String ExcelSheetPath = null;
	private static String Excel_SheetName = null;
	private static BasePages ReportingPages = null;
	private static String WritePath = null;
	private static Member_SignUpPagedata PromotionData = null;

	@BeforeTest
	public static void Beforetest() throws IOException, BiffException {
		HTMLReportPAth = System.getProperty("user.dir") + "\\Resources\\Reports\\ClassicPromotion.html";
		CurrentPageTestCaseName = "Promotion SignUP";
		ExcelSheetPath = System.getProperty("user.dir") + "\\Resources\\TestData\\MGS_TestData.xls";
		Excel_SheetName = "Promotion";
		ReportingPages = new BasePages(HTMLReportPAth, CurrentPageTestCaseName);
		WritePath = System.getProperty("user.dir") + "\\Resources\\TestOutData\\MGS_TestData.xls";
		PromotionData = new Member_SignUpPagedata(ExcelSheetPath, Excel_SheetName, ExcelSheetPath);

		BasePages.ResultsLog.ReportScriptStarted(CurrentPageTestCaseName);
		PromotionData.ClearExistingStatus();
		LaunchBrowser.LaunchBrowserapp();

	}

	@Test
	public static void PromotionSignUP() throws IOException, InterruptedException, BiffException {
		for (int row = 1; row < PromotionData.GetRows(); row++) {
			if (PromotionData.Getdata("WC Member Record Type", row).trim().length() > 2) {

				try {
					PromotionData.setData("Execution Status", row, "Started");
					MGSPages.Page_Login();
					MGSPages.ClassicLoginFlow(row);
					MGSPages.classicAddNewMember(row);
					MGSPages.ClassicEnterPromotionInformation(row);
					Thread.sleep(3000);
					MGSPages.Menu_ClassicApplicationLogout();
					PromotionData.setData("Execution Status", row, "Executed");
					break;
				} catch (Exception e) {

					try {
						MGSPages.Menu_Errormessage(row);
					} catch (Exception e1) {
						BasePages.ResultsLog.logger.log(Status.FAIL, "Error message not displayed");
						BasePages.ExecutionPageExceptionErrorCapture(
								CurrentPageTestCaseName + " Data Row Number, " + row, e.toString());

					}

					MGSPages.Menu_ClassicApplicationLogout();
					PromotionData.setData("Execution Status", row, " Row Execution Not Completed");
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
