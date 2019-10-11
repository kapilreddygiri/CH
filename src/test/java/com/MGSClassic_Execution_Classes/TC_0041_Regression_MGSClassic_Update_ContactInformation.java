package com.MGSClassic_Execution_Classes;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.MGS.CommonPages.MGSPages;
import com.MGS.PagesData.Member_SignUpPagedata;
import com.Utils.BasePages;
import com.Utils.LaunchBrowser;
import com.aventstack.extentreports.Status;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class TC_0041_Regression_MGSClassic_Update_ContactInformation {
	
	private static String HTMLReportPAth = null;
	private static String CurrentPageTestCaseName = null;
	private static String ExcelSheetPath = null;
	private static String Excel_SheetName = null;
	private static String WritePath = null;
	private static BasePages ReportingPages = null;
	private static Member_SignUpPagedata MothlyMemberData = null;

	@BeforeTest
	public static void Beforetest() throws IOException, BiffException {
		HTMLReportPAth = System.getProperty("user.dir") + "\\Resources\\Reports\\TC_0041_Regression_MGSClassic_Update_ContactInformation.html";
		CurrentPageTestCaseName = "TC_0041_Regression_MGSClassic_Update_ContactInformation";
		ExcelSheetPath = System.getProperty("user.dir") + "\\Resources\\TestData\\MGS_TestData.xls";
		Excel_SheetName = "Monthly Member";
		ReportingPages = new BasePages(HTMLReportPAth, CurrentPageTestCaseName);
		WritePath = System.getProperty("user.dir") + "\\Resources\\TestOutData\\MGS_TestData.xls";
		MothlyMemberData = new Member_SignUpPagedata(ExcelSheetPath, Excel_SheetName, ExcelSheetPath);

		BasePages.ResultsLog.ReportScriptStarted(CurrentPageTestCaseName);
		MothlyMemberData.ClearExistingStatus();
		LaunchBrowser.LaunchBrowserapp();

	}
	@Test
	public static void TC_0041_Regression_MGSClassic_Update_ContactInformation()
			throws IOException, InterruptedException, BiffException, WriteException {
		for (int row = 1; row < MothlyMemberData.GetRows(); row++) {

			try {

				MothlyMemberData.setData("Execution Status", row, "Started");
				MGSPages.Page_Login();
				MGSPages.ClassicLoginFlow(row);
				MGSPages.Menu_SearchMember(row);
				MGSPages.ClassicWCMemberValidationPage_updateContactInformation(row);
				MGSPages.Menu_ClassicApplicationLogout();
				MothlyMemberData.setData("Execution Status", row, "Executed");
				break;

			} catch (Exception e) {

				try {

					MGSPages.Menu_Errormessage(row);
				} catch (Exception e1) {
					BasePages.ResultsLog.logger.log(Status.FAIL, "Error message not displayed");
					BasePages.ExecutionPageExceptionErrorCapture(CurrentPageTestCaseName + " Data Row Number, " + row,
							e.toString());

				}

				MGSPages.Menu_ClassicApplicationLogout();
				MothlyMemberData.setData("Execution Status", row, "Row Execution Not Completed");
				 break;
			}

		}

	}
	
	
}
