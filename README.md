# CREATIONAL PATTERN DESIGNS
En este proyecto vamos a ver el uso de distintos patrones de diseño creacionales con clases de ejemplo.
## SINGLETON
### Conceptos
* Solo se crea una unica instancia.
* Garantiza el control del recurso.
* Se carga de manera perezosa.
* Ejemplos
    * Runtime evironments
    * Logger
    * Spring beans
* Hace contraste con el patron de diseño _Factory_.
### Diseño
* La clase es la responsable de su propia creación.
* Es de naturaleza estática.
* Necesita ser segura para subprocesos.
* La instancia de la clase es privada (constructor privado)
* No necesita parámetros en el constructor.
### Trampas
* A veces se sobre usa-
* Dificil para testear.
* Si no tienes cuidado, no será seguro para subprocesos.
* A veces confundido con el patrón de diseño _Factory_, que esta si que usa parámetros en el constructor.
## BUILDER
### Conceptos
* Maneja la construcción compleja de objetos.
* Tiene muchos argumentos. 
* Inmutablidad.
* Ejemplos
    * StringBuilder.
    * DocumentBuilder.
    * LocaleBuilder.
* Hace contraste con el patron de diseño _Prototype_.
### Diseño
* Resuelve el problema de manejar muchos constructores/constructor telescopico (constructores que se llaman unos a otros recursivamente)
* Contiene una clase estática interna.
* Niega la necesidad de exponer setters.
* Podemos usar los genéricos de Java con ventaja.
### Trampas
* Inmutable
* Complejo de implementar.
* Hay que crear una clase estática interna (Aunque se puede evitar)
* No se refactoriza despues de la construcción. 
## PROTOTYPE
### Conceptos
* Evita la creación costosa.
* Evita la subclasificación. 
* Normalmente no se usa _new_ para la construcción. La primera instancia se puede generar con _new_ pero el resto se clona.
* Puede usarse una interfaz para su instancia. 
* Suele implementarse con algún tipo de registro.
* Ejemplos
  * Object#clone()
* Hace contraste con el patron de diseño _Factory_. 
### Diseño
* Implementa interfaz Clone/Clonable.
* Evita la creación con _new_.
* Cada instancia es unica. 
* Construcción costosa no es responsablidad del cliente. 
* Se pueden usar parámetros para la construcción. 
* _Shallow_ vs _Deep Copy_.
### Trampas
* No está claro cuando usarlo. 
* Se suele usar con otros patrones de diseño.
* Tenemos que implementarlo con algún tipo de registro.
* _Shallow copy_ vs _Deep copy_.
## FACTORY
### Conceptos
* No exponen lógica de instanciacion, el cliente no sabe nada sobre el tipo de objeto que se está creando.
* Aplaza la creación de instancias a subclases.
* Driven Interface (Interfaz comun).
* Parameter Driven.
* Son implementadas bajo una arquitectura o framework, e implementadas por el usuario que usa ese framework/arquitectura.
* Ejemplos
  * Calendar.
  * NumberFormat.
* Hace contraste con el patron de diseño _Singleton_ (son opuestos)
* Soluciona creación compleja de objetos, como el patrón de diseño _Builder_ a diferencia que en _Factory_ tenemos parámetros para especificar el tipo que queremos obtener.
### Diseño
* Responsable de la creación y el ciclo de vida de sus objetos.
* Los objetos creados se referencia a través de una interfaz/contrato común.
* Creacion a través de metodos parametrizados o distintos constructores.
### Trampas
* Complejo.
* La creación de objetos no tiene lugar en la Factory en sí, sino en las distintas subclases que maneja.
* No se refactoriza después de su creación.
## ABSTRACT FACTORY
### Conceptos
* Es una factoria de factorias.
* Factoria de objetos relacionados.
* Interfaz común. 
* Aplaza la creación de instancias a subclases.
* Ejemplos:
  * Document Builder (API XML Java). 
### Diseño
* Agrupa factorias.
* Responsable del ciclo de vida
* Los objetos creados se referencia a través de una interfaz/contrato común.
* Creacion a través de metodos parametrizados.
* Composicion de objetos.
### Trampas
* Complejo de implentar.
* Patron que contiene otros patrones.
* Empieza como el patron _Factory_ y acaba refactorizandose a _AbstractFactory_