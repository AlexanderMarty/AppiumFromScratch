import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CredoApp_Bug {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();


        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, false);

        URL url = new URL("http://127.0.0.1:4808/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
            var el1 = driver.findElement(By.id("credoappsdk.standalone:id/reference_number"));
            el1.sendKeys("qwerty123");
            Thread.sleep(200);
            var el2 = driver.findElement(By.id("credoappsdk.standalone:id/reference_number"));
            el2.clear();
            Thread.sleep(200);
            var el3 = driver.findElement(By.id("credoappsdk.standalone:id/permissions_switch"));
            el3.click();
            Thread.sleep(200);
            var el4 = driver.findElement(By.id("credoappsdk.standalone:id/permissions_switch"));
            el4.click();
            Thread.sleep(200);
        }
    }
}
