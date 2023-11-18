package in.podtest.pom;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver wd ;
    By emailInput = By.xpath("//input[@name='email']");
    By passwordInput = By.xpath("//input[@name='password']");

    By loginButton = By.xpath("//button[@type='submit']");

    private static Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage(WebDriver wd) {
        log.error("LoginPage class object created");
        this.wd = wd;
    }

    public LoginPage get() {
       // log.error("Login page accessed");
        this.wd.get("https://demo.evershop.io/account/login");
        return this;
    }

    public LoginPage get(String URL) {
        // log.error("Login page accessed");
        this.wd.get(URL);
        return this;
    }

    public void fillUserName( String userName) {
        wd.findElement(this.emailInput).sendKeys(userName);
    }

    public LoginPage fillLoginDetails( String UN, String pw) {

        wd.findElement(this.emailInput).sendKeys(UN);
        wd.findElement(passwordInput).sendKeys(pw);
        return this;
    }

    public void clickLoginButton() {
        wd.findElement(loginButton).click();
    }
}
