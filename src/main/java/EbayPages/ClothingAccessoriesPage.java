package EbayPages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClothingAccessoriesPage extends CommonAPI {
    public ClothingAccessoriesPage(WebDriver driver) {PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(ClothingAccessoriesPage.class);


    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(3) > a")
    WebElement Activewear;
    @FindBy(css = "#gf-l > li:nth-child(9) > a")
    WebElement Map;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(4) > a")
    WebElement CoatsJacketsVests;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(5) > a")
    WebElement Dresses;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(6) > a")
    WebElement HosierySocks;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(7) > a")
    WebElement IntimatesSleep;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(8) > a")
    WebElement Jeans;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(9) > a")
    WebElement JumpsuitsRompers;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(10) > a")
    WebElement Leggings;
    @FindBy(css = "#s0-28_1-9-0-1\\[2\\]-0-0 > div.b-pagination > nav > ol > li:nth-child(2) > a")
    WebElement NextPage;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(11) > a")
    WebElement OutfitsSets;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(12) > a")
    WebElement Pants;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(13) > a")
    WebElement Shorts;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(14) > a")
    WebElement Skirts;
    @FindBy(css = "#gf-l > li:nth-child(1) > a")
    WebElement AbouteBay;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(15) > a")
    WebElement SuitsSuitSeparates;
    @FindBy(css = "#gf-l > li:nth-child(2) > a")
    WebElement Announcements;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(16) > a")
    WebElement Sweaters;
    @FindBy(css = "#mainContent > section.b-module.b-motors-links > div.b-motors-links__container > div:nth-child(93) > a")
    WebElement FringeSweater;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(17) > a")
    WebElement Swimwear;
    @FindBy(css = "#mainContent > section.b-module.b-motors-links > div.b-motors-links__container > div:nth-child(78) > a")
    WebElement MiniBikini;
    @FindBy(css = "#s0-17-12-0-1\\[0\\]-0-0 > ul > li:nth-child(18) > a")
    WebElement Tops;
    @FindBy(css = "#mainContent > section.b-module.b-motors-links > div.b-motors-links__container > div:nth-child(99) > a")
    WebElement SheerBlouse;
    @FindBy(css = "#s0-28_1-9-0-1\\[0\\]-0-0-12-list > li:nth-child(1) > a > div > img")
    WebElement FreePeople;
    @FindBy(css = "#s0-17-12-0-1\\[1\\]-0-0-0 > ul > li:nth-child(1) > a")
    WebElement Juniors;
    @FindBy(css = "#gf-l > li:nth-child(6) > a")
    WebElement Policies;
    @FindBy(css = "#mainContent > section.b-module.b-carousel.b-guidance--text.b-display--landscape > div.b-carousel__header.sameline > div.b-carousel__seeall > button")
    WebElement SeeAll;
    @FindBy(css = "#s0-17-12-0-1\\[1\\]-0-0-0 > ul > li:nth-child(2) > a")
    WebElement Petites;
    @FindBy(css = "#gf-l > li:nth-child(4) > a")
    WebElement SecurityCenter;
    @FindBy(css = "#s0-17-12-0-1\\[1\\]-0-0-0 > ul > li:nth-child(4) > a")
    WebElement Maternity;
//    @FindBy(css = "#gh-bti")
//    WebElement BTN;
    @FindBy(css = "#gh-Alerts-i")
    WebElement BTN;

    public void scrollToView2(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        waitFor(1);
    }


    public void clickOnActivewear() {

        click(Activewear);
        LOG.info("Active wear clicked");
    }

    public void scrollToMap(WebDriver driver) {

        scrollToView2(driver, Map);

        LOG.info("Scroll to map success");

    }

    public void clickOnCoatsJacketsVests() {

        click(CoatsJacketsVests);
        LOG.info("Coats Jackets Vests clicked");
    }

    public void clickOnDresses() {

        click(Dresses);
        LOG.info("Dresses clicked");

    }

    public void clickOnHosierySocks() {

        click(HosierySocks);
        LOG.info("Hosiery Socks clicked");
    }

    public void clickOnIntimatesSleep() {

        click(IntimatesSleep);
        LOG.info("Intimates Sleep clicked");
    }

    public void clickOnJeans() {

        click(Jeans);
        LOG.info("Jeans clicked");
    }

    public void clickOnJumpsuitsRompers() {


        click(JumpsuitsRompers);
        LOG.info("Jumpsuits Rompers clicked");
    }

    public void clickOnLeggings() {

        click(Leggings);
        LOG.info("Leggings clicked");
    }

    public void scrollToNextPage(WebDriver driver) {

        scrollToView2(driver, NextPage);
        LOG.info(" NextPage scrolled");
    }

    public void clickOnOutfitsSets() {

        click(OutfitsSets);
        LOG.info("OutfitsSets clicked");
    }

    public void clickOnPants() {

        click(Pants);
        LOG.info("Pants clicked");
    }

    public void clickOnShorts() {

        click(Shorts);
        LOG.info("Shorts clicked");
    }

    public void clickOnSkirts() {

        click(Skirts);
        LOG.info("Skirts clicked");
    }

    public void scrollToAbouteBay(WebDriver driver) {

        scrollToView2(driver, AbouteBay);
        LOG.info("Aboute Bay scrolled ");
    }

    public void clickOnSuitsSuitSeparates() {

        click(SuitsSuitSeparates);
        LOG.info("Aboute Bay clicked ");
    }

    public void scrollToAnnouncements(WebDriver driver) {

        scrollToView2(driver, Announcements);
        LOG.info("Announcements scrolled ");
    }

    public void clickOnSweaters() {

        click(Sweaters);
        LOG.info("Sweaters clicked ");
    }

    public void scrollToFringeSweater(WebDriver driver) {

        scrollToView2(driver, FringeSweater);
        LOG.info("FringeSweater scrold");
    }

    public void clickOnSwimwear() {

        click(Swimwear);
        LOG.info("Swimwear clicked");
    }

    public void scrollToMiniBikini(WebDriver driver) {

        scrollToView2(driver, MiniBikini);
        LOG.info("MiniBikini clicked");
    }

    public void clickOnTops() {

        click(Tops);
        LOG.info("Tops clicked");
    }

    public void scrollToSheerBlouse(WebDriver driver) {

        scrollToView2(driver, SheerBlouse);
        LOG.info("SheerBlouse scrolled");
    }

    public void clickOnFreePeople() {

        click(FreePeople);
        LOG.info("FreePeople clicked");
    }

    public void clickOnJuniors() {

        click(Juniors);
        LOG.info("Juniors clicked");

    }

    public void scrollToPolicies(WebDriver driver) {

        scrollToView2(driver, Policies);
        LOG.info("Policies scrolled");
    }

    public void scrollUpToSeeAll(WebDriver driver) {

        scrollToView2(driver, SeeAll);
        LOG.info("SeeAll scrolled");
    }
    public void clickOnPetites(){

        click(Petites);
        LOG.info("Petites");
    }
    public void scrollToSecurityCenter(WebDriver driver) {

        scrollToView2(driver, SecurityCenter);
        LOG.info("Security Center scrolled");
    }
    public void clickOnMaternity() {

        click(Maternity);
        LOG.info("Maternity");
    }
    public void scrollToBTN(WebDriver driver) {

        scrollToView2(driver, BTN);
        LOG.info(" BTN scrolled");
    }
    public void clickOnBTN() {

        click(BTN);
        LOG.info(" BTN clicked");
    }
    public void hoveroverMyBTN(WebDriver driver) {

        hoverOver(driver, BTN);
        LOG.info(" BTN scrolled");
    }
    }

