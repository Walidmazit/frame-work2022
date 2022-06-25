package eaby;

import EbayPages.HomeGardenPage;
import EbayPages.ebayHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class HomeGardenTest extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(HomeGardenTest.class);


    @Test
    public void MyGarage() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoverOverMotor(getDriver());
        homePage.clickOnMyGarage();
    }

      @Test
    public void homeGardan() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoverOverhomegarden(getDriver());
        homePage.clickOntoolspower();
        waitFor(1);
    }

       @Test
    public void Dewalt() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        HomeGardenPage homeGardenPage = new HomeGardenPage(getDriver());
        homePage.hoverOverhomegarden(getDriver());
           ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
           waitFor(1);
           homePage.clickOntoolspower();
        homeGardenPage.clickOnDewalt();
        waitFor(1);
    }
}