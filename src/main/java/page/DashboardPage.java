package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage extends BasePage{
	
	WebDriver driver;
	//constructor of DashboardPage
	public DashboardPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	//WebElements , Attributes
	@FindBy(how = How.XPATH, using = "//strong[contains(text(), 'Dashboard')]") WebElement dashboardHeaderElement;
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/aside[1]/div/nav/ul[2]/li[2]/a/span") WebElement customerHeaderElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"customers\"]/li[2]/a/span") WebElement addCustomerHeaderElement;

	//Interactable methods
	public void validateDashboardPage(String dashboard) {
		validateElement(dashboardHeaderElement, dashboard, "Dashboard Page Not available!");		
	}

	public void clickOnCustomerMenuButton() {
		customerHeaderElement.click();		
	} 
	public void clickOnAddCustomerMenuButton() {
		addCustomerHeaderElement.click();		
	}
}
