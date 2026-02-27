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

    public void clickEnProductoPorNombre(String nombre) {
        find(By.xpath("//div[text()='" + nombre + "']")).click();
    }

    public String obtenerDescripcion() {
        return descripcionProducto.getText();
    }

    public boolean estaVisibleBotonRegresar() {
        return botonRegresar.isCurrentlyVisible();
    }
}