package eaby;

import EbayPages.MotorItemsPage;
import EbayPages.ebayHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MotorsItemsTest extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(MotorsItemsTest.class);

    @Test
    public void motorcycle() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        MotorItemsPage motorItemsPage = new MotorItemsPage(getDriver());
        homePage.hoverOverMotor(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);
        homePage.clickOnMotorcycles();
    }
    @Test
    public void boat() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        MotorItemsPage motorItemsPage = new MotorItemsPage(getDriver());
        homePage.hoverOverMotor(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);
        homePage.clickOnBoat();

    }
    @Test
     public void FishingBeat() {
        LOG.info("TEst is Processing");
        ebayHomePage homePage = new ebayHomePage(getDriver());
        MotorItemsPage motorItemsPage = new MotorItemsPage(getDriver());
        homePage.hoverOverMotor(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);

        homePage.clickOnBoat();
        motorItemsPage.clickOnFishinBoat();
    }
   @Test
    public void CarTracks() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        MotorItemsPage motorItemsPage = new MotorItemsPage(getDriver());
        homePage.hoverOverMotor(getDriver());
       ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
       waitFor(1);

        homePage.clickOnCarsTrucks();
        waitFor(1);
        motorItemsPage.clickOnCollctorCars();
    }
   @Test
    public void Classic() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        MotorItemsPage motorItemsPage = new MotorItemsPage(getDriver());
        homePage.hoverOverMotor(getDriver());
       ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
waitFor(1);
        homePage.clickOnClassic();
        motorItemsPage.scrollToAutomotiveTools(getDriver());
        waitFor(1);
    }
  @Test
    public void AllPartsAccessories () {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        MotorItemsPage motorItemsPage = new MotorItemsPage(getDriver());
        homePage.hoverOverMotor(getDriver());
      ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        ;waitFor(1);
        homePage.clickOnAllPartsAccessories();
        motorItemsPage.clickOnWheels();
      String ExpectedTitle = "Car & Truck Exterior Parts & Accessories for sale | eBay";
       Assert.assertEquals(getPageTitle(),ExpectedTitle);
       waitFor(1);
    }
   @Test
    public void PowerSports () {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        MotorItemsPage motorItemsPage = new MotorItemsPage(getDriver());
        homePage.hoverOverMotor(getDriver());
       ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
waitFor(1);
        homePage.clickOnPowerSport();
        motorItemsPage.clickOnAtvscar();
        waitFor(1);
        String ExpectedTitle = "ATVs for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
    }
    @Test
    public void Trailaer () {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        MotorItemsPage motorItemsPage = new MotorItemsPage(getDriver());
        homePage.hoverOverMotor(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        homePage.clickOnTrailaer();
        waitFor(1);
        motorItemsPage.clickOnBuses();

        String ExpectedTitle = "Buses for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }
}
