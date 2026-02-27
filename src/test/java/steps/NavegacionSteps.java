package steps;

import net.serenitybdd.annotations.Step;
import page.NavegacionPage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class NavegacionSteps {

    NavegacionPage navegacionPage;

    @Step("Hacer clic en el nombre del producto")
    public void entrarAlDetalle(String nombre) {
        navegacionPage.clickEnProductoPorNombre(nombre);
    }

    @Step("Validar que la descripción sea correcta")
    public void validarDescripcion(String textoEsperado) {
        assertThat(navegacionPage.obtenerDescripcion(), containsString(textoEsperado));
    }

    @Step("Validar que se muestra la página de detalle")
    public void validarPaginaDetalle() {
        assert navegacionPage.estaVisibleBotonRegresar();
    }

    @Step("Cambiar el orden de los productos")
    public void cambiarOrden(String opcion) {
        navegacionPage.seleccionarOrden(opcion);
    }

    @Step("Validar nombre del primer producto")
    public void validarPrimerProducto(String nombreEsperado) {
        String actual = navegacionPage.obtenerPrimerNombre();
        assert actual.equals(nombreEsperado);
    }

    @Step("Validar precio del primer producto")
    public void validarPrecioDelPrimero(String precioEsperado) {
        String actual = navegacionPage.obtenerPrimerPrecio();
        assert actual.equals(precioEsperado);
    }
}