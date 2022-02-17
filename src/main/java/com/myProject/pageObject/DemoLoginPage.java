package com.myProject.pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;



public class DemoLoginPage {
	
WebDriver driver;
	
	public DemoLoginPage(WebDriver rdriver)
	{
		
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	

	@FindBy(xpath = "//a[@class='login']") 
	private WebElement signInBtn;
	
	@FindBy(xpath = "//img[@class='logo img-responsive']")
	private WebElement myShopLogo;
	
	@FindBy(id="search_query_top")
	private WebElement searchProductBox;
	
	@FindBy(name="submit_search")
	private WebElement searchButton;
	
	
	public DemoLoginPage clickOnSignIn() throws Throwable {
		
		 Wait<WebDriver> wait = new FluentWait<WebDriver>((WebDriver) driver)
	        		.withTimeout(Duration.ofSeconds(20))
	        	    .pollingEvery(Duration.ofSeconds(2))
	        	    .ignoring(Exception.class);
	        wait.until(ExpectedConditions.visibilityOf(signInBtn));
	        signInBtn.click();
	        Thread.sleep(2000);
	        return new DemoLoginPage(driver);
		
		
		
	}
	
	public boolean validateLogo() throws Throwable {
		return myShopLogo.isDisplayed();
	}
	
	public String getMyStoreTitle() {
		String myStoreTitel=driver.getTitle();
		return myStoreTitel;
	}
	
	
	
	

}
