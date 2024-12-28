package tests;

import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import pages.CartPage;
import pages.GeneralStorepage;
import pages.ProductsPage;
import utils.Constants;
import utils.ExtentUtility;

public class CartTest extends BaseTest{
	GeneralStorepage genralStorePage;
	ProductsPage productPage;
	CartPage cartpage;
	Logger cartTestPageLog = LogManager.getLogger();
	
	@BeforeClass
	public void setUp() throws MalformedURLException, InterruptedException {


		//random = new Random();
		driver = (AndroidDriver) getDriver("android");
		genralStorePage=new GeneralStorepage(driver);
		cartTestPageLog.info("after genralStorePage instance");
		productPage= new ProductsPage(driver);
		cartTestPageLog.info("after ProductsPage instance");
		cartpage=new CartPage(driver);
		cartTestPageLog.info("after cartpage instance");
		reportlog=ExtentUtility.getinstance();

	}
	@Test



	public void scrolltoadd() {

		//productPage.scrollToProduct();

	}
	@Test

	public void getCartPageTestCaseC34() throws InterruptedException
	{ 
		cartTestPageLog.info("in getCartPageTestCaseC34");
		System.out.println("in getCartPageTestCaseC34");

		genralStorePage.setTextofTextField();
		genralStorePage.clickBtn();


		cartTestPageLog.info("Before scrollToProduct jordenring");
		productPage.scrollToProduct(driver,"Jordan 6 Rings");
		cartTestPageLog.info("after scrollToProduct jordenring");
		cartTestPageLog.info("Before scrollToProduct PG");
		productPage.scrollToProduct(driver,"PG 3");
		cartTestPageLog.info("after scrollToProduct PG");

		productPage.clickCartBtn();
		cartTestPageLog.info("after clickCartBtn");
		float sumprice=0;
		float expPrice=0;
		try {
			
			sumprice=cartpage.getTotalSum();
			expPrice=cartpage.getExpectedPrice();
			System.out.println(sumprice);
			reportlog.startExtentReport();
			reportlog.startExtentCreateReport("getCartPageTestCaseC34");
			reportlog.logTestInfo("sum ammount is corrct");
			Assert.assertEquals(String.valueOf(sumprice),String.valueOf(expPrice),"it is not matchinh");
			System.out.println("after assert");
			reportlog.logTestwithPassed("getCartPageTestCaseC34 pass");
			//reportlog.startExtentReport();
			//reportlog.logTestInfo("sum ammount is corrct");
			//reportlog.logTestwithPassed("sum amount is addition of Items in the cart");
			}
		catch(AssertionError e) {
			cartTestPageLog.error(sumprice + " not   matched with " + expPrice);
			String filename = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
			String path = Constants.screenshotsFilepath + filename + ".png";
			System.out.println(path);
			reportlog.logTestfailwithScreenshot(path);
		}
		String chkboxLebel=cartpage.verifyCheckboxLabel();
		cartTestPageLog.info("after verifyCheckboxLabel");
		cartpage.clicktermsBtn();
		cartTestPageLog.info("after clicktermsBtn");
		cartpage.clickpurchasBtn();
		cartTestPageLog.info("after clickpurchasBtn");
		driver.navigate().back();



	}


}



