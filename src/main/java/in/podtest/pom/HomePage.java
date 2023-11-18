package in.podtest.pom;

import in.podtest.utility.WaitManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver wd;
    WaitManager wm;

    By cartIcon = By.xpath("//a[@class='mini-cart-icon']");
    By menNavigation = By.cssSelector("div.header a[href='/men']");

    public HomePage(WebDriver wd) {
        this.wd = wd;
        this.wm = new WaitManager(this.wd);

    }

    public HomePage clickCartIcon() {
        wd.findElement(this.cartIcon).click();
        return this;
    }

    public HomePage isValidPage() {
        wm.explicitWait(menNavigation);
        return this;
    }
}
