package EbayPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeGardenPage extends CommonAPI {

    public HomeGardenPage(WebDriver driver) {PageFactory.initElements(driver, this);}
    private final Logger LOG = LoggerFactory.getLogger(HomeGardenPage.class);


    @FindBy(css = "#s0-28_1-9-0-1\\[1\\]-0-0-12-list > li:nth-child(1) > a > p")
    WebElement Dewalt;




    public void clickOnDewalt() {

        click(Dewalt);
        LOG.info("Dewalt clicked");
    }
}
