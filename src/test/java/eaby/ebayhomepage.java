package eaby;

import EbayPages.SearchResultPage;
import EbayPages.ebayHomePage;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ExcelReader;
import utility.Utility;

import java.util.List;

public class ebayhomepage extends CommonAPI {


    @Test

    public void iphone() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("iphone");
        waitFor(1);
        homePage.clickSearchBtn();
        String ExpectedTitle = "iphone: Search Result | eBay";
        Assert.assertEquals(getPageTitle(), ExpectedTitle);
        waitFor(1);

    }

    @Test
    public void ClickOnFloatingMenu() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.searchElement("iphone");
        homePage.clickSearchBtn();


        homePage.hoveroverMyeBayfloatingMenu(getDriver());

    }

    @Test
    public void ClickOnAcceptOfferfromIphoneSearch() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.TypeIphoneInSearchBar();
        homePage.clickoptionMenu();
    }


    @Test
    public void buyBtn() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("Milwaukee 2401-22 M12 12V 1/4-Inch Hex Screwdriver Kit");
        homePage.clickSearchBtn();

        homePage.clickOnMilwaukee();
        waitFor(1);
        homePage.clickOnAddCard();
        waitFor(1);
    }


    @Test

    public void Electricaltools() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("elctrical tools");
        waitFor(1);
        homePage.clickSearchBtn();
        waitFor(1);

    }

    @Test

    public void wachmen() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("wach men");
        homePage.clickSearchBtn();
        waitFor(1);
        homePage.clickOnWachMan();
        waitFor(1);
    }

    @Test
    public void womenwach() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("womon wach");
        homePage.clickSearchBtn();
        waitFor(1);
        homePage.clickOnWomenWach();
    }

    @Test
    public void shose() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("wkids shose");
        homePage.clickSearchBtn();
        waitFor(1);
        homePage.clickOnKidsshose();
    }

    @Test
    public void scrollToview() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.scrollToViewtheBottom(getDriver());
        waitFor(1);
        homePage.clickOnCompanyinf();
        waitFor(1);
    }

    @Test
    public void scrollToview2() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.scrollToViewHelpSection(getDriver());
        homePage.clickOnSellar();
        homePage.hoveroverMyPaymentsfees(getDriver());

        waitFor(1);
    }

    @Test
    public void scrollToview3() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.scrollToView3(getDriver());
        waitFor(1);
        homePage.clickOnSFb();

    }

    @Test
    public void scrollToview4() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.scrollToView4(getDriver());
        homePage.clickOnHowtoSell();
        waitFor(1);
    }

    @Test
    public void scrollToview5() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.scrollToView5(getDriver());
        homePage.clickOnstores();
        waitFor(1);
    }

    @Test
    public void scrollToview6() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.scrollToView6(getDriver());
        waitFor(1);
        homePage.clickOndevlopers();
    }

    @Test
    public void scrollToview67() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.scrollToView7(getDriver());
        homePage.hoveroverMyUntiedState(getDriver());
        waitFor(1);
        waitFor(1);
        homePage.clickOnFlag();
    }

    @Test

    public void toys() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("toys");
        homePage.clickSearchBtn();
        homePage.typeAndScrollToViewVideoGame(getDriver());
        homePage.clickOnvd();
        waitFor(1);
        homePage.clicknew();
        homePage.hoveroverMyVideoGame(getDriver());
        waitFor(1);
        takeScreenshot("Toys");
        waitFor(1);

    }

    @Test
    public void boots() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("boots");
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.clickSearchBtn();
       waitFor(1);

        homePage.clickOnBoots();
        homePage.clickOnCondition();
        homePage.scrollToViewTellusWhatyouThing(getDriver());
        homePage.scrollToViewUp(getDriver());
        homePage.clickOnTellusWhatyouThing();
        homePage.clickOnSend();
        waitFor(1);

    }

    @Test
    public void scrollToviewUpAndDown() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.scrollToViewUpAndDown(getDriver());
        homePage.scrollUpToViewToWellcomePage(getDriver());
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        homePage.clickOnBrandOtlet();
        waitFor(1);
        homePage.clickOnAccerUpTo50();
        waitFor(1);
        takeScreenshot("Asser");
        waitFor(1);
    }

    @Test
    public void hoveroverMyshooping() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoveroverMyShoopingCart(getDriver());
        waitFor(1);
        homePage.clickOnAddToCart();
        homePage.clickOnQtyBtn();
    }

    @Test
    public void hoveroverMyebayRefurbished() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.hoveroverMyebayRefurbished(getDriver());
        homePage.clickOnSurveillance();
        waitFor(1);
        homePage.scrollUpToViewToHomeCammra(getDriver());
        homePage.clickOnseeDetail();

    }

    @Test
    public void RegisterLogin() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        homePage.clickOnRegisterBtn();
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.typeOnRegisterEmail("yaakoub@yahoo.com");
        homePage.typeOnRegisterPassword("Yaakoub123");
        homePage.typeOnRegisteName("walid");
        homePage.typeOnRegisteLastName("Jamal");
        homePage.clickOnCeatAccount();
        waitFor(1);

    }

    @Test
    public void nike() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("nike shose");
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.clickSearchBtn();
        homePage.scrollUpToViewcheckedBox(getDriver());
        homePage.clickOnCheckedBox();
        waitFor(1);
    }

    @Test
    public void addidas() {
        ebayHomePage homePage = new ebayHomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("Addidas shose");
        ExplicitlyWaitForNewPageToLoad(getDriver(), getPageTitle());

        waitFor(1);
        homePage.clickSearchBtn();
        waitFor(1);
        homePage.clickOnUsSize();
        homePage.clickOnDepartment();
        homePage.scrollToAddidasShose(getDriver());
        waitFor(1);
    }


    @Test
    public void EnterItemsFromExcel() {

        ebayHomePage homePage = new ebayHomePage(getDriver());
        ExcelReader excelReader = new ExcelReader(Utility.currentDir + "/data/TestData.xlsx");
        List<String> items = excelReader.getEntireColumnForGivenHeader("Sheet1", "item");

        for (String item : items) {

            homePage.ClearItemInSearchBar();
            homePage.TypeItemInSearchBar(item);

            waitFor(1);


        }


    }
}



























