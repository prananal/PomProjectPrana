package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	// constructor of DashboardPage
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElements , Attributes
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section/div/div[2]/div/div[1]/div[1]/div/div/header/div/strong")
	WebElement addCustomerHeaderElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"general_compnay\"]/div[1]/div/input")
	WebElement fullNameElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"general_compnay\"]/div[2]/div/select")
	WebElement companyElement;

	// Interactable methods
	public void validateAddCustomerPage(String addCustomerHeaderText) {
		validateElement(addCustomerHeaderElement, addCustomerHeaderText, "Add Customer Page Not available!");
	}
	
	public void insertFullName(String fullName) {
		fullNameElement.sendKeys(fullName + generateRandomNum(99));		
	}
	
	public void insertCompanyName(String companyName) {
		SelectFromDropDown(companyElement, companyName);		
	}
}
