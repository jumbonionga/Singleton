# Singleton
## Pasos
1. Se crea la clase de configuración de la instancia.
   1. Se define la clase.
   2. Se hace el constructor privado.
   3. Se declara una variable estática privada de tipo `Clase` en la clase (`instance`).
2. Dentro de la clase, implementar el método estático `getInstance()`. 
   1. Este método debe verificar si `instance` es `null`. Si lo es, crea una nueva instancia.
   2. Debe retornar `instance`.
3. Agregar propiedades a la clase, como `String` o números, que representen configuraciones típicas.
4. Proporcionar `getters` y `setters`.
5. Utilizar la implementación en la aplicación.
   1. En otra parte de la aplicación, se usa `{CLASE}.getInstance()` para obtener la instancia de la clase.
   2. Se establecen o recuperan las propiedades usando los `getters` y `setters`.

Como referencia puede usarse [Singleton](https://www.youtube.com/watch?v=gocJeOHtj9w)