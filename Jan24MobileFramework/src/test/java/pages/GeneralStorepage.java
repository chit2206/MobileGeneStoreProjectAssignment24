package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class GeneralStorepage extends BasePage {
	AppiumDriver driver;
	public GeneralStorepage(AppiumDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public GeneralStorepage(IOSDriver driver) {
		super(driver);
	}

	public WebElement getPageTitle() {
		return pageTitle;
	}
	public void setPageTitle(WebElement pageTitle) {
		this.pageTitle = pageTitle;
	}

	@AndroidFindBy(id = "com.androidsample.generalstore:id/toolbar_title")
	private WebElement pageTitle;
	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(className = "android.widget.TextView")
	private WebElement appIcon;

	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(className = "android.widget.Spinner")
	private WebElement selectedOption;

	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]")
	private WebElement dropLebalText;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]")
	public WebElement TextFieldlabel;
	
	@AndroidFindBy(className = "android.widget.EditText")
	private WebElement textField;
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[3]")
	private WebElement textRadiobtn;
	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(id = "com.androidsample.generalstore:id/radioMale")
	private WebElement maleRadiobtn;
	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(id = "com.androidsample.generalstore:id/radioFemale")
	private WebElement femaleRadiobtn;
	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(className = "android.widget.Button")
	private WebElement shopButton;
	
	public void clickOnFirstItem(){

	}

	
	  public String getTitleForPage() { //RemoteWebElement image =
		  String titlepage=pageTitle.getText();
		  return titlepage;
	  
	  }
	  public String getLebelForDropdown() { //RemoteWebElement image =
		  String dropdownLabel=dropLebalText.getText();
		  return dropdownLabel;
	  
	  }
	  public String getTextForDropdown() { //RemoteWebElement image =
		  String dropdownLabel=selectedOption.getText();
		  return dropdownLabel;
	  
	  }
	 
	  public String getLebelOFTextField() { //RemoteWebElement image =
		  String dropdownText=TextFieldlabel.getText();
		  return dropdownText;
	  
	  }
	  public void setTextofTextField() { //RemoteWebElement image =
		  textField.sendKeys("chitra");
		  
	  
	  }
	  public String getTextOfTextField() { //RemoteWebElement image =
		  String dropdownText=textField.getText();
		  return dropdownText;
	  
	  }
	  public String getTextOfRadiobtn() { //RemoteWebElement image =
		  String dropdownText=textRadiobtn.getText();
		  return dropdownText;
	  }
	  public void clickBtn()
	  {
		  shopButton.click();
	  }
	 
	  public boolean getstatusRadiobtn() { //RemoteWebElement image =
		  Boolean dropdowisMaleSelected=maleRadiobtn.isSelected();
		  return dropdowisMaleSelected;
	  }
	  public String getTextOfbtn() { //RemoteWebElement image =
		  String btnText=shopButton.getText();
		  return btnText;
	  }

}
