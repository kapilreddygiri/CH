package com.Communities_Execution_Classes;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Communities.CommonPages.CommunitiesPages;
import com.Communities.PagesData.CommunitiesMember_SignUpPagedata;
import com.Utils.BasePages;
import com.Utils.LaunchBrowser;
import com.aventstack.extentreports.Status;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class GiftMember_SignUp {

	private static String HTMLReportPAth = null;
	private static String CurrentPageTestCaseName = null;
	private static String ExcelSheetPath = null;
	private static String Excel_SheetName = null;
	private static String WritePath = null;
	private static BasePages ReportingPages = null;
	private static CommunitiesMember_SignUpPagedata CommunitiesMonthlyMemberData = null;

	@BeforeTest
	public static void Beforetest() throws IOException, BiffException {

		HTMLReportPAth = System.getProperty("user.dir") + "\\Resources\\Reports\\CommunitiesGiftMembers.html";
		CurrentPageTestCaseName = "Communities Gift Member SignUP";
		ExcelSheetPath = System.getProperty("user.dir") + "\\Resources\\TestData\\Communities_TestData.xls";
		Excel_SheetName = "Gift Member";
		ReportingPages = new BasePages(HTMLReportPAth, CurrentPageTestCaseName);
		WritePath = System.getProperty("user.dir") + "\\Resources\\TestOutData\\Communities_TestData.xls";
		CommunitiesMonthlyMemberData = new CommunitiesMember_SignUpPagedata(ExcelSheetPath, Excel_SheetName, ExcelSheetPath);

		BasePages.ResultsLog.ReportScriptStarted(CurrentPageTestCaseName);
		CommunitiesMonthlyMemberData.ClearExistingStatus();
		LaunchBrowser.LaunchBrowserapp();

	}

	@Test
	public static void CommunitiesGiftMemberSignUP()
			throws IOException, InterruptedException, BiffException, WriteException {
		for (int row = 1; row < CommunitiesMonthlyMemberData.GetRows(); row++) {
			if (CommunitiesMonthlyMemberData.Getdata("WC Member Record Type", row).trim().length() > 2) {
				try {

					CommunitiesMonthlyMemberData.setData("Execution Status", row, "Started");

					CommunitiesPages.CMUPage_Login_SignUp(row);
					CommunitiesPages.CMUPage_Gift_EnterWineClubInformation_Gift(row);
					CommunitiesPages.CMUPage_PaymentPage_EnterandValidate_PaymentPage(row);
					CommunitiesPages.CMUPage_PaymentApproved_CopyCardNumber(row);
					CommunitiesMonthlyMemberData.setData("Execution Status", row, "Executed");
					break;
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("In Catch Main");
					BasePages.ResultsLog.logger.log(Status.FAIL, e.toString() + " Row " + row);
					try {

 					} catch (Exception e1) {
						BasePages.ResultsLog.logger.log(Status.FAIL, "Error message not displayed");
						BasePages.ExecutionPageExceptionErrorCapture(
								CurrentPageTestCaseName + " Data Row Number, " + row, e.toString());
						break;
					}
					CommunitiesPages.CMUPage_Menu_ClickLogout(row);

 					CommunitiesMonthlyMemberData.setData("Execution Status", row, "Row Execution Not Completed");
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
