package EbayPages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SportingGoodsPage extends CommonAPI {
    public SportingGoodsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    private final Logger LOG = LoggerFactory.getLogger(SportingGoodsPage.class);

    @FindBy(css = "#mainContent > section.b-module.b-module-related-event-listings.clearfix > ul > li:nth-child(6) > a > div.b-info > div.b-info__title")
    WebElement LacrosseBigChief;
    @FindBy(css = "#s0-28_1-9-0-1\\[4\\]-0-0 > ul > li:nth-child(1) > div > div.s-item__info.clearfix > a > h3")
    WebElement LSolarstorm;
    @FindBy(css = "#mainContent > section.b-module.b-motors-links > div.b-motors-links__container > div:nth-child(89) > a")
    WebElement DrivingIron;
    @FindBy(css = "#s0-28_1-9-0-1\\[4\\]-1-2-0-2-list > li.carousel__snap-point > div > a > div > p")
    WebElement WaterShoes;
    @FindBy(css = "#mainContent > section.b-module.b-motors-links > div.b-motors-links__container > div:nth-child(97) > a")
    WebElement DiamondbackPodium;
    @FindBy(css = "#s0-28-9-0-1\\[0\\]-0-0-6-5-4\\[0\\]-flyout > button")
    WebElement Size;
    @FindBy(css = "#s0-28-9-0-1\\[0\\]-0-0-6-5-4\\[0\\]-flyout > div > ul > li:nth-child(1) > a > span:nth-child(1)")
    WebElement Size12;
    @FindBy(css = "//*[@id=\"s0-28_1-9-0-1[1]-0-0-6-5-4[2]-flyout\"]/button")
    WebElement EMountainBikes;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(3) > a")
    WebElement ebay;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(4) > a")
    WebElement BicycleFrames;
    @FindBy(css = "#s0-28_1-9-0-1\\[1\\]-0-0-6-5-4\\[1\\]-flyout > button")
    WebElement FramSize;
    @FindBy(css = "#s0-28_1-9-0-1\\[1\\]-0-0-6-5-4\\[1\\]-flyout > div > ul > li:nth-child(1) > a > span:nth-child(1)")
    WebElement SizeInch;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(4) > a")
    WebElement ADumbbells;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(7) > a")
    WebElement HomeGyms;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(11) > a")
    WebElement PullUpBars;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(12) > a")
    WebElement PushUpStands;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(13) > a")
    WebElement WeightPlates;
    @FindBy(css = "#e19 > div.i_.si32 > div.i_.si35 > a > span:nth-child(1)")
    WebElement WeightPlatesForSele;
    @FindBy(css = "#s0-28_1-9-0-1\\[1\\]-0-1-12-list > li:nth-child(2) > a > div > div > img")
    WebElement PerfactFittnes;
    @FindBy(css = "#s0-28_1-9-0-1\\[0\\]-0-1\\[0\\]-0-12-list > li:nth-child(2) > a > div > img")
    WebElement Set;
    @FindBy(css = "#s0-28_1-9-0-1\\[0\\]-0-1\\[0\\]-0-12-list > li:nth-child(1) > a > div > img")
    WebElement Neoprene;
    @FindBy(css = "#s0-28_1-9-0-1\\[2\\]-0-0 > ul > li:nth-child(45) > span > a > span > svg")
    WebElement Emotion;
    @FindBy(css = "#s0-28_1-9-0-1\\[0\\]-0-1\\[0\\]-0-12-list > li:nth-child(1) > a > div > img")
    WebElement BlackWatch;
    @FindBy(css = "#s0-28_1-9-0-1\\[0\\]-0-1\\[0\\]-0-12-list > li:nth-child(3) > a > div > img")
    WebElement Hax;
    @FindBy(css = "#s0-28_1-9-0-1\\[0\\]-0-1\\[0\\]-0-12-list > li:nth-child(4) > a > p")
    WebElement Gray;
    @FindBy(css = "#s0-28_1-9-0-1\\[0\\]-0-1\\[0\\]-0-12-list > li:nth-child(3) > a > p")
    WebElement Blue;
    @FindBy(css = "#s0-28_1-9-0-1\\[0\\]-0-0-12-list > li:nth-child(1) > a > p")
    WebElement Garmin;
   @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(9) > a")
    WebElement  ForerunnerGPSRunning;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(9) > a")
    WebElement  FitTechParts;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(8) > a")
    WebElement  Stopwatches;
    ;











    public void scrollToView2(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        waitFor(1);
    }


    public void scrollToLacrosseBigChief(WebDriver driver) {

        scrollToView2(driver, LacrosseBigChief);
        LOG.info("Lacrosse BigChief scrolled");

    }


    public void clickOnLacrosseBigChief() {

        click(LacrosseBigChief);
        LOG.info("Lacrosse BigChief clicked");
    }
    public void scrollToDrivingIron(WebDriver driver) {

        scrollToView2(driver, DrivingIron);
        LOG.info("DrivingIron scrolled");

    }
    public void clickOnDrivingIron() {

        click(DrivingIron);
        LOG.info("Driving Iron DrivingIron");
    }


    public void clickOnWaterShoes() {

        click(WaterShoes);
        LOG.info("Water Shoes clicked");
    }
    public void scrollToDiamondbackPodium(WebDriver driver) {

        scrollToView2(driver, DiamondbackPodium);
        LOG.info("Diamond back Podium scrolled");
    }
    public void clickOnDiamondbackPodium() {

        click(DiamondbackPodium);
        LOG.info("Diamond back Podium clicked");
    }
    public void clickOnSize() {

        click(Size);
        LOG.info("Size clicked");
    }
    public void clickOnSize1() {

        click(Size12);
        LOG.info("Size12 clicked");
    }
    public void clickOnEMountainBikes() {

        click(EMountainBikes);
        LOG.info("EMountain Bikes clicked");
    }
    public void clickOnEbay() {

        click(ebay);
        LOG.info("ebay clicked");
    }
    public void clickOnBicycleFrames() {

        click(BicycleFrames);
        LOG.info("ebay clicked");
    }
    public void clickOnFramSize() {

        click(FramSize);
        LOG.info("FramSize clicked");
    }
    public void clickOnizeInch() {

        click(SizeInch);
        LOG.info("SizeInch clicked");
    }
    public void clickOnADumbbells() {

        click(ADumbbells);
        LOG.info("ADumbbells clicked");
    }
    public void clickOnHomeGyms() {

        click(HomeGyms);
        LOG.info("HomeGyms clicked");
    }
    public void clickOnPullUpBars() {

        click(PullUpBars);
        LOG.info("Pull UpBars clicked");
    }
    public void clickOnPushUpStands() {

            click(PushUpStands);
        LOG.info("Push Up Stands clicked");

        }
    public void clickOnWeightPlates() {

        click(WeightPlates);
        LOG.info("Weight Plates clicked");
    }
    public void scrollToWeightPlatesForSele(WebDriver driver) {

        scrollToView2(driver, WeightPlatesForSele);
        LOG.info("Weight Plates ForSelle scrolled");
    }
    public void clickOnWeightPlatesForSele() {

        click(WeightPlatesForSele);
        LOG.info("Weight Plates ForSelle clicked");
    }
    public void clickOnPerfactFittnes() {

        click(PerfactFittnes);
        LOG.info("Perfect Fitness clicked");
    }
    public void clickOnSet() {

        click(Set);
        LOG.info("Set clicked");
    }
    public void clickOnNeoprene() {

        click(Neoprene);
        LOG.info("Neoprene clicked");
    }
    public void scrollToEmotion(WebDriver driver) {

        scrollToView2(driver, Emotion);
        LOG.info("Emotion clicked");
    }
    public void clickOnEmotion() {

        click(Emotion);
        LOG.info("Emotion clicked");
    }
    public void clickOnBlackWatch() {

        click(BlackWatch);
        LOG.info("Black Watch clicked");
    }
    public void clickOnHax() {

        click(Hax);
        LOG.info("Hax clicked");
    }
    public void clickOnGray() {

        click(Gray);
        LOG.info("Gray clicked");
    }
    public void clickOnBlue() {

        click(Blue);
        LOG.info("Gray  clicked");
    }
        public void clickOnGarmin() {
            click(Garmin);
            LOG.info("Garmin clicked");
        }
    public void clickOnForerunnerGPSRunning() {
        click(ForerunnerGPSRunning);
        LOG.info("For runner GPS Running click");
    }
    public void clickOnFitTechParts() {
        click(FitTechParts);
        LOG.info("Fit Tech Parts clicked");
    }
    public void clickOnStopwatches() {
        click(Stopwatches);
        LOG.info("Stop watches clicked");
    }

    }










