import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CrediOrbe_BUG {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();


        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, false);

        URL url = new URL("http://127.0.0.1:4808/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);

        var el1 =  driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"CrediOrbe\"]"));
        el1.click();
        Thread.sleep(200);

        var packageName = driver.getCurrentPackage();
        var el2 =  driver.findElement(By.id(packageName + ":id/onboarding_next"));
        el2.click();
        Thread.sleep(200);
        var el3 =  driver.findElement(By.id(packageName +":id/onboarding_popup_ok_button"));
        el3.click();
        Thread.sleep(200);
        var el4 =  driver.findElement(By.id(packageName +":id/onboarding_next"));
        el4.click();
        Thread.sleep(200);

        for (int i = 0; i < 10; i++) {
            var el5 = driver.findElement(By.id(packageName + ":id/onboarding_complete"));
            el5.click();
            Thread.sleep(5000);
            var el6 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
            el6.sendKeys("qwe");
            Thread.sleep(200);
            var el7 = driver.findElement(By.id(packageName + ":id/loancalculation_agreement_check_result"));
            el7.click();
            Thread.sleep(200);
            var el8 = driver.findElement(By.id(packageName + ":id/loancalculation_agreement_check_result_2"));
            el8.click();
            Thread.sleep(200);
            var el9 = driver.findElement(By.id(packageName + ":id/loancalculation_agreement_check_result_3"));
            el9.click();
            Thread.sleep(200);
            var el10 = driver.findElement(By.id(packageName + ":id/application_form_continue_btn"));
            el10.click();
            Thread.sleep(200);
            var el11 = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
            el11.click();
            Thread.sleep(200);
            var el12 = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
            el12.click();
            Thread.sleep(200);
            System.out.println(i);
        }
//        var el13 =  driver.findElement(By.id(packageName +":id/onboarding_complete"));
//        el13.click();
//        Thread.sleep(200);

    }
}
