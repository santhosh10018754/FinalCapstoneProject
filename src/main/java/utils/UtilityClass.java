package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityClass {

	
	public static WebDriver driver;
	
	public void launch() {
		
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	public void closing( ) {
		
		driver.close();
	}
	
}
