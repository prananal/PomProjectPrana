package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	//constructor of loginpage
	public LoginPage(WebDriver driver) {
		this.driver = driver; // this keyword refers to all the variables and methods in that class
	}
	
	//WebElements , Attributes
//	WebElement userNameElement = driver.findElement(By.xpath("//*[@id=\"user_name\"]"));
//	driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("absd");
	
//	@FindBy(how, using);
	@FindBy(how = How.XPATH, using = "//*[@id=\"user_name\"]")  WebElement userNameElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]" ) WebElement passwordElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"login_submit\"]" ) WebElement signInButtonElement;
	
	//Interactable methods
	public void insertUserName(String usrName) {
		userNameElement.sendKeys(usrName);		
	}
	public void insertPassword(String password) {
		passwordElement.sendKeys(password);		
	}
	public void clickOnSiginButton() {
		signInButtonElement.click();		
	}
	
	//method 2 i.e combining methods
//	public void performLogin(String usrName, String password) {
//		userNameElement.sendKeys(usrName);
//		passwordElement.sendKeys(password);
//		signInButtonElement.click();		
//	}
}
