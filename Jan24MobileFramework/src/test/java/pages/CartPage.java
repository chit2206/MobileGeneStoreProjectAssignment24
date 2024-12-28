package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.messages.internal.com.google.protobuf.Duration;
import io.cucumber.messages.internal.com.google.protobuf.util.Durations;

public class CartPage extends BasePage {
	AppiumDriver driver;
	Logger cartPageLog = LogManager.getLogger();
	public CartPage(AppiumDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public CartPage(IOSDriver driver) {
		super(driver);
	}


	/*
	 * @iOSXCUITFindBy(accessibility = "")
	 * 
	 * @AndroidFindBy(xpath =
	 * "(//android.widget.TextView[text(),'Samsung Galaxy S10 - Black'])[3]")
	 * private WebElement firstItem;
	 */
	//cartPageLog.info("after jordentextpriceElement");
	@iOSXCUITFindBy(accessibility = "")
	/*
	 * @AndroidFindBy(xpath = "//*[contains(@text,'$165.0')]") private WebElement
	 * jordenTextPrice;
	 */
	@AndroidFindBy(xpath = "//*[contains(@text,'$170.97')]")
	private WebElement jorden9TextPrice;

	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(xpath = "//*[contains(@text,'$130.0')]")
	private WebElement pGTextPrice;

	@AndroidFindBy(id = "com.androidsample.generalstore:id/totalAmountLbl")
	private WebElement totalTextPrice;
	@AndroidFindBy(className = "android.widget.CheckBox")	
	private WebElement checkBoxEle;
	@AndroidFindBy(id = "com.androidsample.generalstore:id/btnProceed")
	private WebElement purchaeCompletBtn;
	@AndroidFindBy(id = "com.androidsample.generalstore:id/termsButton")
	private WebElement termsBtn;

	public void clickOnFirstItem(){

	}

	public float getTotalSum() {
		System.out.println("before PGprice");
		String pgPrice=pGTextPrice.getText();
		System.out.println("after PGprice");
		String jPrice="";
		try {
		 jPrice=jorden9TextPrice.getText();}
		catch(Exception e)
		{
			//jPrice=jordenTextPrice.getText();
			throw e;
			
		}
		System.out.println(jPrice);
		String numericPrice = pgPrice.replace("$", "");

		// Convert to float
		float pgnumber = Float.parseFloat(numericPrice);
		String jnumericPrice = jPrice.replace("$", "");

		// Convert to float
		float jnumber = Float.parseFloat(jnumericPrice);

		float sum=jnumber+pgnumber;
		return sum;

	}
	public String verifyCheckboxLabel() {
		// Get the label associated with the checkbox
		String labelText = checkBoxEle.getText();
		System.out.println("Checkbox label: " + labelText);
		return labelText;
	}
	public void clickpurchasBtn() {
		purchaeCompletBtn.click();
	}
public float getExpectedPrice() {
	String expString= totalTextPrice.getText();
	String expetedicPrice = expString.replace("$", "");
	float expFloatPrice=Float.parseFloat(expetedicPrice);
	return expFloatPrice;

	
}

	public void clicktermsBtn() {
		 TouchAction action=new AndroidTouchAction((PerformsTouchActions) driver);
		 action.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(termsBtn))).waitAction();
		 action.perform();
		//termsBtn.click();
		driver.switchTo().alert().accept();
	}


}
