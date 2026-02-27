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
}