package in.podtest;

import in.podtest.pom.LoginPage;
import in.podtest.utility.ConfigReader;
import in.podtest.utility.ManageDrivers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTestCrossBrowser {
/*
    LoginPage login;
    ConfigReader prop;
    String browserName;
    WebDriver wd;
    private static Logger log = LogManager.getLogger(LoginTestCrossBrowser.class.getName());

    @BeforeClass
    public void preSteps() {

        prop = new ConfigReader();
        log.error("prestep executed");

    }

    @Parameters({"browser"})
    @Test
    public void loginSuccess(String browserName) {


        //browserName = prop.getProperties().getProperty("browserName");
        //wd = new ManageDrivers().getDriver(browserName);
        wd = new ManageDrivers().getRemoteDriver(browserName);
        //wd = ManageDrivers.getRemoteDriverStatic(browserName);
        login = new LoginPage(wd);
        login.get().fillLoginDetails("akhiljda@gmail.com", "Password").clickLoginButton();

    }
*/

}
