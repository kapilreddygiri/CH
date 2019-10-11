package com.MGSClassic_Execution_Classes;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.MGS.CommonPages.Menu;
import com.MGS.CommonPages.MGSPages;
import com.MGS.Pages.Page_Login;
import com.MGS.PagesData.Member_SignUpPagedata;
import com.Utils.BasePages;
import com.Utils.LaunchBrowser;
import com.aventstack.extentreports.Status;

import jxl.read.biff.BiffException;

public class TC_0006_Regression_MGSClassic_Complimentary_SignUp {

//	private  String HTMLReportPAth = System.getProperty("user.dir")
//			+ "\\Resources\\Reports\\ClassicComplimentary.html";
//	private  String CurrentPageTestCaseName = "Complimentary Sign Up";
//	private  String ExcelSheetPath = System.getProperty("user.dir") + "\\Resources\\TestData\\MGS_TestData.xls";
//	private  String Excel_SheetName = "Complimentary";
//	private  BasePages ReportingPages = new BasePages(HTMLReportPAth, CurrentPageTestCaseName);
//	private  Member_SignUpPagedata Complimentarydata = new Member_SignUpPagedata(ExcelSheetPath, Excel_SheetName);

	private static String HTMLReportPAth = null;
	private static String CurrentPageTestCaseName = null;
	private static String ExcelSheetPath = null;
	private static String Excel_SheetName = null;
	private static String WritePath = null;
	private static BasePages ReportingPages = null;
	private static Member_SignUpPagedata Complimentarydata = null;

	@BeforeTest
	public static void Beforetest() throws IOException, BiffException {

		HTMLReportPAth = System.getProperty("user.dir") + "\\Resources\\Reports\\ClassicComplimentary.html";
		CurrentPageTestCaseName = "Complimentary Sign Up";
		ExcelSheetPath = System.getProperty("user.dir") + "\\Resources\\TestData\\MGS_TestData.xls";
		Excel_SheetName = "Complimentary";
		ReportingPages = new BasePages(HTMLReportPAth, CurrentPageTestCaseName);
		WritePath = System.getProperty("user.dir") + "\\Resources\\TestOutData\\MGS_TestData.xls";
		Complimentarydata = new Member_SignUpPagedata(ExcelSheetPath, Excel_SheetName, ExcelSheetPath);
		System.out.println("@Before Classic");
		BasePages.ResultsLog.ReportScriptStarted(CurrentPageTestCaseName);
		Complimentarydata.ClearExistingStatus();
		LaunchBrowser.LaunchBrowserapp();

	}

	@Test
	public static void ComplimentarySignUP() throws IOException, InterruptedException, BiffException {
		System.out.println("@Test Classic");
		long id = Thread.currentThread().getId();
		System.out.println(id);
		for (int row = 1; row < Complimentarydata.GetRows(); row++) {
			if (Complimentarydata.Getdata("WC Member Record Type", row).trim().length() > 2) {

				try {
					Complimentarydata.setData("Execution Status", row, "Started");
					MGSPages.Page_Login();
					MGSPages.ClassicLoginFlow(row);
					MGSPages.classicAddNewMember(row);
					MGSPages.ClassicEnterComplimentaryInformation(row);
					MGSPages.ClassicValidateWCMemberDetails_Complimentary(row);
					MGSPages.Menu_ClassicApplicationLogout();
					Complimentarydata.setData("Execution Status", row, "Executed");
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
					Complimentarydata.setData("Execution Status", row, " Row Execution Not Completed");
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
