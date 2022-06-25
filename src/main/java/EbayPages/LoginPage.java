package EbayPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;



public class LoginPage extends CommonAPI {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

          private final Logger LOG = LoggerFactory.getLogger(LoginPage.class);

    @FindBy(css = "#userid")
    WebElement Longinemail;
    @FindBy(css = "#signin-continue-btn")
    WebElement Continue;





    public void typeOnloginEmailField(String Text) {

        type(Longinemail, Text);
        LOG.info("Email entered");
    }

    public void clickcOncontueptn() {

        click(Continue);
        LOG.info("Continue clicked");
    }

    public void typeOnloginUserName(String Text) {

        type(Longinemail, Text);
    }

    public void typeOnlogin(String Text) {

        type(Longinemail, Text);
    }


}
