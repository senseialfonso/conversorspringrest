# 🌐 Conversor de Unidades con Spring Boot REST

Este proyecto es una aplicación web desarrollada con **Spring Boot** que permite convertir:

- 🌡️ Celsius a Fahrenheit
- 🛣️ Kilómetros a Millas

Incluye una interfaz web amigable y un backend accesible vía API REST.

---

## 📁 Estructura del Proyecto

```
conversion-rest/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── ejemplo/
        │           └── conversion/
        │               ├── ConversionController.java
        │               └── ConversionRestApplication.java
        └── resources/
            └── static/
                └── index.html
```

---

## 🔧 Archivos principales

### `ConversionController.java` 🎯
Controlador REST que maneja dos rutas:

- `/api/convert/celsius-to-fahrenheit?celsius=25`
- `/api/convert/kilometers-to-miles?km=10`

Devuelve resultados numéricos como respuesta directa.

---

### `ConversionRestApplication.java` 🚀
Archivo principal que inicia el servidor Spring Boot.

---

### `index.html` 🖥️
Interfaz web basada en **Bootstrap** que permite al usuario:

- Introducir valores para conversión.
- Ver el resultado sin recargar la página (con `fetch()`).

---

## ▶️ Cómo ejecutar

1. Abre una terminal en la carpeta del proyecto.
2. Ejecuta el siguiente comando:

```bash
mvn spring-boot:run
```

3. Abre tu navegador y visita:

```
http://localhost:8080/index.html
```

---

## 💡 Extras

- El frontend está hecho con **Bootstrap 5** para un estilo moderno.
- Las peticiones al backend son asíncronas, usando `fetch()`.

---

¡Listo para aprender y modificar! ✨
