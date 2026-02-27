# language: es
@comprar
Característica: Gestionar carrito de compras de SauceDemo

  Antecedentes:
    Dado que el usuario abre la página de SauceDemo
    Cuando escribo el usuario "standard_user"
    Y escribo la contraseña "secret_sauce"
    Y hago click en el boton Login

  @SAUCE @happypath
  Escenario: Finalizar la compra de un producto exitosamente - OK
    Y el usuario selecciona el boton add to cart del producto "Sauce Labs Bike Light"
    Y presiona el icono del carrito de la derecha
    Cuando el usuario presiona el botón Checkout
    Y completa su información con el nombre "Pepito", apellido "Perez" y código postal "12345"
    Y presiona el botón Continue
    Y presiona el botón Finish
    Entonces se debe mostrar el mensaje de confirmación "Thank you for your order!"

    #el sistema permite realizar el proceso de compra sin necesidad de tener algo en el carrito
  @SAUCE2 @permisivopath
  Escenario: Intentar finalizar compra sin un producto en el carrito - OK
    Y presiona el icono del carrito de la derecha
    Cuando el usuario presiona el botón Checkout
    Y completa su información con el nombre "Pepito", apellido "Perez" y código postal "12345"
    Y presiona el botón Continue
    Y presiona el botón Finish
    Entonces se debe mostrar el mensaje de confirmación "Thank you for your order!"

  @SAUCE3 @unhappypath
  Escenario: Intentar finalizar compra sin ingresar el nombre
    Y el usuario selecciona el boton add to cart del producto "Sauce Labs Bike Light"
    Y presiona el icono del carrito de la derecha
    Cuando el usuario presiona el botón Checkout
    Y completa su información con el nombre "", apellido "Perez" y código postal "12345"
    Y presiona el botón Continue
    Entonces el sistema debería mostrar el error "Error: First Name is required"

  @SAUCE4 @unhappypath
  Escenario: Intentar finalizar compra sin ingresar el apellido
    Y el usuario selecciona el boton add to cart del producto "Sauce Labs Bike Light"
    Y presiona el icono del carrito de la derecha
    Cuando el usuario presiona el botón Checkout
    Y completa su información con el nombre "Pepito", apellido "" y código postal "12345"
    Y presiona el botón Continue
    Entonces el sistema debería mostrar el error "Error: Last Name is required"

  @SAUCE5 @unhappypath
  Escenario: Intentar finalizar compra sin ingresar el codigo postal
    Y el usuario selecciona el boton add to cart del producto "Sauce Labs Bike Light"
    Y presiona el icono del carrito de la derecha
    Cuando el usuario presiona el botón Checkout
    Y completa su información con el nombre "Pepito", apellido "Perez" y código postal ""
    Y presiona el botón Continue
    Entonces el sistema debería mostrar el error "Error: Postal Code is required"

  @SAUCE6 @unhappypath
  Escenario: Intentar finalizar compra sin ingresar ningún dato
    Y el usuario selecciona el boton add to cart del producto "Sauce Labs Bike Light"
    Y presiona el icono del carrito de la derecha
    Cuando el usuario presiona el botón Checkout
    Y completa su información con el nombre "", apellido "" y código postal ""
    Y presiona el botón Continue
    Entonces el sistema debería mostrar el error "Error: First Name is required"