package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	public WebDriverWait wait;
	public ExtentSparkReporter reporter; 
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeSuite
	public void report() {
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("AdactinHotel Test Results");
		reporter.config().setDocumentTitle("Login Test Results");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
	    extent.setSystemInfo("Tested By", "Santhosh");
	}
	
	
	
public Base() {
	       try {
			prop = new Properties();
			FileInputStream ip= new FileInputStream(
	"C:\\Users\\admir\\eclipse-workspace\\AdactinHotelBooking\\src\\main\\java\\Config\\Config.properties");
			prop.load(ip);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
public static void initial() {
		
		String browsername= prop.getProperty("browser");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get(prop.getProperty("url"));
		
	}
	
	public void elementClickWait(WebElement ele, int duration) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		}
	
}
