package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.MobileCapabilityType;

public class baseclass {



	//public static AppiumDriver driver;
	public static AndroidDriver driver;
	public static Properties prop;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static String dateName;
	public static ExtentHtmlReporter reporter;

	public baseclass()

	{
	

		File src = new File("../MahindraFinance/PropertiesFile/config.properties");
		dateName = new SimpleDateFormat("yyyy-MM-dd_hh-mm-S a").format(new Date());
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {
			System.out.println("Excepation is" + e.getMessage());
		}
	}
	

	@BeforeSuite
	public void startReport() {
		reporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Report/"+ prop.getProperty("ReportName") + "_" + "Report" + ".html");
		reporter.config().setDocumentTitle(prop.getProperty("DocumentTitle")); 
		reporter.config().setReportName(prop.getProperty("ReportName")); 
		reporter.config().setTheme(Theme.DARK); 
		reporter.config().setLevel(Status.PASS);

		extent = new ExtentReports(); 
		extent.attachReporter(reporter);

		extent.setSystemInfo("Company Name", prop.getProperty("CompanyName"));
		extent.setSystemInfo("Environment", prop.getProperty("Environment"));
		extent.setSystemInfo("User Name", prop.getProperty("UserName"));
		extent.setSystemInfo("Platform", System.getProperty("os.name"));
		extent.setSystemInfo("Java Version", System.getProperty("java.version"));
		extent.setSystemInfo("Browser name", prop.getProperty("browser"));
	}

		
	@BeforeMethod
	public void setup() {

		try {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("autoAcceptAlerts", true);

			dc.setCapability("noReset", "false");
			
			dc.setCapability("fullReset", "false");
		
			dc.setCapability("appPackage", "in.amazon.mShop.android.shopping");

			dc.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
			
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");

			
			URL url = new URL("http://127.0.0.1:4723/"); 
	

			driver = new AndroidDriver(url, dc);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

			

		} catch (Exception exp) {

			System.out.println("Cause is " + exp.getCause());
			System.out.println("Message is " + exp.getMessage());
			exp.printStackTrace();

		}
	}
	
	public static String getScreenShot(WebDriver driver, String screenshotName) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + "_" + dateName+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		logger.addScreenCaptureFromPath(destination);
		System.out.println();
		System.out.println("******** SCREENSHOT TAKEN --> "+ dateName +" ********");
		System.out.println();
		return destination;
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws Exception {
		if (result.getStatus() == ITestResult.FAILURE) {
			String excepionMessage = Arrays.toString(result.getThrowable().getStackTrace());

			logger.log(Status.FAIL,
					"<details>" + "<summary>" + "<b>" + "<font color =" + "red>"
							+ "Test step fail due to below reason : " + "</font>" + "</b>" + "</summary>"
							+ excepionMessage.replaceAll(",", "<br>") + "</details>");

			getScreenShot(driver, "hub_Screenshot");
		} else if (result.getStatus() == ITestResult.SUCCESS) {

			String Pass_Test_Case = "<b>" + result.getName() + " - Test Case PASSED" + "</b>";

			extent.setTestRunnerOutput(Pass_Test_Case);
		} else {

			String Skip_Test_Case = "<b>" + result.getName() + " - Test case SKIP : " + "</b>";
			logger.log(Status.SKIP, MarkupHelper.createLabel(Skip_Test_Case, ExtentColor.ORANGE));

			String excepionMessage = Arrays.toString(result.getThrowable().getStackTrace());
			logger.fail("<details>" + "<summary>" + "<b>" + "<font color=" + "red>"
					+ "Test case skipped due to below reason :" + "</font>" + "</b>" + "</summary>"
					+ excepionMessage.replaceAll(",", "<br>") + "</details>" + " \n");

			extent.setTestRunnerOutput(Skip_Test_Case);
		}
		System.out.println();
		driver.quit();
	}

	@AfterSuite
	public void reportdisplay()
	{
		extent.flush();
	}
}
