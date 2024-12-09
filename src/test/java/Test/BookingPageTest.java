package Test;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.Base;
import pages.BookingPage;
import pages.LoginPage;
public class BookingPageTest extends Base{
	
	LoginPage loginPage;
	BookingPage bookingPage;
	@BeforeMethod
public void setup() {
	
	initial();
	loginPage = new LoginPage();
	bookingPage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	
	
	}
@Test
public void SelectAllTheValues() {
	BookingPage obj = new BookingPage();
	obj.loc(1);
	obj.selecthotels(1);
	obj.selectrooms(1);
	obj.selectnofrooms(2);
	obj.selectcheckindate("06/11/2024");
	obj.selectcheckoutdate("07/11/2024");
	obj.selectadultrooms(2);
	obj.selectchildrooms(2);
	obj.clicksearch();
	
	System.out.println("Successfully Logged in and selected all the parameters in booking page !!!!! ");
    System.out.println("Booking Testscript is success");
	
	}
@AfterMethod
public void teardown() {
driver.quit();
}
}