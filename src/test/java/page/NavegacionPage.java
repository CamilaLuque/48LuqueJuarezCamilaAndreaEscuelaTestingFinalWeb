package page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class NavegacionPage extends PageObject {

    @FindBy(className = "inventory_details_desc")
    WebElementFacade descripcionProducto;

    @FindBy(id = "back-to-products")
    WebElementFacade botonRegresar;

    @FindBy(className = "product_sort_container")
    WebElementFacade selectorOrden;

    @FindBy(className = "inventory_item_name")
    java.util.List<WebElementFacade> listaNombres;

    @FindBy(className = "inventory_item_price")
    java.util.List<WebElementFacade> listaPrecios;

    public void clickEnProductoPorNombre(String nombre) {
        find(By.xpath("//div[text()='" + nombre + "']")).click();
    }

    public String obtenerDescripcion() {
        return descripcionProducto.getText();
    }

    public boolean estaVisibleBotonRegresar() {
        return botonRegresar.isCurrentlyVisible();
    }

    public void seleccionarOrden(String opcion) {
        selectorOrden.selectByVisibleText(opcion);
    }

    public String obtenerPrimerNombre() {
        return listaNombres.get(0).getText();
    }

    public String obtenerPrimerPrecio() {
        return listaPrecios.get(0).getText();
    }
}