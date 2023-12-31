package in.podtest;

import in.podtest.pom.HomePage;
import in.podtest.pom.LoginPage;
import in.podtest.utility.ConfigReader;
import in.podtest.utility.ExcelManager;
import in.podtest.utility.ManageDrivers;
import in.podtest.utility.WaitManager;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class LoginTest {

    LoginPage login;
    HomePage home;
    ConfigReader prop;
    String browserName;
    WebDriver wd;

    WaitManager wm;
    private static Logger log = LogManager.getLogger(LoginTest.class.getName());

    @Parameters({"browser"})
    @BeforeClass
    public void preSteps(String browserName) {
    //public void preSteps() {
        prop = new ConfigReader();
       // String browserName = prop.getProperties().getProperty("browserName");
        wd = new ManageDrivers().getRemoteDriver(browserName);
        wm = new WaitManager(wd);
        String implcitWaitTime = prop.getProperties().getProperty("implicitWaitTime");

        Long l1 = new Long(implcitWaitTime);

        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(l1));

        System.out.println("Implicit Wait Time is"+wd.manage().timeouts().getImplicitWaitTimeout().toSeconds());
        log.error("prestep executed");

    }

    @Test(testName = "Verify User able to login", groups = {"jenkinsDemo"})
    public void loginSuccess() {

        login = new LoginPage(wd);
        home = new HomePage(wd);
        login.get().fillLoginDetails("akhiljda@gmail.com", "Password").clickLoginButton();
        home.isValidPage();
        //Assert.assertEquals(wd.getCurrentUrl(), "https://demo.evershop.io/");

    }

    @Test
    public void TC4() {
        System.out.println("Changes made by SDET2");
    }

    @Test
    public void TC3( ) {
        System.out.println("Added By SDET1");
    }

/*
    @Test
    public void loginSuccess2() {

        Assert.assertTrue(false);

    }

    @AfterMethod
    public void addScreenshotToReport(ITestResult result) {
        if (result.getStatus() == ITestResult.SUCCESS) {
            try {
               // String screenshotName = "./src/test/resources/screenshots/"+result.getName() + ".png";
                String screenshotName = "./target/surefire-reports/"+result.getName() + ".png";
                TakesScreenshot ts = (TakesScreenshot) wd;
                File source = ts.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(source, new File(screenshotName));
                Reporter.log("<img src='" + screenshotName.toString() + "' height='400' width='850'/>");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
*/
    @DataProvider(name = "Authentication")
    public  Object[][] credentials() throws IOException {
       // Object[] o1 = new Object[] {"testuser_1", "Test@123" } ;
        //Object[][] o2 = new Object[][] {{"testuser_1", "Test@123" },{ "testuser_2", "Test@123" }} ;
        Object[][] o2 = ExcelManager.readData();
        return o2;
    }

    @Test(dataProvider = "Authentication")
    public void test(String sUsername, String sPassword) {
        System.out.println(sUsername + " "+ sPassword);

    }

    @Test(enabled = false)
    public void test2() {
        Assert.assertTrue(false);

    }

}
