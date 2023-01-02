package org.example;

import dev.failsafe.internal.util.Assert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class InCreditBooster {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();


        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, false);

        URL url = new URL("http://127.0.0.1:4808/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);

        var el1 =  driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"IN Credit Booster\"]"));
        el1.click();
//        Thread.sleep(2000);
        var packageName = driver.getCurrentPackage();

        var el2 = driver.findElement(By.id(packageName + ":id/onboarding_next"));
        el2.click();
//        Thread.sleep(2000);
        var el3 = driver.findElement(By.id(packageName + ":id/onboarding_skip"));
        el3.click();
        Thread.sleep(2000);
        var el4 = driver.findElement(By.id(packageName + ":id/membership_id_field"));
        el4.sendKeys("qwe");
        Thread.sleep(2000);
        var el5 = driver.findElement(By.id(packageName + ":id/loancalculation_agreement_check_result"));
        el5.click();
        Thread.sleep(2000);
        var el6 =  driver.findElement(By.id(packageName + ":id/application_form_continue_btn"));
        el6.click();
        Thread.sleep(2000);


        WebElement el7 = driver.findElement(By.id(packageName+ ":id/appCompatTextView"));
        Assert.isTrue(el7.getText().contains("Allow mobile permissions to generate credit score"), "Alarm");

//        Assert.isTrue(el7.getText().startsWith("Allow"), "Alarm");
    }
}
