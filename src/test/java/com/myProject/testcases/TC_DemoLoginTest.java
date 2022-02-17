package com.myProject.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myProject.base.Base;
import com.myProject.pageObject.DemoLoginPage;
import com.myProject.utility.Log;
import com.myProject.utility.Xls_Reader;


public class TC_DemoLoginTest extends Base{
	
	
	
		
		private DemoLoginPage login;
		
		
		
		@Test
		public void verifyLogo() throws Throwable {
			
			Log.info("verifyLogo");
			login = new DemoLoginPage(driver);
			boolean result=login.validateLogo();
			Assert.assertTrue(result);
			Log.info("Logo is varified");
		}
		
		@Test
		public void verifyTitle() {
			Log.info("verifyTitle");
			login = new DemoLoginPage(driver);
			String actTitle=login.getMyStoreTitle();
			System.out.println(actTitle);
			Assert.assertEquals(actTitle,"My Store1" );
			Log.info("Title is Varified");
		}

		
		
		
	}


