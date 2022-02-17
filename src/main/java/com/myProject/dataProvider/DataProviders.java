/**
 * 
 */
package com.myProject.dataProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.myProject.utility.Xls_Reader;


/**
 * @author Yeasin
 *
 */
public class DataProviders {

    String path = ".\\TestData\\TestData.xlsx";
	
	Xls_Reader reader = new Xls_Reader(path);
	

//Class --> LoginPageTest Test Case--> loginTest

	@DataProvider(name = "credentials")
	public Object[][] getCredentials() {
		// Totals rows count
		int rows = reader.getRowCount("Credentials");
		// Total Columns
		int column = reader.getColumnCount("Credentials");
		int actRows = rows - 1;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = reader.getCellData("Credentials", j, i + 2);
			}
		}
		return data;
	}


	}


