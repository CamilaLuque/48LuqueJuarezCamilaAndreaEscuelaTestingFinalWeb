# language: es
@carrito
Característica: Gestionar carrito de compras de SauceDemo

  Antecedentes:
    Dado que el usuario abre la página de SauceDemo
    Cuando escribo el usuario "standard_user"
    Y escribo la contraseña "secret_sauce"
    Y hago click en el boton Login

  @SAUCE @happypath
  Escenario: Agregar un producto al carrito - OK
    Cuando el usuario selecciona el boton add to cart del producto "Sauce Labs Bike Light"
    Y presiona el icono del carrito de la derecha
    Entonces el producto agregado aparece en la lista de compra

  @SAUCE2 @happypath
  Escenario: Eliminar un producto al carrito - OK
    Cuando el usuario selecciona el boton add to cart del producto "Sauce Labs Bike Light"
    Y presiona el icono del carrito de la derecha
    Y elimina el producto "Sauce Labs Bike Light" de la lista
    Entonces el carrito ya no debería tener ese producto

  @SAUCE3 @happypath
  Escenario: Actualización del contador del carrito al agregar un producto
    Cuando el usuario selecciona el boton add to cart del producto "Sauce Labs Bike Light"
    Entonces el icono del carrito debería mostrar "1" unidad

