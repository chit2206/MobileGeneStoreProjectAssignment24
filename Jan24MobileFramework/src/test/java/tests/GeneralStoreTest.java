package tests;

import java.net.MalformedURLException;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import pages.GeneralStorepage;
import pages.ProductsPage;

public class GeneralStoreTest extends BaseTest{
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

	public void getTitleOfPAgeTC21()
	{ System.out.println("in getTitleOfPAgeTC21");
	String pageTitle1=	genralStorePage.getTitleForPage();
	System.out.println(pageTitle1);
	//Assert.assertEquals(pageTitle,"General Store","it is not matchinh");

	}

	@Test

	public void getdropLebelTC23()
	{ 
		System.out.println("in getdropLebelTC23");
		String lebelDropdown=	genralStorePage.getLebelForDropdown();
		System.out.println(lebelDropdown);
		//Assert.assertEquals(pageTitle,"General Store","it is not matchinh");

	}
	@Test

	public void getDropdownTextTC22()
	{ 
		System.out.println("in getDropdownTextTC22");
		String textDropdown=	genralStorePage.getTextForDropdown();
		System.out.println(textDropdown);
		//Assert.assertEquals(pageTitle,"General Store","it is not matchinh");

	}
	@Test

	public void getlebelTextBoxTC32()
	{ 
		System.out.println("in getTextofbtnNClickC34");
		String lebelTextbox=genralStorePage.getLebelOFTextField();
		System.out.println(lebelTextbox);
		//Assert.assertEquals(pageTitle,"General Store","it is not matchinh");

	}
	@Test

	public void getTextofTextFiledTC33()
	{ 
		System.out.println("in getTextofTextFiledTC33");
		String textOfTextbox=genralStorePage.getTextOfTextField();
		System.out.println(textOfTextbox);
		//Assert.assertEquals(pageTitle,"General Store","it is not matchinh");

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
		
			
			productPage.scrollToProduct(driver,"Air Jordan 4 Retro");
			
	

	}


}
