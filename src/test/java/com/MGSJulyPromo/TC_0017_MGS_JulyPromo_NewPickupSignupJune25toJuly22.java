package com.MGSJulyPromo;

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

public class TC_0017_MGS_JulyPromo_NewPickupSignupJune25toJuly22 {
	private static String HTMLReportPAth = null;
	private static String CurrentPageTestCaseName = null;
	private static String ExcelSheetPath = null;
	private static String Excel_SheetName = null;
	private static String WritePath = null;
	private static BasePages ReportingPages = null;
	private static Member_SignUpPagedata MonthlyMemberData = null;

	@BeforeTest
	public static void Beforetest() throws IOException, BiffException {
		HTMLReportPAth = System.getProperty("user.dir") + "\\Resources\\Reports\\TC_0017_MGS_JulyPromo_NewPickupSignupJune25toJuly22.html";
		CurrentPageTestCaseName = "July Promo New Pcikup SignUp from June25 to July22";
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
	public static void TC_0017_MGS_JulyPromo_NewPickupSignupJune25toJuly22()
			throws IOException, InterruptedException, BiffException, WriteException {
		for (int row = 1; row < MonthlyMemberData.GetRows(); row++) {

			try {

				MonthlyMemberData.setData("Execution Status", row, "Started");
				MGSPages.Page_Login();
				MGSPages.ClassicLoginFlow(row);
				MGSPages.ClassicEnterMonthlyMemberInformation(row);
				MGSPages.ClassicWCMemberValidationPage_JulyPromoEligibilityforNewPickUpTypeSignUpJune25toJuly22(row);
				
				
				System.out.println("Thread sleep 20000");
				Thread.sleep(20000);
				MGSPages.Menu_ClassicApplicationLogout();
				MonthlyMemberData.setData("Execution Status", row, "Executed");

			} catch (Exception e) {

				try {

					MGSPages.Menu_Errormessage(row);
				} catch (Exception e1) {
					BasePages.ResultsLog.logger.log(Status.FAIL, "Error message not displayed");
					BasePages.ExecutionPageExceptionErrorCapture(CurrentPageTestCaseName + " Data Row Number, " + row,
							e.toString());

				}

				MGSPages.Menu_ClassicApplicationLogout();
				MonthlyMemberData.setData("Execution Status", row, "Row Execution Not Completed");

			}

		}

	}
	
}
