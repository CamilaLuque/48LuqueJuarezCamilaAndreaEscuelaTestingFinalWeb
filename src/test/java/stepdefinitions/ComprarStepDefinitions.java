package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;
import steps.ComprarSteps;

public class ComprarStepDefinitions {
    @Steps
    ComprarSteps comprarSteps;

    @Cuando("el usuario presiona el botón Checkout")
    public void presionarCheckout() {
        comprarSteps.iniciarCheckout();
    }

    @Y("completa su información con el nombre {string}, apellido {string} y código postal {string}")
    public void completarInformacion(String nombre, String apellido, String zip) {
        comprarSteps.ingresarDatos(nombre, apellido, zip);
    }

    @Y("presiona el botón Continue")
    public void presionarContinue() {
        comprarSteps.clickContinue();
    }

    @Y("presiona el botón Finish")
    public void presionarFinish() {
        comprarSteps.clickFinalizar();
    }

    @Entonces("se debe mostrar el mensaje de confirmación {string}")
    public void validarMensaje(String mensaje) {
        comprarSteps.validarCompra(mensaje);
    }

    @Entonces("el sistema debería mostrar el error {string}")
    public void validarError(String mensaje) {
        comprarSteps.validarMensajeError(mensaje);
    }

}
