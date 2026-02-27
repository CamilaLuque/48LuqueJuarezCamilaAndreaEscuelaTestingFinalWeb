# language: es
@logout
Característica: Cerrar sesión de SauceDemo

  Antecedentes:
    Dado que el usuario abre la página de SauceDemo
    Cuando escribo el usuario "standard_user"
    Y escribo la contraseña "secret_sauce"
    Y hago click en el boton Login

  @SAUCE @happypath
  Escenario: Cerrar sesión en la pagina SauceDemo - OK
    Cuando que el usuario selecciona el boton lateral de menu
    Y el usuario presiona la opcion Logout
    Entonces debería mandar a la url inicial "https://www.saucedemo.com/"
