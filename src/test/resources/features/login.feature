# language: es
  @login
Característica: Iniciar sesión en SauceDemo

  Antecedentes:
    Dado que el usuario abre la página de SauceDemo

  @SAUCE @happypath
  Escenario: Verificar el logeo correcto en la pagina SauceDemo - OK
    Cuando escribo el usuario "standard_user"
    Y escribo la contraseña "secret_sauce"
    Y hago click en el boton Login
    Entonces debería mandar a la url "https://www.saucedemo.com/inventory.html"

  @SAUCE2 @unhappypath
  Escenario: Inicio de sesión con usuario inválido
    Cuando escribo el usuario "usuario_falso"
    Y escribo la contraseña "secret_sauce"
    Y hago click en el boton Login
    Entonces se debe mostrar el mensaje de error "Epic sadface: Username and password do not match any user in this service"

  @SAUCE3 @unhappypath
  Escenario: Inicio de sesión con contraseña inválida
    Cuando escribo el usuario "standard_user"
    Y escribo la contraseña "clave_incorrecta"
    Y hago click en el boton Login
    Entonces se debe mostrar el mensaje de error "Epic sadface: Username and password do not match any user in this service"

  @SAUCE4 @unhappypath
  Escenario: Inicio de sesión sin colocar usuario
    Cuando escribo el usuario ""
    Y escribo la contraseña "secret_sauce"
    Y hago click en el boton Login
    Entonces se debe mostrar el mensaje de error "Epic sadface: Username is required"

  @SAUCE4 @unhappypath
  Escenario: Inicio de sesión sin colocar contraseña
    Cuando escribo el usuario "standard_user"
    Y escribo la contraseña ""
    Y hago click en el boton Login
    Entonces se debe mostrar el mensaje de error "Epic sadface: Password is required"