package page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class LogoutPage extends PageObject {
    @FindBy(id = "react-burger-menu-btn")
    WebElementFacade menuButton;

    @FindBy(id = "logout_sidebar_link")
    WebElementFacade logoutButton;

    public void abrirMenu() { menuButton.click();}

    public void clickLogout() {
        logoutButton.click();
    }
}