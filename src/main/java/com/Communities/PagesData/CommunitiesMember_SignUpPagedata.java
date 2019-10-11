package com.Communities.PagesData;

import java.io.File;
import java.io.IOException;

import com.Utils.ExcelConnection;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class CommunitiesMember_SignUpPagedata {
	static ExcelConnection testData = null;

	public CommunitiesMember_SignUpPagedata() {

	}

	public CommunitiesMember_SignUpPagedata(String ExcelPath, String sheetname, String WritalPath) {
		testData = new ExcelConnection(ExcelPath, sheetname, WritalPath);
		testData.columnDictionary();

	}

	public String Getdata(String FieldName, int row) {

		return testData.readCell(testData.GetCell(FieldName), row).trim();

	}

	public int GetRows() {

		return testData.rowcount();
	}

	public void setData(String FieldName, int row, String TexttoEnter) throws BiffException, IOException {

		testData.setValueintocell(FieldName, row, TexttoEnter);

	}
	
	public void CloseWriteExcel() throws WriteException, IOException {
		
		testData.CloseWritExcel();
	}

	public void ClearExistingStatus() throws BiffException, IOException {

		for (int i = 1; i <= GetRows(); i++) {

			setData("Execution Status", i, "");

			setData("Error", i, "");

		}

	}

}
