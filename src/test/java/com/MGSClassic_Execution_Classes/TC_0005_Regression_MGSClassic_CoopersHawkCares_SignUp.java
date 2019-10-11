package com.MGSClassic_Execution_Classes;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MGS.CommonPages.Menu;
import com.MGS.CommonPages.MGSPages;
import com.MGS.Pages.Page_Login;
import com.MGS.PagesData.Member_SignUpPagedata;
import com.Utils.BasePages;
import com.Utils.LaunchBrowser;
import com.aventstack.extentreports.Status;

import jxl.read.biff.BiffException;

public class TC_0005_Regression_MGSClassic_CoopersHawkCares_SignUp {

//	private static String HTMLReportPAth = System.getProperty("user.dir")
//			+ "\\Resources\\Reports\\ClassicCoopersHawkCares.html";
//	private static String CurrentPageTestCaseName = "Cooper's Hawk Cares Sign Up";
//	private static String ExcelSheetPath = System.getProperty("user.dir") + "\\Resources\\TestData\\MGS_TestData.xls";
//	private static String Excel_SheetName = "Coopers Hawk Cares";
//	static BasePages ReportingPages = new BasePages(HTMLReportPAth, CurrentPageTestCaseName);
//	static Member_SignUpPagedata CoopersHawkCareData = new Member_SignUpPagedata(ExcelSheetPath, Excel_SheetName);

	private static String HTMLReportPAth = null;
	private static String CurrentPageTestCaseName = null;
	private static String ExcelSheetPath = null;
	private static String WritePath = null;
	private static String Excel_SheetName = null;
	private static BasePages ReportingPages = null;
	private static Member_SignUpPagedata CoopersHawkCareData = null;

	@BeforeTest
	public static void Beforetest() throws IOException, BiffException {

		HTMLReportPAth = System.getProperty("user.dir") + "\\Resources\\Reports\\ClassicCoopersHawkCares.html";
		CurrentPageTestCaseName = "Cooper's Hawk Cares Sign Up";
		ExcelSheetPath = System.getProperty("user.dir") + "\\Resources\\TestData\\MGS_TestData.xls";
		WritePath = System.getProperty("user.dir") + "\\Resources\\TestOutData\\MGS_TestData.xls";
		Excel_SheetName = "Coopers Hawk Cares";
		ReportingPages = new BasePages(HTMLReportPAth, CurrentPageTestCaseName);
		CoopersHawkCareData = new Member_SignUpPagedata(ExcelSheetPath, Excel_SheetName, ExcelSheetPath);

		System.out.println("@Before Classic");
		long id = Thread.currentThread().getId();
		System.out.println(id);

		BasePages.ResultsLog.ReportScriptStarted(CurrentPageTestCaseName);
		CoopersHawkCareData.ClearExistingStatus();
		LaunchBrowser.LaunchBrowserapp();

	}

	@Test
	public static void CoopersHawkCaresSignUP() throws IOException, InterruptedException, BiffException {
		System.out.println("@Test Classic");
		long id = Thread.currentThread().getId();
		System.out.println(id);
		for (int row = 1; row < CoopersHawkCareData.GetRows(); row++) {

			if (CoopersHawkCareData.Getdata("WC Member Record Type", row).trim().length() > 2) {
				try {
					CoopersHawkCareData.setData("Execution Status", row, "Started");
					MGSPages.Page_Login();
					MGSPages.ClassicLoginFlow(row);
					MGSPages.classicAddNewMember(row);
					MGSPages.ClassicEnterCoopersHawkCareInformation(row);
					Thread.sleep(3000);
					MGSPages.Menu_ClassicApplicationLogout();
					CoopersHawkCareData.setData("Execution Status", row, "Executed");
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
					CoopersHawkCareData.setData("Execution Status", row, " Row Execution Not Completed");
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
