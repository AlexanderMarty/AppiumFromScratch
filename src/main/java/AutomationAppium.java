import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

//setting capabilities via code

public class AutomationAppium {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("noReset", true);

        URL url = new URL("http://127.0.0.1:4808/wd/hub");
       AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);

        var el1 =  driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"IN Credit Booster\"]"));
        el1.click();
        Thread.sleep(2000);
        var el2 = driver.findElement(By.id("incr.credoapp:id/onboarding_next"));
        el2.click();
        Thread.sleep(2000);
        var el3 = driver.findElement(By.id("incr.credoapp:id/onboarding_skip"));
        el3.click();
      Thread.sleep(2000);
        var el4 = driver.findElement(By.id("incr.credoapp:id/membership_id_field"));
        el4.sendKeys("qwe");
        Thread.sleep(2000);
        var el5 = driver.findElement(By.id("incr.credoapp:id/loancalculation_agreement_check_result"));
        el5.click();
        Thread.sleep(2000);
        var el6 =  driver.findElement(By.id("incr.credoapp:id/application_form_continue_btn"));
        el6.click();
        Thread.sleep(2000);

//        MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"IN Credit Booster\"]");
//        el1.click();
//        MobileElement el2 = (MobileElement) driver.findElementById("incr.credoapp:id/onboarding_next");
//        el2.click();
//        MobileElement el3 = (MobileElement) driver.findElementById("incr.credoapp:id/onboarding_skip");
//        el3.click();
//        MobileElement el4 = (MobileElement) driver.findElementById("incr.credoapp:id/membership_id_field");
//        el4.sendKeys("qwe");
//        MobileElement el5 = (MobileElement) driver.findElementById("incr.credoapp:id/loancalculation_agreement_check_result");
//        el5.click();
//        MobileElement el6 = (MobileElement) driver.findElementById("incr.credoapp:id/application_form_continue_btn");
//        el6.click();

    }
}
