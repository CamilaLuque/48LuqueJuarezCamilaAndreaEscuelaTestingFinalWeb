package steps;

import net.serenitybdd.annotations.Step;
import page.LoginPage;

public class LoginSteps {

    LoginPage loginPage;

    @Step("Abrir la pagina de SauceDemo")
    public void abrirSauce() {
        loginPage.open();
    }

    @Step("Escribir el usuario")
    public void escriboElUsuario(String username) {
        loginPage.enterUsername(username);
    }

    @Step("Escribir la contraseña")
    public void escriboLaContrasena(String password) {
        loginPage.enterPassword(password);
    }

    @Step("Presionar Login")
    public void clickLogin() {
        loginPage.clickLogin();
    }

    @Step("Validar la URL")
    public void validarURL(String url) {
        String urlActual = loginPage.getDriver().getCurrentUrl();
        assert urlActual.equals(url): "La URL no es la esperada";
    }

    @Step("Validar mensaje de error en login")
    public void validarMensajeError(String mensajeEsperado) {
        String mensajeActual = loginPage.getErrorMessage();
        assert mensajeActual.equals(mensajeEsperado);
    }
}