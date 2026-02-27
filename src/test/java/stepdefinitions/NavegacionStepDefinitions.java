package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;
import steps.NavegacionSteps;

public class NavegacionStepDefinitions {

    @Steps
    NavegacionSteps navegacionSteps;

    @Cuando("el usuario hace clic en el nombre del producto {string}")
    public void elUsuarioHaceClicEnElNombreDelProducto(String nombre) {
        navegacionSteps.entrarAlDetalle(nombre);
    }

    @Entonces("el sistema muestra la página de detalle del producto")
    public void elSistemaMuestraLaPaginaDeDetalleDelProducto() {
        navegacionSteps.validarPaginaDetalle();
    }

    @Y("la descripción debe contener el texto {string}")
    public void laDescripcionDebeContenerElTexto(String texto) {
        navegacionSteps.validarDescripcion(texto);
    }
}