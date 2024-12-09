package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.Base;
import pages.BookingPage;
import pages.LoginPage;
public class LoginPageTest extends Base{
	
	LoginPage loginPage;
	BookingPage bookingpage;
	@BeforeMethod
		public void setup() {
			
			initial();
			loginPage = new LoginPage();
			
			}
		
		@Test
		public void login() {
			bookingpage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		}
		
		
		@AfterMethod
		public void teardown() {
			driver.quit();
		}
	
	
}