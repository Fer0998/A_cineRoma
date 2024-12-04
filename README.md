# A_cineRoma

## Cine Roma - Sistema de Gestión de Películas

Este proyecto implementa un sistema de gestión para un cine, utilizando las clases `Cine` y `Película`, con el objetivo de almacenar, organizar y mostrar películas proyectadas en el cine. El sistema permite realizar varias operaciones sobre las películas, incluyendo agregar, listar y ordenar según diferentes criterios.

## Descripción General
El Cine Roma, ubicado en *Rivadavia 325*, cuenta con una colección de películas gestionada mediante un `HashSet` para evitar duplicados. Las películas se consideran iguales si tienen el mismo título, lo cual se determina sobrescribiendo los métodos `equals` y `hashCode` en la clase `Película`.

## Funcionalidades Principales

### Clase **Cine**
- **`agregarPelicula(Pelicula):void`**  
  Agrega una nueva película al conjunto del cine si no está duplicada.

- **`listarTodo():void`**  
  Muestra todas las películas registradas.

- **`listarDuranMas(int horas):void`**  
  Lista las películas cuya duración es mayor a las horas indicadas.

- **`listarMenorDuracionAMayorDuracion():void`**  
  Muestra las películas ordenadas por duración, de menor a mayor.

- **`listarOrdenadasPorTituloAZ():void`**  
  Lista las películas en orden alfabético por título.

- **`listarOrdenadasPorDirectorAZ():void`**  
  Lista las películas en orden alfabético por director.

## Interacción en el Main
1. Crear el cine *ROMA SRL*.
2. Solicitar al usuario los datos de las películas a registrar, permitiendo agregar varias películas.
3. Mostrar las películas con duración mayor a la ingresada por el usuario.
4. Listar todas las películas.
5. Ordenar y listar por título, director y duración.

## Mejoras
- Se utiliza un `HashSet` para evitar películas duplicadas.
- Implementación de `equals` y `hashCode` para determinar unicidad por título.

Este proyecto permite al cine gestionar de forma eficiente su catálogo, ofreciendo opciones de consulta ordenadas y filtradas, asegurando la no duplicación de registros.
