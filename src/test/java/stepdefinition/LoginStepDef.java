package stepdefinition;

import in.podtest.LoginTest;
import in.podtest.pom.HomePage;
import in.podtest.pom.LoginPage;
import in.podtest.utility.ConfigReader;
import in.podtest.utility.ManageDrivers;
import in.podtest.utility.WaitManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class LoginStepDef {

    LoginPage login;
    HomePage home;
    ConfigReader prop;
    String browserName;
    WebDriver wd;

    WaitManager wm;

    String URL;

    private static Logger log = LogManager.getLogger(LoginStepDef.class.getName());


    @Given("Application URL is opened")
    public void open_url() {

        prop = new ConfigReader();
        browserName = prop.getProperties().getProperty("browserName");
        wd = new ManageDrivers().getRemoteDriver(browserName);
        wm = new WaitManager(wd);

        login = new LoginPage(wd);
        URL =  prop.getProperties().getProperty("url");
        login.get(URL);
    }

    @When("Provide Credentials {string} and {string} on Login Screen")
    public void fillCredentials(String UN, String PW) {
        log.info("Username is: "+UN);
        log.info("Password is:"+PW);
        login.fillLoginDetails(UN, PW).clickLoginButton();
    }

    @When("Provide Credentials")
    public void fillCredentials(DataTable table) {
       List<String> row1 =  table.row(1);
        log.info("Username is: "+row1.get(0));
        log.info("Password is:"+row1.get(1));
        login.fillLoginDetails(row1.get(0), row1.get(1)).clickLoginButton();
    }


    @Then("Application should not allow to Login")
    public void validateLogin() {
        String currentURL = wd.getCurrentUrl();
        Assert.assertEquals(currentURL, "https://demo.evershop.io/"); //Hard Assertion

        //SoftAssert sa = new SoftAssert();
        //sa.assertEquals(currentURL, "https://demo.evershop.io/");//1

        //2


        //System.out.println("I reached Here");

        //sa.assertAll();
    }


}
