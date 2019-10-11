package com.MGSLightning_Execution_Classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
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
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class TC_0005_Regression_MGSLightning_CoopersHawkCares_SignUp {

//	public WebDriver driver;
//	private String HTMLReportPAth = System.getProperty("user.dir")
//			+ "\\Resources\\Reports\\LightningCoopersHawkCare.html";
//	private String CurrentPageTestCaseName = "Coopers Hawk Cares SignUP";
//	private String ExcelSheetPath = System.getProperty("user.dir") + "\\Resources\\TestData\\MGS_TestDataLightning.xls";
//	private String Excel_SheetName = "Coopers Hawk Cares";
//	BasePages ReportingPages = new BasePages(HTMLReportPAth, CurrentPageTestCaseName);
//	Member_SignUpPagedata CoopersHawkCaresData = new Member_SignUpPagedata(ExcelSheetPath, Excel_SheetName);

	private static String HTMLReportPAth = null;
	private static String CurrentPageTestCaseName = null;
	private static String ExcelSheetPath = null;
	private static String WritePath = null;
	private static String Excel_SheetName = null;
	private static BasePages ReportingPages = null;
	private static Member_SignUpPagedata CoopersHawkCaresData = null;

	@BeforeTest
	public static void Beforetest()
			throws IOException, RowsExceededException, WriteException, InterruptedException, BiffException {
		System.out.println("@Before Light");
		long id = Thread.currentThread().getId();
		System.out.println(id);

		HTMLReportPAth = System.getProperty("user.dir") + "\\Resources\\Reports\\TC_0005_Regression_MGSLightning_CoopersHawkCares_SignUp.html";
		CurrentPageTestCaseName = "TC_0005_Regression_MGSLightning_CoopersHawkCares_SignUp";
		ExcelSheetPath = System.getProperty("user.dir") + "\\Resources\\TestData\\MGS_TestData.xls";
		Excel_SheetName = "Coopers Hawk Cares";
		ReportingPages = new BasePages(HTMLReportPAth, CurrentPageTestCaseName);
		WritePath = System.getProperty("user.dir") + "\\Resources\\TestOutData\\MGS_TestData.xls";
		CoopersHawkCaresData = new Member_SignUpPagedata(ExcelSheetPath, Excel_SheetName, ExcelSheetPath);

		BasePages.ResultsLog.ReportScriptStarted(CurrentPageTestCaseName);
		CoopersHawkCaresData.ClearExistingStatus();
		LaunchBrowser.LaunchBrowserapp();

	}

	@Test
	public static void TC_0005_Regression_MGSLightning_CoopersHawkCares_SignUp() throws IOException, InterruptedException, BiffException {
		System.out.println("@Test Light");
		long id = Thread.currentThread().getId();
		System.out.println(id);
		for (int row = 1; row < CoopersHawkCaresData.GetRows(); row++) {

			if (CoopersHawkCaresData.Getdata("WC Member Record Type", row).trim().length() > 2) {

				try {
				 

					MGSPages.Page_Login();
					MGSPages.Menu_LightningLoginFlow(row);
					MGSPages.lightningAddNewMember(row);
					MGSPages.LightningEnterCoopersHawkCareInformation(row);
					Thread.sleep(3000);
					MGSPages.Menu_LightningApplicationLogout();

					 
					break;
				} catch (Exception e) {
					e.printStackTrace();
					try {
						MGSPages.Menu_LightningErrormessage(row);
					} catch (Exception e1) {
						BasePages.ResultsLog.logger.log(Status.FAIL, "Error message not displayed");
						BasePages.ExecutionPageExceptionErrorCapture(
								CurrentPageTestCaseName + " Data Row Number, " + row, e.toString());

					}

					MGSPages.Menu_LightningApplicationLogout();
					CoopersHawkCaresData.setData("Execution Status", row, "Execution Not Completed");
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
