package eaby;

import EbayPages.LoginPage;
import EbayPages.ebayHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class LoginTest extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(LoginTest.class);

          @Test
    public void loginInvalidEmailk() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.clickOnLogin();
              ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

              waitFor(1);
       loginPage.typeOnloginEmailField("tex@gmail.");
        waitFor(1);
        loginPage.clickcOncontueptn();
    }

       @Test
    public void loginInvalidUserName() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
           LoginPage loginPage = new LoginPage(getDriver());
        homePage.clickOnLogin();
           ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

           waitFor(1);
        loginPage.typeOnloginEmailField("Jacob");
        waitFor(1);
        loginPage.clickcOncontueptn();
    }

         @Test
    public void loginMissingEmailfikled() {
              ebayHomePage homePage = new ebayHomePage(getDriver());
              LoginPage loginPage = new LoginPage(getDriver());
              homePage.clickOnLogin();
             ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

             waitFor(1);
             loginPage.typeOnloginEmailField("");
              waitFor(1);
              loginPage.clickcOncontueptn();
          }

}
