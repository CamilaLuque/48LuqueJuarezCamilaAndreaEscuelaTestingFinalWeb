# Proyecto de Pruebas Automatizadas con Serenity - SauceDemo

Este proyecto contiene un conjunto de pruebas automatizadas para la página web [SauceDemo](https://www.saucedemo.com/), desarrolladas utilizando **Serenity BDD + Cucumber**.

Las pruebas automatizan los principales flujos funcionales del sistema, incluyendo login, gestión del carrito, compra de productos y logout.

---

## 1. Prerrequisitos

Antes de ejecutar las pruebas, asegúrate de tener instalado y configurado lo siguiente:

* **Java 17**
* **Apache Maven**
* **IDE recomendado:** IntelliJ IDEA o similar
* **Variables de Entorno:**

    * `JAVA_HOME` apuntando al JDK 17
    * `M2_HOME` apuntando a Maven
    * Carpetas `bin` incluidas en el `Path`

---
## 2. Features Desarrollados

### Login

* Inicio de sesión con usuario válido.
* Validación de error con credenciales inválidas.

### Gestión de Carrito

* Agregar productos al carrito.
* Eliminar productos del carrito.
* Validar que el número de productos en el carrito sea el correcto.

### Compra

* Flujo completo de compra.
* Validación de formulario con datos incompletos.
* Caso permisivo de compra.

### Logout

* Cierre de sesión exitoso.

---

## 3. Ejecución de las Pruebas

En este proyecto **NO se ejecutan los tests por línea de comandos con tags como en Karate**.

La ejecución se realiza desde el **Runner del feature que se desea correr**.

---

## Cómo ejecutar un Feature

1. Ir a la carpeta:

```
src/test/java/runner
```

2. Abrir el Runner correspondiente al feature que se desea ejecutar
   (por ejemplo: `LoginRunner`, `ComprarRunner`, etc.).

3. Colocar el **tag del escenario** que se desea ejecutar dentro del Runner.

   Ejemplo:

```java
@CucumberOptions(
    features = "src/test/resources/features/login.feature",
    tags = "@SAUCE"
)
```
4. Hacer clic derecho sobre el archivo Runner.

5. Seleccionar:

```
Run + 'NombreDelRunner'
```
---

## Ejecutar todos los escenarios de un Feature

Si deseas ejecutar todos los escenarios del feature, usa el tag general al inicio de cada archivo feature, como:

```java
tags = "@login"
```
---

## Ejecutar por test específico

Si deseas ejecutar un escenario específico del feature, usa el tag al inicio de la prueba deseada, como:

```java
tags = "@SAUCE2"
```
---

## Ejecutar por tipo de flujo

Si deseas ejecutar un escenario por tipo de flujo como `@happypath` o `@unhappypath`, usa:

```java
tags = "@happypath"
```
---

```java
tags = "@unhappypath"
```
---

## 4. Reportes

Una vez finalizada la ejecución, Serenity generará el reporte en el path:

```
target/site/serenity/index.html
```