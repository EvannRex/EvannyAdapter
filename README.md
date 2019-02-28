# Patron de diseño adapter
## ¿Que es?
### El adaptador es un patrón de diseño estructural que permite que los objetos con interfaces incompatibles colaboren.
## ¿Que problema resuelve?
### resuelve problemas de incompatibilidad entre objetos, ya sea por el formato de archivos que manejan o por el tipo de datos que usan, el adaptador se encarga de hacer posible la comunicacion de esos objetos, en algunos casos convirtiendo de un formato de archivo a otro o haciendo conversiones entre tipos de datos para asi no cambiar el codigo de las clases que se estan comunicando
## ¿Como lo hace?
### se usa una clase intermedia entre las clases incompatibles, los metodos de esta clase se encargan de usar los metodos de la clase incompatible para darle a la otra clase los datos que necesita de la clase incompatible como se puede ver en la imagen ![alt text](https://refactoring.guru/images/patterns/diagrams/adapter/example.png)
## Ventajas
### el codigo de conversion al estar separado respeta el principio de responsabilidad unica 
### se pueden agregar varios adaptadores sin afectar al codigo existente
## Desventajas
### aumenta la complejidad del codigo al agregar mas clases e interfaces, a veces es mas facil cambiar el resto del codigo en lugar de agregar una nueva
## Explicacion del ejemplo
### tenemos dos clases de motor que implementan una interface motor, estas clases tienen 3 metodos para operar el motor (prender, acelear, detener), el objetivo de la clase principal es poder seleccionar cualquier motor desde un metodo general llamado usarMotor mandar a llamar los 3 metodos del motor
### pero tambien tenemos una clase de motor electrico el cual contiene mas metodos que conforman su funcionamiento(conectar,prender,moverMasRapido,detener,desconectar), estos metodos se usan para hacer lo mismo que los metodos de los otros dos, pero necesita mas metodos para hacer lo mismo, por lo que para prender motor debe de ejecutarse el metodo de conectar antes de prender, de lo contrario no prendera el motor, pero la el metodo de main solo usa 3 metodos para cada motor.
### ahi es donde entra el adaptador que sera una implementacion de la interface motor y que al implementar los metodos de prender acelerar y detener incluira los metodos que necesita el motor electrico para hacer los mismo que los otros dos motorees mediante el uso de un objeto tipo motor electrico., entonces queda implementado de la siguiente manera prender(conectar y prender) acelerar(moverMasRapido) y detener (detener, desconectar), para que desde main se use un objeto tipo motorElectricoAdapter para poder usar los metodos de motor electrico usando los mismos metodos que usa con los otros dos motores.
