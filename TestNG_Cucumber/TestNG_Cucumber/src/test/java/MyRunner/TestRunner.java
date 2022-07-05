package MyRunner;

import Lib.ReadObject;
import Lib.Report;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

@CucumberOptions(
        features = {"src/test/resources/Features"},
        tags = {"@LoginAndroid"},
        glue= {"StepDefinitions"},
        plugin = { "pretty","html:target/cucumber-reports"}
)


public class TestRunner extends AbstractTestNGCucumberTests {

    private TestNGCucumberRunner testNGCucumberRunner;
    public static AndroidDriver connection;
    public static WebDriverWait wait;
    public static ReadObject parser;
    public static String capturePath;
    public static String currentFeature;
    public static Integer intScenarioNum;
    public static HashMap<String,String> glbVarString = new HashMap<>();
    public static HashMap<String,Boolean> glbVarBoolean = new HashMap<>();


    @BeforeClass(alwaysRun = true)
    public void setUpCucumber() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        String now = LocalDate.now().toString();
        String[] strDateNow = LocalDateTime.now().toString().split("[.]");//(dtf.format(now).toString());
        String strDate = strDateNow[0].replace(":","-");
        //capturePath = "/Users/gdis/Documents/AutomationCapture/"+strDate;
        capturePath = "C:\\CaptureScreen\\BLUANDROID"+strDate;

    }

    @BeforeMethod
    @Parameters(value = { "appPackage", "appActivity" , "udid" })
    public void beforeClass(String appPackage, String appActivity, String udid) throws IOException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid", udid); //Give Device ID of your mobile phone
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", appActivity);
        capabilities.setCapability("noReset", "false");
        capabilities.setCapability("autoWebView", "true");
        capabilities.setCapability("chromedriverExecutable", System.getProperty("user.dir") +"\\chromeDriver\\chromedriver.exe");
        connection = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        connection.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(connection, 10);

        parser = new ReadObject(System.getProperty("user.dir")+"/src/test/java/objects/object.properties");
        intScenarioNum = 0;
    }

    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        currentFeature = cucumberFeature.toString();
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        testNGCucumberRunner.finish();
    }

    @AfterMethod
    public void afterMethod() throws IOException {
        String folderNameMethod = capturePath+"/"+currentFeature.replace(" ","_")+"/";
        Report.CreateWPExcel(folderNameMethod, currentFeature, "HORIZONTAL");
    }
}

