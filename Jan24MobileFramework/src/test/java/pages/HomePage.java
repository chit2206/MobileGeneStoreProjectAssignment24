package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage extends BasePage {
	AndroidDriver driver;
	public HomePage(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public HomePage(IOSDriver driver) {
		super(driver);
	}
	
	@AndroidFindBy(xpath =
			 "(//android.view.View[@content-desc=\"Home\"]")
			  private WebElement firstItem;
	@AndroidFindBy(xpath =
			 "(//android.widget.TextView[@content-desc=\"GeneralStore\"]")
			  private WebElement gStoreImage;
	/*
	 * @iOSXCUITFindBy(accessibility = "")
	 * 
	 * @AndroidFindBy(xpath =
	 * "(//android.widget.TextView[text(),'Samsung Galaxy S10 - Black'])[3]")
	 * private WebElement firstItem;
	 * 
	 * @iOSXCUITFindBy(accessibility = "")
	 * 
	 * @AndroidFindBy(id = "com.solodroid.solomerce:id/product_image") private
	 * WebElement image;
	 * 
	 * @iOSXCUITFindBy(accessibility = "")
	 * 
	 * @AndroidFindBy(id = "com.solodroid.solomerce:id/action_bar_root") private
	 * WebElement productImage;
	 * 
	 * @AndroidFindBy(uiAutomator = "") public WebElement justforex;
	 */

	public void clickOnFirstItem(){

	}

	public void doubleTapOnProductImage() {
		RemoteWebElement image = (RemoteWebElement) gStoreImage;
		JavascriptExecutor js = driver;
		js.executeScript("mobile: doubleClickGesture", ImmutableMap.of("elementId", image.getId()));

	}





}
