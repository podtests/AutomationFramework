package in.podtest;

import in.podtest.pom.LoginPage;
import in.podtest.utility.ConfigReader;
import in.podtest.utility.ManageDrivers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestParallel {


/*
    private static Logger log = LogManager.getLogger(LoginTestParallel.class.getName());

    @BeforeClass
    public void preSteps() {

        log.error("prestep executed");

    }

    @Test
    public void loginSuccess() {

        LoginPage login;
        ConfigReader prop;
        String browserName;
        WebDriver wd;
        prop = new ConfigReader();
        browserName = prop.getProperties().getProperty("browserName");
        wd = new ManageDrivers().getDriver(browserName);
        //wd = new ManageDrivers().getRemoteDriver(browserName);
        //wd = ManageDrivers.getRemoteDriverStatic(browserName);
        login = new LoginPage(wd);
        login.get().fillLoginDetails("akhiljda@gmail.com", "Password").clickLoginButton();

        //Assert.assertEquals("","");
        //SoftAssert asserts = new SoftAssert();

    }

    @Test
    public void loginUnsuccess() {
        LoginPage login;
        ConfigReader prop;
        String browserName;
        WebDriver wd;
        prop = new ConfigReader();
        browserName = prop.getProperties().getProperty("browserName");
        wd = new ManageDrivers().getDriver(browserName);
        //wd = new ManageDrivers().getRemoteDriver(browserName);
        //wd = ManageDrivers.getRemoteDriverStatic(browserName);
        login = new LoginPage(wd);
        login.get().fillLoginDetails("akhiljda@gmail.com", "Pass").clickLoginButton();

    }
*/
}
