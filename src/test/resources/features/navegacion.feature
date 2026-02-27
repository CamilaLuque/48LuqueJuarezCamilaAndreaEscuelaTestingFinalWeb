# language: es
@navegacion
Característica: Navegar en la página de SauceDemo

  Antecedentes:
    Dado que el usuario abre la página de SauceDemo
    Cuando escribo el usuario "standard_user"
    Y escribo la contraseña "secret_sauce"
    Y hago click en el boton Login

  @SAUCE @happypath
  Escenario: Ver la descripción detallada de un producto
    Cuando el usuario hace clic en el nombre del producto "Sauce Labs Bike Light"
    Entonces el sistema muestra la página de detalle del producto
    Y la descripción debe contener el texto "A red light isn't the desired state in testing"

  @SAUCE2 @happypath
  Escenario: Ordenar productos por precio de menor a mayor
    Cuando el usuario cambia el orden a "Price (low to high)"
    Entonces el primer producto de la lista debería ser "Sauce Labs Onesie"
    Y el precio debería ser "$7.99"