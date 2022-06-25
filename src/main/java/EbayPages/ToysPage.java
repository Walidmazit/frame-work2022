package EbayPages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToysPage extends CommonAPI {
    public ToysPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    private final Logger LOG = LoggerFactory.getLogger(ToysPage.class);


    @FindBy(css = "#spokeResultSet > div.item-grid-spoke > div > div:nth-child(2) > div > div > a > h3 > span > span")
    private WebElement asraraal;
    @FindBy(css = "#binBtn_btn")
    WebElement buyasraraal;

    @FindBy(css = "#s0-28_1-9-0-1\\[2\\]-0-0-12-list > li:nth-child(1) > a > p")
    WebElement Mettel;
    @FindBy(css = "#s0-28_1-9-0-1\\[3\\]-0-0-12-list > li:nth-child(3) > a > p")
    WebElement BabeAlive;
    @FindBy(css = "#mainContent > section.b-module.b-visualnav > div.b-visualnav__grid > a:nth-child(1) > div.b-visualnav__title")
    WebElement CarsTrucksVans;
    @FindBy(css = "#s0-28_1-9-0-1\\[4\\]-0-1-12-list > li:nth-child(2) > div > a > div")
    WebElement LEGO;
    @FindBy(css = "#mainContent > section.b-module.b-module-related-event-listings.clearfix > ul > li:nth-child(6) > a > div.b-info > div.b-info__title")
    WebElement BokimonCards;
    @FindBy(css = "#mainContent > section.b-module.b-visualnav > div.b-visualnav__grid > a:nth-child(2) > div.b-visualnav__title")
    WebElement Scale;
    @FindBy(css = "#s0-28_1-9-0-1\\[0\\]-0-1\\[0\\]-0-12-list > li:nth-child(2) > a > p")
    WebElement Aircraft;
    @FindBy(css = "#s0-28_1-9-0-1\\[3\\]-0-1-12-list > li:nth-child(3) > div > a > div")
    WebElement Revel85;
    @FindBy(css = "#s0-28_1-9-0-1\\[0\\]-0-1\\[1\\]-0-12-list > li:nth-child(1) > a > p")
    WebElement FullyAssmbeledPainted;
    @FindBy(css = "#mainContent > section.b-module.b-visualnav > div.b-visualnav__grid > a:nth-child(2) > div.b-visualnav__title")
    WebElement CardBoker;
    @FindBy(css = "#s0-28_1-9-0-1\\[0\\]-0-1\\[0\\]-0-12-list > li:nth-child(1) > a > p")
    WebElement FisherPrice;
    @FindBy(css = "#s0-28_1-9-0-1\\[0\\]-0-0-12-list > li:nth-child(3) > a > p")
    WebElement NerfRival;
    @FindBy(css = "#s0-28_1-9-0-1\\[3\\]-0-1-12-list > li:nth-child(5) > div > a > div")
    WebElement NRival;
    @FindBy(css = "#s0-28_1-9-0-1\\[2\\]-0-0 > ul > li:nth-child(10) > div > div.s-item__info.clearfix > a > h3")
    WebElement Rebornbabydoll;
    @FindBy(css = "#s0-28_1-9-0-1\\[0\\]-0-0 > ul > li:nth-child(7) > div > div.s-item__info.clearfix > a > h3")
    WebElement GreanGobin;


    public void scrollToView2(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        waitFor(2);
    }


    public void clickOnAstrial() {

        click(asraraal);
        LOG.info("asraraal clicked");
    }

    public void clickOnbuyAstrial() {

        click(buyasraraal);
        LOG.info("buy asraraal clicked");

    }

    public void clickOnMettel() {

        click(Mettel);
        LOG.info("buy asraraal clicked");
    }

    public void scrollToBabeAlive(WebDriver driver) {

        scrollToView2(driver, BabeAlive);
        LOG.info("Babe Alive scrolled ");
    }

    public void clickOnBabeAlive() {

        click(BabeAlive);
        LOG.info("Babe Alive clicked ");
    }

    public void clickOnCarsTrucksVans() {

        click(CarsTrucksVans);
        LOG.info("Cars Trucks Vans clicked");
    }

    public void scrollToLEGO(WebDriver driver) {

        scrollToView2(driver, LEGO);
        LOG.info("LEGO scrollef");
    }

    public void clickOnLEGO() {

        click(LEGO);
        LOG.info("LEGO clicked");
    }

    public void clickOnBokimonCards() {

        click(BokimonCards);
        LOG.info("LEGO clicked");
    }

    public void scrollToBokimonCards(WebDriver driver) {

        scrollToView2(driver, BokimonCards);
        LOG.info("Kimono Cards scrolled");
    }

    public void clickOnScale() {

        click(Scale);
        LOG.info("Scale clicked");
    }

    public void clickOnAircraft() {

        click(Aircraft);
        LOG.info("Aircraft clicked");
    }

    public void scrollToRevel85(WebDriver driver) {

        scrollToView2(driver, Revel85);
        LOG.info("Revel85 scrolled");

    }

    public void clickOnRevel85() {

        click(Revel85);
        LOG.info("Revel85 clicked");

    }

    public void clickOnFullyessmbeledPainted() {

        click(FullyAssmbeledPainted);
        LOG.info("FullyA ssmbeled Painted clicked");
    }

    public void clickOnCardBoker() {

        click(CardBoker);
        LOG.info("Card Broker clicked");
    }

    public void clickOnFisherPrice() {

        click(FisherPrice);
        LOG.info("Fisher Price clicked");
    }

    public void clickOnNerfRival() {

        click(NerfRival);
        LOG.info("Nerf Rival clicked");

    }

    public void scrollToNRivel(WebDriver driver) {

        scrollToView2(driver, NRival);
        LOG.info(" Rival scrolled");
    }

    public void clickOnNRival() {

        click(NRival);
        LOG.info(" Rival clicked");
    }
    public void clickOnRebornbabydoll() {

        click(Rebornbabydoll);
        LOG.info("Reborn baby doll scrolled");
    }
    public void clickOnGreanGobin() {

        click(GreanGobin);
        LOG.info("Grean Gobin clicked");
    }
}













