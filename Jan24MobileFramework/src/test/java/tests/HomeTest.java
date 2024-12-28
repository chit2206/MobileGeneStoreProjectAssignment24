package tests;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import pages.HomePage;

public class HomeTest extends BaseTest{

	@Test
	public void firstTest() throws MalformedURLException, InterruptedException {
		AndroidDriver driver = (AndroidDriver) getDriver("android");

//		IOSDriver iosDriver =  (IOSDriver) BaseTest.getDriver("ios");
		HomePage hp = new HomePage(driver);
		hp.clickOnFirstItem();
		//driver.getTitle();
	//	driver.installApp(apkPath);
		//String apkPath=System.getProperty("user.dir") + "/src/test/resources/apkFiles/General-Store (1).apk";
		//driver.installApp(apkPath);

		Thread.sleep(2000);

		//hp.image.click();
		Thread.sleep(2000);
		  String appPackage = "com.example.myapp"; // Replace with your app's package name
	        boolean isInstalled = driver.isAppInstalled(appPackage);
	        if (isInstalled) {
	            System.out.println("App installation verified.");
	        } else {
	            System.out.println("App installation failed.");
	        }

		//hp.doubleTapOnProductImage();



	}

}
