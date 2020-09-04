# DesafioSofka

Este repositorio contiene el desarrollo completo de la segunda etapa del proceso de selección Sofka, en la ruta /Desafío/src/Algoritmos se encuentran los archivos .java que contienen el código fuente.

## ¿Como se construyó este algoritmo?🛠️

Este algoritmo se construyó utilizando 4 clases, las cuales se describirán a continuación:

- **CargaBoing747:** 
  - Se definen los atributos del bulto (Peso, valor y tarifa) y la capacidad máxima de carga del avión (atributo definido como ***final***)
  - Se implementan los métodos(Verificar peso máximo del bulto (define si un bulto excede la capacidad máxima de carga permitida), calcular valor del bulto (calcula el valor total    a pagar por la carga del bulto según la tarifa de cada rango de pesos),  
- **Main:** Se ejecutan los algoritmos planteados en cada punto,
  -  Se ejecuta el algoritmo "Pasaje de avión" (se instancia un objeto de esta clase y se envían los parámetros para realizar las operaciones)
  -  Se ejecuta el algoritmo "Boing 747" (Se instancia una lista de tipo <Boing 747> la cuál almacenará los valores de la tabla de seguimiento, se insertan los bultos y se realizan las operaciones solicitadas)
- **PasajeDeAvion:** 
  - Se definen los atributos de tarifa por kilometro y costo de pasaje
  - Se definen el metodo pqra definir el precio del pasaje
- **Vuelo:** Esta clase realiza las operaciones de promedio de peso de bultos, bulto de peso maximo y minimo, y la cantidad de bultos que hay en el vuelo 

## Tecnologías usadas🚀
- Se utilizó el lenguaje de programación Java (JDK 14)
- Se utlizó el IDE Apache NetBeans 12

## Ejecución⚙️
Para ejecutar se debe utilizar un IDE compatible con Java, importar el proyecto y ejecutarlo en el IDE, el metodo main se encuentra en la clase Main.java, todas las salidas se dan por consola

## Observaciones📋
Se cumplieron los requerimientos a cabalidad
