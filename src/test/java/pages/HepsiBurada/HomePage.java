package pages.HepsiBurada;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HepsiBurada.Components.Navbar;
import utilities.PagePath;
import utilities.PropertiesFile;

import java.time.Duration;

public class HomePage extends BasePage {
    public Navbar navbar;
    public By acceptCookiesLocator = getPropertiesToXPath(PagePath.homePagePath, "acceptCookiesLocator");
    public By searchInboxLocator = getPropertiesToXPath(PagePath.homePagePath, "searchInboxLocator");
    public By searchButtonLocator = getPropertiesToXPath(PagePath.homePagePath, "searchButtonLocator");
    public By specialTodayLocator = getPropertiesToXPath(PagePath.homePagePath, "specialTodayLocator");

    public By loginButtonLocator = getPropertiesToXPath(PagePath.homePagePath, "loginButtonLocator");
    public By loginOrSignUpLocator = getPropertiesToXPath(PagePath.homePagePath, "loginOrSignUpLocator");
    public By searchFirstProductLocator = getPropertiesToXPath(PagePath.homePagePath, "searchFirstProductLocator");

    public HomePage(WebDriver driver) {
        super.driver = driver;
        this.getUrl = PropertiesFile.getProperties(PagePath.configurationPath, "basePath");
        navbar = new Navbar();


    }

    public void acceptCookies() {
        if (isDisplayed(acceptCookiesLocator))
            click(acceptCookiesLocator);
    }


    public void gotoLoginOrSignUp() {
        pageLoadTimeout(Duration.ofSeconds(40));
        hover(loginOrSignUpLocator);
        click(loginButtonLocator);
    }

    public void searchProduct(String productName) {
        pageLoadTimeout(Duration.ofSeconds(40));
        type(searchInboxLocator, productName);
        implicitlyWait(Duration.ofSeconds(10));
        click(searchFirstProductLocator);
    }
}
