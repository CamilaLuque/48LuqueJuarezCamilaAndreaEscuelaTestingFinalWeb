package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;
import steps.LoginSteps;

public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Dado("que el usuario abre la página de SauceDemo")
    public void queElUsuarioAbreLaPaginaDeGoogle() {
        loginSteps.abrirSauce();
    }

    @Cuando("escribo el usuario {string}")
    public void escriboElUsuario(String username) {
        loginSteps.escriboElUsuario(username);
    }

    @Y("escribo la contraseña {string}")
    public void escriboLaContraseña(String password) {
        loginSteps.escriboLaContrasena(password);
    }

    @Y("hago click en el boton Login")
    public void hagoClickEnElBotonLogin() {
        loginSteps.clickLogin();
    }

    @Entonces("debería mandar a la url {string}")
    public void deberíaMandarALaUrl(String url) {
        loginSteps.validarURL(url);
    }

    @Entonces("se debe mostrar el mensaje de error {string}")
    public void seDebeMostrarElMensajeDeError(String mensaje) {
        loginSteps.validarMensajeError(mensaje);
    }
}
