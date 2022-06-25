package eaby;

import EbayPages.ClothingAccessoriesPage;
import EbayPages.ebayHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClothingAccessoriesTest extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(ClothingAccessoriesPage.class);

    @Test

    public void ClothingAccessories() {

        LOG.info("TEst is Processing");
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        homePage.clickOnWomenClothing();
        waitFor(1);

        String ExpectedTitle = "Women's Clothing for Sale - eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);


        LOG.info("TEst passed");
    }

    @Test

    public void TestingActivewear() {
        LOG.info("TEst is going");
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        waitFor(1);
        homePage.clickOnWomenClothing();
        String ExpectedTitle = "Women's Clothing for Sale - eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
        clothingAccessoriesPage.clickOnActivewear();
        clothingAccessoriesPage.scrollToMap(getDriver());

        LOG.info("TEst is Finish");
    }


    @Test
    public void TestCoatsJacketsVests() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);
        homePage.clickOnWomenClothing();
        clothingAccessoriesPage.clickOnCoatsJacketsVests();
        String ExpectedTitle = "Women's Coats, Jackets & Vests for Sale - eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);

    }

    @Test

    public void TestDresses() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);
        homePage.clickOnWomenClothing();
        clothingAccessoriesPage.clickOnDresses();
        String ExpectedTitle = "Women's Dresses for Sale - eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);

    }

    @Test

    public void TestHosierySocks() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);
        homePage.clickOnWomenClothing();
        waitFor(1);
        clothingAccessoriesPage.clickOnHosierySocks();
        String ExpectedTitle = "Women's Hosiery & Socks for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }

    @Test

    public void TestIntimatesSleep() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);
        homePage.clickOnWomenClothing();
        clothingAccessoriesPage.clickOnIntimatesSleep();
        String ExpectedTitle = "Women's Intimates & Sleepwear for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }

    @Test

    public void Jeans() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());waitFor(1);
        homePage.clickOnWomenClothing();
        clothingAccessoriesPage.clickOnJeans();
        String ExpectedTitle = "Women's Jeans for Sale - eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }

    @Test

    public void TestJumpsuitsRompers() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);
        homePage.clickOnWomenClothing();
        clothingAccessoriesPage.clickOnJumpsuitsRompers();
        String ExpectedTitle = "Women's Jumpsuits & Rompers for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }


    @Test

    public void TestLeggings() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        homePage.clickOnWomenClothing();
        clothingAccessoriesPage.clickOnLeggings();
        String ExpectedTitle = "Women's Leggings for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        clothingAccessoriesPage.scrollToNextPage(getDriver());
        waitFor(1);
    }

    @Test

    public void TsetLOGest() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);
        homePage.clickOnWomenClothing();
        waitFor(1);
        clothingAccessoriesPage.clickOnOutfitsSets();
        String ExpectedTitle = "Women's Outfits & Sets for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }

    @Test

    public void testPants() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);

        homePage.clickOnWomenClothing();
        waitFor(1);
        clothingAccessoriesPage.clickOnPants();
        String ExpectedTitle = "Women's Pants for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }

    @Test

    public void TestShorts() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        waitFor(4);
        homePage.clickOnWomenClothing();
        clothingAccessoriesPage.clickOnShorts();
        String ExpectedTitle = "Women's Shorts for Sale - eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(3);
    }

    @Test

    public void TestSkirts() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.clickOnWomenClothing();
        waitFor(1);
        clothingAccessoriesPage.clickOnSkirts();
        String ExpectedTitle = "Women's Skirts for Sale - eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        clothingAccessoriesPage.scrollToAbouteBay(getDriver());
        waitFor(1);
    }

    @Test

    public void SuitsSuitSeparates() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.clickOnWomenClothing();
        waitFor(1);
        clothingAccessoriesPage.clickOnSuitsSuitSeparates();
        String ExpectedTitle = "Women's Suits & Suit Separates for Sale - eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        clothingAccessoriesPage.scrollToAnnouncements(getDriver());
        waitFor(1);
    }
    @Test

    public void Sweaters() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        homePage.clickOnWomenClothing();
        waitFor(1);
        clothingAccessoriesPage.clickOnSweaters();
        clothingAccessoriesPage.scrollToFringeSweater(getDriver());
        String ExpectedTitle = "Women's Sweaters for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
            waitFor(1);

    }
    @Test

    public void Swimwear() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.clickOnWomenClothing();
        clothingAccessoriesPage.clickOnSwimwear();
        waitFor(1);
        clothingAccessoriesPage.scrollToMiniBikini(getDriver());
        String ExpectedTitle = "Women's Swimwear for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }
    @Test

    public void Tops() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);

        homePage.clickOnWomenClothing();
        waitFor(1);
        clothingAccessoriesPage.clickOnTops();
        clothingAccessoriesPage.scrollToSheerBlouse(getDriver());
        String ExpectedTitle = "Women's Tops for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);

    }
    @Test

    public void FreePeople() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.clickOnWomenClothing();
        clothingAccessoriesPage.clickOnTops();
        clothingAccessoriesPage.scrollToSheerBlouse(getDriver());
        waitFor(1);
        clothingAccessoriesPage.clickOnFreePeople();
        String ExpectedTitle = "Free People Women's Tops & Blouses for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);

//        String ExpectedTitle = "Free People Women's Tops & Blouses for sale | eBay";
//        Assert.assertEquals(getPageTitle(), ExpectedTitle);
    }
    @Test

    public void Juniors() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.clickOnWomenClothing();
        waitFor(1);

        clothingAccessoriesPage.clickOnJuniors();
        clothingAccessoriesPage.scrollToPolicies(getDriver());
        clothingAccessoriesPage.scrollUpToSeeAll(getDriver());
        String ExpectedTitle = "Junior Size Clothing for Women for Sale - eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);


    }

    @Test

    public void Petites() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        waitFor(1);
        homePage.clickOnWomenClothing();
        clothingAccessoriesPage.clickOnPetites();
        clothingAccessoriesPage.scrollToSecurityCenter(getDriver());
        String ExpectedTitle = "Petites Clothing for Women for Sale - eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }

    @Test

    public void ScrollBtn() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        ClothingAccessoriesPage clothingAccessoriesPage = new ClothingAccessoriesPage(getDriver());
        homePage.hoveroverClothingAccessories(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.clickOnWomenClothing();
        clothingAccessoriesPage.clickOnMaternity();
        clothingAccessoriesPage.hoveroverMyBTN(getDriver());

        String ExpectedTitle = "Baby Essentials for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);

    }


}

