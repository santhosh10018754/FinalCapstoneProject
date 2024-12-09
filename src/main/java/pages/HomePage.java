package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.Base;
public class HomePage extends Base {
	
	
	@FindBy(linkText = "NewUserRegisterHere")
	WebElement RegisterHere;
	
	@FindBy ( id = "login")
	WebElement Login;
	
	
	//initializing the page objects
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public  RegisterPage clickregister() {
	    RegisterHere.click();
		return new RegisterPage();
		}
	
public LoginPage clicklogin() {
		
		Login.click();
		return new LoginPage();
		
	}
		
}