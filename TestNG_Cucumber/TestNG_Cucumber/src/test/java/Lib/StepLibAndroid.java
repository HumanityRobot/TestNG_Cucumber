package Lib;

import MyRunner.TestRunner;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class StepLibAndroid extends TestRunner {

    public static AndroidDriver driver = connection;
    public static ReadObject pars = parser;
    public String capturePath = TestRunner.capturePath;
    public String featureName = TestRunner.currentFeature;

    public static void loginNoCapture(String nomor, String password) throws InterruptedException{

    }

    public static void existingLoginNoCapture() throws Throwable{
        driver.hideKeyboard();
        Thread.sleep(1000);
        driver.findElement(pars.getbjectLocator("login_btnLoginDenganAkunLain")).click();
        Thread.sleep(1000);
        driver.findElement(pars.getbjectLocator("login_btnLoginDenganAkunLain")).click();
        DoloopWhileObject("btnKeluar");
        driver.findElement(pars.getbjectLocator("btnKeluar")).click();
        DoloopWhileObject("login_btnYukMulai");

    }

    public static void Logout() throws Throwable{
        driver.hideKeyboard();
        driver.findElement(pars.getbjectLocator("dashboard_btnHomeAndroid")).click();
        Thread.sleep(2000);
        driver.findElement(pars.getbjectLocator("dashboard_btnAccountSettingAndroid")).click();
        DoloopWhileObject("pengaturan_lblKodeReferralAndroid");
        scrollDownObject("pengaturan_lblKeluarAplikasiAndroid");
        driver.findElement(pars.getbjectLocator("pengaturan_lblKeluarAplikasiAndroid")).click();
        driver.findElement(pars.getbjectLocator("btnKeluar")).click();

    }

    public static void DoloopWhileObject(String obj) throws Throwable {
        int objTrue = 0;
        do {
            Thread.sleep(500);
            objTrue = driver.findElements(pars.getbjectLocator(obj)).size();
        }while (objTrue == 0);
    }

    public static void scrollDownObject(String obj) throws InterruptedException {
        Thread.sleep(500);
        //SWIPING AREA
        Dimension windowSizePopDown = driver.manage().window().getSize();

        Integer widthPopDown = windowSizePopDown.getWidth();
        Integer heightPopDown = windowSizePopDown.getHeight();

        //Bulan
        Integer xPopDown = (widthPopDown/3*2)-widthPopDown/5;
        Integer yPopDown = heightPopDown/2+heightPopDown/4;

        int FindObj = 0;
        FindObj = driver.findElements(pars.getbjectLocator(obj)).size();
        if (FindObj == 0) {
            do {
                new TouchAction((PerformsTouchActions) driver)
                        .press(PointOption.point(xPopDown, yPopDown))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(xPopDown, yPopDown - heightPopDown / 2))
                        .release().perform();

                FindObj = driver.findElements(pars.getbjectLocator(obj)).size();
            } while (FindObj == 0);
        }
    }


}
