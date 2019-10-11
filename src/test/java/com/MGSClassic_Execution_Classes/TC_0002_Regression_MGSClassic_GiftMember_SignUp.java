package com.MGSClassic_Execution_Classes;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.MGS.CommonPages.Menu;
import com.MGS.CommonPages.Page_PaymentDetails;
import com.MGS.CommonPages.MGSPages;
import com.MGS.CommonPages.SignUpValidationPage;
import com.MGS.Pages.Page_GiftMembersEntry;
import com.MGS.Pages.Page_Login;
import com.MGS.PagesData.Member_SignUpPagedata;
import com.Utils.BasePages;
import com.Utils.LaunchBrowser;
import com.aventstack.extentreports.Status;

import jxl.read.biff.BiffException;

public class TC_0002_Regression_MGSClassic_GiftMember_SignUp {

//	private static String HTMLReportPAth = System.getProperty("user.dir")
//			+ "\\Resources\\Reports\\ClassicGiftMember.html";
//	private static String CurrentPageTestCaseName = "Gift Member Sign Up";
//	private static String ExcelSheetPath = System.getProperty("user.dir") + "\\Resources\\TestData\\MGS_TestData.xls";
//	private static String Excel_SheetName = "Gift Member";
//	private static BasePages ReportingPages = new BasePages(HTMLReportPAth, CurrentPageTestCaseName);
//	private static Member_SignUpPagedata GiftMemberData = new Member_SignUpPagedata(ExcelSheetPath, Excel_SheetName);

	private static String HTMLReportPAth = null;
	private static String CurrentPageTestCaseName = null;
	private static String ExcelSheetPath = null;
	private static String Excel_SheetName = null;
	private static String WritePath = null;
	private static BasePages ReportingPages = null;
	private static Member_SignUpPagedata GiftMemberData = null;

	@BeforeTest
	public static void Beforetest() throws IOException, BiffException {

		HTMLReportPAth = System.getProperty("user.dir") + "\\Resources\\Reports\\ClassicGiftMember.html";
		CurrentPageTestCaseName = "Gift Memeber Sign Up";
		ExcelSheetPath = System.getProperty("user.dir") + "\\Resources\\TestData\\MGS_TestData.xls";
		Excel_SheetName = "Gift Member";
		ReportingPages = new BasePages(HTMLReportPAth, CurrentPageTestCaseName);
		WritePath = System.getProperty("user.dir") + "\\Resources\\TestOutData\\MGS_TestData.xls";
		GiftMemberData = new Member_SignUpPagedata(ExcelSheetPath, Excel_SheetName, ExcelSheetPath);

		BasePages.ResultsLog.ReportScriptStarted(CurrentPageTestCaseName);
		GiftMemberData.ClearExistingStatus();
		LaunchBrowser.LaunchBrowserapp();

	}

	@Test
	public static void GiftMemberSignUP() throws IOException, InterruptedException, BiffException {

		for (int row = 1; row < GiftMemberData.GetRows(); row++) {
			if (GiftMemberData.Getdata("WC Member Record Type", row).trim().length() > 2) {
				try {
					GiftMemberData.setData("Execution Status", row, "Started");
					MGSPages.Page_Login();
					MGSPages.ClassicLoginFlow(row);
					MGSPages.classicAddNewMember(row);
					MGSPages.ClassicEnterGiftMemberInformation(row);
					MGSPages.ClassicEnterAndValidateGiftPayment_DetailsPage(row);
					MGSPages.Menu_ClassicApplicationLogout();
					GiftMemberData.setData("Execution Status", row, "Executed");
					break;
				} catch (Exception e) {
					e.printStackTrace();
					try {
						MGSPages.Menu_Errormessage(row);
					} catch (Exception e1) {
						BasePages.ResultsLog.logger.log(Status.FAIL, "Error message not displayed");
						BasePages.ExecutionPageExceptionErrorCapture(
								CurrentPageTestCaseName + " Data Row Number, " + row, e.toString());

					}

					MGSPages.Menu_ClassicApplicationLogout();
					GiftMemberData.setData("Execution Status", row, " Row Execution Not Completed");
					 break;
				}
			}
		}
	}

	public static void ExecuteGiftMemberSignUP_FrommMainClass() throws IOException {

		BasePages.ResultsLog.ReportScriptStarted(CurrentPageTestCaseName);
	}

	@AfterTest
	public static void CloseBroswer() throws IOException {
		ReportingPages.CloseBrowser();

	}

}
