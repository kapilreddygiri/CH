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

public class TC_0004_Regression_MGSLightning_Promotion_SignUp {

//	public WebDriver driver;
//	private String HTMLReportPAth = System.getProperty("user.dir") + "\\Resources\\Reports\\LightningPromotion.html";
//	private String CurrentPageTestCaseName = "Promotion SignUP";
//	private String ExcelSheetPath = System.getProperty("user.dir") + "\\Resources\\TestData\\MGS_TestDataLightning.xls";
//	private String Excel_SheetName = "Promotion";
//	BasePages ReportingPages = new BasePages(HTMLReportPAth, CurrentPageTestCaseName);
//	Member_SignUpPagedata PromotionData = new Member_SignUpPagedata(ExcelSheetPath, Excel_SheetName);

	private static String HTMLReportPAth = null;
	private static String CurrentPageTestCaseName = null;
	private static String ExcelSheetPath = null;
	private static String Excel_SheetName = null;
	private static BasePages ReportingPages = null;
	private static Member_SignUpPagedata PromotionData = null;
	private static String WritePath = null;

	@BeforeTest
	public static void Beforetest()
			throws IOException, RowsExceededException, WriteException, InterruptedException, BiffException {

		HTMLReportPAth = System.getProperty("user.dir") + "\\Resources\\Reports\\TC_0004_Regression_MGSLightning_Promotion_SignUp.html";
		CurrentPageTestCaseName = "TC_0004_Regression_MGSLightning_Promotion_SignUp";
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
	public void TC_0004_Regression_MGSLightning_Promotion_SignUp() throws IOException, InterruptedException, BiffException {
		for (int row = 1; row < PromotionData.GetRows(); row++) {

			if (PromotionData.Getdata("WC Member Record Type", row).trim().length() > 2) {

				try {
					 

					MGSPages.Page_Login();
					MGSPages.Menu_LightningLoginFlow(row);
					MGSPages.lightningAddNewMember(row);
					MGSPages.LightningEnterPromotionInformation(row);
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
					PromotionData.setData("Execution Status", row, "Execution Not Completed");
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
