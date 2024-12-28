package base;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.google.common.io.Files;

import utils.ExtentUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseTest {
	protected static AndroidDriver driver = null;
	AppiumDriverLocalService service;
	protected ExtentUtility reportlog = ExtentUtility.getinstance();

	protected Logger myBaseTestLog = LogManager.getLogger();

	@BeforeSuite
	public void startServer(){/*service = new AppiumServiceBuilder()
	.withAppiumJS(new File("C:\\Users\\chitr\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
	.withIPAddress("127.0.0.1").usingPort(4724).build();
service.start();*/
		System.out.println("server started in Beforesiuit");
	}

	@AfterSuite
	public void stopServer() {

		System.out.println("service stopped");
		//service.stop();
	}


	public static AndroidDriver getDriver(String driverName) throws MalformedURLException, InterruptedException {

		String name = driverName.toLowerCase();
		switch (name) {
		case "android":
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			UiAutomator2Options uio = new UiAutomator2Options();
			uio.setPlatformName("android");
			uio.setDeviceName("0B111FDD40020S");
			uio.setPlatformVersion("14");
			uio.setAutomationName("UIAutomator2");
			System.out.println("app is set");
			uio.setAppPackage("com.androidsample.generalstore");
			uio.setAppActivity("com.androidsample.generalstore.MainActivity");
			uio.setCapability("noReset", true);
			System.out.println("app is set2");
			//uio.setAppPackage(CapabilitiesConst.PACKAGE_NAME);
			//uio.setAppActivity(CapabilitiesConst.ACTIVITY_NAME);
			//String apkPath=System.getProperty("user.dir") + "\\src\\test\\resources\\apkFiles\\General-Store (1).apk";
			//uio.setApp(apkPath);//"user.dir") + "/src/test/resources/apkFiles/General-Store (1).apk");
			System.out.println("app is about to installed");
			System.out.println(url);
			driver = new AndroidDriver(url, uio);
			//((InteractsWithApps) driver).installApp(apkPath);
			//Thread.sleep(1000);
			System.out.println("app is installed");
			break;

		case "ios":
			URL url1 = new URL("http://127.0.0.1:4723/");
			XCUITestOptions xct = new XCUITestOptions();
			xct.setPlatformName("android");
			xct.setDeviceName("Samsung");
			xct.setPlatformVersion("13");
			xct.setAutomationName("XCUITDriver");
			xct.setApp("");
			//driver = new IOSDriver(url1, xct);
			break;

		default:
			break;
		}
		return driver;
	}
	public void takescreenshot(String filepath) {
		// Perform actions with the driver
		// System.out.println("WebDriver instance is null. Please initialize it
		// first.");
		// Other operations...

		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		File srcFile = takescreenshot.getScreenshotAs(OutputType.FILE);
		File descFile = new File(filepath);

		try {
			Files.copy(srcFile, descFile);
			myBaseTestLog.info("captures the screenshot");
			reportlog.logTestInfo("captures the screenshot");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			myBaseTestLog.error("Error while capturing  the screenshot");

		}

	}

}






