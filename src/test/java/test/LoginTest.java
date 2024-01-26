package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
		
	//login data
	String usrName= "demo@codefios.com";
	String password= "abc123";
	String dashboardValidationText = "Dashboard";
	String alertUserValidationText = "Please enter your user name";
	String alertPasswordValidationText = "Please enter your password";
	//String dashboardHeaderValidationText = "Dashboard";
	
	
	@Test
	public void validUsrShdBeAbleTOLogin(){
		
		driver = BrowserFactory.init();
		
		//call all methods defined in LoginPage.java class (create object of login page)
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(usrName);
		loginPage.insertPassword(password);
		loginPage.clickOnSiginButton();
		
		//call all methods defined in DashboardPage.java class (by creating object of Dashboard page)
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage(dashboardValidationText);
	
	}

}
