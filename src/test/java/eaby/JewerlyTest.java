package eaby;

import EbayPages.JewerlyPage;
import EbayPages.ebayHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JewerlyTest extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(JewerlyTest.class);


       @Test
    public void Jewerly() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        JewerlyPage jewerlyPage = new JewerlyPage(getDriver());
        homePage.hoverOverjewerly(getDriver());
        waitFor(4);

        jewerlyPage.clickOnLuxuryWatches();
        waitFor(1);
       jewerlyPage.scrollToRolexExplorerWatches(getDriver());
        jewerlyPage.clickOnRolexExplorerWatches();

        String ExpectedTitle = "Rolex Explorer Watches for Sale - Authenticity Guaranteed - eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);

    }

       @Test
    public void Wristwatches() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        JewerlyPage jewerlyPage = new JewerlyPage(getDriver());
        homePage.hoverOverjewerly(getDriver());
           ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
           waitFor(1);
           homePage.clickOnWristwatches();
//        jewerlyPage.scrollToInvictaMenWatchProDiver(getDriver());
        waitFor(1);
        jewerlyPage.clickOnInvictaMenWatchProDiver();
        waitFor(1);

    }

     @Test
    public void RelaxWatch() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        JewerlyPage jewerlyPage = new JewerlyPage(getDriver());
        homePage.hoverOverjewerly(getDriver());
         ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
         waitFor(1);

         homePage.clickOnOMGA();
        waitFor(1);
//      jewerlyPage.scrollToDive300r(getDriver());
        jewerlyPage.clickOnDive300();
        String ExpectedTitle = "OMEGA Diver 300M Co-Axial Master Chronometer White Men's Watch - 210.30.42.20.04.001 for sale online | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }

     @Test
    public void FashionJewelry() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        JewerlyPage jewerlyPage = new JewerlyPage(getDriver());
         homePage.hoverOverjewerly(getDriver());
         ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
         waitFor(1);

         homePage.clickOnFashionJewelry();
         waitFor(1);
        jewerlyPage.scrollToMendelMens(getDriver());
        jewerlyPage.clickOnMendelMens();
    }

      @Test
    public void Breitling() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        JewerlyPage jewerlyPage = new JewerlyPage(getDriver());
        homePage.hoverOverjewerly(getDriver());
          ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
          waitFor(1);
          homePage.clickOnBreitling();
     waitFor(1);
        jewerlyPage.clickOnNavitimery();
        String ExpectedTitle = "Breitling Navitimer Watches for Sale - Authenticity Guaranteed - eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
    }

         @Test
    public void TAGHeuer() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        JewerlyPage jewerlyPage = new JewerlyPage(getDriver());
        homePage.hoverOverjewerly(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);

        homePage.clickOnTAGHeuer();
        waitFor(1);
//        jewerlyPage.clickOnTAGHeuerFormula();
        waitFor(1);
    }

       @Test
    public void PatekPhilippe() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        JewerlyPage jewerlyPage = new JewerlyPage(getDriver());
        homePage.hoverOverjewerly(getDriver());
           ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
           waitFor(1);
        homePage.clickOnPatekPhilippe();
        jewerlyPage.clickOnBreitlingWatches();
        waitFor(1);

    }

       @Test
    public void Cartier() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        JewerlyPage jewerlyPage = new JewerlyPage(getDriver());
        homePage.hoverOverjewerly(getDriver());
           ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
           waitFor(1);
        homePage.clickOnCartier();
        jewerlyPage.clickOnRings();
        String ExpectedTitle = "Cartier Fine Jewelry for Sale - eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }

     @Test
    public void VanCleefArpels() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        JewerlyPage jewerlyPage = new JewerlyPage(getDriver());
        homePage.hoverOverjewerly(getDriver());
         ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
         waitFor(1);

         homePage.clickOnVanCleefArpels();
        waitFor(1);
        jewerlyPage.scrollToTestNumber2(getDriver());
        jewerlyPage.clickOnTestNumber2();
        String ExpectedTitle = "Van Cleef & Arpels Fine Jewelry for Sale | Shop Designer Jewelry | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }

     @Test
    public void TiffanyCo() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        JewerlyPage jewerlyPage = new JewerlyPage(getDriver());
        homePage.hoverOverjewerly(getDriver());
         ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
         waitFor(1);

        homePage.clickOnTiffanyCo();
        waitFor(1);
        jewerlyPage.clickOnWhiteGold();
        String ExpectedTitle = "Tiffany & Co. White Gold Fine Jewelry for Sale | Shop Designer Jewelry | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }

    @Test
    public void FashionRings() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        JewerlyPage jewerlyPage = new JewerlyPage(getDriver());
        homePage.hoverOverjewerly(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.clickOnTiffanyCo();
        waitFor(1);
        jewerlyPage.clickOnWhiteGold();
        waitFor(1);
        jewerlyPage.scrollToFashionRings(getDriver());
        jewerlyPage.clickOnFashionRings();
       String ExpectedTitle = "Fashion Rings for sale | eBay";
       Assert.assertEquals(getPageTitle(), ExpectedTitle);
       waitFor(1);
    }
}





