package steps;

import net.serenitybdd.annotations.Step;
import page.GestionCarritoPage;

public class GestionCarritoSteps {

    GestionCarritoPage carritoPage;

    @Step("Añadir producto al carrito")
    public void addToCart(String producto) {
        carritoPage.clickAdd();
    }

    @Step("Hacer click en el carrito")
    public void clickCarrito() {
        carritoPage.clickCarrito();
    }

    @Step("Verificar que haya un producto en el carrito")
    public void ProductoEnCarrito(String producto) {
        String nombreProducto = carritoPage.VerificarProductoEnCarrito();
        assert  nombreProducto.equals(producto);
    }

    @Step("Eliminar producto del carrito")
    public void eliminarProducto() {
        carritoPage.clickRemove();
    }

    @Step("Verificar que el carrito esté vacío")
    public void verificarCarritoVacio() {
        assert carritoPage.ProductoEliminado();
    }

    @Step("Verificar cantidad en el badge del carrito")
    public void verificarContadorCarrito(String cantidadEsperada) {
        String cantidadReal = carritoPage.obtenerTexto();
        assert cantidadReal.equals(cantidadEsperada);
    }
}