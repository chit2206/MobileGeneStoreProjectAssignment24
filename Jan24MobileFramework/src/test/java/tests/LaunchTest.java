package tests;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;


public class LaunchTest extends BaseTest{
	AndroidDriver driver;
	@Test
	public void launchAPpHere() throws MalformedURLException,InterruptedException{
		System.out.println("inside launchapp");
		driver = (AndroidDriver) getDriver("android");
	System.out.println("afterdriver called");
	//String apkPath=System.getProperty("user.dir") + "/src/test/resources/apkFiles/General-Store (1).apk";
	//((InteractsWithApps) driver).installApp(apkPath);
	boolean isappInstalled=driver.isAppInstalled("com.androidsample.generalstore");
	System.out.println("isinstalled ="+isappInstalled);
	if(!isappInstalled)
	{
	    System.out.println("application is instlled but still fall in if condition");
		//driver.installApp(apkPath);

	}else //(//android.widget.TextView[@content-desc="GeneralStore"])[2]
		{
		
    System.out.println("after action");}
//driver.removeApp("8d36a2d u0 com.androidsample.generalstore");
	//String titlename=driver.get
	// Assert.assertEquals("General Store", titlename);
	//System.out.println("title is ="+titlename);
	WebElement selectedOption = driver.findElement(By.className("android.widget.Spinner"));
    System.out.println("Selected Country: " + selectedOption.getText());
    selectedOption.getText().equals("Afghanistan");
   //dropdownlabel text
    WebElement label = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]"));//("android.widget.TextView"));
    System.out.println("Label text: " + label);
    String labelText = label.getText();
    System.out.println("Label text: " + labelText);
    labelText.equals("Select the country where you want to shop");
    WebElement TextFieldlabel = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]"));
    String labelTextfield = TextFieldlabel.getText();
    System.out.println("Label Text: " + labelTextfield);
    WebElement filedText = driver.findElement(By.className("android.widget.EditText"));
    String placeholderText = filedText.getAttribute("text");
    System.out.println("Placeholder Text: " + placeholderText);
    filedText.sendKeys("chitra");
    WebElement maleRadioButton = driver.findElement(By.id("com.androidsample.generalstore:id/radioMale"));
    System.out.println("male radio button ");
    WebElement labelElement = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[3]"));
    System.out.println("labelElement radio button");
    WebElement femaleRadioButton = driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale"));
    System.out.println("female radio button is selected");
    if(maleRadioButton.isSelected()) {
		System.out.println("male radio button is selected");
	}
    femaleRadioButton.click();
    //WebElement buttonshop = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));

	WebElement letsShopButton = driver.findElement(By.className("android.widget.Button"));
	String expectedLabel = "Let's Shop";
	String actualLabel = letsShopButton.getText();
   // Assert.assertEquals(actualLabel, expectedLabel, "Button label does not match!");
    letsShopButton.click();
    String text ="Jordan 6 Rings";
    //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\""+text+"\"));"));

	  int startX = 742, startY = 644, endX = 804, endY = 3000;

	  TouchAction action = new TouchAction(driver);
	  action.press(PointOption.point(startX, startY))
	  .waitAction(WaitOptions.waitOptions( Duration.ofSeconds(1)))
	  .moveTo(PointOption.point(endX, endY)).release().perform();
		/*
		 * Map<String, Object> scrollParams = new HashMap<>();
		 * scrollParams.put("direction", "down"); scrollParams.put("percent", 0.5);
		 * driver.executeScript("mobile: scrollGesture", scrollParams);
		 */
	/*
	 * Map<String, Object> scrollParams = new HashMap<>();
	 * scrollParams.put("startX", 742); // Starting X coordinate
	 * scrollParams.put("startY", 644); // Starting Y coordinate
	 * scrollParams.put("endX", 804); // Ending X coordinate
	 * scrollParams.put("endY", 1794); // Ending Y coordinate
	 * scrollParams.put("duration", 1000); // Duration in milliseconds
	 * scrollParams.put("direction","down"); scrollParams.put("percent", 0.5);
	 * driver.executeScript("mobile: scrollGesture", scrollParams);
	 */
	/*
	 * TouchAction action = new TouchAction(driver);
	 *
	 * // Define start and end coordinates for scrolling int startX = 500; // X
	 * coordinate to start int startY = 1500; // Y coordinate to start (bottom of
	 * the screen) int endX = 500; // X coordinate to end int endY = 500; // Y
	 * coordinate to end (top of the screen)
	 *
	 * // Perform the scroll gesture action.press(PointOption.point(startX, startY))
	 * .waitAction(WaitOptions.waitOptions(ofSeconds(1))) // Wait for 1 second
	 * .moveTo(PointOption.point(endX, endY)) .release() .perform();
	 */
	  scrollToProduct("Jordan 9 Retro","$160.97","ADD TO CART");
	 //scrollToProduct("PG 3","$110.0","ADD TO CART");
	  //scrollToProduct("ADD TO CART");
	  
	}
	
	  public void scrollToProduct(String productName,String Price,String addtiCard) {
	 
		  int i;
		 String text ="Air Jordan 4 Retro";
		 //   driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\""+productName+"\"));"));
		  boolean productFound = false; int maxScrolls = 10; // Maximum scroll attempts
	  int scrollCount = 0; //while (!productFound && scrollCount < maxScrolls) { 
		  try
	  { // Try to find the element WebElement product =
			 // $165.0
			  System.out.println("we reached in try block and product name is ="+productName);
			  WebElement itemPrice=driver.findElement(By.xpath("//*[contains(@text,'"+Price+"')]"));
			  System.out.println("we reached in try block and product name is ="+Price);
			//  WebElement pageTitle=driver.findElement(By.xpath("//*[contains(@text,'Products')]"));
			 // driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + productName + "\")"));
			 // WebElement produtcTitle=driver.findElement(By.xpath("//*[contains(@text,'"+productName+"')]"));
			  //System.out.println("Title of the page is "+pageTitle.getText());  
	  WebElement productCart=driver.findElement(By.xpath("//*[contains(@text,'"+addtiCard+"')]"));
	  System.out.println("Product found: " + productName); 
	  productFound = true; 
	  productCart.click();
	  
	
	  //xit loop if found 
	  } 
	  catch (NoSuchElementException e) { 
		  System.out.println("we reached in nosuch exception block");
		  // Scroll down if the  product is not found 
		  org.openqa.selenium.Dimension screenSize1 =driver.manage().window().getSize(); int startX = screenSize1.getWidth() / 2;
	  int startY = (int) (screenSize1.getHeight() * 0.8); // 80% of screen height
	  int endX = startX; int endY = (int) (screenSize1.getHeight() * 0.2); // 20%	  of screen height
	 
	  // Perform scroll
	  TouchAction action = new TouchAction(driver);
	  action.press(PointOption.point(startX, startY))
	  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
	  .moveTo(PointOption.point(endX, endY)) .release() .perform(); }
		  } 
	  
	  public void scrollToProduct1(String productName) {
			 
		  boolean productFound = false; int maxScrolls = 10; // Maximum scroll attempts
		  int scrollCount = 0; while (!productFound && scrollCount < maxScrolls) { 
			  try
		  { // Try to find the element WebElement product =
				  System.out.println("we reached in try block2 and product name is ="+productName);
				  System.out.println("Available contexts: " + driver.getContextHandles());
				  driver.context("WEBVIEW_stetho_com.google.android.apps.messaging");
				  System.out.println(driver.getContext());
				  driver.switchTo().frame(0);
				  System.out.println("we reached in try block and product name is ="+productName);
				  WebElement pageTitle=driver.findElement(By.xpath("//*[contains(@text,'Products')]"));
				 // driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + productName + "\")"));
				  WebElement produtcTitle=driver.findElement(By.xpath("//*[contains(@text,'Jordan 4 Retro')]"));
				  System.out.println("Title of the page is "+pageTitle.getText());  
		  WebElement productCart=driver.findElement(By.xpath("//*[contains(@text,'"+productName+"')]"));
		  System.out.println("Product found: " + productName); 
		  productFound = true; 
		  productCart.click();
		  //xit loop if found 
		  } 
		  catch (NoSuchElementException e) { 
			  System.out.println("we reached in nosuch exception block");
			  // Scroll down if the  product is not found 
			  org.openqa.selenium.Dimension screenSize1 =driver.manage().window().getSize(); int startX = screenSize1.getWidth() / 2;
		  int startY = (int) (screenSize1.getHeight() * 0.8); // 80% of screen height
		  int endX = startX; int endY = (int) (screenSize1.getHeight() * 0.2); // 20%	  of screen height
		 
		  // Perform scroll
		  TouchAction action = new TouchAction(driver);
		  action.press(PointOption.point(startX, startY))
		  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		  .moveTo(PointOption.point(endX, endY)) .release() .perform(); }
			  } 
		  }
}
