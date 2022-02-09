# Arquitecturas Empresariales
## Laboratorio 1 - INTRODUCCIÓN MVN-GIT Y HEROKU
Hecho por: Nicolas Camacho Hurtado

[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://conversortemperatura.herokuapp.com/index.html)


### Requisitos para la utilización del proyecto:

Para el uso local del aplicativo es necesario contar con:

- Maven
- Java 8
- Git
- Spark Framework Web
- IntelliJ Idea preferiblemente, o algun cualquier otro IDE de compilación Java

### Instalación del proyecto

Lo primero es realizar la clonación del proyecto desde la terminal con el comando `git clone https://github.com/Haatom/AREP-Lab1`, una vez clonado el proyecto realizamos la ejecución del comando `mvn clean` para realizar una limpieza de dependencias y binarios, una vez realizado podemos ejecutar la verificación y compilación del proyecto con el comando `mvn package`

### Ejecución del proyecto

Para Windows usamos el comando: `java -cp target/classes:target/dependency/* edu.escuelaing.arem.ConversionTemp`

Para Linux usamos el comando `java -cp target/classes;target/dependency/* edu.escuelaing.arem.ConversionTemp`

### Pruebas Unitarias

Se realizaron pruebas unitarias para verificar que la conversión de las temperaturas se realizan de una forma correcta verificando valores positivos y negativos:

![](https://github.com/Haatom/AREP-Lab1/blob/master/img/pruebas.png)

Resultado de las pruebas:

![](https://github.com/Haatom/AREP-Lab1/blob/master/img/pruebasresultado.png)

### Arquitectura Utilizada

El proyecto se basa en peticiones GET a una API REST creada mediante una arquitectura Cliente-Servidor, donde el cliente envia la petición get con el numero y el tipo de conversión que desea realizar al servidor, este mismo lo procesa mediante el API REST quien es el que procesa y calcula la conversión de temperaturas.

![](img/https://github.com/Haatom/AREP-Lab1/blob/master/img/peticion.png)

El calculo de las temperaturas:

![](https://github.com/Haatom/AREP-Lab1/blob/master/img/calculo.png)

La conexión al API se realizó mediante un archivo Javascript en el que contamos con 2 funciones, una para realizar la conección y lograr entregar el resultado de la conversión y la otra para que se realice el calculo deseado por el usuario ya sea Convertir Celsius a Fahrenheit o Convertir Fahrenheit a Celsius

![](https://github.com/Haatom/AREP-Lab1/blob/master/img/javascript.png)

Interfaz grafica usada:

![](https://github.com/Haatom/AREP-Lab1/blob/master/img/browser.png)

Esta fue realizada en un archivo HTML usando estilos con CSS, la interfaz cuenta con un select con dos opciones "Convertir Celsius a Fahrenheit" y "Convertir Fahrenheit a Celsius" en las que dependiendo de la opción escogida unicamente en el input ingresaremos el valor que deseamos convertir ya sea de Celsius a Farenheit o Fahrenheit a Celsius, una vez ingresado el valor podemos oprimir el boton de calcular para que nos imprima en pantalla el valor del calculo de la conversión de la temperatura.





