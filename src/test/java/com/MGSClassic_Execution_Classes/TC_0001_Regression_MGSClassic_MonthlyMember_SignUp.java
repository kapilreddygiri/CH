

package com.MGSClassic_Execution_Classes;

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
import com.Utils.WriteExcel;
import com.aventstack.extentreports.Status;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class TC_0001_Regression_MGSClassic_MonthlyMember_SignUp {

//	private static String HTMLReportPAth = System.getProperty("user.dir")
//			+ "\\Resources\\Reports\\ClassicMonthlyMembers.html";
//	private static String CurrentPageTestCaseName = "Monthly Member SignUP";
//	private static String ExcelSheetPath = System.getProperty("user.dir") + "\\Resources\\TestData\\MGS_TestData.xls";
//	private static String Excel_SheetName = "Monthly Member";
//	BasePages ReportingPages = new BasePages(HTMLReportPAth, CurrentPageTestCaseName);
//	static Member_SignUpPagedata MonthlyMemberData = new Member_SignUpPagedata(ExcelSheetPath, Excel_SheetName);

	private static String HTMLReportPAth = null;
	private static String CurrentPageTestCaseName = null;
	private static String ExcelSheetPath = null;
	private static String Excel_SheetName = null;
	private static String WritePath = null;
	private static BasePages ReportingPages = null;
	private static Member_SignUpPagedata MonthlyMemberData = null;

	@BeforeTest
	public static void Beforetest() throws IOException, BiffException {

		HTMLReportPAth = System.getProperty("user.dir") + "\\Resources\\Reports\\ClassicMonthlyMembers.html";
		CurrentPageTestCaseName = "Monthly Member SignUP";
		System.out.println("================>"+System.getProperty("user.dir") + "\\Resources\\TestData\\MGS_TestData.xls");
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
	public static void ClassicMonthlyMemberSignUP()
			throws IOException, InterruptedException, BiffException, WriteException {
		for (int row = 1; row <= MonthlyMemberData.GetRows(); row++) {

			if (MonthlyMemberData.Getdata("WC Member Record Type", row).length() > 2) {
				try {
					MonthlyMemberData.setData("Execution Status", row, "Started");
					MGSPages.Page_Login();
					MGSPages.ClassicLoginFlow(row);
					MGSPages.classicAddNewMember(row);
					MGSPages.ClassicEnterMonthlyMemberInformation(row);
					MGSPages.ClassicEnterAndValidateMonthlyPayment_DetailsPage(row);
					MGSPages.Menu_ClassicApplicationLogout();
					MonthlyMemberData.setData("Execution Status", row, "Executed");
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
					MonthlyMemberData.setData("Execution Status", row, "Row Execution Not Completed");
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

