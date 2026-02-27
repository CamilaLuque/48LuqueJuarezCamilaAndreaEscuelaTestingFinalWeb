package page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {
    @FindBy(id = "user-name")
    WebElementFacade username;

    @FindBy(id = "password")
    WebElementFacade password;

    @FindBy(id = "login-button")
    WebElementFacade loginButton;

    @FindBy(css = "[data-test='error']")
    WebElementFacade errorMessage;

    public void enterUsername(String usernameText) {
        username.type(usernameText);
    }

    public void enterPassword(String passwordText) {
        password.type(passwordText);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public String getErrorMessage() { return errorMessage.getText();}
}