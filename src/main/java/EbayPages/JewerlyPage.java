package EbayPages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JewerlyPage extends CommonAPI {
    public JewerlyPage(WebDriver driver) {PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(JewerlyPage.class);



    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(11) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement LuxuryWatches;
    @FindBy(css = "#mainContent > section.b-module.b-visualnav > div.b-visualnav__grid > a:nth-child(1) > div.b-visualnav__title")
    WebElement Relax;
    @FindBy(css = "#s0-28_1-9-0-1\\[6\\]-1-2-0-2-list > li:nth-child(3) > div > a > div > p")
    WebElement RolexExplorerWatches;
    @FindBy(css = "#s0-28_1-9-0-1\\[7\\]-0-1-12-list > li:nth-child(2) > div > a > div")
    WebElement InvictaMenWatchProDiver;
    @FindBy(css = "#s0-28_1-9-0-1\\[7\\]-0-1-12-list > li:nth-child(2) > div > a > div")
    WebElement Dive300;
    @FindBy(css = "#e19 > div.i_.si32 > div.i_.si35 > a > span")
    WebElement ShopePandoraJewerly;
    @FindBy(css = "#s0-28_1-9-0-1\\[0\\]-0-0-12-list > li:nth-child(1) > a > p")
    WebElement Navitimer;
    @FindBy(css = "#s0-28_1-9-0-1\\[5\\]-0-1-12-list > li:nth-child(3) > div > a > div")
    WebElement MendelMens;
    @FindBy(css = "#s0-28_1-9-0-1\\[4\\]-0-0 > ul > li:nth-child(1) > div > div.s-item__info.clearfix > a > h3")
    WebElement TAGHeuerFormula;
    @FindBy(css = "#s0-0-18-5-58-13\\[0\\]-card-tems-wrapper > ul > li:nth-child(4) > div > div.image > a > span > img")
    WebElement TAGHeuerWatches;
    @FindBy(css = "#s0-28_1-9-0-1\\[5\\]-1-2-0-2-list > li:nth-child(1) > div > a > div > p")
    WebElement BreitlingWatches;
    @FindBy(css = "#s0-28_1-9-0-1\\[0\\]-0-0-12-list > li:nth-child(2) > a > p")
    WebElement Rings;
    @FindBy(css = "#s0-28_1-9-0-1\\[1\\]-0-0 > div.b-pagination > nav > ol > li:nth-child(2) > a")
    WebElement TestNumber2;
    @FindBy(css = "#s0-28_1-9-0-1\\[1\\]-0-0-12-list > li:nth-child(4) > a > p")
    WebElement WhiteGold;
    @FindBy(css = "#s0-28_1-9-0-1\\[3\\]-1-2-0-2-list > li:nth-child(1) > div > a > div > p")
    WebElement FashionRings;


    public void scrollToView2(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        waitFor(2);
    }


    public void clickOnLuxuryWatches() {

        click(LuxuryWatches);
        LOG.info("LuxuryWatches clicked");

    }

    public void clickOnRelax() {

        click(Relax);
        LOG.info("Relax clicked");
    }

    public void scrollToRolexExplorerWatches(WebDriver driver) {

        scrollToView2(driver, RolexExplorerWatches);
        LOG.info("Rolex Explorer Watches scrolled");
    }

    public void clickOnRolexExplorerWatches() {

        click(RolexExplorerWatches);
        LOG.info("Rolex Explorer Watches scrolled");
    }

    public void scrollToInvictaMenWatchProDiver(WebDriver driver) {

        scrollToView2(driver, InvictaMenWatchProDiver);
        LOG.info("Rolex Explorer Watches scrolled scrooled");
    }

    public void clickOnInvictaMenWatchProDiver() {

        click(InvictaMenWatchProDiver);
        LOG.info("Invicta Men Watc hProDiver scrolled");
    }

    public void scrollToDive300r(WebDriver driver) {

        scrollToView2(driver, Dive300);
        LOG.info("Dive300  scrolled");
    }

    public void clickOnDive300() {

        click(Dive300);
        LOG.info("Dive300 clicked");
    }

    public void scrollToShopePandoraJewerly(WebDriver driver) {

        scrollToView2(driver, ShopePandoraJewerly);
        LOG.info("Shope Pandora Jewerly scrolled");
    }

    public void clickOnShopePandoraJewerly() {

        click(ShopePandoraJewerly);
        LOG.info("Shope Pandora Jewerly scrolled");

    }

    public void clickOnNavitimery() {

        click(Navitimer);
        LOG.info("Navitimer clicked");
    }

    public void scrollToMendelMens(WebDriver driver) {

        scrollToView2(driver, MendelMens);
        LOG.info("MendelMens scrolled");
    }

    public void clickOnMendelMens() {


        click(MendelMens);
        LOG.info("MMendel Mens click ");

    }

    public void clickOnTAGHeuerFormula() {


        click(TAGHeuerFormula);
        LOG.info("TAGHeuer Formula click ");


    }

    public void scrollToTAGHeuerWatches(WebDriver driver) {

        scrollToView2(driver, TAGHeuerWatches);
        LOG.info("TAGHeue rWatches scrolled ");

    }

    public void clickOnTAGHeuerWatches() {


        click(TAGHeuerWatches);
        LOG.info("TAGHeuer Watches clicked ");
    }

    public void clickOnBreitlingWatches() {


        click(BreitlingWatches);
        LOG.info("Breitlin gWatches clicked ");
    }

    public void clickOnRings() {


        click(Rings);
        LOG.info("Rings clicked ");
    }

    public void scrollToTestNumber2(WebDriver driver) {

        scrollToView2(driver, TestNumber2);
        LOG.info("TestNumber2 scrolled");
    }

    public void clickOnTestNumber2() {

        click(TestNumber2);
        LOG.info("TestNumber2 clicked");
    }

    public void clickOnWhiteGold() {


        click(WhiteGold);
        LOG.info("WhiteGold clicked");
    }
    public void scrollToFashionRings(WebDriver driver) {

        scrollToView2(driver, FashionRings);
        LOG.info("Fashion Rings scrolled ");


}
    public void clickOnFashionRings() {


        click(FashionRings);
        LOG.info("Fashion Rings clicked");
    }
}

