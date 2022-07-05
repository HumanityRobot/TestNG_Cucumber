package StepDefinitions;

import Lib.FunctionalLib;
import Lib.FunctionalLibAndroid;
import Lib.ReadObject;
import Lib.StepLibAndroid;
import MyRunner.TestRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;

import java.util.concurrent.TimeUnit;

public class loginAndroidStepDef extends TestRunner {

    public AndroidDriver driver = this.connection;
    public ReadObject pars = this.parser;
    public String capturePath = TestRunner.capturePath;
    public String featureName = TestRunner.currentFeature;

    @Given("user open blu App")
    public void user_open_blu_App() throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        intScenarioNum++;
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Boolean objDisplayed = false;
        try {
            objDisplayed = driver.findElement(pars.getbjectLocator("login_btnYukMulai")).isDisplayed();
        }catch (Exception e){
            objDisplayed = false;
        }
        if (objDisplayed==false){
            if (driver.findElements(pars.getbjectLocator("login_btnLoginDenganAkunLain")).size() >= 1){
                StepLibAndroid.existingLoginNoCapture();
            }else {
                int objTrue = 0;
                do {
                    Thread.sleep(500);
                    driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
                    Thread.sleep(1000);
                    objTrue = driver.findElements(pars.getbjectLocator("login_btnYukMulai")).size();
                }while (objTrue == 0);
            }
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Given("Click Button Yuk Mulai")
    public void click_Button_Yuk_Mulai() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        FunctionalLibAndroid.takeSnapShot(driver,capturePath,featureName,intScenarioNum,"login_btnYukMulai");
        driver.findElement(pars.getbjectLocator("login_btnYukMulai")).click();
    }

    @When("user do login by insert registered phone number")
    public void user_do_login_by_insert_registered_phone_number() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        StepLibAndroid.DoloopWhileObject("login_txtNoHp");
        driver.findElement(pars.getbjectLocator("login_txtNoHp")).clear();
        driver.findElement(pars.getbjectLocator("login_txtNoHp")).sendKeys("085696963232");
        driver.hideKeyboard();
        FunctionalLibAndroid.takeSnapShot(driver,capturePath,featureName,intScenarioNum,"login_txtNoHp");
        driver.findElement(pars.getbjectLocator("login_btnLanjut")).click();
        Thread.sleep(2000);
        if (driver.findElements(pars.getbjectLocator("btnPermision")).size() >= 1){
            driver.findElement(pars.getbjectLocator("btnPermision")).click();
        }
    }

    @When("user input correct OTP")
    public void user_input_correct_OTP() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        StepLibAndroid.DoloopWhileObject("login_btnOtp");
        Thread.sleep(2000);
        driver.findElement(pars.getbjectLocator("login_btnOtp")).click();
        Thread.sleep(2000);
        FunctionalLibAndroid.takeSnapShot(driver,capturePath,featureName,intScenarioNum,"login_btnOtp");
        driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.DIGIT_1));
        driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.DIGIT_2));
        driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.DIGIT_3));
        driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.DIGIT_4));

    }

    @When("user insert correct password")
    public void user_insert_correct_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        StepLibAndroid.DoloopWhileObject("login_btnMasuk");
        driver.findElement(pars.getbjectLocator("login_txtPassword")).sendKeys("Password123@");
        //FunctionalLibAndroid.takeSnapShot(driver,capturePath,featureName,intScenarioNum,"login_btnMasuk");
        driver.hideKeyboard();
        Thread.sleep(1000);
        driver.findElement(pars.getbjectLocator("login_btnEye")).click();
        FunctionalLibAndroid.takeSnapShot(driver,capturePath,featureName,intScenarioNum,"login_btnMasuk");
        driver.findElement(pars.getbjectLocator("login_btnMasuk")).click();
    }

    @Then("successfully login")
    public void successfully_login() throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        StepLibAndroid.DoloopWhileObject("dashboard_btnNantiSajaBioAndro");
        FunctionalLibAndroid.takeSnapShot(driver,capturePath,featureName,intScenarioNum,"dashboard_btnNantiSajaBioAndro");
        driver.findElement(pars.getbjectLocator("dashboard_btnNantiSajaBioAndro")).click();
        Thread.sleep(2000);
        FunctionalLibAndroid.takeSnapShot(driver,capturePath,featureName,intScenarioNum,"dashboard_txtGreatingAndroid");
        driver.findElement(pars.getbjectLocator("dashboard_btnTrackerAndroid")).click();
        Thread.sleep(2000);
        FunctionalLibAndroid.takeSnapShot(driver,capturePath,featureName,intScenarioNum,"dashboard_btnTrackerAndroid");
        driver.findElement(pars.getbjectLocator("dashboard_btnSimpananAndroid")).click();
        Thread.sleep(2000);
        FunctionalLibAndroid.takeSnapShot(driver,capturePath,featureName,intScenarioNum,"dashboard_btnSimpananAndroid");

        StepLibAndroid.Logout();

    }

    @When("user do login by insert unregistered phone number")
    public void user_do_login_by_insert_unregistered_phone_number() throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        StepLibAndroid.DoloopWhileObject("login_txtNoHp");
        driver.findElement(pars.getbjectLocator("login_txtNoHp")).clear();
        driver.findElement(pars.getbjectLocator("login_txtNoHp")).sendKeys("085696963131");
        driver.hideKeyboard();
        FunctionalLibAndroid.takeSnapShot(driver,capturePath,featureName,intScenarioNum,"login_txtNoHp");
        driver.findElement(pars.getbjectLocator("login_btnLanjut")).click();
        Thread.sleep(2000);
        if (driver.findElements(pars.getbjectLocator("btnPermision")).size() >= 1){
            driver.findElement(pars.getbjectLocator("btnPermision")).click();
        }
    }

    @Then("direct to Biar prosesnya lancar, siapkan ini dulu yuk")
    public void direct_to_Biar_prosesnya_lancar_siapkan_ini_dulu_yuk() throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        StepLibAndroid.DoloopWhileObject("login_lblBiarProsesLancarSiapin");
        FunctionalLibAndroid.takeSnapShot(driver,capturePath,featureName,intScenarioNum,"login_lblBiarProsesLancarSiapin");
    }

    @When("user insert incorrect password")
    public void user_insert_incorrect_password() throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        StepLibAndroid.DoloopWhileObject("login_btnMasuk");
        driver.findElement(pars.getbjectLocator("login_txtPassword")).sendKeys("Password123!");
        //FunctionalLibAndroid.takeSnapShot(driver,capturePath,featureName,intScenarioNum,"login_btnMasuk");
        driver.hideKeyboard();
        Thread.sleep(1000);
        driver.findElement(pars.getbjectLocator("login_btnEye")).click();
        FunctionalLibAndroid.takeSnapShot(driver,capturePath,featureName,intScenarioNum,"login_btnMasuk");
        driver.findElement(pars.getbjectLocator("login_btnMasuk")).click();
    }

    @Then("display live error Password yang dimasukkan salah")
    public void display_live_error_Password_yang_dimasukkan_salah() throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        StepLibAndroid.DoloopWhileObject("login_lblPasswordSalah");
        FunctionalLibAndroid.takeSnapShot(driver,capturePath,featureName,intScenarioNum,"login_lblPasswordSalah");
    }

    @When("user input incorrect OTP")
    public void user_input_incorrect_OTP() throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        StepLibAndroid.DoloopWhileObject("login_btnOtp");
        Thread.sleep(2000);
        driver.findElement(pars.getbjectLocator("login_btnOtp")).click();
        Thread.sleep(2000);
        FunctionalLibAndroid.takeSnapShot(driver,capturePath,featureName,intScenarioNum,"login_btnOtp");
        driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.DIGIT_2));
        driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.DIGIT_2));
        driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.DIGIT_2));
        driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.DIGIT_2));
    }

    @Then("display live error Oops… Kode Salah")
    public void display_live_error_Oops_Kode_Salah() throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        StepLibAndroid.DoloopWhileObject("login_lblOTPKodeSalah");
        FunctionalLibAndroid.takeSnapShot(driver,capturePath,featureName,intScenarioNum,"login_lblOTPKodeSalah");
    }

    @When("user click button Fees & Rates")
    public void user_click_button_Fees_Rates() throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        FunctionalLibAndroid.takeSnapShot(driver,capturePath,featureName,intScenarioNum,"login_lblFeesAndRates");
        driver.findElement(pars.getbjectLocator("login_lblFeesAndRates")).click();
    }

    @Then("direct to Fees & Rate Page")
    public void direct_to_Fees_Rate_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        StepLibAndroid.DoloopWhileObject("login_btnWebViewHaloBlu");
        FunctionalLibAndroid.takeSnapShot(driver,capturePath,featureName,intScenarioNum,"login_btnWebViewHaloBlu");
    }
}
