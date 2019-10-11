package com.MGSLightning_Execution_Classes;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.MGS.CommonPages.MGSPages;
import com.MGS.PagesData.Member_SignUpPagedata;
import com.Utils.BasePages;
import com.Utils.LaunchBrowser;
import com.aventstack.extentreports.Status;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class TC_0019_Regression_MGSLightning_PlaceOrder_BarrelReserve {
	
	private static String HTMLReportPAth = null;
	private static String CurrentPageTestCaseName = null;
	private static String ExcelSheetPath = null;
	private static String Excel_SheetName = null;
	private static String WritePath = null;
	private static BasePages ReportingPages = null;
	private static Member_SignUpPagedata MonthlyMemberData = null;

	@BeforeTest
	public static void Beforetest() throws IOException, BiffException {
		HTMLReportPAth = System.getProperty("user.dir") + "\\Resources\\Reports\\TC_0019_Regression_MGSLightning_PlaceOrder_BarrelReserve.html";
		CurrentPageTestCaseName = "TC_0019_Regression_MGSLightning_PlaceOrder_BarrelReserve";
		ExcelSheetPath = System.getProperty("user.dir") + "\\Resources\\TestData\\MGS_TestData.xls";
		Excel_SheetName = "Monthly Member";
		ReportingPages = new BasePages(HTMLReportPAth, CurrentPageTestCaseName);
		WritePath = System.getProperty("user.dir") + "\\Resources\\TestOutData\\MGS_TestData.xls";
		MonthlyMemberData = new Member_SignUpPagedata(ExcelSheetPath, Excel_SheetName, ExcelSheetPath);

		BasePages.ResultsLog.ReportScriptStarted(CurrentPageTestCaseName);
		MonthlyMemberData.ClearExistingStatus();
		LaunchBrowser.LaunchBrowserapp();

	}
	@Test
	public static void TC_0019_Regression_MGSLightning_PlaceOrder_BarrelReserve()
			throws IOException, InterruptedException, BiffException, WriteException {
		for (int row = 1; row < MonthlyMemberData.GetRows(); row++) {

			try {

				MonthlyMemberData.setData("Execution Status", row, "Started");
				MGSPages.Page_Login();
				MGSPages.Menu_LightningLoginFlow(row);
				MGSPages.Menu_SearchMemberLightning(row);
				MGSPages.LightningWCMemberValidationPage_orderBarrelReserve();
				MGSPages.Menu_LightningApplicationLogout();
				MonthlyMemberData.setData("Execution Status", row, "Executed");

			} catch (Exception e) {

				try {

					MGSPages.Menu_Errormessage(row);
				} catch (Exception e1) {
					BasePages.ResultsLog.logger.log(Status.FAIL, "Error message not displayed");
					BasePages.ExecutionPageExceptionErrorCapture(CurrentPageTestCaseName + " Data Row Number, " + row,
							e.toString());

				}

				MGSPages.Menu_LightningApplicationLogout();
				MonthlyMemberData.setData("Execution Status", row, "Row Execution Not Completed");
				break;
			}

		}

	}
	@AfterTest
	public static void CloseBroswer() throws IOException {
		ReportingPages.CloseBrowser();

	}
	
}