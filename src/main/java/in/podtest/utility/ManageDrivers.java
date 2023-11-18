package in.podtest.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ManageDrivers {

    static  WebDriver wd;

    private WebDriver wd2;


    public static WebDriver getDriverStatic(String browserName) {

        switch( browserName) {
            case "chrome": {
                wd = new ChromeDriver();
                break;
            }
            case "firefox": {
                wd = new FirefoxDriver();
                break;
            }
            default: {
                System.out.println("In Default");
                wd = new ChromeDriver();
                break;
            }
        }

        return wd;

    }

    public static WebDriver getRemoteDriverStatic(String browserName)  {
        ChromeOptions option = null;

        switch( browserName) {
            case "chrome": {
                option = new ChromeOptions();
                break;
            }
            default: {
                option = new ChromeOptions();
                break;
            }
        }

        try {
            wd = new RemoteWebDriver(new URL("http://localhost:4444"),option);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return wd;
    }

    public WebDriver getDriver(String browserName) {

        switch( browserName) {
            case "chrome": {
                wd2 = new ChromeDriver();
                break;
            }
            case "firefox": {
                wd2 = new FirefoxDriver();
                break;
            }
            default: {
                System.out.println("In Default");
                wd2 = new ChromeDriver();
                break;
            }
        }

        return wd2;

    }
    public WebDriver getRemoteDriver(String browserName)  {
        ChromeOptions option = null;
        FirefoxOptions option2 = null;

        try {
            switch (browserName) {
                case "chrome": {
                    option = new ChromeOptions();
                    wd2 = new RemoteWebDriver(new URL("http://localhost:4444"), option);
                    break;
                }
                case "firefox": {
                    option2 = new FirefoxOptions();
                    wd2 = new RemoteWebDriver(new URL("http://localhost:4444"), option2);
                    break;
                }

                default: {
                    option = new ChromeOptions();
                    wd2 = new RemoteWebDriver(new URL("http://localhost:4444"), option);
                    break;
                }
            }
        }

        catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return wd2;
    }



}
