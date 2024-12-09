package Test;

import org.testng.annotations.Test;
import pages.HomePage;
public class RegisterPageTest {
	@Test
	public void registerTest() {
		HomePage obj=new HomePage();
		obj.clickregister().
		enterusername("Santhoshi").
		enterpassword("Sandy@1").
		enterconpass("Sandy@1").
		enterfullname("Santhosh U").
		enteremail("admiralsantho@2001.com").
		entercaptcha("ghjklmn").
		clickterms()
	    .clickgobacktologinpage();
		
		
		
		//clickRegisterButton();
		
		
	}
}
