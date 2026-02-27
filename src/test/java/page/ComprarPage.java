package page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class ComprarPage extends PageObject {
    @FindBy(id = "checkout")
    WebElementFacade checkoutButton;

    @FindBy(id = "first-name")
    WebElementFacade firstNameField;

    @FindBy(id = "last-name")
    WebElementFacade lastNameField;

    @FindBy(id = "postal-code")
    WebElementFacade postalCodeField;

    @FindBy(id = "continue")
    WebElementFacade continueButton;

    @FindBy(id = "finish")
    WebElementFacade finishButton;

    @FindBy(className = "complete-header")
    WebElementFacade confirmationMessage;

    @FindBy(css = "[data-test='error']")
    WebElementFacade errorMessage;

    public void clickCheckout() { checkoutButton.click(); }

    public void completarInformacion(String nombre, String apellido, String zip) {
        firstNameField.type(nombre);
        lastNameField.type(apellido);
        postalCodeField.type(zip);
    }

    public void clickContinue() { continueButton.click(); }

    public void clickFinalizar() { finishButton.click(); }

    public String obtenerMensajeConfirmacion() {
        return confirmationMessage.getText();
    }

    public String obtenerMensajeError() {
        return errorMessage.getText();
    }
}