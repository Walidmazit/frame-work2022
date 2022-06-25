package eaby;

import EbayPages.SportingGoodsPage;
import EbayPages.ebayHomePage;
import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SportingGoodsTest extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(SportingGoodsTest.class);


    @Test
    public void SportingGoodsTest() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());
        homePage.hoveroverSportingGoods(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        homePage.clickOnHuntingEquipment();

        sportingGoodsPage.scrollToLacrosseBigChief(getDriver());
        sportingGoodsPage.clickOnLacrosseBigChief();
        String ExpectedTitle = "Lacrosse Big Chief Hip Boots, Insulated and Non Insulated,154040, 700001 | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);

    }

    @Test
    public void CyclingEquipment() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());
        homePage.hoveroverSportingGoods(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());
        homePage.clickOnHuntingEquipment();

    }


       @Test
    public void GolfClubs() {

           ebayHomePage homePage = new ebayHomePage(getDriver());
           SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());

           homePage.hoveroverSportingGoods(getDriver());
           ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
           homePage.clickOnGolfClubs();

           sportingGoodsPage.scrollToDrivingIron(getDriver());
           sportingGoodsPage.clickOnDrivingIron();

           String ExpectedTitle = "Driving Iron for sale | eBay";
           Assert.assertEquals(getPageTitle(), ExpectedTitle);

       }


       @Test
    public void TeamSports() {

           ebayHomePage homePage = new ebayHomePage(getDriver());
           SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());

           homePage.hoveroverSportingGoods(getDriver());
           ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

           homePage.clickOnWaterSports();
           homePage.clickOnWaterSports();


           String ExpectedTitle = "Water Sports Equipment products for sale | eBay";
           Assert.assertEquals(getPageTitle(), ExpectedTitle);
       }


        @Test
    public void Bikes() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());
        homePage.hoveroverSportingGoods(getDriver());
            ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        waitFor(1);
        homePage.clickOnBikes();
        sportingGoodsPage.scrollToDiamondbackPodium(getDriver());
        sportingGoodsPage.clickOnDiamondbackPodium();
        String ExpectedTitle = "Diamondback Podium for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }

       @Test
    public void Size() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());

        homePage.hoveroverSportingGoods(getDriver());
           ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        homePage.clickOnBikes();
        waitFor(1);
        sportingGoodsPage.scrollToDiamondbackPodium(getDriver());
        sportingGoodsPage.clickOnDiamondbackPodium();
        String ExpectedTitle = "Diamondback Podium for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        sportingGoodsPage.clickOnSize();
        sportingGoodsPage.clickOnSize1();
        waitFor(1);
    }

        @Test
    public void ElectricBikes() {


        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());

        homePage.hoveroverSportingGoods(getDriver());
            ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        homePage.clickOnElectricBikes();
        sportingGoodsPage.clickOnEbay();
        String ExpectedTitle = "Bikes for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);

    }

       @Test
    public void BicycleFrames() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());

        homePage.hoveroverSportingGoods(getDriver());
           ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        homePage.clickOnElectricBikes();
        sportingGoodsPage.clickOnEbay();
        String ExpectedTitle = "Bikes for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        sportingGoodsPage.clickOnBicycleFrames();
        sportingGoodsPage.clickOnFramSize();
        waitFor(1);
        sportingGoodsPage.clickOnizeInch();

    }

        @Test
    public void Dumbbells() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());

        homePage.hoveroverSportingGoods(getDriver());
            ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        homePage.clickOnDumbbells();
        sportingGoodsPage.clickOnADumbbells();
        waitFor(1);
        String ExpectedTitle = "Weight Lifting Belts for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
    }

       @Test
    public void HomeGymsDumbbells() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());

        homePage.hoveroverSportingGoods(getDriver());
           ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        homePage.clickOnDumbbells();
        waitFor(1);
        sportingGoodsPage.clickOnHomeGyms();
        String ExpectedTitle = "Strength Training Home Gyms for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
    }

       @Test
    public void PullUpBars() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());

        homePage.hoveroverSportingGoods(getDriver());
           ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        homePage.clickOnDumbbells();
        waitFor(1);
        sportingGoodsPage.clickOnHomeGyms();
        sportingGoodsPage.clickOnPullUpBars();

        String ExpectedTitle = "Pull Up Bars for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
    }

           @Test
    public void PushUpStands() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());

        homePage.hoveroverSportingGoods(getDriver());
               ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        waitFor(1);
        homePage.clickOnDumbbells();

        sportingGoodsPage.clickOnPushUpStands();
        String ExpectedTitle = "Push Up Stands for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
    }

       @Test
    public void WeightPlates() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());

        homePage.hoveroverSportingGoods(getDriver());
           ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        homePage.clickOnDumbbells();
        waitFor(1);
        sportingGoodsPage.clickOnWeightPlates();
        String ExpectedTitle = "Weight Plates for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
    }

        @Test
    public void PerfactFittnes() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());

        homePage.hoveroverSportingGoods(getDriver());
            ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        waitFor(1);
        homePage.clickOnDumbbells();

        sportingGoodsPage.clickOnPerfactFittnes();
        waitFor(1);
    }

        @Test
    public void SetPerfactFittnes() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());

        homePage.hoveroverSportingGoods(getDriver());
            ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        waitFor(1);
        homePage.clickOnDumbbells();

        sportingGoodsPage.clickOnSet();
        String ExpectedTitle = "Dumbbell Sets for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }

        @Test
    public void NeopreneSetPerfactFittnes() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());

        homePage.hoveroverSportingGoods(getDriver());
            ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        homePage.clickOnDumbbells();
        sportingGoodsPage.clickOnSet();
        waitFor(4);
        sportingGoodsPage.clickOnNeoprene();
        String ExpectedTitle = "Neoprene Dumbbell Sets for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(4);
    }

       @Test
    public void EmotionBtn() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());
        homePage.hoveroverSportingGoods(getDriver());
           ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        waitFor(1);
        homePage.clickOnDumbbells();
        sportingGoodsPage.clickOnSet();
        sportingGoodsPage.clickOnNeoprene();
        String ExpectedTitle = "Neoprene Dumbbell Sets for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        sportingGoodsPage.scrollToEmotion(getDriver());
        waitFor(1);

    }

    @Test
    public void GpsRunning() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());
        homePage.hoveroverSportingGoods(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        waitFor(1);
        homePage.clickOnGpsRunning();
        sportingGoodsPage.clickOnBlackWatch();
        String ExpectedTitle = "Black GPS & Running Watches for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(4);
    }
   @Test
    public void Hax() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());
        homePage.hoveroverSportingGoods(getDriver());
       ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        homePage.clickOnGpsRunning();
        waitFor(1);
        sportingGoodsPage.clickOnHax();
    }

    @Test
    public void RubberBtn() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());
        homePage.hoveroverSportingGoods(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        waitFor(1);
        homePage.clickOnGpsRunning();
        sportingGoodsPage.clickOnGray();
        String ExpectedTitle = "Gray GPS & Running Watches for sale | eBay";
       Assert.assertEquals(getPageTitle(), ExpectedTitle);
       waitFor(4);
    }
        @Test
       public void Blue() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());
        homePage.hoveroverSportingGoods(getDriver());
            ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        waitFor(1);

        homePage.clickOnGpsRunning();
        sportingGoodsPage.clickOnBlue();
        String ExpectedTitle = "Blue GPS & Running Watches for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(4);
    }
   @Test
    public void ForerunnerGPSRunning() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());
        homePage.hoveroverSportingGoods(getDriver());
       ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        homePage.clickOnGpsRunning();
        sportingGoodsPage.clickOnBlue();
        sportingGoodsPage.clickOnGarmin();
        waitFor(1);
        sportingGoodsPage.clickOnForerunnerGPSRunning();
        String ExpectedTitle = "Other Fitness Technology for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }
    @Test
    public void  FitTechParts() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());
        homePage.hoveroverSportingGoods(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        homePage.clickOnGpsRunning();
        sportingGoodsPage.clickOnBlue();
        waitFor(1);
        sportingGoodsPage.clickOnGarmin();
        sportingGoodsPage.clickOnForerunnerGPSRunning();
        sportingGoodsPage.clickOnFitTechParts();
        String ExpectedTitle = "Fit Tech Parts for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }
    @Test
    public void  Stopwatches() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(getDriver());
        homePage.hoveroverSportingGoods(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(),getPageTitle());
        homePage.clickOnGpsRunning();
        sportingGoodsPage.clickOnBlue();
        sportingGoodsPage.clickOnGarmin();
        sportingGoodsPage.clickOnForerunnerGPSRunning();
        sportingGoodsPage.clickOnFitTechParts();
        sportingGoodsPage.clickOnStopwatches();
        String ExpectedTitle = "Fitness Stopwatches for sale | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);
    }
}



