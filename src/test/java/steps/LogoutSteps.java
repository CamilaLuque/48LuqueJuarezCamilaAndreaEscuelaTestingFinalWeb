package steps;

import net.serenitybdd.annotations.Step;
import page.LogoutPage;

public class LogoutSteps {

    LogoutPage logoutPage;

    @Step("Abrir el menu lateral")
    public void abrirMenu() {
        logoutPage.abrirMenu();
    }

    @Step("Hacer click en la opción logout")
    public void clickLogout() {
        logoutPage.clickLogout();
    }

    @Step("Redirige a la página inicial")
    public void validarURL(String url) {
        String urlActual = logoutPage.getDriver().getCurrentUrl();
        assert urlActual.equals(url): "La URL no es la esperada";
    }

}