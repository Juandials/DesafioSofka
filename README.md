# DesafioSofka

Este repositorio contiene el desarrollo completo de la segunda etapa del proceso de selección Sofka, en la ruta /Desafío/src/Algoritmos se encuentran los archivos .java que contienen el código fuente.

## ¿Como se construyó este algoritmo?🛠️

Este algoritmo se construyó utilizando 4 clases, las cuales se describirán a continuación:

- **CargaBoing747:** 
  - Se definen los atributos del bulto (Peso, valor y tarifa) y la capacidad máxima de carga del avión (atributo definido como ***final***)
  - Se implementan los métodos verificar peso máximo del bulto (define si un bulto excede la capacidad máxima de carga permitida), calcular valor del bulto (calcula el valor total    a pagar por la carga del bulto según la tarifa de cada rango de pesos),  
- **Main:** Se ejecutan los algoritmos planteados en cada punto,
  -  Se ejecuta el algoritmo "Pasaje de avión" (se instancia un objeto de esta clase y se envían los parámetros para realizar las operaciones)
  -  Se ejecuta el algoritmo "Boing 747" (Se instancia una lista de tipo <Boing 747> la cuál almacenará los valores de la tabla de seguimiento, se insertan los bultos y se realizan las operaciones solicitadas)
  - Se realiza la validación de carga máxima, se muestra la tabla de seguimiento y se realiza la conversión de pesos (COP) a dolares (USD)
- **PasajeDeAvion:** 
  - Se definen los atributos de tarifa por kilometro y costo de pasaje
  - Se implementa el metodo para definir el precio del pasaje, según los parámetros de dias de estancias y kilometros
- **Vuelo:** Esta implementa el constructor de la clase con el atributo de cantidad de bultos definido por el tamaño de la lista, la clase implementa los metodos de BultoMasPesado (busca el bulto más pesado de la carga, recoriendo la lista de bultos) BultoMasLiviano (Busca el bulto mas liviano recorriendo la lista y buscando el bulto más pesado, después de encontrarlo lo compara con los demás para encpntrar el bulto más liviando), promedio de peso de bultos (Suma todos los pesos de los bultos y los divide entre al tamaño de a lista para encontrar el promedio de pesos de los bultos). 

## Tecnologías usadas🚀
- Se utilizó el lenguaje de programación Java (JDK 14)
- Se utlizó el IDE Apache NetBeans 12

## Ejecución⚙️
Para ejecutar se debe utilizar un IDE compatible con Java, importar el proyecto y ejecutarlo en el IDE, el metodo main se encuentra en la clase Main.java, todas las salidas se dan por consola

## Observaciones📋
Se cumplieron los requerimientos a cabalidad
