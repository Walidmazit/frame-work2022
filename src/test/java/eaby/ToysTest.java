package eaby;

import EbayPages.ToysPage;
import EbayPages.ebayHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToysTest extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(ToysTest.class);

    @Test
    public void hoverovertoysr() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        ToysPage toysPage = new ToysPage(getDriver());
        homePage.hoverOverToys(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);
        homePage.clickOnToysDeal();
        toysPage.clickOnAstrial();
        toysPage.clickOnbuyAstrial();
        waitFor(1);
//        String ExpectedTitle = "Astral Radiance Booster Box 36 ct Pokemon TCG Sword & Shield SEALED 820650860232 | eBay";
//        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }


    @Test
    public void Mattel() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        ToysPage toysPage = new ToysPage(getDriver());
        homePage.hoverOverToys(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.clickOnActionFigure();
        toysPage.clickOnMettel();
        waitFor(1);

    }

    @Test
    public void TeddiBear() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        ToysPage toysPage = new ToysPage(getDriver());
        homePage.hoverOverToys(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);

        homePage.clickOnTeddBear();
        waitFor(1);
        toysPage.scrollToBabeAlive(getDriver());
        toysPage.clickOnBabeAlive();
        waitFor(1);

    }

    @Test
    public void CarsTrucksVans() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        ToysPage toysPage = new ToysPage(getDriver());
        homePage.hoverOverToys(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);

        homePage.clickOnToysVichele();
        waitFor(1);
        toysPage.clickOnCarsTrucksVans();
        String ExpectedTitle = "Diecast Cars, Trucks & Vans for Sale - eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);

    }

    @Test
    public void BuldingToys() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        ToysPage toysPage = new ToysPage(getDriver());
        homePage.hoverOverToys(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.clickOnBuldingToys();
        toysPage.scrollToLEGO(getDriver());
        toysPage.clickOnLEGO();
        waitFor(1);
    }

    @Test
    public void CollactiveCarGame() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        ToysPage toysPage = new ToysPage(getDriver());
        homePage.hoverOverToys(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.clickOnCollactiveCarGames();
        toysPage.scrollToBokimonCards(getDriver());
        toysPage.clickOnBokimonCards();
        String ExpectedTitle = "U Pokemon Card Booster Box Pokemon Go 2 Box set s10b w/10 promo pack NEW | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);

    }

    @Test
    public void ModelsTrains() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        ToysPage toysPage = new ToysPage(getDriver());
        homePage.hoverOverToys(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);

        homePage.clickOnModelsTrains();
        toysPage.clickOnScale();
        waitFor(1);
        String ExpectedTitle = "O Model Railroads & Trains for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }

    @Test
    public void ToysModelsKit() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        ToysPage toysPage = new ToysPage(getDriver());
        homePage.hoverOverToys(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);

        homePage.clickOnToysModelKit();
        waitFor(1);
        toysPage.clickOnAircraft();
        toysPage.scrollToRevel85(getDriver());
        toysPage.clickOnRevel85();
        waitFor(1);
        String ExpectedTitle = "O Model Railroads & Trains for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);

    }

    @Test
    public void warhammare40k() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        ToysPage toysPage = new ToysPage(getDriver());
        homePage.hoverOverToys(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.clickOnWarhammar40k();
        toysPage.clickOnFullyessmbeledPainted();
        String ExpectedTitle = "Fully Assembled & Painted Warhammer 40K Miniatures for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }

    @Test
    public void BoardRoleplayingGames() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        ToysPage toysPage = new ToysPage(getDriver());
        homePage.hoverOverToys(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.clickOnBoardRoleplayingGames();
        waitFor(1);
        toysPage.clickOnCardBoker();
        String ExpectedTitle = "Card Games & Poker Cards for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }

    @Test
    public void PreschoolToysPretendPlay() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        ToysPage toysPage = new ToysPage(getDriver());
        homePage.hoverOverToys(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.clickOnPreschoolToysPretendPlay();
        toysPage.clickOnFisherPrice();
        String ExpectedTitle = "Fisher-Price Toys for Sale - eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }

    @Test
    public void NERFDartGunsSoftDarts() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        ToysPage toysPage = new ToysPage(getDriver());
        homePage.hoverOverToys(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);
        homePage.clickOnNERFDartGunsSoftDarts();
        toysPage.clickOnNerfRival();
        toysPage.scrollToNRivel(getDriver());
        toysPage.clickOnNRival();
        waitFor(1);
    }

    @Test
    public void RebornDollsPlaysets() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        ToysPage toysPage = new ToysPage(getDriver());
        homePage.hoverOverToys(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.clickOnRebornDollsPlaysets();
        toysPage.clickOnRebornbabydoll();
        String ExpectedTitle = "Reborn Dolls Playsets for Sale - New & Used Lifelike Dolls - eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }


    @Test
    public void MarvelLegendsActionFigures() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        ToysPage toysPage = new ToysPage(getDriver());
        homePage.hoverOverToys(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.clickOnMarvelLegendsActionFigures();
        toysPage.clickOnGreanGobin();
        String ExpectedTitle = "Other Marvel Universe Action Figures for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }
}




