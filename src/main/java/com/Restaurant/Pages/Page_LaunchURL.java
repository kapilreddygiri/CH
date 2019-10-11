package com.Restaurant.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.MGS.PagesData.Member_SignUpPagedata;
import com.Restaurant.PageData.Restaurant_SignUpPagedata;
import com.Utils.BasePages;
import com.Utils.LaunchBrowser;

public class Page_LaunchURL extends BasePages {
	static Restaurant_SignUpPagedata data = new Restaurant_SignUpPagedata();
	
	public void LaunchURL() throws IOException {

		driver.get(LaunchBrowser.TestSettingsObjects.getProperty("RestaurantURL"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void LaunchURLManager() throws IOException {
System.out.println(LaunchBrowser.TestSettingsObjects.getProperty("MANAGER"));
		driver.navigate().to(LaunchBrowser.TestSettingsObjects.getProperty("MANAGER"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
	public void LaunchURLServer() throws IOException {

		driver.get(LaunchBrowser.TestSettingsObjects.getProperty("SERVER"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void LaunchURLBarTender() throws IOException {

		driver.get(LaunchBrowser.TestSettingsObjects.getProperty("BARTENDER"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void LaunchURLTRA() throws IOException {

		driver.get(LaunchBrowser.TestSettingsObjects.getProperty("TRA"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void LaunchAcitvationURL (int row) throws IOException, InterruptedException {
		
		String CardNumber=EnteredCardNumber;
		System.out.println(CardNumber);
		String Cardgenerateddate=data.Getdata("Card Generated Date", row);
		System.out.println(Cardgenerateddate);
		String CostofMembership=data.Getdata("Cost of Membership", row).trim();
		double TotalAmount=((Double.parseDouble(CostofMembership)*5.741779)/100)+Double.parseDouble(CostofMembership);
		String ActivateURL="http://localhost:8090/Interfaces/Services.asmx/UpdateTrasactionDetails?LId=1&EID=1&EName=Devin%20Lown&CSeq=1&RevID=1&CNumber=1&CardNumber="+CardNumber+"&TDate="+Cardgenerateddate+"&WID=1&PTAmount="+CostofMembership+"&TCAmount="+TotalAmount+"";
		System.out.println(ActivateURL);
		driver.navigate().to(ActivateURL);
		Thread.sleep(5000);
		LaunchURLManager();
		
	//	Page_MemberSearch.searchCardforActivation(CardNumber);
					}
	
	
}
