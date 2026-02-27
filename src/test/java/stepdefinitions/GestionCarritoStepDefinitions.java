package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;
import steps.GestionCarritoSteps;

public class GestionCarritoStepDefinitions {

    @Steps
    GestionCarritoSteps carritoSteps;
    private String productoSeleccionado;

    @Cuando("el usuario selecciona el boton add to cart del producto {string}")
    public void addToCart(String producto) {
        this.productoSeleccionado = producto;
        carritoSteps.addToCart(producto);
    }

    @Y("presiona el icono del carrito de la derecha")
    public void presionaIconoDelCarritoDeLaDerecha() {carritoSteps.clickCarrito();}

    @Entonces("el producto agregado aparece en la lista de compra")
    public void ProductoEnCarrito() {
        carritoSteps.ProductoEnCarrito(this.productoSeleccionado);}

    @Y("elimina el producto {string} de la lista")
    public void eliminaElProductoDeLaLista(String producto) {
        carritoSteps.eliminarProducto();
    }

    @Entonces("el carrito ya no debería tener ese producto")
    public void elCarritoDeberiaEstarVacio() {
        carritoSteps.verificarCarritoVacio();
    }

    @Entonces("el icono del carrito debería mostrar {string} unidad")
    public void elIconoDelCarritoDeberiaMostrarUnidad(String cantidad) {
        carritoSteps.verificarContadorCarrito(cantidad);
    }
}
