package EbayPages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ebayHomePage extends CommonAPI {
    public ebayHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    private final Logger LOG = LoggerFactory.getLogger(ClothingAccessoriesPage.class);


    @FindBy(css = "#gh-ac")
    private WebElement searchField;

   @FindBy(css = "#gh-btn")
    private WebElement searchBtn;
    @FindBy(css = "#gh-eb-My > div > a.gh-eb-li-a.gh-rvi-menu")
    WebElement MyeBayfloatingMenu;

    @FindBy(css = "#s0-50-12-5-3\\[1\\] > div.srp-controls--responsive.srp-controls__row-cells.left > div.srp-controls__control--responsive > div > ul > li:nth-child(2) > a > span")
    WebElement AccpetsOffers;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > a")
    WebElement Motor;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement Motorcycles;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(7) > a")
    WebElement Boat;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(1) > a")
    WebElement CarsTrucks;


    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(7) > a")
    WebElement MyGarage;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(6)")
    WebElement HomeGarden;

    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(6) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(6) > a")
    WebElement toolspower;

    @FindBy(css = "#gh-ug > a")
    WebElement Longin;

    @FindBy(css = "#gh-cat")
    WebElement DropDown;
    @FindBy(css = "#gh-cat")
    WebElement menuDropdown;
    @FindBy(css = "#s0-0-32-4-0-0\\[3\\]-4-match-media-0-ebay-carousel-list > li:nth-child(3) > a > div:nth-child(3) > span")
    WebElement buybtn;
    @FindBy(css = "#srp-river-results > ul > li:nth-child(1) > div > div.s-item__image-section > div > a > div > img")
    WebElement Milwaukee;
    @FindBy(css = "#vi-viewInCartBtn")
    WebElement AddtoCard;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > a")
    WebElement toys;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(8) > a")
    WebElement toysDeal;

    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(11) > a")
    WebElement jewerly;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(11) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(5) > a")
    WebElement Findjewerly;
    @FindBy(css = "#srp-river-results > ul > li:nth-child(3) > div > div.s-item__image-section > div > a > div > img")
    WebElement wachman;
    @FindBy(css = "#srp-river-results > ul > li:nth-child(2) > div > div.s-item__info.clearfix > div.s-item__details.clearfix > div:nth-child(1) > span")
    WebElement womenwach;
    @FindBy(css = "#srp-river-results > ul > li:nth-child(3) > div > div.s-item__image-section > div > a > div > img")
    WebElement kidsshose;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(4) > h3 > a")
    WebElement bottom;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(4) > ul > li:nth-child(1) > a")
    WebElement Companyinfo;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(5) > h3:nth-child(1) > a")
    WebElement help;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(5) > ul:nth-child(2) > li:nth-child(1) > a")
    WebElement Seller;
    @FindBy(css = "#main-menu > nav > ul > li:nth-child(7) > a > span")
    WebElement paynmentfees;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(3) > h3")
    WebElement Stayconnected;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(3) > ul > li:nth-child(1) > a")
    WebElement facebook;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(2) > h3:nth-child(1) > a")
    WebElement Sell;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(2) > ul:nth-child(2) > li:nth-child(1)")
    WebElement howtoSell;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(1) > h3 > a")
    WebElement buy;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(1) > ul > li:nth-child(4) > a")
    WebElement stores;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(2) > h3:nth-child(3)")
    WebElement Tools;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(2) > ul:nth-child(4) > li:nth-child(1) > a")
    WebElement devlopers;
    @FindBy(css = "#gf-fbtn")
    WebElement untiedstate;
    @FindBy(css = "#gf-f > ul > li:nth-child(11) > a > p")
    WebElement colombai;
    @FindBy(css = "#s0-50-12-6-3-query_answer2-answer-7-2-1-list > li:nth-child(6) > div > a > div")
    WebElement viedogame;
    @FindBy(css = "#srp-river-results > ul > li:nth-child(1) > div > div.s-item__image-section > div > a > div > img")
    WebElement newseled;
    @FindBy(css = "#_rvwlnk")
    WebElement review;
    @FindBy(css = "#nid-rt2-7 > button > span")
    WebElement boots;
    @FindBy(css = "#nid-rt2-6 > div:nth-child(3) > span.filter-menu-button__text")
    WebElement conditions;
    @FindBy(css = "#srp-river-results > ul > li.srp-river-answer.srp-river-answer--RIGHT_ALIGNED_MESSAGE > div > a")
    WebElement telluswhatyouthink;
    @FindBy(css = "#submitFdbk")
    WebElement send;
    @FindBy(css = "body > div.srp-main.srp-main--isLarge > div.s-answer-region.s-answer-region-above-river > div > span:nth-child(2) > a:nth-child(5)")
    WebElement scrollup;
    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(2) > ul:nth-child(4) > li:nth-child(3) > a")
    WebElement scrolldownandup;
    @FindBy(css = "#gh-p-4 > a")
    WebElement scrollupToBrandOutlet;
    @FindBy(css = "#s0-17-12-0-1\\[3\\]-0-0-0 > ul > li:nth-child(1) > a")
    WebElement accer;
    @FindBy(css = "#gh-minicart-hover > div > a > svg")
    WebElement shoopingCart;
    @FindBy(css = "#gh-minicart-hover-body > div > div > div.gh-minicart-actions > div:nth-child(2) > a")
    WebElement ViewCart;
    @FindBy(css = "#s0-0-20-10-11-factory_authorized_outlet-1021188228-202073278054-qty\\[\\]-1-dropdown")
    WebElement QTY;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(12) > a")
    WebElement ebayRefurbished;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(12) > a")
    WebElement Surveillance;
    @FindBy(css = "#s0-28_1-9-0-1\\[2\\]-0-0 > ul > li:nth-child(48) > div > div.s-item__info.clearfix > a > h3")
    WebElement HomesecirityCammra;
    @FindBy(css = "#tab-panel-1 > div.item-desc > div.item-content-wrapper > div.item-details > a")
    WebElement Seedetails;
    @FindBy(css = "#gh-ug-flex > a")
    WebElement Register;
    @FindBy(css = "#Email")
    WebElement Registernemail;
    @FindBy(css = "#password")
    WebElement RegistePassWoed;
    @FindBy(css = "#firstname")
    WebElement RegisterName;
    @FindBy(css = "#lastname")
    WebElement RegisterLastName;
    @FindBy(css = "#EMAIL_REG_FORM_SUBMIT")
    WebElement CreatAccount;
    @FindBy(css = "#x-refine__group_1__2 > ul > li:nth-child(1) > div > a > div > span > input")
    WebElement checkedBox;
    @FindBy(css = "#s0-50-12-6-3-query_answer1-answer-3-1-1-list > li:nth-child(8) > div > a")
    WebElement size;
    @FindBy(css = "#s0-50-12-0-1-2-6-0-2\\[1\\]-4\\[3\\]-3")
    WebElement department;
    @FindBy(css = "#s0-50-12-6-3-query_answer1-answer-7-2-1-list > li:nth-child(8) > div > a > div")
    WebElement addidasshose;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(2) > a")
    WebElement Classics;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement AllPartsAccessories;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(4) > a")
    WebElement PowerSports;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(6) > a")
    WebElement Trailers;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement ActionFigure;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(2) > a")
    WebElement teddiBears;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(3) > a")
    WebElement ToysVichcel;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(4) > a")
    WebElement BuldingToys;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(5) > a")
    WebElement CollactiveCarGame;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(6) > a")
    WebElement ModelsTrains;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(8) > a")
    WebElement ToysModelsKit;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(2) > a")
    WebElement Warhammar40k;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement BoardRoleplayingGames;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(4) > a")
    WebElement PreschoolToysPretendPlay;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(5) > a")
    WebElement NERFDartGunsSoftDarts;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(6) > a")
    WebElement RebornDollsPlaysets;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(8) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(7) > a")
    WebElement MarvelLegendsActionFigures;

    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(11) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(2) > a")
    WebElement Wristwatches;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(11) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(2) > a")
    WebElement OMGA;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(11) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(4) > a")
    WebElement FashionJewelry;

    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(11) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement Breitling;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(11) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(4) > a")
    WebElement TAGHeuer;

    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(11) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(5) > a")
    WebElement PatekPhilippe;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(11) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(6) > a")
    WebElement Cartier;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(11) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(7) > a")
    WebElement VanCleefArpels;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(11) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(8) > a")
    WebElement TiffanyCo;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(9) > a")
    WebElement SportingGoods;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(9) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement HuntingEquipment;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(9) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(2) > a")
    WebElement CyclingEquipment;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(9) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(4) > a")
    WebElement GolfClubs;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(9) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(8) > a")
    WebElement WaterSports;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(9) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement Bikes;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(9) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(4) > a")
    WebElement ElectricBikes;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(9) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(6) > a")
    WebElement Dumbbells;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(9) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(2) > ul > li:nth-child(5) > a")
    WebElement GpsRunning;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(7) > a")
    WebElement ClothingAccessories;
    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(7) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement WomenClothing;

    //    //reusable steps


    public void searchElement(String item) {

        type(searchField, item);
    }

    //
    public void clickSearchBtn() {
        click(searchBtn);
        waitFor(5);
    }


    public void hoveroverMyeBayfloatingMenu(WebDriver driver) {

        hoverOver(driver, MyeBayfloatingMenu);

    }

    public void clickOnCarsTrucks() {

        click(CarsTrucks);
    }


    public void clickoptionMenu() {
        click(AccpetsOffers);


    }

    public void TypeIphoneInSearchBar() {


        type(searchField, "Iphone");
        click(searchBtn);

//
//    }


    }

    public void hoverOverMotor(WebDriver driver) {

        hoverOver(driver, Motor);

    }

    public void clickOnMotorcycles() {

        click(Motorcycles);
    }

    public void clickOnBoat() {
        click(Boat);
    }


    public void clickOnMyGarage() {

        click(MyGarage);
    }

    public void hoverOverhomegarden(WebDriver driver) {

        hoverOver(driver, HomeGarden);


    }

    public void clickOntoolspower() {

        click(toolspower);

    }


    public void clickOnLogin() {

        click(Longin);
    }


    public void clickDropdownbtn() {

        click(DropDown);
    }

    public void selectOptionFromDropDown(String option) {
        selectFromDropdown(menuDropdown, option);


    }

    public void clickOnMilwaukee() {

        click(Milwaukee);
    }

    public void clickOnAddCard() {

        click(AddtoCard);
    }

    public void hoverOverToys(WebDriver driver) {

        hoverOver(driver, toys);

    }

    public void clickOnToysDeal() {

        click(toysDeal);

    }

    public void hoverOverjewerly(WebDriver driver) {

        hoverOver(driver, jewerly);


//    public void clickOnJewerly(WebDriver driver) {

//        hoverOver(driver, jewerly1);
    }

    public void clickOnFindjewerly() {

        click(Findjewerly);
    }

    public void clickOnWachMan() {

        click(wachman);

    }

    public void clickOnWomenWach() {

        click(womenwach);
    }

    public void clickOnKidsshose() {

        click(kidsshose);
    }

    public void scrollToView2(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollToViewtheBottom(WebDriver driver) {
        scrollToView2(driver, bottom);
        waitFor(5);

    }

    public void clickOnCompanyinf() {
        click(Companyinfo);
        waitFor(5);
    }

    public void scrollToViewHelpSection(WebDriver driver) {
        scrollToView2(driver, help);
        waitFor(5);
    }

    public void clickOnSellar() {
        click(Seller);
        waitFor(5);
    }

    public void hoveroverMyPaymentsfees(WebDriver driver) {

        hoverOver(driver, paynmentfees);
    }

    public void scrollToView3(WebDriver driver) {
        scrollToView2(driver, Stayconnected);
        waitFor(5);
    }

    public void clickOnSFb() {
        click(facebook);

    }

    public void scrollToView4(WebDriver driver) {
        scrollToView2(driver, Sell);
        waitFor(5);
    }

    public void clickOnHowtoSell() {
        click(howtoSell);
    }

    public void scrollToView5(WebDriver driver) {
        scrollToView2(driver, buy);
        waitFor(5);
    }

    public void clickOnstores() {
        click(stores);
    }

    public void scrollToView6(WebDriver driver) {
        scrollToView2(driver, Tools);
        waitFor(5);
    }

    public void clickOndevlopers() {
        click(devlopers);
    }

    public void scrollToView7(WebDriver driver) {
        scrollToView2(driver, untiedstate);
        waitFor(5);
    }

    public void hoveroverMyUntiedState(WebDriver driver) {

        hoverOver(driver, untiedstate);
    }

    public void clickOnFlag() {
        click(colombai);
    }

    public void typeAndScrollToViewVideoGame(WebDriver driver) {
        scrollToView2(driver, viedogame);
    }

    public void clickOnvd() {

        click(viedogame);
    }

    public void clicknew() {

        click(newseled);
    }

    public void hoveroverMyVideoGame(WebDriver driver) {

        hoverOver(driver, review);

    }

    public void clickOnBoots() {

        click(boots);
    }

    public void clickOnCondition() {

        click(conditions);
    }

    public void scrollToViewTellusWhatyouThing(WebDriver driver) {

        scrollToView2(driver, telluswhatyouthink);
    }

    public void clickOnTellusWhatyouThing() {

        click(telluswhatyouthink);
    }

    public void clickOnSend() {

        click(send);
    }

    public void scrollToViewUp(WebDriver driver) {

        scrollToView2(driver, scrollup);
    }

    public void scrollToViewUpAndDown(WebDriver driver) {
        scrollToView2(driver, scrolldownandup);

    }

    public void scrollUpToViewToWellcomePage(WebDriver driver) {

        scrollToView2(driver, scrollupToBrandOutlet);
    }

    public void clickOnBrandOtlet() {

        click(scrollupToBrandOutlet);
    }

    public void clickOnAccerUpTo50() {

        click(accer);
    }

    public void hoveroverMyShoopingCart(WebDriver driver) {

        hoverOver(driver, shoopingCart);
    }

    public void clickOnAddToCart() {

        click(ViewCart);

    }

    public void clickOnQtyBtn() {

        click(QTY);
    }

    public void hoveroverMyebayRefurbished(WebDriver driver) {

        hoverOver(driver, ebayRefurbished);
    }

    public void clickOnSurveillance() {

        click(Surveillance);
    }

    public void scrollUpToViewToHomeCammra(WebDriver driver) {

        scrollToView2(driver, HomesecirityCammra);
    }

    public void clickOnseeDetail() {

        click(Seedetails);
    }

    public void clickOnRegisterBtn() {

        click(Register);
    }


    public void typeOnRegisterEmail(String Text) {

        type(Registernemail, Text);
    }

    public void typeOnRegisterPassword(String Text) {

        type(RegistePassWoed, Text);
    }

    public void typeOnRegisteName(String Text) {

        type(RegisterName, Text);
    }

    public void typeOnRegisteLastName(String Text) {

        type(RegisterLastName, Text);
    }

    public void clickOnCeatAccount() {

        click(CreatAccount);
    }

    public void scrollUpToViewcheckedBox(WebDriver driver) {

        scrollToView2(driver, checkedBox);
    }

    public void clickOnCheckedBox() {

        click(checkedBox);
    }

    public void clickOnUsSize() {

        click(size);
    }

    public void clickOnDepartment() {

        click(department);
    }

    public void scrollToAddidasShose(WebDriver driver) {

        scrollToView2(driver, addidasshose);
    }

    public void clickOnClassic() {

        click(Classics);
    }

    public void clickOnAllPartsAccessories() {

        click(AllPartsAccessories);
    }

    public void clickOnPowerSport() {

        click(PowerSports);
    }

    public void clickOnTrailaer() {

        click(Trailers);
    }

    public void clickOnActionFigure() {

        click(ActionFigure);
    }

    public void clickOnTeddBear() {

        click(teddiBears);
    }

    public void clickOnToysVichele() {

        click(ToysVichcel);
    }

    public void clickOnBuldingToys() {

        click(BuldingToys);
    }

    public void clickOnCollactiveCarGames() {

        click(CollactiveCarGame);
    }

    public void clickOnModelsTrains() {

        click(ModelsTrains);
    }

    public void clickOnToysModelKit() {

        click(ToysModelsKit);
    }

    public void clickOnWarhammar40k() {

        click(Warhammar40k);
    }

    public void clickOnBoardRoleplayingGames() {

        click(BoardRoleplayingGames);
    }

    public void clickOnPreschoolToysPretendPlay() {

        click(PreschoolToysPretendPlay);
    }

    public void clickOnNERFDartGunsSoftDarts() {

        click(NERFDartGunsSoftDarts);
    }

    public void clickOnRebornDollsPlaysets() {

        click(RebornDollsPlaysets);
    }

    public void clickOnMarvelLegendsActionFigures() {

        click(MarvelLegendsActionFigures);
    }

    public void clickOnWristwatches() {

        click(Wristwatches);
    }

    public void clickOnOMGA() {

        click(OMGA);
    }

    public void clickOnFashionJewelry() {

        click(FashionJewelry);
    }

    public void clickOnBreitling() {

        click(Breitling);
    }

    public void clickOnTAGHeuer() {

        click(TAGHeuer);
    }

    public void clickOnPatekPhilippe() {

        click(PatekPhilippe);
    }

    public void clickOnCartier() {

        click(Cartier);
    }

    public void clickOnVanCleefArpels() {

        click(VanCleefArpels);
    }

    public void clickOnTiffanyCo() {

        click(TiffanyCo);
    }

    public void hoveroverSportingGoods(WebDriver driver) {

        hoverOver(driver, SportingGoods);
    }

    public void clickOnHuntingEquipment() {

        click(HuntingEquipment);

    }

    public void clickOnCyclingEquipment() {

        click(CyclingEquipment);

    }

    public void clickOnGolfClubs() {

        click(GolfClubs);
    }

    public void clickOnWaterSports() {

        click(WaterSports);
    }

    public void clickOnBikes() {

        click(Bikes);
    }

    public void clickOnElectricBikes() {

        click(ElectricBikes);
    }

    public void clickOnDumbbells() {

        click(Dumbbells);
    }

    public void clickOnGpsRunning() {

        click(GpsRunning);
    }

    public void hoveroverClothingAccessories(WebDriver driver) {

        hoverOver(driver, ClothingAccessories);
        LOG.info("TEst of log");

    }
    public void clickOnWomenClothing() {

        click(WomenClothing);
        LOG.info("Women Clothing selected");
    }







    public void TypeItemInSearchBar(String item) {


        typeAndEnter(searchField, item);
        //click(searchBtn);
    }


    public void ClearItemInSearchBar() {

        click(searchField);

        clear(searchField);

        //click(searchBtn);
    }
}








