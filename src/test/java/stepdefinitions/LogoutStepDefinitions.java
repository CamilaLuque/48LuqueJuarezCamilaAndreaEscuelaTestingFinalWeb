package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;
import steps.LogoutSteps;

public class LogoutStepDefinitions {

    @Steps
    LogoutSteps logoutSteps;

    @Dado("que el usuario selecciona el boton lateral de menu")
    public void queElUsuarioSeleccionaElBotónLateralDeMenu() {
        logoutSteps.abrirMenu();
    }

    @Y("el usuario presiona la opcion Logout")
    public void elUsuarioPresionaLaOpciónLogout() {
        logoutSteps.clickLogout();
    }

    @Entonces("debería mandar a la url inicial {string}")
    public void deberíaMandarALaUrlInicial(String url) {
        logoutSteps.validarURL(url);
    }
}
