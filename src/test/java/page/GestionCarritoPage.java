package page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class GestionCarritoPage extends PageObject {

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElementFacade AddButton;

    @FindBy(id = "shopping_cart_container")
    WebElementFacade CarritoButton;

    @FindBy(css = ".cart_list .inventory_item_name")
    WebElementFacade ProductoEnCarrito;

    @FindBy(id = "remove-sauce-labs-bike-light")
    WebElementFacade removeButton;

    @FindBy(className = "inventory_item_name")
    WebElementFacade listaProductos;

    @FindBy(className = "shopping_cart_badge")
    WebElementFacade badgeCarrito;

    public void clickAdd() {
        AddButton.click();
    }

    public void clickCarrito() {
        CarritoButton.click();
    }

    public String VerificarProductoEnCarrito() {
        return ProductoEnCarrito.getText();
    }

    public void clickRemove() {
        removeButton.click();
    }

    public boolean ProductoEliminado() {
        return !listaProductos.isVisible();
    }

    public String obtenerTexto() {
        if (badgeCarrito.isVisible()) {
            return badgeCarrito.getText();
        }
        return "0";
    }
}