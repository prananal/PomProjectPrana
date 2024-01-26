package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BasePage {
	
	WebDriver driver;
	
	 public  void validateElement(WebElement element, String expected, String errorMsg) {			
		 Assert.assertEquals(element.getText(), expected, errorMsg);			
		} 
	 
	 public int generateRandomNum(int num)	 {
		 Random rnd = new Random();
		 int generateRndNum = rnd.nextInt(num);
		 return generateRndNum;
	 }
	 
	 public void SelectFromDropDown(WebElement element, String visibleText)	 {
		 Select sel = new Select(element);
		 sel.selectByVisibleText(visibleText);
	 }
}
