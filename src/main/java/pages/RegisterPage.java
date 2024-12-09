package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.Base;
public class RegisterPage extends Base{
	
	@FindBy (id = "username")
	WebElement username;
	
	@FindBy (id = "password")
	WebElement password;
	
	@FindBy (id = "re_password")
	WebElement conpass;
	
	@FindBy (id = "full_name")
	WebElement fullname;
	
	@FindBy (id = "email_add")
	WebElement email;
	
	@FindBy (id = "captcha-form")
	WebElement captcha;
	
	@FindBy (id = "tnc_box")
	WebElement terms;
	
	@FindBy (xpath = "//a[text()='Go back to Login page']")
	WebElement GobacktoLoginpage;
	
	//@FindBy (id = "Submit")
	//WebElement registerButton;
    public RegisterPage() {
		
	PageFactory.initElements(driver, this);
	}
	
	public RegisterPage enterusername(String uname) {
		
	username.sendKeys(uname);
	return this;
	
	}
	
	public RegisterPage enterpassword(String pwd) {
		password.sendKeys(pwd);
		return this;
	}
	
	public RegisterPage enterconpass(String cpwd) {
		conpass.sendKeys(cpwd);
		return this;
	}
	public RegisterPage enterfullname(String fname) {
		fullname.sendKeys(fname);
		return this;
		
	}
	
	public RegisterPage enteremail(String emailid) {
		
		email.sendKeys(emailid);
		return this;
	}
	public RegisterPage entercaptcha(String captchac) {
		captcha.sendKeys(captchac);
		return this;
		
	}
	
	public RegisterPage clickterms() {
		
	terms.click();
	return this;
	}
	
	public RegisterPage clickgobacktologinpage() {
	
		elementClickWait(GobacktoLoginpage, 10);
		GobacktoLoginpage.click();
		return this;
	}
	
	
	/*public Register clickRegisterButton() {
		
		//elementClickWait(registerButton, 10);
		registerButton.click();
		return this;
	}
	
	*/
}
