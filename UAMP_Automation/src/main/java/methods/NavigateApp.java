package methods;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class NavigateApp extends AppStart {

	public static void main(String[] args) throws Exception {
		
		AndroidDriver<AndroidElement> driver=(AndroidDriver<AndroidElement>) Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("(//android.widget.TextView)[@text='Wake Up']").click(); //Open First Album
		driver.findElementByXPath("(//android.widget.TextView)[@text='Geisha']").click(); //Play Track
		driver.findElementByXPath("(//android.widget.TextView)[@text='Geisha']").click(); //Stop Track
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Outro - Totally Here and Now (feat. Alan Watts)\"));");
		
	}

}
