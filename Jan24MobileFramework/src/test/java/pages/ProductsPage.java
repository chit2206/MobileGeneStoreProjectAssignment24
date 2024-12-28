package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;


import base.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ProductsPage extends BasePage {
	AppiumDriver driver;
	public ProductsPage(AppiumDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public ProductsPage(IOSDriver driver) {
		super(driver);
	}


	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(xpath = "(//*[contains(@text,'$165.0')]")
	private WebElement jordenPrice;

	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(xpath = "(//*[contains(@text,'Jordan 6 Rings')]")
	private WebElement jordenText;
	@AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
	private WebElement cartBtn;
	
	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.support.v7.widget.RecyclerView\").childSelector(new UiSelector().text(\"ADD TO CART\"))")
    //(xpath = "(//*[contains(@text,'ADD TO CART')]")
	private WebElement jordenAdd2Cart;
		public void clickOnFirstItem(){

	}

	public void scrollToProduct(AppiumDriver driver, String jordentxt) throws InterruptedException {
		
		//String jordentxt=jordenText.getText();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\""+jordentxt+"\"));"));
		//Thread.sleep(3000);
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver; String scrollScript =
		 * "arguments[0].scrollIntoView(true);"; js.executeScript(scrollScript,
		 * jordenAdd2Cart);
		 */
		//Point point ; //jordenAdd2Cart.getLocation();  // Get the location of the element (x, y)
		/*
		 * int x = 911; int y = 1058;
		 * 
		 * // Use Actions class to perform click at the element's location Actions
		 * actions = new Actions(driver); actions.moveByOffset(911,
		 * 1058).click().perform(); jordenAdd2Cart.tap(1, 1000);
		 */
		jordenAdd2Cart.click();
	}
	
    public void clickCartBtn() {
    	
	cartBtn.click();
	
}




}
