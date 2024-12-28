package tests;

import java.net.MalformedURLException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import base.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import pages.GeneralStorepage;
import pages.ProductsPage;

public class ProductsTest extends GeneralStoreTest {
	GeneralStorepage genralStorePage;
	ProductsPage productPage;
	@BeforeClass
	public void setUp() throws MalformedURLException, InterruptedException {


		//random = new Random();
		driver = (AndroidDriver) getDriver("android");
		genralStorePage=new GeneralStorepage(driver);
		productPage= new ProductsPage(driver);


	}
	@Test



	public void scrolltoadd() {

		//productPage.scrollToProduct();

	}
	@Test

	public void getTextofbtnNClickC34() throws InterruptedException
	{ 
		System.out.println("in getTextofbtnNClickC34");
		//	String textOfbtn=genralStorePage.getTextOfbtn();
		//System.out.println(textOfbtn);
		genralStorePage.setTextofTextField();
		genralStorePage.clickBtn();
		//Assert.assertEquals(pageTitle,"General Store","it is not matchinh");


		productPage.scrollToProduct(driver,"Jordan 6 Rings");
		productPage.scrollToProduct(driver,"PG 3");
		productPage.clickCartBtn();



	}


}
