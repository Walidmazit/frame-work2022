package EbayPages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MotorItemsPage extends CommonAPI {

    public MotorItemsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    private final Logger LOG = LoggerFactory.getLogger(MotorItemsPage.class);

    @FindBy(css = "#mainContent > section.b-module.b-visualnav > div.b-visualnav__grid > a:nth-child(1) > div.b-visualnav__title")
     private WebElement FishingBoat;
    @FindBy(css = "#mainContent > section.b-module.b-visualnav > div.b-visualnav__grid > a:nth-child(2) > div.b-visualnav__title")
    private WebElement CollctorCars;
    @FindBy(css = "#s0-28_2-9-0-1\\[3\\]-1-2-0-bModCarousel-12-list > li:nth-child(2) > div > a > div > div.b-event__footer > h3")
    private WebElement OutomotiveTools;
    @FindBy(css = "#mainContent > section:nth-child(3) > div.b-visualnav__grid > a:nth-child(1) > div.b-visualnav__title")
    private WebElement wheels;
    @FindBy(css = "#mainContent > section:nth-child(4) > div.b-visualnav__grid > a:nth-child(1) > div.b-visualnav__img.b-visualnav__img__default > img")
    private WebElement ATVSCar;
    @FindBy(css = "#mainContent > section.b-module.b-visualnav > div.b-visualnav__grid > a:nth-child(3) > div.b-visualnav__title")
    private WebElement Buses;








    public void clickOnFishinBoat() {

        click(FishingBoat);
        LOG.info("Fishing Boat clicked");
    }

    public void scrollToView2(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        waitFor(2);
    }
    public void clickOnCollctorCars() {

        click(CollctorCars);
        LOG.info("Collector Cars clicked");
    }
    public void scrollToAutomotiveTools(WebDriver driver) {

        scrollToView2(driver, OutomotiveTools);
        LOG.info("Automotive Tools scrolled ");
    }
    public void clickOnWheels() {

        click(wheels);
        LOG.info("wheels clicked ");
    }
    public void clickOnAtvscar() {

        click(ATVSCar);
        LOG.info("ATSCar clicked ");
    }
    public void clickOnBuses() {

        click(Buses);
        LOG.info("Buses clicked ");
    }




}
