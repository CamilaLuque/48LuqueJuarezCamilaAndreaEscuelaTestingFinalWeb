package steps;

import net.serenitybdd.annotations.Step;
import page.ComprarPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ComprarSteps {
    ComprarPage comprarPage;

    @Step("Iniciar el proceso de checkout")
    public void iniciarCheckout() {
        comprarPage.clickCheckout();
    }

    @Step("Ingresar datos del cliente")
    public void ingresarDatos(String nombre, String apellido, String zip) {
        comprarPage.completarInformacion(nombre, apellido, zip);
    }

    @Step("Confirmar información")
    public void clickContinue() {
        comprarPage.clickContinue();
    }

    @Step("Presionar finalizar")
    public void clickFinalizar() {
        comprarPage.clickFinalizar();
    }

    @Step("Validar mensaje de éxito")
    public void validarCompra(String mensajeEsperado) {
        assertThat(comprarPage.obtenerMensajeConfirmacion(), equalTo(mensajeEsperado));
    }

    @Step("Validar mensaje de error en checkout")
    public void validarMensajeError(String mensajeEsperado) {
        String mensajeReal = comprarPage.obtenerMensajeError();
        assertThat(mensajeReal, equalTo(mensajeEsperado));
    }
}